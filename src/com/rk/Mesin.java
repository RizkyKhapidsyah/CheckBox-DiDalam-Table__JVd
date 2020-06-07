package com.rk;

import javax.swing.*;

public class Mesin extends JTable {

    @Override
    public Class<?> getColumnClass(int column) {
        switch (column) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return Integer.class;
            case 3:
                return Boolean.class;
            default:
                return String.class;
        }
    }
}
