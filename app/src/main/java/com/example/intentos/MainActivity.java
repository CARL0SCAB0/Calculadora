package com.example.intentos;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.*;
import android.widget.*;

public class MainActivity extends Activity {
    EditText jet1, jet2, jet3;
    Button jbn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jet1 = findViewById(R.id.xet1);
        jet2 = findViewById(R.id.xet2);
        jet3 = findViewById(R.id.xet3);
        jbn = findViewById(R.id.xbn);

        jbn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // Obtener los valores de a, b y c
                String aValue = jet1.getText().toString();
                String bValue = jet2.getText().toString();
                String cValue = jet3.getText().toString();

                // Crear un Intent para la SegundaActivity
                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);

                // Pasar los valores de a, b y c como extras al Intent
                intent.putExtra("value_A", aValue);
                intent.putExtra("value_B", bValue);
                intent.putExtra("value_C", cValue);

                // Iniciar la SegundaActivity
                startActivity(intent);
            }
        });
    }
}

