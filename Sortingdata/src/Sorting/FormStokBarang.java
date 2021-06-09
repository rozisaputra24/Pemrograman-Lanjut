package Sorting;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormStokBarang {
    private JPanel rootPanel;
    private JTextField textNama;
    private JTextField textHarga;
    private JTextField textStok;
    private JButton ButtonSimpan;
    private JTable tableStokBarang;
    private DefaultTableModel tableModel;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public FormStokBarang() {
        this.initComponents();
        ButtonSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Nama = textNama.getText();
                String Harga = textHarga.getText();
                String Stok = textStok.getText();
                if(Nama.isBlank() || Harga.isBlank() || Stok.isBlank()){
                    JOptionPane.showMessageDialog(rootPanel,
                            "Data barang belum lengkap",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    tableModel.addRow(new Object[]{Nama, Harga, Stok });
                    //clear textfield
                    textNama.setText("");
                    textHarga.setText("");
                    textStok.setText("");
                }
            }
        });
    }

    private void initComponents(){
        Object[] tableColom = {
                "Nama Barang",
                "Harga Penyewaan/Hari (Rp)",
                "Stok Barang",
        };
        Object[][] initData = {
                {"Tenda Doom (2)", "20.000", "23"},
                {"Sleeping Bag", "10.000", "50"},
                {"Senter", "5.000", "67"},
                {"Carrier", "25.000", "46"},
                {"Nesting Set", "15.000", "39"},
        };
        tableModel = new DefaultTableModel(initData, tableColom);
        //set table model
        tableStokBarang.setModel(tableModel);
        //menampilkan sorting di setiap colom
        tableStokBarang.setAutoCreateRowSorter(true);
        //enable single selection
        tableStokBarang.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}
