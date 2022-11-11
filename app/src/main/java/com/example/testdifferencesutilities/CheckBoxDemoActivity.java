package com.example.testdifferencesutilities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class CheckBoxDemoActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    CheckBox cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_demo);

        cb = (CheckBox) findViewById(R.id.check);
        cb.setOnCheckedChangeListener(this);
    }

    public void onCheckedChanged(CompoundButton buttonView,
                                 boolean isChecked) {
        if (isChecked) {
            cb.setText("This checkbox is: checked");
        } else {
            cb.setText("This checkbox is: unchecked");
        }
    }
}