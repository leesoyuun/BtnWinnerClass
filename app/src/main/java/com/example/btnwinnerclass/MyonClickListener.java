package com.example.btnwinnerclass;

import android.view.View;

public class MyonClickListener implements View.OnClickListener {
    MainActivity mainActivity;
    public MyonClickListener(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        mainActivity.mButton1.setText("You clicked button 1");
    }
}
