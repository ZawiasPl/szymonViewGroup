package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        ViewGroup rootView = findViewById(R.id.activity_main_my_view_group);

        MyCustonPhoneView myCustomPhoneViewOption1 = new MyCustonPhoneView(this, "111 111 111");
        rootView.addView(myCustomPhoneViewOption1);

        MyCustonPhoneView myCustomPhoneViewOption2 = findViewById(R.id.my_custom_view);
        myCustomPhoneViewOption2.initView("222 222 222");

    }
}
