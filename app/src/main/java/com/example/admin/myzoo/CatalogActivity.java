package com.example.admin.myzoo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Admin on 9/13/2017.
 */

public class CatalogActivity extends AppCompatActivity {

    ListView lvCatalog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final String[] animalType = {"Mammals", "Reptiles", "Amphibians", "Birds"};

        lvCatalog = (ListView) findViewById(R.id.lvCatalog);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, animalType);
    }
}
