import java.util.Scanner;
public class lab2_sum_number {
    public lab2_sum_number(){

    }
    public static void main(String[] args) {
        int i,sum;
        System.out.print("Enter score: ");
        Scanner var1 = new Scanner(System.in);
        int score = var1.nextInt();
        i=0;
        sum=0;
        while(i<score){
            i=i+1;
            sum = sum+i;

        }
        System.out.println("result = "+sum);
    }
}
