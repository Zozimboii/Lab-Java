import java.util.Scanner;
public class lab4_count_char {
    public static void main(String[] args) {
        
        
        System.out.println("Enter Character: ");
        Scanner aChar = new Scanner(System.in);
        String cLower = aChar.nextLine();
        cLower = cLower.toLowerCase();
        System.out.println("Enter the sentence: ");
        String aSentence = aChar.nextLine();
        aSentence = aSentence.toLowerCase();

        int ans =0;
        for (int i=0;i<aSentence.length();i++){
            if (cLower.charAt(0)==aSentence.charAt(i)){
                ans = ans+1;

            }
            else
                ans = ans;

        }
        if(ans>=1){
            System.out.print("result : "+cLower+":"+ans);
        }
        else    
            System.out.print("There isn't "+cLower);


    }
    
}