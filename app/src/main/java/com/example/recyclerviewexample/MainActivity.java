package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contacts> contactArrayList = new ArrayList<>();

        RecyclerView mRecycylerView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    mRecycylerView1 = (RecyclerView)findViewById(R.id.recycler1);
    contactArrayList.add(new Contacts("sidharth",R.drawable.ic_launcher_background,"6457562340"));
    contactArrayList.add(new Contacts("rahul",R.drawable.ic_launcher_background,"645756254520"));

    ContactAdapter cAdapter = new ContactAdapter(MainActivity.this,contactArrayList);
    mRecycylerView1.setLayoutManager(new LinearLayoutManager(this));
    mRecycylerView1.setAdapter(cAdapter);
    }

}
