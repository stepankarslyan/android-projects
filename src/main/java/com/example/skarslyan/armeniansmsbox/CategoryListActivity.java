package com.example.skarslyan.armeniansmsbox;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CategoryListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //CharSequence[] categories = getResources().getTextArray(R.array.categories);
        ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(this, R.layout.list_item_view,(CharSequence[]) categories);

        ListView listView = (ListView) findViewById(R.id.category_list_view);
        listView.setAdapter(adapter);

        Intent intent = getIntent();
    }

}
