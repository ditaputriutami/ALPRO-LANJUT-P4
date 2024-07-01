import java.util.Scanner;
public class Praktik5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] x = {{1, 2, 3}, {4, 5, 6}};
        int[][] y = {{3, 6, 1}, {4, 7, 9}};
        int baris = 2;
        int kolom = 3;

        System.out.println("Ini adalah matrix x");
        cetakMatriks(x);

        System.out.println("Ini adalah matrix y");
        cetakMatriks(y);

        // Penjumlahan Matrix
        int[][] hasilPenjumlahan = jumlahkanMatriks(x, y);
        System.out.println("Hasil Penjumlahan Matrix:");
        cetakMatriks(hasilPenjumlahan);

        // Pengurangan Matrix
        int[][] hasilPengurangan = kurangiMatriks(x, y);
        System.out.println("Hasil Pengurangan Matrix:");
        cetakMatriks(hasilPengurangan);
    }

    static void cetakMatriks(int[][] matriks) {
        for (int[] baris : matriks) {
            for (int elemen : baris) {
                System.out.print(elemen + " ");
            }
            System.out.println();
        }
    }
    static int[][] jumlahkanMatriks(int[][] matriks1, int[][] matriks2) {
        int baris = matriks1.length;
        int kolom = matriks1[0].length;
        int[][] hasil = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }
        return hasil;
    }
    static int[][] kurangiMatriks(int[][] matriks1, int[][] matriks2) {
        int baris = matriks1.length;
        int kolom = matriks1[0].length;
        int[][] hasil = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] - matriks2[i][j];
            }
        }
        return hasil;
    }
}
