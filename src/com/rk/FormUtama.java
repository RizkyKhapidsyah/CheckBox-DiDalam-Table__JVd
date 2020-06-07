package com.rk;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class FormUtama extends JFrame {

    Mesin table;
    JScrollPane scroll;
    String header[] = {"Nama", "Jurusan", "Angkatan", "Lulus"};
    Object data[][] = {
            {"Rizky Khapidsyah", "Informatika", "2009", true},
            {"Kenniko Irman", "Ekonomi", "2009", false},
            {"Dessy Puspita Sari", "Ekonomi", "2011", true},
            {"Khairina El Tifani", "SMKN 3", "2006", false},
            {"Falih Robbiansyah", "SD", "2016", false}
    };

    public FormUtama() {
        super("CheckBox Di Dalam Tabel");
        Inisialisasi_Komponen();
    }

    private void Inisialisasi_Komponen() {
        DefaultTableModel model = new DefaultTableModel(data, header);

        table = new Mesin();
        table.setModel(model);

        scroll = new JScrollPane(table);
        scroll.setPreferredSize(new Dimension(400, 200));

        add(scroll, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
