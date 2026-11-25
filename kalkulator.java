import java.util.Scanner;
public class kalkulator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[]args){
        int pilihan=-1;
        while (pilihan!=0) {
        System.out.println("====APLIKASI KALKULATOR====");
        System.out.println("1. Hitung Faktorial");
        System.out.println("2. Hitung Perpangkatan");
        System.out.println("3. Perkalian Matriks 2x2");
        System.out.println("0. Keluar");
        pilihan = scanner.nextInt();
        
        switch (pilihan) {
            case 1:
                hitungFaktorial();
                break;
            case 2:
                hitungPerpangkatan();
                break;
            case 3:
                perkalianMatriks();
                break;
            case 0:
                System.out.println("Terima kasih telah menggunakan Aplikasi Kalkulator.");
                break;
            default:
                System.out.println("Error! Silahkan input pilihan 0-3.");
        }
        }
    }
    
    public static void hitungFaktorial() {
        System.out.print("Masukkan angka untuk menghitung faktorial: ");
        int angka = scanner.nextInt();
        int hasil = 1;
        for (int i = angka; i > 0; i--) {
            hasil = hasil * i;
        }
        System.out.println("Faktorial dari " + angka + " adalah: " + hasil);
    }

    public static void hitungPerpangkatan() {
        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();
        System.out.print("Masukkan eksponen: ");
        int eksponen = scanner.nextInt();
        int hasil = 1;
        for (int i = 0; i < eksponen; i++) {
            hasil = hasil * angka;
        }
        System.out.println(angka + " pangkat " + eksponen + " adalah: " + hasil);
    }

    public static void perkalianMatriks() {
        int[][] matriksA = new int[2][2];
        int[][] matriksB = new int[2][2];
        int[][] hasil = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Masukkan matriks A baris [" + i + "] kolom [" + j + "]: ");
                matriksA[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Masukkan matriks B baris [" + i + "] kolom [" + j + "]: ");
                matriksB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j] = matriksA[i][0] * matriksB[0][j] + matriksA[i][1] * matriksB[1][j];
            }
        }

        System.out.println("Hasil perkalian matriks A dan B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}