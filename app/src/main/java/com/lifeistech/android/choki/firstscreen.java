package com.lifeistech.android.choki;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.SharedPreferences;
import android.content.Intent;




public class FirstScreen extends AppCompatActivity {

    //変数宣言

    EditText nameEditText;
    EditText goukeiEditText;
    String name;
    int goukei;
    int ruikei;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_FirstScreen);

        nameEditText = (EditText) findViewById(R.id.editText);
        goukeiEditText = (EditText)findViewById(R.id.editText);

    }


    public  void next(View v){

        SharedPreferences data1 = getSharedPreferences("DataSave", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor1 = data1.edit();
        name = nameEditText.getText().toString();
        editor1.putString("Username", name);
        editor1.commit();

        SharedPreferences data2 = getSharedPreferences("DataSave", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor2 = data2.edit();
        goukei = Integer.parseInt(goukeiEditText.getText().toString()) + data2.getInt("goukei",0);
        editor2.putInt("Goukeikingaku", goukei);
        editor2.commit();

        nameEditText.setText("");
        goukeiEditText.setText("");

    }

    public void enter(View v){

        SharedPreferences data1 =  getSharedPreferences("DataSave", Context.MODE_PRIVATE);
        name = data1.getString("Username", name);

        SharedPreferences data2 = getSharedPreferences("DataSave",Context.MODE_PRIVATE);
        goukei = data2.getInt("Goukeikingaku",goukei);


        /*Intent intent = new Intent(this,LastScreen.class);
        intent.putExtra("name",name);
        intent.putExtra("goukei",goukei);
        startActivity(intent);*/

    }

}
