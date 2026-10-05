package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of salespeople: ");
        final int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;

        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int mx = sales[0];
        int mx_i = 0;
        int mn = sales[0];
        int mn_i = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
            if(mx<sales[i]){
                mx = sales[i];
                mx_i = i;
            }
            if(sales[i]<mn){
                mn = sales[i];
                mn_i = i;
            }
        }
        System.out.println("\nTotal sales: " + sum);

        System.out.println("Average sale: " + (double)sum/sales.length);

        System.out.println("Salesperson "+ (mx_i+1) + " had the highest sale with $"+ mx +".");
        System.out.println("Salesperson "+ (mn_i+1) + " had the lowest sale with $"+ mn +".");
        System.out.print("Enter a number:");
        double threshold = scan.nextDouble();
        int counter = 0;
        System.out.println("The salespeople who exceeded " + threshold +" in sales:");
        for (int i=0; i<sales.length; i++)
        {
            if(threshold<sales[i]) {
                System.out.println(" " + (i+1) + " " + sales[i]);
                counter++;
            }
        }
        System.out.println("Total : "+ counter +" people.");
    }
}