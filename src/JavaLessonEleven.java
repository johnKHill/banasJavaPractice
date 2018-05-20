import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class JavaLessonEleven {

    public static void main(String[] args) {
//        *******************
//        This section will be about collection classes
//        Makes it easy to keep track of groups of objects.. ArrayLists
//        Similar to an Array except ArrayList AUTOMATICALLY RESIZE when you
//        delete or add items to them
//        THIS IS ANYTHING YOU CAN POSSIBLY DO WITH ARRAYLISTS


        ArrayList  arrayListOne;
        // Automatically starts with a default size of 10 but will/can change
        arrayListOne = new ArrayList();

        ArrayList arrayListTwo = new ArrayList(); // Made thus one all on 1 line

//        They can contain any type of information inside of it
//        This one only accepts Strings
         ArrayList<String> names = new ArrayList<String>();
//         Add to the new ArrayList
        names.add("John Smith");
        names.add("James Hodges");
        names.add("Oliver Miller");
//        Another way to add items - index values... call the function and add the index
        names.add(2, "Jack Ryan");

//         To retrieve items in the ArrayList
//        Use the get method with a for loop
//        ArrayList uses the size method and NOT  length
//        And To replace a value in an ArrayList
//        You can also Remove items in and ArrayList
//        You can remove a specific RANGE of items- deletes off the ArrayList
//        Print out all items in the ArrayList
        names.set(0,"John Adams");
        names.remove(3);


        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));


        }
//        names.removeRange(0,1);
        System.out.println(names);

//        ENHANCED FOR LOOP - print everything in names ArrayList
        for(String i : names){
            System.out.println(i);
        }

//        Before the enhanced for loop, ther was the Iterator object
        //iterate through the values currently in the ArrayList by ****hasNext()**** method
//        And uses the ***next()**** method to return a boolean
        Iterator indivItems = names.iterator();

        while (indivItems.hasNext()){
            System.out.println(indivItems.next());
            
        }

//        You can create an ArrayList without  stating the values inside of them

        ArrayList nameCopy = new ArrayList();
        ArrayList nameBackup = new ArrayList();

//        Copy values from an ArrayList(names) and stored/add them in Another(nameCopy)
        nameCopy.addAll(names);

//        Take a String and save it to an ArrayList
        String paulYoung = "Paul Young";
        names.add(paulYoung);

//        Check if and Item is in an ArrayList by using the contains() method
//        This also checks for a boolean - if true, SOUT
        if(names.contains(paulYoung)){
            System.out.println("Paul is here");
        }

//         Check if everything in one ArrayList(names) is in Another ArrayList(nameCopy)
        if(names.containsAll(nameCopy)){
            System.out.println("Everything in nameCopy is in names");
        }
        
//        NOT going to print because I copied everything in names to nameCopy and
//        added to names... names has one additional value
        if(nameCopy.containsAll(names)){
            System.out.println("Everything in nameCopy is in names");
        }

//        Delete Everything inside of names ArrayList
        names.clear();

//        Check if the Arraylist is empty by calling on the isEmpty method which checks a boolean
        if(names.isEmpty()) {
            System.out.println("ArrayList is empty");
        }


//        Turn an ArrayList into a regular Array full of objects by using the ***toArray()*** method
        Object[] moreNames = new Object[4];
        moreNames = nameCopy.toArray();
//         Print everything in moreNames to a String array
        System.out.println(Arrays.toString(moreNames));

        










    }




















































}
