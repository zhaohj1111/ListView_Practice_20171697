package com.example.listview_practice_20171697;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class details0 extends AppCompatActivity {

    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details0);
        textView1=findViewById(R.id.TXT0);
        Intent intent = getIntent();
        String txt;
        txt=intent.getStringExtra("de");
        textView1.setText(txt);

    }
}
