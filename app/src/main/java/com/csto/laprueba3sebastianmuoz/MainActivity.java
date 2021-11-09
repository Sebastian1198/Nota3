package com.csto.laprueba3sebastianmuoz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spUbicacion;
    Button btn;
    ArrayList<String> vl = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spUbicacion = (Spinner)findViewById(R.id.spLugares);
        btn = (Button) findViewById(R.id.btnContinuar);
        vl.add("");
        vl.add("Buenos aires");
        vl.add("Rio Claro");
        vl.add("Lima");
        ArrayAdapter<String> AA = new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,vl);
        spUbicacion.setAdapter(AA);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(spUbicacion.getSelectedItem()==""){
                    Toast.makeText(getApplicationContext(), "Seleccione ",Toast.LENGTH_LONG).show();
                }
                if(spUbicacion.getSelectedItem()=="Buenos aires"){
                    Toast.makeText(getApplicationContext(), "Usted selecciono Buenos aires ",Toast.LENGTH_LONG).show();
                    Intent I = new Intent(getApplicationContext(),MainActivity2.class);
                    startActivity(I);
                }
                if(spUbicacion.getSelectedItem()=="Rio Claro"){
                    Toast.makeText(getApplicationContext(), "Usted selecciono Rio Claro ",Toast.LENGTH_LONG).show();
                    Intent I = new Intent(getApplicationContext(),MainActivity3.class);
                    startActivity(I);
                }
                if(spUbicacion.getSelectedItem()=="Lima"){
                    Toast.makeText(getApplicationContext(), "Usted selecciono Lima ",Toast.LENGTH_LONG).show();
                    Intent I = new Intent(getApplicationContext(),MainActivity3.class);
                    startActivity(I);
                }


            }
        });

    }
}