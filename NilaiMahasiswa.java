import java.util.Scanner;

public class NilaiMahasiswa {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // Mendapatkan jumlah mahasiswa
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        // Deklarasi array untuk menyimpan data mahasiswa
        String[][] dataMahasiswa = new String[jumlahMahasiswa][4]; // Nama, NIM, Jurusan, Rata-rata
        int[][] nilaiMahasiswa = new int[jumlahMahasiswa][3]; // Nilai Tes 1, Tes 2, Tes 3

        // Input data untuk setiap mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa " + (i + 1));
            System.out.print("Nama: ");
            dataMahasiswa[i][0] = input.nextLine(); // Konsumsi karakter baris baru
            input.nextLine(); // Baca nama sebenarnya
            System.out.print("NIM: ");
            dataMahasiswa[i][1] = input.nextLine();
            System.out.print("Jurusan: ");
            dataMahasiswa[i][2] = input.nextLine();

            // Input dan hitung nilai serta rata-rata mahasiswa
            for (int j = 0; j < 3; j++) {
                System.out.print("Nilai Tes " + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = input.nextInt();
                dataMahasiswa[i][3] += nilaiMahasiswa[i][j];
            }
            dataMahasiswa[i][3] = Integer.parseInt(dataMahasiswa[i][3]) / 3;

            System.out.println();
        }

        // Mencari nilai tertinggi dan terendah untuk setiap tes dan rata-rata
        int[] nilaiTertinggi = new int[3];
        int[] nilaiTerendah = new int[3];
        float rataRataTertinggi = Float.MIN_VALUE;
        float rataRataTerendah = Float.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            nilaiTertinggi[i] = nilaiMahasiswa[0][i];
            nilaiTerendah[i] = nilaiMahasiswa[0][i];
        }

        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < 3; j++) {
                if (nilaiTertinggi[j] < nilaiMahasiswa[i][j]) {
                    nilaiTertinggi[j] = nilaiMahasiswa[i][j];
                }
                if (nilaiTerendah[j] > nilaiMahasiswa[i][j]) {
                    nilaiTerendah[j] = nilaiMahasiswa[i][j];
                }
            }

            if (rataRataTertinggi < dataMahasiswa[i][3]) {
                rataRataTertinggi = Float.parseFloat(dataMahasiswa[i][3]);
            }
            if (rataRataTerendah > dataMahasiswa[i][3]) {
                rataRataTerendah = Float.parseFloat(dataMahasiswa[i][3]);
            }
        }

        // Menampilkan tabel hasil
        System.out.println("---------------------------");
        System.out.println("Daftar Nilai Mahasiswa: ");
        System.out.println("---------------------------");
        System.out.println("\t\t\t\tNama\tNIM\tJurusan\tTest 1\tTest 2\tTest 3\tRata-rata");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Mahasiswa " + (i + 1) + "\t");
            for (int j = 0; j < 4; j++) {
                System.out.print(dataMahasiswa[i][j] + "\t");
            }
            System.out.println();
        }



System.out.print(rataRataTertinggi); // Rata-rata tertinggi
System.out.println();
System.out.print("Nilai Terendah\t");
for (int i = 0; i < 3; i++) {
  System.out.print(nilaiTerendah[i] + "\t");
}
System.out.print(rataRataTerendah); // Rata-rata terendah
System.out.println();
  }
}
