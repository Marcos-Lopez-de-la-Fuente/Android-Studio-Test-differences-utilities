package com.example.testdifferencesutilities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class FieldDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_field_demo);


        EditText fld = (EditText) findViewById(R.id.field);
        fld.setText("Licensed under the Apache License, Version 2.0 " +
                "(the \"License\"); you may not use this file " +
                "except in compliance with the License. You may " +
                "obtain a copy of the License at " +
                "http://www.apache.org/licenses/LICENSE-2.0");
    }
}