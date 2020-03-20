package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void click(View view) {
        // Question q = questionsBank.get(currentIndex);
        Intent intent = new Intent(this, Info.class);
        //String question = questionTextView.getText().toString();
//        Question question = questionsBank.get(currentIndex);
//        intent.putExtra(Keys.QUESTION_KEY, question);
        //String answer = Boolean.toString(q.getAnswer());
        //intent.putExtra("KEY_ANS",answer);
        startActivity(intent);

    }


}
