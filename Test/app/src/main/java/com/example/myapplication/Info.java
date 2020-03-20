package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        getIntent();
    }
    public void launchActivity(View view) {

        Intent intent = new Intent(this, Result.class);
        EditText name= findViewById(R.id.name_view);
        String nameString = name.getText().toString();

        EditText age = findViewById(R.id.age_view);
        int ageString = Integer.parseInt(age.getText().toString());

        CheckBox has_fur =findViewById(R.id.notify_me_checkbox);
        boolean hasF = has_fur.isChecked();

        People p = new People(nameString, ageString, hasF);
        intent.putExtra(Keys.NAME_KEY, p);
        startActivity(intent);

    }
}
