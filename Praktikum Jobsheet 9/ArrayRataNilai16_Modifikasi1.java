import java.util.Scanner;

public class ArrayRataNilai16_Modifikasi1 {

    public static void main(String[] args) {

        Scanner sc16 = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;
        int jumlahLulus = 0; // Variabel untuk menghitung jumlah mahasiswa yang lulus

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc16.nextInt();

            if (nilaiMhs[i] > 70) {
                jumlahLulus++; // Menginkrementasi jumlah mahasiswa yang lulus jika nilainya > 70
            }
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        rata2 = total / nilaiMhs.length;
        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Jumlah mahasiswa yang lulus: " + jumlahLulus); // Mencetak jumlah mahasiswa yang lulus
    }
}
