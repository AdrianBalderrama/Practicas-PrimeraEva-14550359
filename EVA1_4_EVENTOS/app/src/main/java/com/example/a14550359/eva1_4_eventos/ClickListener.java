package com.example.a14550359.eva1_4_eventos;

import android.util.Log;
import android.view.View;

public class ClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Log.wtf("Desde Clase", "Evento Click");
    }
}
