package com.example.adapters_android;

import com.example.adapters_android.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    //step 1 ->
    ArrayList<Skills> arr = Skills.get10Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(id.lvSkills);

        //step 3 ->
        SkillAdapter adapter = new SkillAdapter();
        listView.setAdapter(adapter);


    }
    //step 2 -> Creating our own ADAPTER

    class SkillAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return arr.size(); //step 4 -> return the size of that arrayAdapter
        }

        @Override
        public Skills getItem(int position) {   //step 5 -> change return type to Skills object and return the postion
            return arr.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        //this is very important, iin this only where each view of our text getting created
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            //final step ->
            //to return a view we should do like
            //this inflater helps us to generate/inflate a view
            View itemView = getLayoutInflater().inflate(layout.list_item_skill, parent, false);

            TextView tvName = itemView.findViewById(id.tvName);  //bc this tvName is inside the itemView we use itemView.findviewById
            TextView tvSkill = itemView.findViewById(id.tvSkill);

            tvName.setText(getItem(position).getName());
            tvSkill.setText(getItem(position).getLanguage());

            return itemView;
        }
    }
}