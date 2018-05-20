import java.util.Scanner;

public class JavaLessonFour {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
/*//         *********************
//        This will be on Looping
//        While is establishes a variable outside the loop
        int i = 1;
//         if it was = 20, it would print to 19
        while(i <=20){
            //continue statement
            if(i == 3){
                i +=2;
                continue;
            }
            System.out.println(i);
            i++;
//          Perfect way to print odd numbers
            if((i % 2) == 0){
                i++;
            }

            if(i > 10) {
                break;
            }

        }*/


////              ******************
////            Calculate value for Pi
//
//         double myPi = 4.0;
//         double j = 3.0;
//         // 4 - 4/3 + 4/5 - 4/7.....with the odd numbers forever
//        while(j < 100001){
//            myPi = myPi - (4/j) + (4/(j +2));
//            j += 4;
//            System.out.println(myPi);
//        }
//        System.out.println("Value of PI: " + Math.PI);




/*
//                 ************
//        Execute While Loop til user says Stop with UserInput
            String contYorN = "Y";

            int h = 1;

            while (contYorN.equalsIgnoreCase("y")) {

                System.out.println(h);
                System.out.println("Continue y or n?");
                contYorN = userInput.nextLine();
                h++;
            }
*/




/*
//                    *************
//                  DO While Looping

            int k = 100000;

            do {

            System.out.println(k);
            k++;

            } while(k < 10);
*/





        //                *************
//                     ||||| FOR LOOP |||||
//        for ( declare iterator; conditional statement; change iterator)
//                          **********

//      Counting in reverse from 10
        for (int l = 10; l >= 1; l--) {
            
            System.out.println(l);
        }

//        Counting to 10 using the core principles
        int m, n;
        for(m = 1, n = 2; m <= 9; m += 2, n += 2) {
            System.out.println(m + "\n" + n);
        }















        
    }





















































}
