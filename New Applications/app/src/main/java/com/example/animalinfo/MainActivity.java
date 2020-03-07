package com.example.animalinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText animalN;
    private EditText animal_info;
    private EditText animal_leg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void launchActivity(View view) {

        //String question = questionTextView.getText().toString();
        //Above code gets the question from the textView
        CheckBox has_fur =findViewById(R.id.notify_has_fur);
        boolean hasF = has_fur.isChecked();

        Intent intent = new Intent(this, Info.class);
        animalN= findViewById(R.id.animal_name_view);
        String animalNString = animalN.getText().toString();

        animal_info = findViewById(R.id.more_info);
        String animalInfo = animal_info.getText().toString();

        animal_leg = findViewById(R.id.animal_leg_view);
        int animalLeg = Integer.parseInt(animal_leg.getText().toString());


        Animal a = new Animal(animalNString,animalLeg,hasF,animalInfo);
        intent.putExtra(Keys.NAME_KEY, a);
        startActivity(intent);


    }
}
