package com.example.btnwinnerclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mButton1;
    Button mButton2;
    TextView mTextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = findViewById(R.id.button1);
        mButton2 = findViewById(R.id.button2);
        mTextView1 = findViewById(R.id.textView1); //연결완료

        mButton1.setOnClickListener(new MyonClickListener());
        mButton1.setOnClickListener(new MyonClickListener());

    }

 class MyonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button1: mTextView1.setText("You clicked button 1"); break;
                case R.id.button2: mTextView1.setText("You clicked button 2"); break;
                default: break;
            }
        }
    }

}