package com.example.ojas_25.myprojectsecond;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;


public class SecondActivity extends AppCompatActivity {
    int[] images = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.gla, R.drawable.ganesh1};
    ImageView imageView;
    TextView textView;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String sex = intent.getStringExtra("sex");
        String course = intent.getStringExtra("course");
        int position = intent.getIntExtra("imgUrl", 0);

        CircleImageView imageView = (CircleImageView) findViewById(R.id.circlemageview);
        TextView nameTextView = (TextView) findViewById(R.id.name);
        TextView sexTextView = (TextView) findViewById(R.id.sex);
        TextView courseTextView = (TextView) findViewById(R.id.course);

        nameTextView.setText(name);
        sexTextView.setText(sex);
        courseTextView.setText(course);
        imageView.setImageDrawable(getResources().getDrawable(images[position]));


    }

}
