package com.example.android.quizzapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class WriteIt extends Activity {

    int i = 0, score = 0;
    TextView writeItQuestion;
    EditText writeItAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_it);
        writeItQuestion = (TextView) findViewById(R.id.writeIt_question1);
        writeItAnswer = (EditText) findViewById(R.id.writeIt_answer);

    }

    public void nextQuestion(View view) {
        if(i == 0) {
            TextView answer = (TextView) findViewById(R.id.writeIt_answer);
            if (answer.getText().toString().equals("Tehran")) {
                score++;
            }
            writeItQuestion.setText(R.string.writeIt_question2);
        }

        if(i == 1) {
            TextView answer = (TextView) findViewById(R.id.writeIt_answer);
            if (answer.getText().toString().equals("Paris")) {
                score++;
            }
            writeItQuestion.setText(R.string.writeIt_question3);
        }

        if(i == 2) {
            TextView answer = (TextView) findViewById(R.id.writeIt_answer);
            if (answer.getText().toString().equals("Rome")) {
                score++;
            }
            writeItQuestion.setText(R.string.writeIt_question4);
        }

        if(i == 3) {
            TextView answer = (TextView) findViewById(R.id.writeIt_answer);
            if (answer.getText().toString().equals("Ankara")) {
                score++;
            }
            writeItQuestion.setText(R.string.writeIt_question5);
        }

        if(i == 4) {
            TextView answer = (TextView) findViewById(R.id.writeIt_answer);
            if (answer.getText().toString().equals("London")) {
                score++;
            }
            Intent goToFinishActivity = new Intent(this, End.class);
            goToFinishActivity.putExtra("writeItScore", score);
            startActivity(goToFinishActivity);
        }

        i++;
        writeItAnswer.getText().clear();
    }
}
