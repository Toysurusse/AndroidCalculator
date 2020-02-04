package com.first.listener.operator;

import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.first.R;
import com.first.core.CoreCalculator;

public class DecreaseRound extends AppCompatActivity implements View.OnClickListener{
    public DecreaseRound() {
        Button bMoinsComa = (Button) com.first.core.View.get().findViewById(R.id.decrease);
        bMoinsComa.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(CoreCalculator.getRound() >= 1){
            CoreCalculator.setRound(CoreCalculator.getRound() - 1);
        }
        CoreCalculator.roundResult();
        System.out.println("Arrondi : " + CoreCalculator.getRound());
    }
}
