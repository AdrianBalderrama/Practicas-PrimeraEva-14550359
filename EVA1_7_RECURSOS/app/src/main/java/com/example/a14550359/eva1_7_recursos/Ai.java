package com.example.a14550359.eva1_7_recursos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Ai extends AppCompatActivity {

    ImageView imgVwmostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai);
        imgVwmostrar=findViewById(R.id.imgVwmostrar);
        imgVwmostrar.setImageResource(R.drawable.goku);
    }
}
