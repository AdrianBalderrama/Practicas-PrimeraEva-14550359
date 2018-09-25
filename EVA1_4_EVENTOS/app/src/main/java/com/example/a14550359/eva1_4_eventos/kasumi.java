package com.example.a14550359.eva1_4_eventos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class kasumi extends AppCompatActivity implements View.OnClickListener {
    //CREAMOS UN OBJETO QUE ESCUCHA EVENTOS


TextView txtVwMensa;// Este objeto se vincula al widget
Button btnInterfaz;
Button btnClaseAnonima;
Button btnPorClase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kasumi);//solo muestra y crea los widgets
        txtVwMensa = findViewById(R.id.txtVwMensa);//con esto queda vinculado el widget y lo podemos usar
        btnInterfaz.setOnClickListener(this);
        btnClaseAnonima.setOnClickListener(this);
        txtVwMensa.setText("Hola Mundo");
        final Context cntApp= getApplicationContext();

        //VINCULAR BOTON
        btnInterfaz= findViewById(R.id.btnInterfaz);
        btnPorClase.setOnClickListener(this);
btnClaseAnonima.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(cntApp, "EVENTO POR CLASE ANONIMA",Toast.LENGTH_LONG).show();
    }
});
    }
    public void click(View v){

        Toast.makeText(this, "The Russian", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View v) {
        Toast.makeText( this, "Akari",Toast.LENGTH_LONG).show();
    }
}
