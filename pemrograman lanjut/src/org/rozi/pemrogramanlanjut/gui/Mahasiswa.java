package org.rozi.pemrogramanlanjut.gui;

public class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJenjang(){
        char kodeJ = nim.charAt(0);
        if(kodeJ == '1'){
            return "S1";
        } else if(kodeJ == '2'){
            return "S2";
        } else if(kodeJ == '3'){
            return "S3";
        }
        return "UNKNOWN";
    }

    public String getTahunMasuk(){
        char kodeTM1 = nim.charAt(1);
        char kodeTM2 = nim.charAt(2);
        if(kodeTM1 == '1' && kodeTM2 == '7'){
            return "2017";
        } else if(kodeTM1 == '1' && kodeTM2 == '8'){
            return "2018";
        } else if(kodeTM1 == '1' && kodeTM2 == '9'){
            return "2019";
        } else if(kodeTM1 == '2' && kodeTM2 == '0'){
            return "2020";
        }
        return "UNKNOWN";
    }

    public String getFakultas(){
        char kodeF = nim.charAt(3);
        if(kodeF == '1'){
            return "TARBIYAH DAN KEGURUAN";
        } else if(kodeF == '2'){
            return "SYARIAH DAN HUKUM";
        } else if(kodeF == '3'){
            return "USHULUDDIN";
        } else if(kodeF == '4'){
            return "DAKWAH DAN KOMUNIKASI";
        } else if(kodeF == '5'){
            return "SAINS DAN TEKNOLOGI";
        } else if(kodeF == '6'){
            return "PSIKOLOGI";
        } else if(kodeF == '7'){
            return "EKONOMI DAN ILMU SOSIAL";
        } else if(kodeF == '8'){
            return "PERTANIAN DAN PETERNAKAN";
        }
        return "UNKNOWN";
    }

    public String getProdi(){
        char kodeP1 = nim.charAt(4);
        char kodeP2 = nim.charAt(5);
        if(kodeP1 == '0' && kodeP2 == '1'){
            return "Teknik Informatika";
        } else if(kodeP1 == '0' && kodeP2 == '2'){
            return "Teknik Industri";
        } else if(kodeP1 == '0' && kodeP2 == '3'){
            return "Sistem Informasi";
        } else if(kodeP1 == '0' && kodeP2 == '4'){
            return "Matematika";
        } else if(kodeP1 == '0' && kodeP2 == '5'){
            return "Teknik Elektro";
        }
        return "UNKNOWN";
    }

    public String getJenisKelamin(){
        char kodeJK = nim.charAt(6);
        if(kodeJK == '1'){
            return "LAKI-LAKI";
        } else if(kodeJK == '2'){
            return "Perempuan";
        }
        return "UNKNOWN";
    }

    public String getNomorUrut(){
        char kodeNU1 = nim.charAt(7);
        char kodeNU2 = nim.charAt(8);
        char kodeNU3 = nim.charAt(9);
        char kodeNU4 = nim.charAt(10);
        return ""+kodeNU1 +kodeNU2 +kodeNU3 +kodeNU4;
    }

}
