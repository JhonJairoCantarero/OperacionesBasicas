package com.example.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2;
    String res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.txtn1);
        n2 = (EditText) findViewById(R.id.txtn2);

    }
    public void EnviarSuma(View view){
        Intent i = new Intent(this,MainActivity2.class);
            float num1 = new Float(n1.getText().toString());
            float num2 = new Float(n2.getText().toString());
            res = ("RESULTADO: " + (num1+num2));
            i.putExtra("dato", res.toString());
        startActivity(i);
    }

    public void EnviarResta(View view){
        Intent i = new Intent(this,MainActivity2.class);
        float num1 = new Float(n1.getText().toString());
        float num2 = new Float(n2.getText().toString());
        res = ("RESULTADO: " + (num1-num2));
        i.putExtra("dato2", res.toString());
        startActivity(i);
    }

    public void EnviarDivision(View view){
        Intent i = new Intent(this,MainActivity2.class);
        float num1 = new Float(n1.getText().toString());
        float num2 = new Float(n2.getText().toString());
        res = ("RESULTADO: " + (num1/num2));
        i.putExtra("dato3", res.toString());
        startActivity(i);
    }

    public void EnviarMultiplicacion(View view){
        Intent i = new Intent(this,MainActivity2.class);
        float num1 = new Float(n1.getText().toString());
        float num2 = new Float(n2.getText().toString());
        res = ("RESULTADO: " + (num1*num2));
        i.putExtra("dato4", res.toString());
        startActivity(i);
    }

}