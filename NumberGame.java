import java.util.Random;
import java.util.Scanner;

public class NumberGame {
       public static void main ( String [] args)
        {
            Random r=new Random();                              //r1 is object of Random class
            int x=r.nextInt(100)+1;                      // x is an integer variable to store random values generated by os
            System.out.println("Guess your Number(1-100) = ");
            Scanner sc = new Scanner(System.in);               //sc is the object of Scanner Class
            int ug;                                            //ug is user guess number
            do {
                ug = sc.nextInt();
                if (ug == x)                                    //comparing guess no with random number ,i.e,x
                {
                    System.out.println("Correct");
                } else if (x > ug) {
                    System.out.println("Too Low");
                } else {
                    System.out.println("Too High");
                }

            } while(ug!=x);


        }

    }



