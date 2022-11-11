# Android-Studio-Test-differences-utilities

Project in Android Studio to practice different utilities.

<details>

**<summary>Application Images</summary>**

<img src="resForReadme/mobile.gif">

</details>

## **Code**

<ul>

### <li>**Java files**

<ul>

<li>

<details>

**<summary>`MainActivity.java`</summary>**

```java
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
```

</details>

</li>

<li>

<details>

**<summary>`NowActivity.java`</summary>**

```java
package com.example.testdifferencesutilities;

import androidx.appcompat.app.AppCompatActivity;

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

        this.btn = this.findViewById(R.id.btn);

        this.btn.setOnClickListener(this);
        this.updateTime();

    }


    private void updateTime() {
        this.btn.setText(new Date().toString());
    }

    @Override
    public void onClick(View view) {
        this.updateTime();
    }
}
```

</details>

</li>

<li>

<details>

**<summary>`CheckBoxDemoActivity.java`</summary>**

```java
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
```

</details>

</li>

<li>

<details>

**<summary>`FieldDemoActivity.java`</summary>**

```java
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
```

</details>

</li>

<li>

<details>

**<summary>`LinearLayoutDemoActivity.java`</summary>**

```java
package com.example.testdifferencesutilities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class LinearLayoutDemoActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {


    RadioGroup orientation;
    RadioGroup gravity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_demo);


        orientation = (RadioGroup) findViewById(R.id.orientation);
        orientation.setOnCheckedChangeListener(this);
        gravity = (RadioGroup) findViewById(R.id.gravity);
        gravity.setOnCheckedChangeListener(this);
    }

    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.horizontal:
                orientation.setOrientation(LinearLayout.HORIZONTAL);
                break;

            case R.id.vertical:
                orientation.setOrientation(LinearLayout.VERTICAL);
                break;
            case R.id.left:
                gravity.setGravity(Gravity.LEFT);
                break;

            case R.id.center:
                gravity.setGravity(Gravity.CENTER_HORIZONTAL);
                break;

            case R.id.right:
                gravity.setGravity(Gravity.RIGHT);
                break;
        }
    }
}
```

</details>

</li>

</ul>

</li>

### <li>**XML files**

<ul>

#### <li>**`drawable`**

<ul>

<li>

<details>

**<summary>`background.xml`</summary>**

```xml
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">

    <gradient
        android:angle="90"
        android:centerColor="@color/purple_500"
        android:endColor="@color/purple_700"
        android:startColor="@color/purple_200" />

</shape>
```

</details>

</li>

<li>

<details>

**<summary>`button.xml`</summary>**

```xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">

    <gradient
        android:angle="45"
        android:centerColor="@color/teal_700"
        android:endColor="@color/teal_700"
        android:startColor="@color/teal_200" />

    <corners android:radius="40dp" />

</shape>
```

</details>

</li>

</ul>

</li>

#### <li>**`layout`**

<ul>

<li>

<details>

**<summary>`activity_main.xml`</summary>**

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/background"
    android:orientation="vertical"
    android:padding="30dp">


    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <androidx.appcompat.widget.AppCompatButton
            android:id="@+id/goToNow"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="10dp"
            android:layout_weight="1"
            android:background="@drawable/button"
            android:text="Now" />

        <androidx.appcompat.widget.AppCompatButton
            android:id="@+id/labelDemo"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="10dp"
            android:layout_weight="1"
            android:background="@drawable/button"
            android:text="label Demo" />

    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <androidx.appcompat.widget.AppCompatButton
            android:id="@+id/imageViewDemo"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="10dp"
            android:layout_weight="1"
            android:background="@drawable/button"
            android:text="image View Demo" />

        <androidx.appcompat.widget.AppCompatButton
            android:id="@+id/fieldDemo"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="10dp"
            android:layout_weight="1"
            android:background="@drawable/button"
            android:text="field Demo"

            />

    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <androidx.appcompat.widget.AppCompatButton
            android:id="@+id/checkBoxDemo"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="10dp"
            android:layout_weight="1"
            android:background="@drawable/button"
            android:text="check Box Demo" />

        <androidx.appcompat.widget.AppCompatButton
            android:id="@+id/radioButtonDemo"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="10dp"
            android:layout_weight="1"
            android:background="@drawable/button"
            android:text="radio Button Demo"

            />

    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <androidx.appcompat.widget.AppCompatButton
            android:id="@+id/linearLayoutDemo"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="10dp"
            android:layout_weight="1"
            android:background="@drawable/button"
            android:text="linear Layout Demo" />

        <androidx.appcompat.widget.AppCompatButton
            android:id="@+id/linearPercentDemo"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="10dp"
            android:layout_weight="1"
            android:background="@drawable/button"
            android:text="linear Percent Demo"

            />

    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <androidx.appcompat.widget.AppCompatButton
            android:id="@+id/relativeLayoutDemo"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="10dp"
            android:layout_weight="1"
            android:background="@drawable/button"
            android:text="relative Layout Demo" />

        <androidx.appcompat.widget.AppCompatButton
            android:id="@+id/overlapDemo"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="10dp"
            android:layout_weight="1"
            android:background="@drawable/button"
            android:text="overlap Demo"

            />

    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <androidx.appcompat.widget.AppCompatButton
            android:id="@+id/tableLayoutDemo"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="10dp"
            android:layout_weight="1"
            android:background="@drawable/button"
            android:text="table Layout Demo" />

        <androidx.appcompat.widget.AppCompatButton
            android:id="@+id/scrollViewDemo"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="10dp"
            android:layout_weight="1"
            android:background="@drawable/button"
            android:text="scroll View Demo"

            />

    </LinearLayout>

</LinearLayout>
```

</details>

</li>

<li>

<details>

**<summary>`activity_now.xml`</summary>**

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <Button
        android:id="@+id/btn"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:text="aa" />

</LinearLayout>
```

</details>

</li>

<li>

<details>

**<summary>`activity_check_box_demo.xml`</summary>**

```xml
<?xml version="1.0" encoding="utf-8"?>
<CheckBox xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/check"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="This checkbox is: unchecked" />
```

</details>

</li>

<li>

<details>

**<summary>`activity_field_demo.xml`</summary>**

```xml
<?xml version="1.0" encoding="utf-8"?>
<EditText xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/field"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent"
    android:singleLine="false" />
```

</details>

</li>

<li>

<details>

**<summary>`activity_image_view_demo.xml`</summary>**

```xml
<?xml version="1.0" encoding="utf-8"?>
<ImageView xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/icon"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent"
    android:adjustViewBounds="true"
    android:src="@drawable/ic_launcher_background" />
```

</details>

</li>

<li>

<details>

**<summary>`activity_label_demo.xml`</summary>**

```xml
<?xml version="1.0" encoding="utf-8"?>
<TextView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="fill_parent"
    android:layout_height="wrap_content"
    android:text="You were expecting something profound?" />

```

</details>

</li>

<li>

<details>

**<summary>`activity_linear_layout_demo.xml`</summary>**

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent"
    android:orientation="vertical">

    <RadioGroup
        android:id="@+id/orientation"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:padding="5dip">

        <RadioButton
            android:id="@+id/horizontal"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="horizontal" />

        <RadioButton
            android:id="@+id/vertical"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="vertical" />
    </RadioGroup>

    <RadioGroup
        android:id="@+id/gravity"
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:padding="5dip">

        <RadioButton
            android:id="@+id/left"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="left" />

        <RadioButton
            android:id="@+id/center"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="center" />

        <RadioButton
            android:id="@+id/right"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="right" />
    </RadioGroup>
</LinearLayout>
```

</details>

</li>

<li>

<details>

**<summary>`activity_linear_percent_demo.xml`</summary>**

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent"
    android:orientation="vertical">

    <Button
        android:layout_width="fill_parent"
        android:layout_height="0dip"
        android:layout_weight="50"
        android:text="Fifty Percent" />

    <Button
        android:layout_width="fill_parent"
        android:layout_height="0dip"
        android:layout_weight="30"
        android:text="Thirty Percent" />

    <Button
        android:layout_width="fill_parent"
        android:layout_height="0dip"
        android:layout_weight="20"
        android:text="Twenty Percent" />
</LinearLayout>
```

</details>

</li>

<li>

<details>

**<summary>`activity_overlap_demo.xml`</summary>**

```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent">

    <Button
        android:layout_width="fill_parent"
        android:layout_height="fill_parent"
        android:text="I AM BIG"
        android:textSize="120dip"
        android:textStyle="bold" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:text="I am small" />
</RelativeLayout>
```

</details>

</li>

<li>

<details>

**<summary>`activity_radio_btton_demo.xml`</summary>**

```xml
<?xml version="1.0" encoding="utf-8"?>
<RadioGroup xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent"
    android:orientation="vertical">

    <RadioButton
        android:id="@+id/radio1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Rock" />

    <RadioButton
        android:id="@+id/radio2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Scissors" />

    <RadioButton
        android:id="@+id/radio3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Paper" />
</RadioGroup>
```

</details>

</li>

<li>

<details>

**<summary>`activity_relative_layout_demo.xml`</summary>**

```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="fill_parent"
    android:layout_height="wrap_content">

    <TextView
        android:id="@+id/label"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignBaseline="@+id/entry"
        android:layout_alignParentLeft="true"
        android:text="URL:" />

    <EditText
        android:id="@id/entry"
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentTop="true"
        android:layout_toRightOf="@id/label" />

    <Button
        android:id="@+id/ok"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/entry"
        android:layout_alignRight="@id/entry"
        android:text="OK" />

    <Button
        android:id="@+id/cancel"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignTop="@id/ok"
        android:layout_toLeftOf="@id/ok"
        android:text="Cancel" />
</RelativeLayout>
```

</details>

</li>

<li>

<details>

**<summary>`activity_scroll_view_demo.xml`</summary>**

```xml
<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="fill_parent"
    android:layout_height="wrap_content">

    <TableLayout
        android:layout_width="fill_parent"
        android:layout_height="fill_parent"
        android:stretchColumns="0">

        <TableRow>

            <View
                android:layout_height="80dip"
                android:background="#000000" />

            <TextView
                android:layout_gravity="center_vertical"
                android:paddingLeft="4dip"
                android:text="#000000" />
        </TableRow>

        <TableRow>

            <View
                android:layout_height="80dip"
                android:background="#440000" />

            <TextView
                android:layout_gravity="center_vertical"
                android:paddingLeft="4dip"
                android:text="#440000" />
        </TableRow>

        <TableRow>

            <View
                android:layout_height="80dip"
                android:background="#884400" />

            <TextView
                android:layout_gravity="center_vertical"
                android:paddingLeft="4dip"
                android:text="#884400" />
        </TableRow>

        <TableRow>

            <View
                android:layout_height="80dip"
                android:background="#aa8844" />

            <TextView
                android:layout_gravity="center_vertical"
                android:paddingLeft="4dip"
                android:text="#aa8844" />
        </TableRow>

        <TableRow>

            <View
                android:layout_height="80dip"
                android:background="#ffaa88" />

            <TextView
                android:layout_gravity="center_vertical"
                android:paddingLeft="4dip"
                android:text="#ffaa88" />
        </TableRow>

        <TableRow>

            <View
                android:layout_height="80dip"
                android:background="#ffffaa" />

            <TextView
                android:layout_gravity="center_vertical"
                android:paddingLeft="4dip"
                android:text="#ffffaa" />
        </TableRow>

        <TableRow>

            <View
                android:layout_height="80dip"
                android:background="#ffffff" />

            <TextView
                android:layout_gravity="center_vertical"
                android:paddingLeft="4dip"
                android:text="#ffffff" />
        </TableRow>
    </TableLayout>
</ScrollView>
```

</details>

</li>

<li>

<details>

**<summary>`activity_table_layout_demo.xml`</summary>**

```xml
<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent"
    android:stretchColumns="1">

    <TableRow>

        <TextView android:text="URL:" />

        <EditText
            android:id="@+id/entry"
            android:layout_span="3" />
    </TableRow>

    <View
        android:layout_height="2dip"
        android:background="#0000FF" />

    <TableRow>

        <Button
            android:id="@+id/cancel"
            android:layout_column="2"
            android:text="Cancel" />

        <Button
            android:id="@+id/ok"
            android:text="OK" />
    </TableRow>
</TableLayout>
```

</details>

</li>

</ul>

</ul>

</li>

</ul>
