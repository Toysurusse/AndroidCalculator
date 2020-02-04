package com.first.listener.operator;

import android.view.View;
import android.widget.Button;

import com.first.R;
import com.first.core.CoreCalculator;
import com.first.values.Operator;

public class Substract  extends OperatorProvider {

    public Substract() {
        Button bSubstract = (Button) com.first.core.View.get().findViewById(R.id.moins);
        bSubstract.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        calculate(CoreCalculator.getOperator());
        CoreCalculator.setOperator(Operator.LESS);
        CoreCalculator.resetScreen();
        super.onClick(v);
    }
}
