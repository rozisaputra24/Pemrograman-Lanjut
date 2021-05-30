package org.rozi.pemrogramanlanjut.gui;

import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormBiodata {
    private JTextField textNama;
    private JTextField textNIM;
    private JButton buttonCari;
    private JPanel rootPanel;
    private JTextArea textHasil;
    private JButton ButtonSelesai;

    public FormBiodata() {
        buttonCari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Mengambil data dari textNama
                String nama = textNama.getText();

                //Mengambil data dari textNIM
                String nim = textNIM.getText();

                //Diproses
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);

                //Tampilkan output ke form
                textHasil.setText(
                 "Nama\t\t: " + mhs.getNama() + "\n"
                 + "NIM\t\t: " + mhs.getNim() + "\n"
                 + "Jenjang Pendidikan\t: " + mhs.getJenjang() + "\n"
                 + "Tahun Masuk\t\t: " + mhs.getTahunMasuk() + "\n"
                 + "Fakultas\t\t: " + mhs.getFakultas() + "\n"
                 + "Prodi\t\t: " + mhs.getProdi() + "\n"
                 + "Jenis Kelamin\t\t: " + mhs.getJenisKelamin() +"\n"
                 + "Nomor Urut Mahasiswa\t: " + mhs.getNomorUrut() + "\n"
                );

            }
        });
        ButtonSelesai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }



    public JPanel getRootPanel() {
        return rootPanel;
    }

}
