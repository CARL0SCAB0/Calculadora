package com.example.intentos;

import android.os.Bundle;
import android.app.Activity;
import android.widget.*;

public class SegundaActivity extends Activity {
    TextView jtvEquation, jtvResults;
    Bundle bdl;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        jtvEquation = findViewById(R.id.xtvEquation);
        jtvResults = findViewById(R.id.xtvResults);
        bdl = getIntent().getExtras();

        if (bdl != null) {
            String aValue = bdl.getString("value_A");
            String bValue = bdl.getString("value_B");
            String cValue = bdl.getString("value_C");

            // Calcular la solución de la ecuación de segundo grado
            double a = Double.parseDouble(aValue);
            double b = Double.parseDouble(bValue);
            double c = Double.parseDouble(cValue);

            double discriminant = b * b - 4 * a * c;
            String equation = aValue + "x² + " + bValue + "x + " + cValue;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                String results = "Soluciones: x1 = " + root1 + ", x2 = " + root2;
                jtvEquation.setText("Ecuación: " + equation);
                jtvResults.setText(results);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                String results = "Solución única: x = " + root;
                jtvEquation.setText("Ecuación: " + equation);
                jtvResults.setText(results);
            } else {
                String results = "No hay soluciones reales.";
                jtvEquation.setText("Ecuación: " + equation);
                jtvResults.setText(results);
            }
        }
    }
}



