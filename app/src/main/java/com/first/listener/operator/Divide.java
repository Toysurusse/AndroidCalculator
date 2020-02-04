package com.first.listener.operator;

import android.view.View;
import android.widget.Button;

import com.first.R;
import com.first.core.CoreCalculator;
import com.first.values.Operator;

public class Divide extends OperatorProvider {

    public Divide() {
        Button bDivide = (Button) com.first.core.View.get().findViewById(R.id.buttonDivide);
        bDivide.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        calculate(CoreCalculator.getOperator());
        CoreCalculator.setOperator(Operator.DIVIDE);
        CoreCalculator.resetScreen();
        super.onClick(v);
    }
}
