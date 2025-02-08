import java.util.Scanner;
import java.util.Arrays;
public class lab6_array {
    public static void main(String[] args) {
        Double[] score = new Double[5];

        Scanner a =new Scanner(System.in);
        int j=0;
        for( int i =0;i<5;i++){
            j=i+1;
            System.out.println("Enter value : "+j+":");
            score[i]=a.nextDouble();
        }
        System.out.print("product: ");
        for (int i=4;i>=0;i--){
            Arrays.sort(score);
            System.out.println(score[i]);
        }
        for(int i=0;i<5;i++){
            double even = score[i]%2;
            if (even==0){
                System.out.println("Even: "+score[i]+" ");
            }

        }
        //min
        System.out.print("MIN : ");
        System.out.println(score[0]);

        
        //max
        System.out.print("MAX : ");
        System.out.println(score[4]);
        
        //mean
        Double mean;
        Double sum=0.0;
        for (int i=0;i<5;i++){
            sum+=score[i];
            
        }
        mean = sum/5;
        System.out.println("Mean : "+mean);


    }
    
}