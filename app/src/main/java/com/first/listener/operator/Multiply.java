package com.first.listener.operator;

import android.view.View;
import android.widget.Button;

import com.first.R;
import com.first.core.CoreCalculator;
import com.first.values.Operator;

public class Multiply extends OperatorProvider {

    public Multiply() {
        Button bMultiply = (Button) com.first.core.View.get().findViewById(R.id.buttonFois);
        bMultiply.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        calculate(CoreCalculator.getOperator());
        CoreCalculator.setOperator(Operator.MULTIPLY);
        CoreCalculator.resetScreen();
        super.onClick(v);
    }
}
