package com.example.android.quizzapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainMenuActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);


    }

    public void goToMultipleChoice(View view) {
        Intent goToMultipleChoice = new Intent(this, MultipleOption.class);
        startActivity(goToMultipleChoice);
    }

    public void goToOneOption(View view) {
        Intent goToOneOption = new Intent(this, SingleOption.class);
        startActivity(goToOneOption);
    }

    public void goToWrittenAnswer(View view) {
        Intent goToWrittenAnswer = new Intent(this, WriteIt.class);
        startActivity(goToWrittenAnswer);
    }
}