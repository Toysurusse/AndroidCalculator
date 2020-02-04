package com.first.listener.operator;

import android.telecom.CallRedirectionService;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.first.R;
import com.first.core.CoreCalculator;

public class Comma extends AppCompatActivity implements View.OnClickListener{

    public Comma() {
        Button bComa = (Button) com.first.core.View.get().findViewById(R.id.buttonComa);
        bComa.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (!CoreCalculator.getResultJ().getText().toString().contains(".")) {
            CoreCalculator.setResultJAppend(".");
        }
    }
}
