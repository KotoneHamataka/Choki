package com.lifeistech.android.choki;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.content.SharedPreferences;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LastScreen extends AppCompatActivity {

    String name;
    int goukei;
    ArrayList<Bill> billList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        Intent intent = getIntent();
        billList = intent.getParcelableArrayListExtra("bill_list");
        BillAdapter adapter = new BillAdapter(this, billList);

        ListView listView1 = (ListView)findViewById(R.id.listView);
        listView1.setAdapter(adapter);

        //View.setTextSize(36);


        //Log.d("name",getsした値);



    }


}
