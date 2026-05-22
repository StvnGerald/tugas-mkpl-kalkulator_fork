package com.simpel.kalkulator;

public class KalkulatorSimpel {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new KalkulatorForm().setVisible(true);
        });
    }
}
