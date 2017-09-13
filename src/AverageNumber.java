import java.util.Scanner;
/**
 *Program to find the average number of 10 numbers.
 *Author: Zhonglin Yang
 *E-mail Address: zy2708@email.vccs.edu
 *Last Changed: September 11, 2017
 */
public class AverageNumber //Title of 2.1 Assignment
{
    /**
     *
     * Main Method
     * @param args not using any argument
     */
    public static void main (String[] args )
    {
        Scanner number= new Scanner (System.in);
        System.out.println("Enter 10 numbers seperated by commas to find the average number.");
        number.useDelimiter(",");
        int n1=number.nextInt();
        int n2=number.nextInt();
        int n3=number.nextInt();
        int n4=number.nextInt();
        int n5=number.nextInt();
        int n6=number.nextInt();
        int n7=number.nextInt();
        int n8=number.nextInt();
        int n9=number.nextInt();
        int n10=number.nextInt();
        double sum=(n1+n2+n3+n4+n5+n6+n7+n8+n9+n10);
        // The average number may not be a whole number.
        double average=sum/10;
        System.out.println("The numbers you entered:\n\t"+n1+","+n2+","+n3+","+n4+","+n5+","+n6+","+n7+","+n8+","+n9+","+n10+",");
        System.out.println("And the averge number:\n\t"+average);
    }
}
