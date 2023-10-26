import java.util.Scanner;

public class LinearSearch16_Modifikasi1 {

    public static void main(String[] args) {

        Scanner sc16 = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = sc16.nextInt();
        
        int[] arrayInt = new int[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan elemen array ke-" + (i + 1) + ": ");
            arrayInt[i] = sc16.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int key = sc16.nextInt();
        int hasil = -1; // Inisialisasi hasil dengan -1 untuk menandakan bahwa key tidak ditemukan.

        for (int i = 0; i < jumlahElemen; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Key ada di posisi indeks ke-" + hasil);
        } else {
            System.out.println("Key tidak ditemukan");
        }
    }
}
