package com.example.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyCustonPhoneView extends LinearLayout {
    public MyCustonPhoneView(Context context) {
        super(context);
    }

    public MyCustonPhoneView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyCustonPhoneView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyCustonPhoneView(Context context, String phoneNumber) {
        super(context);
        initView(phoneNumber);
    }

    public void initView(final String phoneNumber) {
        View rootView = LayoutInflater.from(getContext()).inflate(R.layout.view_my_custom, this);
        TextView phoneNumberTextView = rootView.findViewById(R.id.view_my_custom_phone_number);
        phoneNumberTextView.setText(phoneNumber);

        ImageButton callButton = rootView.findViewById(R.id.view_my_custom_call_button);
        callButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Calling " + phoneNumber, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
