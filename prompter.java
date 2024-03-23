
import java.util.*;
public class prompter 

{
    public static void main (String[]args)
    {
        int min;
        int max;
        int num3;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a minimum value: ");
        min = input.nextInt();
        System.out.print("Enter a maximum value: ");
        max = input.nextInt();
        
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        num3 = input.nextInt();
         
        while(num3 < min|| num3 > max){
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        num3 = input.nextInt();
        }
        
        input.close();        


    }
    
}
