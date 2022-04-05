/**
 * @(#)NUMBERS.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Exam;
import java.util.Scanner;
public class KIMMAKIM_2992_NUMBERS {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Input an Integer: ");
        int number=input.nextInt();

        if(number>=100000 && number<=100000000){
            
            int FirstLast=number%10;
            int SecondLast=(number%100)/10;
            int ThirdLast=(number%1000)/100;
            int Remains=(number/1000);
            int Sum=(ThirdLast+SecondLast+FirstLast+Remains);

                System.out.println("Last Three Digits: "+ThirdLast+" "+SecondLast+" "+FirstLast);
                System.out.println("Remaining Digits: "+Remains);
                System.out.println("Sum: "+Sum);

                int reverse=0;
                while (Sum>0) {
                int remainder=Sum%10;
                reverse=(reverse*10)+remainder;
                Sum/=10;
                }
                System.out.println("Reverse: "+reverse);
        
            }

        
    }
}
