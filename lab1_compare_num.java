import java.util.Scanner;
public class lab1_compare_num {
    public static void main(String[] args) {
        System.out.println("Enter Number1: ");
        Scanner var1 = new Scanner(System.in);
        Double Number1 = var1.nextDouble();
        System.out.println("Enter Number2: ");
        Double Number2 = var1.nextDouble();
        Double result = Number1-Number2;
        if (result<=0.1 && result>=-0.1){
            System.out.print("Number1: "+Number1+" close "+"Number2:"+Number2);

        }
        else 
            System.out.print("Number1: "+Number1+" don't close "+"Number2:"+Number2);
    }
    
}