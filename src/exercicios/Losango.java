package exercicios;

public class Losango {

    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            System.out.print("\n");
            for (int j = 0; j < 9; j++) {
                if ((i == 0) && (j == 4)) {
                    System.out.print("*");
                    continue;
                }

                if ((i == 1) && (j == 3 || j == 5)) {
                    System.out.print("*");
                    continue;
                }

                if ((i == 2) && (j == 2 || j == 6)) {
                    System.out.print("*");
                    continue;
                }

                if ((i == 3) && (j == 1 || j == 7)) {
                    System.out.print("*");
                    continue;
                }

                if ((i == 4) && (j == 0 || j == 8)) {
                    System.out.print("*");
                    continue;
                }

                if ((i == 5) && (j == 1 || j == 7)) {
                    System.out.print("*");
                    continue;
                }

                if ((i == 6) && (j == 2 || j == 6)) {
                    System.out.print("*");
                    continue;
                }

                if ((i == 7) && (j == 3 || j == 5)) {
                    System.out.print("*");
                    continue;
                }

                if ((i == 8) && (j == 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
