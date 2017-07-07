package loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Foglea on 6/6/2017.
 */
public class FactorialCalculator {
    public static void main(String[]args){
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        String input;
        int num;
        try{
            boolean isValid= false;//conditions below for if the input is valid. Validity set to false
            System.out.println("This program will calculate the factorial of the number ");
            System.out.println("Enter number between 1 and 20: ");// all used to accept input from the user
            do {// loop that will make sure user follows rules
                input= br.readLine();
                num= Integer.parseInt(input);
                if(num < 1
                        || num >20 ){//make sure the input num is between 1 and 20
                     System.out.println("Please enter a number between 1 and 20 ");
                }
                else {
                    isValid =true;//if the input passes the boolean is set to true then goes to the while loop
                }
            } while (!isValid);//while isValid is true
            long factorial =1;// factorial numbers are usually big(multiplication of numbers between 1 and given number)
            for (int num2 = num; num2 >=1; num2--) {
                factorial = factorial * num2;
            }
            System.out.println("Factorial of " +num + " is " +factorial);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
