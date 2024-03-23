
public class Investment 
{
    public static void main (String[] args)
    {
    int years = 0;
    double value = 2500.0;
    double finalvalue = 5000.0;

    do{
        value += value*0.075;
        years ++;

        

    }while (value<finalvalue);

    System.out.println("Years: " + years);
    System.out.println("Final value: " + value);
    }
    
}