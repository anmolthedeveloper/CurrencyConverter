package com.anmolthedeveloper.anmolsingh.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
    }

    Double k,m;

    public void euro(View view){
        k = checkAndGet();
        if (!(k==0)){
            m = k * 0.013;
            DecimalFormat decimalFormat = new DecimalFormat("#.00");
            textView.setText(decimalFormat.format(m));
        }
    }
    public void dollar(View view){
        k = checkAndGet();
        if (!(k==0)){
            m = k * 0.014;
            DecimalFormat decimalFormat = new DecimalFormat("#.00");
            textView.setText(decimalFormat.format(m));
        }
    }
    public void pound(View view){
        k = checkAndGet();
        if (!(k==0)){
            m = k * 0.011;
            DecimalFormat decimalFormat = new DecimalFormat("#.00");
            textView.setText(decimalFormat.format(m));
        }
    }
    public void yen(View view){
        k = checkAndGet();
        if (!(k==0)){
            m = k * 1.57;
            DecimalFormat decimalFormat = new DecimalFormat("#.00");
            textView.setText(decimalFormat.format(m));
        }
    }
    public void dinar(View view){
        k = checkAndGet();
        if (!(k==0)){
            m = k * 16.79;
            DecimalFormat decimalFormat = new DecimalFormat("#.00");
            textView.setText(decimalFormat.format(m));
        }
    }
    public void bitcoin(View view){
        k = checkAndGet();
        if (!(k==0)){
            m = k * 0.0000039;
            DecimalFormat decimalFormat = new DecimalFormat("#.00");
            textView.setText(decimalFormat.format(m));
        }
    }
    public void rubel(View view){
        k = checkAndGet();
        if (!(k==0)){
            m = k * 0.93;
            DecimalFormat decimalFormat = new DecimalFormat("#.00");
            textView.setText(decimalFormat.format(m));
        }
    }
    public void ausdollar(View view){
        k = checkAndGet();
        if (!(k==0)){
            m = k * 0.020;
            DecimalFormat decimalFormat = new DecimalFormat("#.00");
            textView.setText(decimalFormat.format(m));
        }
    }
    public void candollar(View view){
        k = checkAndGet();
        if (!(k==0)){
            m = k * 0.019;
            DecimalFormat decimalFormat = new DecimalFormat("#.00");
            textView.setText(decimalFormat.format(m));
        }
    }

    public double checkAndGet(){
        String s = editText.getText().toString();
        double n=0;
        if (TextUtils.isEmpty(s))
            editText.setError("Empty User Input");
        else {
            n = Double.parseDouble(s);
        }
        return n;
    }
}
