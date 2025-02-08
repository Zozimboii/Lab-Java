import java.util.Scanner;
public class lab3_string_concat {
    public static void main(String[] args) {
        System.out.print("Enter Name: ");
        Scanner a = new Scanner(System.in);
        String name = a.nextLine();
        System.out.print("Enter last Name: ");
        String last = a.nextLine();
        String full = (name+" "+last);
        System.out.println(full);
        //input name
        int s = full.indexOf(' ');
        System.out.print("my name is ");
        System.out.println(full.substring(0, s));
        System.out.print("last name is ");
        System.out.println(full.substring(s+1,full.length()));
        //output name
        
        }
}
