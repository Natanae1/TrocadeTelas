package com.example.natanaelgomes.trocadetelas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class Tela2Activity extends AppCompatActivity {

    Button bttelaprincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela2);
        bttelaprincipal = (Button) findViewById(R.id.bttelaprincipal);

        bttelaprincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tela2Activity.this.finish();
            }
        });
    }
}
