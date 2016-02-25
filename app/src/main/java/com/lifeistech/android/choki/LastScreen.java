package com.lifeistech.android.choki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LastScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_LastScreen);

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);

        adapter.add("name");
        adapter.add("kingaku");

        ListView listView1 = (ListView)findViewById(R.id.listView1);
        listView1.setAdapter(adapter);

    }


}
