package com.example.android.quizzapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class End extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        Intent getScoreFromMultipleChoiceActivity = getIntent();
        int scoreMultiple = getScoreFromMultipleChoiceActivity.getExtras().getInt("multipleScore");
        TextView multipleScore = (TextView) findViewById(R.id.final_score);
        if (scoreMultiple > 0) {
            multipleScore.setText("You scored\n" + scoreMultiple * 5 + "\n points");
        }

        Intent getScoreFromOneActivity = getIntent();
        int scoreOneOption = getScoreFromOneActivity.getExtras().getInt("oneScore");
        TextView oneScore = (TextView) findViewById(R.id.final_score);
        if (scoreOneOption > 0) {
            oneScore.setText("You scored\n" + scoreOneOption * 20 + "\n points");
        }
        Intent getScoreFromWriteItActivity = getIntent();
        int scoreWriteIt = getScoreFromWriteItActivity.getExtras().getInt("writtenScore");
        TextView writtenScore = (TextView) findViewById(R.id.final_score);
        if (scoreWriteIt > 0) {
            writtenScore.setText("You scored\n" + scoreWriteIt * 20 + "\n points");
        }
    }

    public void goToMainMenuActivity(View view) {
        Intent goToMainMenuActivity = new Intent(this, MainMenuActivity.class);
        startActivity(goToMainMenuActivity);
    }
}