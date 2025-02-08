import java.util.Scanner;
public class lab5 {
    public static void main(String[] args) {
        Scanner words = new Scanner(System.in);
        System.out.println("Pls input word : ");
        String word = words.nextLine();

        for (int i =0;i<word.length();i++){
            System.out.println(word.charAt(i));
        }
        
    }
    
}