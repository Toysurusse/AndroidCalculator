package com.first.core;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.first.R;
import com.first.values.Operator;
import com.first.values.Var;
import com.first.values.utilitiesStatic;

import java.math.BigDecimal;
import java.math.MathContext;

public class CoreCalculator extends AppCompatActivity {

    private static int round = 1;
    private static TextView resultJ = null;
    private static BigDecimal resultat = BigDecimal.valueOf(0);
    private static BigDecimal resultatWait = BigDecimal.valueOf(0);
    private static Operator operator = Operator.EQUALS;
    private static boolean reset;


    public CoreCalculator (){
        resultJ = (TextView) View.get().findViewById(R.id.theScreen);
    }

    public static void roundResult() {
        resultJ.setText("");
        resultJ.setText(String.valueOf(resultat));
        System.out.println("resultat affiché : {} " + resultJ.getText().toString() + "// résultat : " + resultat + " résultat save : " + resultatWait);
        if (resultJ.toString().contains(".")){
            System.out.println(" : " + resultJ.getText().toString() +" : " + utilitiesStatic.charAt(resultJ.getText().toString(), '.') + round);
            MathContext arround
                    = new MathContext(utilitiesStatic.charAt(resultJ.getText().toString(), '.') +
                    round);
            resultat = resultat.round(arround);
        }
        System.out.println("resultat affiché : {} " + resultJ.getText().toString() + "// résultat : " + resultat + " résultat save : " + resultatWait);
        resultJ.setText("");
        resultJ.setText(String.valueOf(resultat));
    }


    public static void resetScreen() {
        resultatWait = resultat;
        resultat = BigDecimal.valueOf(0);
        resultJ.setText(Var.ZERO.getC());
        System.out.println("resultat affiché : {} " + resultJ.getText().toString() + "// résultat : " + resultat + " résultat save : " + resultatWait);
    }




    public static int getRound() {
        return round;
    }

    public static void setRound(int newRound) {
        round = newRound;
    }

    public static TextView getResultJ() {
        return resultJ;
    }

    public static void setResultJ(String result) {
        resultJ.setText(String.valueOf(result));
    }


    public static void setResultJAppend(CharSequence result) {
        resultJ.append(result);
    }

    public static BigDecimal getResultat() {
        return resultat;
    }

    public static void setResultat(BigDecimal result) {
        resultat = result;
    }

    public static BigDecimal getResultatWait() {
        return resultatWait;
    }

    public static void setResultatWait(BigDecimal resultatW) {
        resultatWait = resultatW;
    }

    public static Operator getOperator() {
        return operator;
    }

    public static void setOperator(Operator ope) {
        operator = ope;
    }

    public static boolean isReset() {
        return reset;
    }

    public static void setReset(boolean res) {
        reset = res;
    }
}
