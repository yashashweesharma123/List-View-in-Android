package com.example.ojas_25.myprojectsecond;

import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

import java.util.ArrayList;

public class
PersonListAdapter extends ArrayAdapter<PersonActivity> {
    Context context;
    int Resource;
    int[] images = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four,R.drawable.gla,R.drawable.ganesh1};
    int count;

    public PersonListAdapter(Context context, int resource, ArrayList<PersonActivity> objects) {
        super(context, resource, objects);
        this.context = context;
        Resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {



        String name = getItem(position).getName();
        String sex = getItem(position).getSex();
        String course = getItem(position).getCourse();
        String imgUrl = getItem(position).getImgUrl();
        PersonActivity personActivity = new PersonActivity(name, sex, course, imgUrl);
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = (inflater.inflate(Resource, parent, false));
        TextView nameTextView = (TextView) convertView.findViewById(R.id.name);
        TextView sexTextView= (TextView) convertView.findViewById(R.id.sex);
        TextView courseTextView= (TextView) convertView.findViewById(R.id.course);
        TextView textView3=(TextView) convertView.findViewById(R.id.textview3);
        TextView textView4=(TextView) convertView.findViewById(R.id.textview4);
        TextView textView5=(TextView) convertView.findViewById(R.id.textview5);
        CircleImageView imageView = (CircleImageView) convertView.findViewById(R.id.imageview);
        nameTextView.setText(name);
        sexTextView.setText(sex);
        courseTextView.setText(course);
        imageView.setImageDrawable(context.getResources().getDrawable(images[count]));
        if (count < images.length-1) {
            count++;
        } else {
            count = 0;
        }

        return convertView;
    }


    }












