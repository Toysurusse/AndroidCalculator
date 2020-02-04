package com.first.listener.operator;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.first.R;
import com.first.core.CoreCalculator;
import com.first.values.Operator;

import java.math.BigDecimal;
import java.math.MathContext;

public class OperatorProvider extends AppCompatActivity implements View.OnClickListener{

    protected void calculate(Operator operator) {
        MathContext mc
                = new MathContext(5);
        switch (operator) {
            case DIVIDE:
                if (CoreCalculator.getResultat().equals(new BigDecimal(0))){
                    break;
                }
                CoreCalculator.setResultat(CoreCalculator.getResultatWait().divide(CoreCalculator.getResultat(), mc));
                break;
            case MORE:
                CoreCalculator.setResultat(CoreCalculator.getResultat().add(CoreCalculator.getResultatWait()));
                break;
            case MULTIPLY:
                CoreCalculator.setResultat(CoreCalculator.getResultat().multiply(CoreCalculator.getResultatWait(), mc));
                break;
            case LESS:
                CoreCalculator.setResultat(CoreCalculator.getResultatWait().subtract(CoreCalculator.getResultat()));
                break;
        }
        CoreCalculator.roundResult();
        CoreCalculator.setResultatWait(BigDecimal.valueOf(0));
        System.out.println("resultat affiché : {} " + CoreCalculator.getResultJ().getText().toString() + "// résultat : " + CoreCalculator.getResultat() + " résultat save : " + CoreCalculator.getResultatWait());
    }

    @Override
    public void onClick(View v) {
        CoreCalculator.setReset(true);
    }
}
