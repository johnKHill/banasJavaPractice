import java.util.Scanner;

public class JavaLessonFive {

    static double myPI = 3.14159; //Class/Global Variable
    static int randomNumber; //Class/Global Variable
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
////        accessModifier, static, returnType, void, methodName()
//
//
////         Calling the Method
//        System.out.println(addThem(1,2));
//
////        System.out.println("Global " + myPI);
//
//        int d = 5;
////        tryToChange(d);
//
//        System.out.println("main d = " + d);

        System.out.println(getRandomNum(6));
        int guessResult = 1;
        int randomGuess = 0;

        while(guessResult != -1){
            System.out.println("Guess a number between 0 and 50: ");

            randomGuess = userInput.nextInt();

            guessResult = checkGuess(randomGuess);
        }

        System.out.println("Yes the random number is " + randomGuess);
        


    }


    public static int getRandomNum(int d){    // Create a random number and return a random number
//        Return a random number between 0 and 50
        randomNumber = (int) (Math.random() * 51);
        return randomNumber;

    }


    public static int checkGuess(int guess){
        if(guess == randomNumber){
            return -1;
        }else {
            return guess;
        }
    }
    

    public static int addThem(int a, int b){

//        double smallPI = 3.140; // Local Variable
//
//         myPI =  myPI + 3.0;

         
         int c = a + b;

            return c;
     }


     public static void tryToChange(int d){

        d = d + 1;
         System.out.println("tryToChange d = " + d);
     }






































}
