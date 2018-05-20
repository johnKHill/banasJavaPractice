public class JavaLessonThree {

    public static void main(String[] args) {
/*//         These will be Relational Operators:

        int randomNumber = (int) (Math.random() * 50);

        if (randomNumber < 25) {
            System.out.println("The random number is less than 25");

        } else if (randomNumber > 40) {
            System.out.println("The random number is greater than 40");

        } else if(randomNumber <= 18) {
            System.out.println("The random number is equal to 18");

        } else if (randomNumber != 40) {

            System.out.println("The random number is not equal to 40");

        } else {
            System.out.println("Nothing Worked");

        }
        System.out.println("The random number is " + randomNumber);

        //         These will be Relational Operators:

        if(!(false)){
            System.out.println("\nI turned false into true");

        } if((false) || (true)){
            System.out.println("One is true");

        }*/





//         **************************************************************

//        Conditional/Ternary Operator
//          Assigns 1 or another value based off a condition

        int valueOne = 1;
        int valueTwo = 2;

        int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;

        System.out.println(biggestValue);



//        Checking for the limited number of values with a Switch statement

        char theGrade = 'b';
        switch (theGrade) {
            case 'a':
            case 'A':
                System.out.println("Great Job");
                break; // Keep the break if I want to stop at that condition
            case 'b':   // catches lowercase letters
            case 'B':
                System.out.println("Good Job");
                break;
            case 'c':
            case 'C':
                System.out.println("Ok");
                break;
            case 'd':
            case 'D':
                System.out.println("Bad");
                break;
            default: 
                System.out.println("You Failed");
                break;
        }

        












    }













}
