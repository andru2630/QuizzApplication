package com.example.android.quizzapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MultipleOption extends Activity {
    int i = 0, score = 20;
    TextView multipleQuestion;
    CheckBox multipleAnswer1, multipleAnswer2, multipleAnswer3, multipleAnswer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_option);
        multipleQuestion = (TextView) findViewById(R.id.multiple_question);
        multipleAnswer1 = (CheckBox) findViewById(R.id.multiple_answer1);
        multipleAnswer2 = (CheckBox) findViewById(R.id.multiple_answer2);
        multipleAnswer3 = (CheckBox) findViewById(R.id.multiple_answer3);
        multipleAnswer4 = (CheckBox) findViewById(R.id.multiple_answer4);
    }

    public void nextQuestion(View view) {
        if (i == 0) {
            if (multipleAnswer1.isChecked()) {
                score--;
            }
            if (!multipleAnswer2.isChecked()) {
                score--;
            }
            if (multipleAnswer3.isChecked()) {
                score--;
            }
            if (multipleAnswer4.isChecked()) {
                score--;
            }
            multipleQuestion.setText(R.string.multiple_question2);
            multipleAnswer1.setText(R.string.multiple_question2_answer1);
            multipleAnswer2.setText(R.string.multiple_question2_answer2);
            multipleAnswer3.setText(R.string.multiple_question2_answer3);
            multipleAnswer4.setText(R.string.multiple_question2_answer4);
        }
        if (i == 1) {
            if (!multipleAnswer1.isChecked()) {
                score--;
            }
            if (multipleAnswer2.isChecked()) {
                score--;
            }
            if (multipleAnswer3.isChecked()) {
                score--;
            }
            if (!multipleAnswer4.isChecked()) {
                score--;
            }
            multipleQuestion.setText(R.string.multiple_question3);
            multipleAnswer1.setText(R.string.multiple_question3_answer1);
            multipleAnswer2.setText(R.string.multiple_question3_answer2);
            multipleAnswer3.setText(R.string.multiple_question3_answer3);
            multipleAnswer4.setText(R.string.multiple_question3_answer4);
        }
        if (i == 2) {
            if (!multipleAnswer1.isChecked()) {
                score--;
            }
            if (!multipleAnswer2.isChecked()) {
                score--;
            }
            if (!multipleAnswer3.isChecked()) {
                score--;
            }
            if (multipleAnswer4.isChecked()) {
                score--;
            }
            multipleQuestion.setText(R.string.multiple_question4);
            multipleAnswer1.setText(R.string.multiple_question4_answer1);
            multipleAnswer2.setText(R.string.multiple_question4_answer2);
            multipleAnswer3.setText(R.string.multiple_question4_answer3);
            multipleAnswer4.setText(R.string.multiple_question4_answer4);
        }
        if (i == 3) {
            if (multipleAnswer1.isChecked()) {
                score--;
            }
            if (!multipleAnswer2.isChecked()) {
                score--;
            }
            if (multipleAnswer3.isChecked()) {
                score--;
            }
            if (!multipleAnswer4.isChecked()) {
                score--;
            }
            multipleQuestion.setText(R.string.multiple_question5);
            multipleAnswer1.setText(R.string.multiple_question5_answer1);
            multipleAnswer2.setText(R.string.multiple_question5_answer2);
            multipleAnswer3.setText(R.string.multiple_question5_answer3);
            multipleAnswer4.setText(R.string.multiple_question5_answer4);
        }

        if (i == 4) {
            if (!multipleAnswer1.isChecked()) {
                score--;
            }
            if (multipleAnswer2.isChecked()) {
                score--;
            }
            if (!multipleAnswer3.isChecked()) {
                score--;
            }
            if (multipleAnswer4.isChecked()) {
                score--;
            }
            Intent goToFinishActivity = new Intent(this, End.class);
            goToFinishActivity.putExtra("multipleScore", score);
            startActivity(goToFinishActivity);
            score = 0;
        }
        i++;
        resetCheckbox();
    }

    public void resetCheckbox() {
        multipleAnswer1.setChecked(false);
        multipleAnswer2.setChecked(false);
        multipleAnswer3.setChecked(false);
        multipleAnswer4.setChecked(false);
    }

}