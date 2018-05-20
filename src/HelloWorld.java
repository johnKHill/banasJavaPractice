public class HelloWorld {

//    This is the basic of Java's Primitive Data Types

    static String randomString1 = "String to print";
    static final double PINUM = 3.141529;

    public static void main(String[] args) {


        System.out.println(randomString1);
        System.out.println(PINUM);

        int integerOne = 22;
        int integerTwo = integerOne + 1;
        System.out.println(integerTwo);

        byte bigByte = 127;
        short bigShort = 32767;
        int bigInt = 2100000000;
        long bigLong = 922000000000000000L;
        float bigFloat = 3.14F;
        double bigDouble = 3.14823794872734872347923748;

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        boolean trueOrFalse = true;

        char randomChar = 66;
        char anotherChar = 'A';
        System.out.println(randomChar);

        char escapedChars = '\f';


        String randomString = "I'm a random string";
        String anotherString = "Stuff";


//        Combine these Strings
        String andAnotherString = randomString + ' ' + anotherString;
        System.out.println(andAnotherString);

//        Convert any type to a String
        String byteString = Byte.toString(bigByte);
        String shortString = Short.toString(bigShort);
        String intString = Integer.toString(bigInt);
        String longString = Long.toString(bigLong);
        String floatString = Float.toString(bigFloat);
        String doubleString = Double.toString(bigDouble);
        String booleanString = Boolean.toString(trueOrFalse);

        
//       How to (CAST) or convert one primitive to another
        double aDoubleValue = 3.14546466464;
        int doubleToInt = (int) aDoubleValue;
        System.out.println(doubleToInt);
//        (byte) (short) (long) (double) - char doesn't work



//      Turn a String into another primitive data type
        int stringToInt = Integer.parseInt(intString);
        System.out.println(stringToInt);
//        parseShort, parseLong, parseByte, parseFloat, parseDouble, parseBoolean - parse char doesn't work


        







    }








}
