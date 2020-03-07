package com.example.animalinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Info extends AppCompatActivity {
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        setTitle("Animal info");

        text = (TextView)findViewById(R.id.text_view);

        Intent receivingIntent = getIntent();
        //String string = receivingIntent.getStringExtra(Keys.QUESTION_KEY);
        Animal a1 = (Animal) receivingIntent.getSerializableExtra(Keys.NAME_KEY);
        if(a1.isHasFur()){
            text.setText(a1.getName()+"\n"+String.valueOf(a1.getLegs())+"\n"+"Does the animal has fur? true"+"\n"+a1.getMoreinfo());
        }
        else{
            text.setText(a1.getName()+"\n"+String.valueOf(a1.getLegs())+"\n"+"Does the animal has fur? false"+"\n"+a1.getMoreinfo());
        }


    }
}
