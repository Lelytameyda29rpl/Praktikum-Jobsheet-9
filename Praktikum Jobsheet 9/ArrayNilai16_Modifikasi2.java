import java.util.Scanner;
public class ArrayNilai16_Modifikasi2 {

    public static void main(String[] args) {

        Scanner sc16 = new Scanner(System.in);

        int [] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan Nilai Akhir Ke-"+i+" : ");
            nilaiAkhir[i] = sc16.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-"+i+" lulus!");
            }
            
        }
    }
    
}
