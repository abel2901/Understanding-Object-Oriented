
package Exercises;

public class Quadrado {
    
      public static void main(String[] args) {

        for (int i = 0; i < 9; i++) {
            System.out.print("\n");
            for (int j = 0; j < 9; j++) {
                if (i == 0 || i == 8) {
                    System.out.print("*");
                    continue;
                }
                    //linha               //colunas
                if((i >= 1 && i <= 7) &&(j >= 1 && j <= 7)){
                    System.out.print(" ");
                }

                if(j == 0 || j == 8){
                    System.out.print("*");
                }
            }
        }
    }
}
