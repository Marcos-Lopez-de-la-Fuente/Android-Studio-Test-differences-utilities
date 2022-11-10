package com.example.testdifferencesutilities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class NowActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now);


        this.btn = new Button(this);
        this.btn.setOnClickListener(this);
        this.updateTime();

    }

    @Override
    public void onClick(View view) {
        this.updateTime();
    }


    private void updateTime() {
        this.btn.setText(new Date().toString());
    }

}