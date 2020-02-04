package com.first.listener.operator;

import android.view.View;
import android.widget.Button;

import com.first.R;
import com.first.core.CoreCalculator;
import com.first.values.Operator;

public class Add extends OperatorProvider {

    private Button bPlus = null;

    public Add() {
        bPlus = (Button) com.first.core.View.get().findViewById(R.id.buttonPlus);
        bPlus.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        calculate(CoreCalculator.getOperator());
        CoreCalculator.setOperator(Operator.MORE);
        CoreCalculator.resetScreen();
        super.onClick(v);
    }
}
