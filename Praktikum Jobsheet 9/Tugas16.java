import java.util.Scanner;
public class Tugas16 {

    public static void main(String[] args) {
        Scanner sc16 = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen dalam array: ");
        int banyakElemen = sc16.nextInt();

        int[] arr = new int[banyakElemen];

        for (int i = 0; i < banyakElemen; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            arr[i] = sc16.nextInt();
        }

        int nilaiTertinggi = arr[0];
        int nilaiTerendah = arr[0];
        int total = arr[0];

        for (int i = 1; i < banyakElemen; i++) {
            if (arr[i] > nilaiTertinggi) {
                nilaiTertinggi = arr[i];
            }
            if (arr[i] < nilaiTerendah) {
                nilaiTerendah = arr[i];
            }
            total += arr[i];
        }

        double rataRata = (double) total / banyakElemen;

        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Nilai rata-rata: " + rataRata);
    }
}
    

