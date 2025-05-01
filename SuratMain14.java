import java.util.Scanner;

public class SuratMain14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StackSurat14 stack = new StackSurat14(10);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Id Surat        : ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa  : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas           : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi (hari)   : ");
                    int durasi = sc.nextInt(); 
                    sc.nextLine();

                    Surat14 srt = new Surat14(id, nama, kelas, jenis, durasi);
                    stack.push(srt);
                    System.out.println("Surat Berhasil Ditambahkan.");
                    break;

                case 2:
                    Surat14 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses Surat Berikut: ");
                        diproses.tampilSurat();
                        System.out.println("Surat Berhasil Diverifikasi");
                    }
                    break;
                
                case 3:
                    Surat14 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir: ");
                        terakhir.tampilSurat();
                    }
                    break;

                case 4:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String cari = sc.nextLine();
                    Surat14 hasil = stack.cariSurat(cari);
                    if (hasil != null) {
                        System.out.println("Surat ditemukan:");
                        hasil.tampilSurat();
                    } else {
                        System.out.println("Surat tidak ditemukan.");
                    }
                    break;

                case 5:
                    System.out.println("Terima Kasih");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 5);
    }
}
