
package Exercises;

public class Seta {
    public static void main(String[] args) {
       
        for(int i = 0; i < 9; i++){ 
            System.out.print("\n");
            for(int j = 0; j < 9; j++){
                if(j==4){
                    System.out.print("*");
                    continue;
                }
                
                if((j==5) && (i>=1 && i<=2)){
                    System.out.print("*");
                    continue;
                }
                
                if((j==6) && (i==2)){
                    System.out.print("*");
                    continue;
                }
                
                if((j==3)&&(i>=1 && i<=2)){
                    System.out.print("*");
                    continue;
                }
                
                if((j==2) &&(i==2)){
                    System.out.print("*");
                }
                
                else{
                    System.out.print(" ");
                }
            }
        }
    }
}
