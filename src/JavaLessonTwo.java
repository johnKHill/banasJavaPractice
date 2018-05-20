import java.util.Scanner;

public class JavaLessonTwo {

    static Scanner userInput = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.print("Your favorite number: ");
//        .nextDouble, .nextFloat, nextLine, etc. verifies the entries primitive data type
//        program will crash if data type doesn't store the value
        if(userInput.hasNextInt()) {  

            int numberEntered = userInput.nextInt();
            System.out.println("You entered " + numberEntered);

            int numEnterTimes2 = numberEntered + numberEntered;
            System.out.println(numberEntered + " + " + numberEntered + " = " + numEnterTimes2);

            int numEnterMinus2 = numberEntered - 2;
            System.out.println(numberEntered + " -  2  = " + numEnterMinus2);

            int numEnteredTimesSelf = numberEntered * numberEntered;
            System.out.println(numberEntered + " * " + numberEntered + " = " + numEnteredTimesSelf);

            int numEnterDivideBy2 = numberEntered / 2;
            System.out.println(numberEntered + " /  2  = " + numEnterDivideBy2);

            int numEnterRemainder = numberEntered % 2;
            System.out.println(numberEntered + " %  2  = " + numEnterRemainder);


//            Short hand with variables
             numberEntered += 2;
             numberEntered -= 2;

             numberEntered--;
             numberEntered++;

//             Find the Absolute value of a number
             int numberABS = Math.abs(numberEntered);
             int whichisBigger = Math.max(5, 7);   // 7
             int whichisBigger2 = Math.min(5, 7);  // 5

//              Return the Square root
            double numSqrt = Math.sqrt(5.23);

//            Round numbers up
            int numCeiling = (int) Math.ceil(5.23); // 6

            int numFloor = (int) Math.floor(5.23); // 5
            
//            Just a simple round
            int numRound = (int) Math.round(5.63); // 6

//             Get some random numbers
            int randomNumber = (int) (Math.random() * 11);
            System.out.println("Random Number " + randomNumber);





        } else {
            System.out.println("Enter an integer next time.");

        }
        
    }







}
