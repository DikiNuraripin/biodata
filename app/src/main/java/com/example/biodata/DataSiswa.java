package com.example.biodata;

public class DataSiswa {
        private String nis;
        private String nama;
        private String kelas;
        private String alamat;
        private String jurusan;

        public DataSiswa(String nis,String nama,String kelas,String alamat,String jurusan){
            this.nis= nis;
            this.nama= nama;
            this.kelas=kelas;
            this.alamat= alamat;
            this.jurusan= jurusan;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}
