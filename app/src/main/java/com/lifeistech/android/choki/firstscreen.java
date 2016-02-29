package com.lifeistech.android.choki;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.SharedPreferences;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class FirstScreen extends AppCompatActivity {

    //変数宣言

    EditText nameEditText;
    EditText goukeiEditText;
    TextView ruikeiTextView;
    int ruikei;
    int average;


    ArrayList<Bill> billList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        nameEditText = (EditText) findViewById(R.id.editText);
        goukeiEditText = (EditText) findViewById(R.id.editText2);
        ruikeiTextView = (TextView) findViewById(R.id.editText6);
    }


    public void next(View v) {
        // 一人分の請求金額を表したクラス
        Bill bill = new Bill();
        //名前のデータを保存
        bill.name = nameEditText.getText().toString();
        //　”名前”さんの使用金額データを保存
        bill.price = Integer.valueOf(goukeiEditText.getText().toString());
        billList.add(bill);

        // 今までの合計に足す
        ruikei += bill.price;

        nameEditText.setText("");
        goukeiEditText.setText("");
        ruikeiTextView.setText(String.valueOf(ruikei));
}

    public void enter(View v) {
        next(null);



        Intent intent = new Intent(this, LastScreen.class);
        intent.putExtra("bill_list", billList.toArray());
        intent.putParcelableArrayListExtra("bill_list", billList);
        startActivity(intent);
    }

}
