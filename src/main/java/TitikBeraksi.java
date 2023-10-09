import java.util.Scanner;

public class TitikBeraksi {
    public static void main(String[] args){
        Scanner masukan = new Scanner(System.in);
        Titik titik = new Titik();

        int pilihan;
        do {
            System.out.println("MENU OPERASI TITIK");
            System.out.println("1. INISIALISASI TITIK");
            System.out.println("2. TAMPIL TITIK");
            System.out.println("3. PERKALIHAN SKALAR TITIK");
            System.out.println("4. PENCERMINAN TERHADAP SUMBU X");
            System.out.println("5. PENCERMINAN TERHADAP SUMBU Y");
            System.out.println("6. JARAK ANTARA DUA TITIK");
            System.out.println("0. KELUAR");
            System.out.print("MASUKAN PILIHAN : ");
            pilihan = masukan.nextInt();

            switch (pilihan){
                case 1:
                    System.out.print("Masukan nilai x : ");
                    int x = masukan.nextInt();
                    System.out.print("Masukan nilai y : ");
                    int y = masukan.nextInt();
                    titik.inisialisasiTitik(x, y);
                    break;

                case 2:
                    titik.tampilTitik();
                    break;

                case 3:
                    System.out.print("Masukan nilai skalar : ");
                    int skalar = masukan.nextInt();
                    titik.perkalianSkalar(skalar);
                    break;

                case 4:
                    titik.pencerminanSumbuX();
                    break;

                case 5:
                    titik.pencerminanSumbuY();
                    break;

                case 6:
                    Titik titik2 = new Titik();
                    System.out.print("Masukkan nilai x titik kedua: ");
                    int x2 = masukan.nextInt();
                    System.out.print("Masukkan nilai y titik kedua: ");
                    int y2 = masukan.nextInt();
                    titik2.inisialisasiTitik(x2, y2);
                    int jarak = titik.jarak(titik2);
                    System.out.println("Jarak antara dua titik: " + jarak);
                    break;

                case 0:
                    System.out.println("Terima Kasih");
                    break;

                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        }while (pilihan != 0);
    }
}
