package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)

    {
        Scanner scan = new Scanner(System.in);
        final int SALESPEOPLE;

        System.out.print("Give the number of salespeople :");
        SALESPEOPLE=scan.nextInt();


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
        int maxSale=sales[0];
        int minSale=sales[0];
        int indexMin=0;
        int indexMax=0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
            if(sales[i]>maxSale){
                maxSale=sales[i];
                indexMax=i;
            }
            if(sales[i]<minSale){
                minSale=sales[i];
                indexMin=i;
            }
        }
        System.out.println("\nTotal sales: " + sum);
        double avg=(double)sum/SALESPEOPLE;
        System.out.println("\nAverage: " + avg);
        System.out.println("\nSalesperson "+(indexMax+1)+" had the highest sale with $"+maxSale+".");
        System.out.println("\nSalesperson "+(indexMin+1)+" had the lowest sale with $"+minSale+".");

        System.out.print("\nEnter a value: ");
        int userValue=scan.nextInt();

        int count=0;

        for(int i=0;i<sales.length;i++){
            if(sales[i]>userValue){
                System.out.println("Salesperson " + (i+1) + " exceeded " + userValue + " with $" + sales[i]);
                count++;
            }

        }

        System.out.println("Number of salespeople who exceeded " + userValue + ": " + count);
    }
}