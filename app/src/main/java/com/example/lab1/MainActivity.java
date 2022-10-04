package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView helloText;
    private ImageButton startButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloText = (TextView) findViewById(R.id.HelloText);
        startButton = (ImageButton) findViewById(R.id.ButtonStart);
    }

    public void onClickStartButton(View view) {
        startButton.setImageResource(R.drawable.android);
//        helloText.setVisibility(View.VISIBLE);
        startButton.setClickable(false);
    }
}