package com.example.loadingLab36;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class M000ActSplash extends AppCompatActivity {

    Button btnLoading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m001_act_splash);

        View v=findViewById(R.id.incLoadingLayout);
        btnLoading = findViewById(R.id.btnLoading);

        v.setVisibility(View.GONE);

        btnLoading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.btnLoading){
                    v.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}