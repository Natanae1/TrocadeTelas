package com.example.natanaelgomes.trocadetelas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.*;
import android.view.*;

public class PrincipalActivity extends AppCompatActivity {

    Button bttela2;

    Intent iTela2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_principal);
        bttela2 = (Button) findViewById(R.id.bttela2);

        bttela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iTela2 = new Intent(PrincipalActivity.this,Tela2Activity.class);
                startActivity(iTela2);
            }
        });
    }
}
