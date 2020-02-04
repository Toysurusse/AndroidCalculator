package com.first.listener;

import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.first.R;
import com.first.core.CoreCalculator;
import com.first.values.Var;

import java.math.BigDecimal;

public class PadNumber extends AppCompatActivity implements View.OnClickListener {

    public PadNumber (){
        // On récupère le bouton par son identifiant
        Button b0 = (Button) com.first.core.View.get().findViewById(R.id.button0);
        Button b1 = (Button) com.first.core.View.get().findViewById(R.id.button1);
        Button b2 = (Button) com.first.core.View.get().findViewById(R.id.button2);
        Button b3 = (Button) com.first.core.View.get().findViewById(R.id.button3);
        Button b4 = (Button) com.first.core.View.get().findViewById(R.id.button4);
        Button b5 = (Button) com.first.core.View.get().findViewById(R.id.button5);
        Button b6 = (Button) com.first.core.View.get().findViewById(R.id.button6);
        Button b7 = (Button) com.first.core.View.get().findViewById(R.id.button7);
        Button b8 = (Button) com.first.core.View.get().findViewById(R.id.button8);
        Button b9 = (Button) com.first.core.View.get().findViewById(R.id.button9);

        // Puis on lui indique que cette classe sera son listener pour l'évènement Touch
        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (CoreCalculator.isReset() || (!CoreCalculator.getResultJ().getText().toString().contains(".") && Long.valueOf(CoreCalculator.getResultJ().getText().toString()).equals(0L))) {
            CoreCalculator.getResultJ().setText("");
        }

        switch (v.getId()) {
            case R.id.button0:
                CoreCalculator.setResultJAppend(Var.ZERO.getC());
                break;
            case R.id.button1:
                CoreCalculator.setResultJAppend(Var.UN.getC());
                break;
            case R.id.button2:
                CoreCalculator.setResultJAppend(Var.DEUX.getC());
                break;
            case R.id.button3:
                CoreCalculator.setResultJAppend(Var.TROIS.getC());
                break;
            case R.id.button4:
                CoreCalculator.setResultJAppend(Var.QUATRE.getC());
                break;
            case R.id.button5:
                CoreCalculator.setResultJAppend(Var.CINQ.getC());
                break;
            case R.id.button6:
                CoreCalculator.setResultJAppend(Var.SIX.getC());
                break;
            case R.id.button7:
                CoreCalculator.setResultJAppend(Var.SEPT.getC());
                break;
            case R.id.button8:
                CoreCalculator.setResultJAppend(Var.HUIT.getC());
                break;
            case R.id.button9:
                CoreCalculator.setResultJAppend(Var.NEUF.getC());
                break;
        }
        CoreCalculator.setReset(false);
        CoreCalculator.setResultat(new BigDecimal(CoreCalculator.getResultJ().getText().toString()));
    }
}
