package com.first.listener.operator;

import android.view.View;
import android.widget.Button;

import com.first.R;
import com.first.core.CoreCalculator;
import com.first.values.Operator;

public class Equals extends OperatorProvider {

    public Equals() {
        Button bEquals = (Button) com.first.core.View.get().findViewById(R.id.buttonEquals);
        bEquals.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        calculate(CoreCalculator.getOperator());
        CoreCalculator.setOperator(Operator.EQUALS);
        super.onClick(v);
    }
}
