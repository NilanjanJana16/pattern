import java.io.*;
import java.util.*;
public class pattern8 {
    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for( int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){

                if(i+j == n){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }

            }

            System.out.println();
            
        }

    }

    
}
