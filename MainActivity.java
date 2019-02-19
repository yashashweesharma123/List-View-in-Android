package com.example.ojas_25.myprojectsecond;
import  java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.listview);

        PersonActivity yash = new PersonActivity("yash", "male", "Btech","drawable://" + R.drawable.ic_launcher_background);
        PersonActivity udit = new PersonActivity("udit", "male", "Mbbs","drawable://" + R.drawable.ic_launcher_background);
        PersonActivity deepansh = new PersonActivity("deepansh", "male", "Bsc","drawable://" + R.drawable.ic_launcher_background);
        PersonActivity jigyashu = new PersonActivity("jigyashu", "male", "Mcom","drawable://" + R.drawable.ic_launcher_background);
        PersonActivity saurabh = new PersonActivity("saurabh", "male", "diploma","drawable://" + R.drawable.ic_launcher_background);
        PersonActivity akash = new PersonActivity("akash", "male", "Btech","drawable://" + R.drawable.ic_launcher_background);
        PersonActivity yogesh = new PersonActivity("yogesh", "male", "Btech","drawable://" + R.drawable.ic_launcher_background);
        PersonActivity karan = new PersonActivity("karan", "male", "Bcom","drawable://" + R.drawable.ic_launcher_background);
        PersonActivity nikhil = new PersonActivity("nikhil", "male", "Btech","drawable://" + R.drawable.ic_launcher_background);
        PersonActivity ashish = new PersonActivity("ashish", "male", "Btech","drawable://" + R.drawable.ic_launcher_background);
        PersonActivity shiv = new PersonActivity("shiv", "male", "Btech","drawable://" + R.drawable.ic_launcher_background);
        final ArrayList<PersonActivity> people = new ArrayList<>();
        people.add(yash);
        people.add(udit);
        people.add(deepansh);
        people.add(jigyashu);
        people.add(saurabh);
        people.add(akash);
        people.add(yogesh);
        people.add(karan);
        people.add(nikhil);
        people.add(ashish);
        people.add(shiv);
        PersonListAdapter adapter =new  PersonListAdapter(this, R.layout.adapter_view_layout, people);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("name",people.get(position).getName());
                intent.putExtra("sex",people.get(position).getSex());
                intent.putExtra("course",people.get(position).getCourse());
                intent.putExtra("imgUrl",position);
                startActivity(intent);

            }
        });
    }
}













