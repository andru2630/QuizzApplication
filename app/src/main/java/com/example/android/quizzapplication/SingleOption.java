package com.example.android.quizzapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;



public class SingleOption extends Activity {

    int i = 0, score = 0;
    TextView OneQuesstion;
    RadioButton OneAnswer1, OneAnswer2, OneAnswer3, OneAnswer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_option);

        OneQuesstion = (TextView) findViewById(R.id.one_question1);
        OneAnswer1 = (RadioButton) findViewById(R.id.one_answer1);
        OneAnswer2 = (RadioButton) findViewById(R.id.one_answer2);
        OneAnswer3 = (RadioButton) findViewById(R.id.one_answer3);
        OneAnswer4 = (RadioButton) findViewById(R.id.one_answer4);
    }

    public void nextQuestion(View view) {
        if (i == 0) {
            if (OneAnswer1.isChecked()) {
                score++;
            }
            OneQuesstion.setText(R.string.one_question2);
            OneAnswer1.setText(R.string.one_question2_answer1);
            OneAnswer2.setText(R.string.one_question2_answer2);
            OneAnswer3.setText(R.string.one_question2_answer3);
            OneAnswer4.setText(R.string.one_question2_answer4);
        }
        if (i == 1) {
            if (OneAnswer3.isChecked()) {
                score++;
            }
            OneQuesstion.setText(R.string.one_question3);
            OneAnswer1.setText(R.string.one_question3_answer1);
            OneAnswer2.setText(R.string.one_question3_answer2);
            OneAnswer3.setText(R.string.one_question3_answer3);
            OneAnswer4.setText(R.string.one_question3_answer4);
        }
        if (i == 2) {
            if (OneAnswer4.isChecked()) {
                score++;
            }
            OneQuesstion.setText(R.string.one_question4);
            OneAnswer1.setText(R.string.one_question4_answer1);
            OneAnswer2.setText(R.string.one_question4_answer2);
            OneAnswer3.setText(R.string.one_question4_answer3);
            OneAnswer4.setText(R.string.one_question4_answer4);
        }
        if (i == 3) {
            if (OneAnswer2.isChecked()) {
                score++;
            }
            OneQuesstion.setText(R.string.one_question5);
            OneAnswer1.setText(R.string.one_question5_answer1);
            OneAnswer2.setText(R.string.one_question5_answer2);
            OneAnswer3.setText(R.string.one_question5_answer3);
            OneAnswer4.setText(R.string.one_question5_answer4);
        }
        if (i == 4) {
            if (OneAnswer4.isChecked()) {
                score++;
            }
            Intent goToFinishActivity = new Intent(this, End.class);
            goToFinishActivity.putExtra("oneScore", score);
            startActivity(goToFinishActivity);
            score = 0;
        }
        i++;
        resetRadioBox();
    }

    public void resetRadioBox() {
        OneAnswer1.setChecked(false);
        OneAnswer2.setChecked(false);
        OneAnswer3.setChecked(false);
        OneAnswer4.setChecked(false);
    }
}