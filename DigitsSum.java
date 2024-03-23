import java.util.*;
public class DigitsSum
{
    public static void main (String[] args)
    {
    int num;
    int ones;
    int tens;
    int hunds;
    int sum;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    num = input.nextInt();
    input.close();

    ones = num%10;
    tens = (num/10)%10;
    hunds = (num-(tens*10)-(ones))/100;

    sum = ones + tens + hunds;

    System.out.println("The sum of the digits is: " + sum);

    }
    
}
