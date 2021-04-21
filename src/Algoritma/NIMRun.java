/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritma;

/**
 *
 * @author user
 */
public class NIMRun {
    public static void main(String[] args) {
        String nim = "12050116400";
        NIM objNim = new NIM();
        objNim.setNim(nim);
        System.out.println("Jenjang Pendidikan = "+objNim.getJenjang());
        System.out.println("Tahun Masuk = "+objNim.getTahunMasuk());
        System.out.println("Fakultas = "+objNim.getFakultas());
        System.out.println("Jurusan/Prodi = "+objNim.getProdi());
        System.out.println("Jenis Kelamin = "+objNim.getJenisKelamin());
        System.out.println("Nomor Urut Mahasiswa = "+objNim.getNomorUrut());
    }
}
