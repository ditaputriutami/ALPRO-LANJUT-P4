import java.util.Scanner;
public class Praktik7 {
    public static void main(String[] args) {
        int b = 3; // Jumlah baris
        int d = 3; // Jumlah kolom

        Scanner scanner = new Scanner(System.in); // Buat Scanner di luar fungsi untuk efisiensi

        System.out.println("Masukkan Nilai Matrix:");
        int[][] matrix1 = new int[b][d];

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < d; j++) {
                matrix1[i][j] = input(scanner); // Gunakan Scanner dari luar
            }
        }

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int input(Scanner scanner) { // Terima Scanner sebagai argumen
        return scanner.nextInt();
    }
}
