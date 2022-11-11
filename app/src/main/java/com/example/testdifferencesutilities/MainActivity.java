package com.example.testdifferencesutilities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button goToNow;
    Button labelDemo;
    Button imageViewDemo;
    Button fieldDemo;
    Button checkBoxDemo;
    Button radioButtonDemo;
    Button linearLayoutDemo;
    Button linearPercentDemo;
    Button relativeLayoutDemo;
    Button overlapDemo;
    Button tableLayoutDemo;
    Button scrollViewDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.goToNow = this.findViewById(R.id.goToNow);
        this.labelDemo = this.findViewById(R.id.labelDemo);
        this.imageViewDemo = this.findViewById(R.id.imageViewDemo);
        this.fieldDemo = this.findViewById(R.id.fieldDemo);
        this.checkBoxDemo = this.findViewById(R.id.checkBoxDemo);
        this.radioButtonDemo = this.findViewById(R.id.radioButtonDemo);
        this.linearLayoutDemo = this.findViewById(R.id.linearLayoutDemo);
        this.linearPercentDemo = this.findViewById(R.id.linearPercentDemo);
        this.relativeLayoutDemo = this.findViewById(R.id.relativeLayoutDemo);
        this.overlapDemo = this.findViewById(R.id.overlapDemo);
        this.tableLayoutDemo = this.findViewById(R.id.tableLayoutDemo);
        this.scrollViewDemo = this.findViewById(R.id.scrollViewDemo);

        this.goToNow.setOnClickListener(view ->
                this.startActivity(new Intent(this, NowActivity.class))
        );
        this.labelDemo.setOnClickListener(view ->
                this.startActivity(new Intent(this, LabelDemoActivity.class))
        );
        this.imageViewDemo.setOnClickListener(view ->
                this.startActivity(new Intent(this, ImageViewDemoActivity.class))
        );
        this.fieldDemo.setOnClickListener(view ->
                this.startActivity(new Intent(this, FieldDemoActivity.class))
        );
        this.checkBoxDemo.setOnClickListener(view ->
                this.startActivity(new Intent(this, CheckBoxDemoActivity.class))
        );
        this.radioButtonDemo.setOnClickListener(view ->
                this.startActivity(new Intent(this, RadioBttonDemoActivity.class))
        );
        this.linearLayoutDemo.setOnClickListener(view ->
                this.startActivity(new Intent(this, LinearLayoutDemoActivity.class))
        );
        this.linearPercentDemo.setOnClickListener(view ->
                this.startActivity(new Intent(this, LinearPercentDemoActivity.class))
        );
        this.relativeLayoutDemo.setOnClickListener(view ->
                this.startActivity(new Intent(this, RelativeLayoutDemoActivity.class))
        );
        this.overlapDemo.setOnClickListener(view ->
                this.startActivity(new Intent(this, OverlapDemoActivity.class))
        );
        this.tableLayoutDemo.setOnClickListener(view ->
                this.startActivity(new Intent(this, TableLayoutDemoActivity.class))
        );
        this.scrollViewDemo.setOnClickListener(view ->
                this.startActivity(new Intent(this, ScrollViewDemoActivity.class))
        );
    }
}