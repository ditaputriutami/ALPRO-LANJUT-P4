public class ExceptionHandlingMod4_Prak6 {

    public static void main(String[] args) {
        int[][] matriks = {{12, 23, 32}, {34, 56, 63}, {78, 89, 97}};
        int j, k;

        System.out.println("Matriks Sebelum Transpose ");
        try {
            for (j = 0; j < matriks.length; j++) {
                for (k = 0; k < matriks[j].length; k++) {
                    System.out.print(matriks[j][k] + " ");
                }
                System.out.println();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Indeks di luar batas matriks.");
        }

        System.out.println("\nMatriks Setelah Transpose");
        try {
            for (j = 0; j < matriks[0].length; j++) {
                for (k = 0; k < matriks.length; k++) {
                    System.out.print(matriks[k][j] + " ");
                }
                System.out.println();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Indeks di luar batas matriks.");
        }
    }
}
