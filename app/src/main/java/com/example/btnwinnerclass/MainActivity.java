package com.example.btnwinnerclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mButton1;
    TextView mTextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = findViewById(R.id.button1);
        mTextView1 = findViewById(R.id.textView1); //연결완료

        mButton1.setOnClickListener(new MyonClickListener(this));

    }

    private class MyonClickListener implements View.OnClickListener {
        MainActivity mainActivity;
        public MyonClickListener(MainActivity mainActivity) {
            this.mainActivity = mainActivity;
        }


        @Override
        public void onClick(View v) {
            mainActivity.mTextView1.setText("You clicked button 1");
        }
    }
}