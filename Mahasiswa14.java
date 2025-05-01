public class Mahasiswa14 {
    String nama;
    String nim;
    String kelas;
    int nilai; //Perlu menambahkan int nilai

    Mahasiswa14(String nama, String nim, String kelas){ //Ganti namanya dari Mahasiswa menjadi Mahasiswa14
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1; //Menambahkan this diawal
    }

    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }
}
