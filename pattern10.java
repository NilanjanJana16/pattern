import java.util.*;

public class pattern10{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();

     int outerspace = n/2;
     int innerspace = -1;

     for( int i=1; i<=n; i++){

        for(int j=1; j<=outerspace; j++){
            System.out.print("\t");
        }
        
            System.out.print("*\t");
        

        for(int j=1; j<=innerspace; j++){
            System.out.print("\t");
        }

        if(i>1 && i<n){
            System.out.print("*\t");
        }

        if(i<=n/2){
            outerspace--;
            innerspace += 2;
        }else{
            outerspace++;
            innerspace -= 2;
        }

        System.out.println();
     }


 }
}