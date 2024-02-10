package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ClickyActivity extends AppCompatActivity {


private Button aBtn, bBtn, cBtn, dBtn, eBtn, fBtn, aboutMeBtn;

    private TextView pressedTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicky);

pressedTv = findViewById(R.id.main_tv_pressed);


aBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        pressedTv.setText("Pressed: A");
    }
});
bBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        pressedTv.setText("Pressed: B");
    }
});
cBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        pressedTv.setText("Pressed: C");
    }
});
dBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        pressedTv.setText("Pressed: D");
    }
});
eBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        pressedTv.setText("Pressed: E");
    }
});
fBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        pressedTv.setText("Pressed: F");
    }
});



    }
}