package com.example.adapters_android;

import com.example.adapters_android.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(id.lvSkills);
        ArrayList<String> skills = new ArrayList<>();
        skills.add("SQL");
        skills.add("PYTHON");
        skills.add("C++");
        skills.add("REACT");
        skills.add("BOOTSTRAP");
        skills.add("PANDAS");
        // THE IDEA IS WE ARE CREATING AN ADAPTER WHICH HELPS US TO FIT THE HELPER LAYOUT IN LISTVIEW LAYOUT,
        // *** STRINGS -> ADAPTER -> LISTVIEW  ***

        //in this parameters what we are doing is
        //1 -> this activity (MainActivity)
        //2 -> the helper layout which you prepared by adding only a single view in it (text_layout)
        //3 -> id of that text view layout in helper layout
        //4 -> finally the list of strings.
        ArrayAdapter<String> arr = new ArrayAdapter<>(this, layout.text_layout, id.skillsText, skills);

        listView.setAdapter(arr);

    }
}