package com.first.listener;

import com.first.listener.operator.Comma;
import com.first.listener.operator.DecreaseRound;
import com.first.listener.operator.IncreaseRound;
import com.first.listener.operator.OperatorManager;

public class ButtonManager {

    public ButtonManager() {

        new PadNumber();
        new OperatorManager();


    }
}
