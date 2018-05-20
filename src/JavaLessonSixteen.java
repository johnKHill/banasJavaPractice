public class JavaLessonSixteen {

    public static void main(String[] args) {
//          ************************
//        This is about Objects and Classes
//        *********************

//        Create a new Vehicle Object (superCar) that has to be "casted"
        Object superCar = new Vehicle();
        System.out.println(((Vehicle)superCar).getSpeed());


//       Create a new Vehicle Object (superTruck) that has to be "casted" and checked for "equality"
//        New Objects are created with new "Hash codes"
        Object superTruck = new Vehicle();
        System.out.println((superCar.equals(superTruck)));
        System.out.println(superCar.hashCode());


/*        Finalize method - Java garbage collector calls this when you no longer need an object in memory...
        it cleans it up and gets rid of the extra space in memory*/

//        Get the class for an object
        System.out.println(superCar.getClass());

//        Gets the name of the object
        System.out.println(superCar.getClass().getName());

//        ***********************
//        Check if 2 objects are of the same class
        if(superCar.getClass() == superTruck.getClass()){
            System.out.println("The Same Class");
        }

        System.out.println();

//        Call the get super class method
        System.out.println(superCar.getClass().getSuperclass());

        //    toString Method has been overridden in the super (Vehicle) class
        System.out.println(superCar.toString());

//         Primitives are converted into Strings with the " toString() " method
        int randNum = 100;
        System.out.println(Integer.toString(randNum));

/*
//          clone() method allows you to copy the current values and everything of an object, of a certain time,
//          And assign it to another
//    Clone a Vehicle by defining Clonable in the super/cloneable class along with the method...error exception
        superTruck.setWheels(6);
        Vehicle superTruck2 = (Vehicle)superTruck.clone();
        System.out.println(superTruck.getWheels());
        System.out.println(superTruck2.getWheels());
*/










    }



    























}
