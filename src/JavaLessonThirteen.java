import java.util.Arrays;

public class JavaLessonThirteen {

    public static void main(String[] args) {

//       This is focused on Strings and StringBuilders
        
         String randomString = "I'm just a randomstring";

//         Escape codes - quotes
         String gotToQuote = "He said, \"I'm here\"";
//          \n, new line
//          \b , backspaces
//          \'', apostrophes
//          \"", quotes
//          \\, backslash
        
//        Combine Strings
        int numTwo = 2;
        System.out.println(randomString + " " + gotToQuote);
        
//        print in primitive
        System.out.println(randomString + " " + numTwo);

//           ********************************
//      You can convert a String to a Primitive with parse - parseInt, parseDouble,
//        parseLong, parseByte, parseBoolean, parseFloat, parseSort

//        int stringToInt = Integer.parseInt(intString);

//           *********************************

//        String Equality-  2 strings with the "equals()" method
//        Equals is case sensitive; therefore, it will not return equal
//        BUT you can i"ignorecase"
        String uppercaseStr = "Big";

        String lowercaseStr = "big";

        if(uppercaseStr.equalsIgnoreCase(lowercaseStr)){
            System.out.println("They are equal");
        }


//        ******************************
//        What character is at a "specific index" of a string
//        strings have it's own index value'
//        *******************************
        
        String letters = "abcde";
        String moreLetters = "fghijk";

        System.out.println("2nd char: " + letters.charAt(1));

//        Compare strings - IF STRINGS ARE EQUAL, IT PRINTS A ZERO (0) or positive number. BUT,
//        if they ARE NOT EQUAL/FALSE,  it compares which string should come first and
//        prints a negative index number (-5) for the index it starts to represent false

        
        System.out.println(letters.compareTo(moreLetters));

//        **********************************
//        CHECK WHETHER A STRING CONTAINS CERTAIN THINGS - boolean
        System.out.println(letters.contains("abc"));

//        **********************************
//        CHECK IF STRING ENDS WITH SPECIFIC NUMBER OF CHARACTERS
        System.out.println(letters.endsWith("de"));

//        startswith()

//        Find the starting index position of a string
        System.out.println(letters.indexOf("cd"));

//        *************************
//        Specify the index to start searching from
//        indexOf(StringToLookFor, IndexStartPosition)

//        lastIndexOf() works like indexOf EXCEPT,
//        it starts from the end of the String you're searching


//        ******************************

//        Return the number of characters in a String
        System.out.println("Length: " + letters.length());

//        Replace certain character in a String
        System.out.println(letters.replace("abc", "xy"));





//        ****************************************
//        ***********************************
//        Create a String array using the " split() " method
//        calls for a regex/delimeter... tells how you want to split things up
//            ex.: a,b,c,
//        for this, divide everything up into separate spaces
        String[] letterArray = letters.split("");
        System.out.println(Arrays.toString(letterArray));

//        To put the characters into different compartments
        char[] charArray = letters.toCharArray();
        System.out.println(Arrays.toString(charArray));
          

//        Print different parts of the string by using the "subString()" method

        System.out.println(letters.substring(1,4));
//        Print to uppercase
        System.out.println(letters.toUpperCase());
//        Print to lowerscase
        System.out.println(letters.toLowerCase());

//       Get rid of the white space with the "trim(0" method
        String randString = "                  abfghfj          ";
        System.out.println(randomString.trim());

//        ***************************************************************************************
//        A STRING IS IMMUTABLE AND IT CREATE A NEW STRING SOMEHWERE ELSE IN MEMORY WHEN IT IS MANIPULATED
//        Use a "stringBuilder" when trying to make a ton of edits - it gets a block of memory
        
        StringBuilder randSB = new StringBuilder("A random value");

        System.out.println(randSB.append(" again"));
//        The append stays permanantely
        System.out.println(randSB);

//        Delete also
        System.out.println(randSB.delete(15, 21));

        //        Increase that space size... how many characters
        randSB.ensureCapacity(60);

        
//        Find out how much memory space the StringBuilder takes up -  character space
        System.out.println(randSB.capacity());

//        Length
        System.out.println(randSB.length());

//        Trim capacity down to size of actual string size
        randSB.trimToSize();

//       Find out how much memory space the StringBuilder takes up -  character space
        System.out.println(randSB.capacity());

//        Insert a String starting at an index
        System.out.println(randSB.insert(1,"nother" ));

//        Convert the stringBuilder to a String
        String oldSB = randSB.toString();






//        StringBuilders have some of the same methods as Strings
//        charAt(),
//        indexOf(),
//        lastIndexOf(),
//        subString()
//













    }






















































}
