import java.util.Arrays;

public class JavaLessonNine {

    public static void main(String[] args) {

//                        *********
//        ARRAYS - hold different values by indices
//        Has a fixed size and can't be changed...It's an Object

        int[] randomArray;

        int[] numberArray = new int[10];
        randomArray = new int[20];

//        Adding value to array
        randomArray[1] = 2;
//          Array of Strings
        String[] stringArray = {"just", "random", "words"};
//          Adding value to an Array with a for loop
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i;
        }

        int k = 1;
        while (k <= 41) {
            System.out.print('-');
            k++;
        }
        System.out.println();

//        Looping to show what an array looks like
        for (int j = 0; j < numberArray.length; j++) {
            System.out.print("| " + j + " ");
        }
        System.out.println("|");

//                **********
//        Multi-dimensional Array

        String[][] multiArray = new String[10][10];

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = i + " " + j;
            }
        }
        k = 1;
        while (k <= 61) {
            System.out.print('-');
            k++;
        }
        System.out.println();

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {

                System.out.print("|" + multiArray[i][j] + " ");

            }
            System.out.println("|");
        }

        k = 1;
        while (k <= 61) {
            System.out.print('-');
            k++;
        }

        System.out.println("\n");
        
//                     ****************
//        Enhanced FOR LOOP to print ARRAY Values


        for(int row : numberArray){
            System.out.print(row);

        }



        System.out.println("\n");


        

        //                     ****************
//        Enhanced FOR LOOP with a Multi-dimensional

        for(String[] rows : multiArray){

            for (String column : rows){
                System.out.print("|" + column + " ");
            }
            System.out.println("|");
          }


//        ********
//        Copy Array with enhanced For Loop
        int[] numberCopy = Arrays.copyOf(numberArray, 5);

        for(int row : numberCopy){
            System.out.print(row);

        }
        
        System.out.println("\n");

//        Copy Array by it's range/index
       int [] rangeC = Arrays.copyOfRange(numberArray, 3, 6);
        for(int row : rangeC){
            System.out.print(row);

        }
        
        System.out.println("\n");

        System.out.println(Arrays.toString(numberCopy));


//        Makes an array with the default values ...100
        int[] moreNumbers = new int[100];
        Arrays.fill(moreNumbers, 2);

//        Make an multi-dimensional array and fill it
        char[][] boardGame = new char[10][10];

        for (char[] row: boardGame){
            Arrays.fill(row, '*');
        }


//        **************************

//        Sort an Array with method
        int[] numsToSort = new int[10];

        for(int i = 0; i < 10; i++){
            numsToSort[i] = (int) (Math.random() * 100);
        }
//         **********
//        Sort an Array of numbers in ascending order
        Arrays.sort(numsToSort);
        System.out.println(Arrays.toString(numsToSort));
        

//        Binary Search for the index in an Array
        int whereIs50 = Arrays.binarySearch(numsToSort, 50);
        System.out.println(whereIs50);





















    }












































}
