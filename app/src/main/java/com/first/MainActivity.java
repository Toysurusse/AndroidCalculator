package com.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.first.R;
import com.first.core.CoreCalculator;
import com.first.core.View;
import com.first.listener.ButtonManager;
import com.first.values.Operator;
import com.first.values.utilitiesStatic;

import java.math.BigDecimal;
import java.math.MathContext;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new View(this);

        new CoreCalculator();
        new ButtonManager();
    }


}
