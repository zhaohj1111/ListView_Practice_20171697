package com.example.listview_practice_20171697;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private String[] names=new String[]{
            "20161707",
            "20161713",
            "20171591",
            "20171592",
            "20171616",
            "20171627",
            "20171641",
            "20171649",
            "20171650",
            "20171653",
            "20171654",
            "20171655",
            "20171656",
            "20171659",
            "20171664",
            "20171666",
            "20171667",
            "20171668",
            "20171669",
            "20171670",
            "20171679",
            "20171688",
            "20171697",
            "20171705",
            "20171707",
            "20171714",
            "20171717",
            "20171731",
            "20171742",
            "20175064",
            "20175980",
            "20175990",
           };
    //Intent intent0=new Intent(this,details0.class)

    private int [] imageId_bw=new int[]{R.drawable.bw1,R.drawable.bw2,R.drawable.bw3,R.drawable.bw4,R.drawable.bw5,
            R.drawable.bw6,R.drawable.bw7,R.drawable.bw8,R.drawable.bw9,R.drawable.bw10,
            R.drawable.bw11,R.drawable.bw12,R.drawable.bw13,R.drawable.bw14,R.drawable.bw15,
            R.drawable.bw16,R.drawable.bw17,R.drawable.bw18,R.drawable.bw19,R.drawable.bw20,
            R.drawable.bw21,R.drawable.bw22,R.drawable.bw23,R.drawable.bw24,R.drawable.bw25,
            R.drawable.bw26,R.drawable.bw27,R.drawable.bw28,R.drawable.bw29,R.drawable.bw30,
            R.drawable.bw31,R.drawable.bw32,R.drawable.bw33,R.drawable.bw34,R.drawable.bw35,
            R.drawable.bw36,R.drawable.bw37,R.drawable.bw38,R.drawable.bw39,R.drawable.bw40};
    private  ListView listView;
    private MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.list_view);

        myAdapter=new MyAdapter();
        listView.setAdapter(myAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                for(int i=0;i<=names.length;i++){

                    if(i==position){
                        String de="There are somedetails for "+names[i]+" .";
                        Intent intent0=new Intent();
                        intent0.setClass(MainActivity.this,details0.class);
                        intent0.putExtra("de",de);
                        intent0.putExtra("image",i);
                        startActivity(intent0);

                    }
                }
            }
        });

    }

    private class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view=getLayoutInflater().inflate(R.layout.item,null);

            ImageView imageView=view.findViewById(R.id.item_Image);
            TextView textView=view.findViewById(R.id.item_text);
            imageView.setImageResource(imageId_bw[position]);
            textView.setText(names[position]);

            return view;
        }
    }
}
