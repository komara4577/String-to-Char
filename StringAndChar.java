//By Kevin O'Mara
import java.util.Scanner;

public class StringAndChar{
   public static void main (String [] args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a string:");
      String str = input.nextLine();
      
      characters(str);
   }
   
   public static void characters(String str){
      String str1 = str;
      for(int i = 0; i < str1.length(); i++){
         char ch = str1.charAt(i);
         System.out.println("Character at " + i + " Position: " + ch);
      }
   
   }
}