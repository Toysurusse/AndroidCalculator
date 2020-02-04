package com.first.core;

import android.app.Activity;
import android.widget.Button;

import com.first.R;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class View {

    private static ConcurrentHashMap<Integer, Button> buttonList = null;

    private static Activity activity;

    public View (Activity main){
        ConcurrentHashMap<Integer, Button> buttonList = new ConcurrentHashMap<Integer, Button>();
        activity = main;
    }

    public static Activity get(){
        return activity;
    }
}
