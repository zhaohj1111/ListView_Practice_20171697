package com.example.listview_practice_20171697;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class details0 extends AppCompatActivity {

    TextView textView1;
    ImageView imageView1;

    private int [] imageId_color=new int[]{R.drawable.face1,R.drawable.face2,R.drawable.face3,R.drawable.face4,R.drawable.face5,
            R.drawable.face6,R.drawable.face7,R.drawable.face8,R.drawable.face9,R.drawable.face10,
            R.drawable.face11,R.drawable.face12,R.drawable.face13,R.drawable.face14,R.drawable.face15,
            R.drawable.face16,R.drawable.face17,R.drawable.face18,R.drawable.face19,R.drawable.face20,
            R.drawable.face21,R.drawable.face22,R.drawable.face23,R.drawable.face24,R.drawable.face25,
            R.drawable.face26,R.drawable.face27,R.drawable.face28,R.drawable.face29,R.drawable.face30,
            R.drawable.face31,R.drawable.face32,R.drawable.face33,R.drawable.face34,R.drawable.face35,
            R.drawable.face36,R.drawable.face37,R.drawable.face38,R.drawable.face39,R.drawable.face40};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details0);
        textView1=findViewById(R.id.TXT0);
        imageView1=findViewById(R.id.IM0);
        Intent intent = getIntent();
        String txt;
        txt=intent.getStringExtra("de");
        textView1.setText(txt);

        int colorImage=intent.getIntExtra("image",0);
        imageView1.setImageResource(imageId_color[colorImage]);


    }
}
