package com.example.a14550359.eva1_5_otros_eventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class Narumi extends AppCompatActivity {


    RadioGroup rdGrpOpciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_narumi);
        rdGrpOpciones=findViewById(R.id.rdGrpOpciones);
    }
}
