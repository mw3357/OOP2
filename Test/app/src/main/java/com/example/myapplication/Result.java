package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Result extends AppCompatActivity {

    private static String res = "";
    private TextView text;
    private ArrayList<People> peopleBank = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        //getIntent();
        text= findViewById(R.id.text_view);
        Intent receivingIntent = getIntent();
        //String string = receivingIntent.getStringExtra(Keys.QUESTION_KEY);
        People p1 = (People) receivingIntent.getSerializableExtra(Keys.NAME_KEY);
        peopleBank.add(p1);
        for(int i = 0; i < peopleBank.size(); i++) {
            res += String.format("Name: %s \nAge: %s\nStill Alive? %s\n\n",
                    peopleBank.get(i).getName(), peopleBank.get(i).getAge(), peopleBank.get(i).isStillAlive());
        }
        text.setText(res);
    }
    public void click(View view) {

        Intent intent = new Intent(this, Info.class);
        //String question = questionTextView.getText().toString();
//        Question question = questionsBank.get(currentIndex);
//        intent.putExtra(Keys.QUESTION_KEY, question);
        //String answer = Boolean.toString(q.getAnswer());
        //intent.putExtra("KEY_ANS",answer);
        startActivity(intent);

    }
}


