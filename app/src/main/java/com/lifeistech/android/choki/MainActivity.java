package com.lifeistech.android.choki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView myTextView = (TextView) findViewById(R, id.myTextview);
    myTextView.setText("");

    //private EditText edit = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = (EditText) findViewById(R.id.editText);

        editText.setText("");

        editText.selectAll();

        String text = editText.getText().toString();
        Toast.makeText(this, text, Toast.LENGTH_LONG);
    }

}











    public  void next(View v){



    }

    public void enter(View v){



    }


}
