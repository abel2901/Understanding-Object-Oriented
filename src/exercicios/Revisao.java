package exercicios;

public class Revisao {

    public static void main(String[] args) {

        imprimir();
        multiplo();
    }

    /**
     * Imprima todos os números de 150 a 300. *
     */
    public static void imprimir() {
        for (int i = 150; i <= 300; i++) {
            System.out.println(+i);
        }
    }

    /*imprima todos os multiplos de 3 */
    public static void multiplo() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
