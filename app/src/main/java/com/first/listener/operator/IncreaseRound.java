package com.first.listener.operator;

import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.first.R;
import com.first.core.CoreCalculator;
import com.first.values.Var;

public class IncreaseRound extends AppCompatActivity implements View.OnClickListener{
    public IncreaseRound() {
        Button bPlusComa = (Button) com.first.core.View.get().findViewById(R.id.increase);
        bPlusComa.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(CoreCalculator.getRound() <= 8) {
            CoreCalculator.setRound(CoreCalculator.getRound() + 1);
        }
        if (!CoreCalculator.getResultJ().getText().toString().contains(".")){
            CoreCalculator.setResultJAppend(".");
        }
        CoreCalculator.setResultJAppend(Var.ZERO.getC());
        CoreCalculator.setReset(true);
        System.out.println("Arrondi : " + CoreCalculator.getRound());
    }
}
