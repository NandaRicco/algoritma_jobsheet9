public class Surat14 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    public Surat14(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void tampilSurat() {
        System.out.println("Id Surat   : " + idSurat);
        System.out.println("Nama       : " + namaMahasiswa);
        System.out.println("Kelas      : " + kelas);
        System.out.println("Jenis Izin : " + (jenisIzin == 'S' ? "Sakit" : "Izin Keperluan lain"));
        System.out.println("Durasi     : " + durasi + " hari");
    }
}
