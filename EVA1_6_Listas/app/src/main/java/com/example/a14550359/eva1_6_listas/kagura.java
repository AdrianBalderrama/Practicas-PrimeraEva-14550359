package com.example.a14550359.eva1_6_listas;

import android.net.wifi.p2p.WifiP2pManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class kagura extends AppCompatActivity implements ListView.OnItemClickListener {
TextView txtMostrar;
ListView datos;
final String[] sResta={"TM La Junta","TM De Villa","Pizzas Lalin","Pizzas La Sierra","Gorditas de la 27","Buffalucas"
,"MC Donald's","DOGOS JR","La Hacienda","La Cerve","Yaki Yang","Tacos Orientales","Valcor","El Barco","La Pampas","Rickys Tacos"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kagura);
     txtMostrar=findViewById(R.id.txtMostrar);
     datos=findViewById(R.id.datos);
//ASIGNAR UN ADAPTADOR QUE ES COMO UN INTERMEDIARIO PARA EL ORIGEN DE DATOS
        datos.setAdapter(
                new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1, sResta)
        );


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        txtMostrar.setText(sResta[i]);

    }
}
