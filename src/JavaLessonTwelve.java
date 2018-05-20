import java.util.Arrays;
import java.util.LinkedList;

public class JavaLessonTwelve {

    public static void main(String[] args) {

//        ****THIS IS EVERY SINGLE THING YOU CAN DO WITH LINKEDLISTS****
        
//        This section is about LinkedList classes
//        Just another Collections like ArrayList
//        Comparison to Arraylist, it's suited whenever a Collection is needed to add/delete
//        different objects from alot. NOT suited when providing access to  information in
//        a collection using indexes.
//        LinkedLists are not organized like ArrayLists which is synchronously
//        Linkedlists are faster


//      Not restricted
        LinkedList linledListOne = new LinkedList();
//      Restricted the information to be received
        LinkedList<String> names = new LinkedList<String>();
//        Add to restricted list
        names.add("Ahmed Bennani");
        names.add("Ali Syed");

//       There are a bunch of methods for LinkiedLists
//       Add a name which you want it to be the (last) name in the list
        names.addLast("Nathan Martin");
//       Add a name which you want it to be the (first) name in the list
        names.addFirst("Joshua Smith");
//       Define the (position) you want the element in the list
        names.add(0, "Noah Peters");
//      You can (replace) an item
        names.set(2,"Paul Newman");
//       You can (remove) an item
        names.remove(4);
//      You can (remove) based on the value
        names.remove("Joshua Smith");

        
//        Still can use the ENHANCED FOR LOOP
        for(String name : names) {
            System.out.println(name);
        }

//        Retrieve (first) items by index - ( get() ) method
        System.out.println("\nFirst Index: " + names.get(0));


//         Retrieve last item or first
//        System.out.println("\nFirst Index: " + names.getLast());
        System.out.println("\nLast Index: " + names.getLast());


//        **************
//        Create a new Linkedlist and give it all the values another Linkedlist already has
//        In the constructor, pass in the LinkedList (names) that you want to copy
        
        LinkedList<String> nameCopy = new LinkedList<String>(names);
        System.out.println("\nnameCopy: " + nameCopy);

//        See if a linkedList contain (specific) items it
        if(names.contains("Noah Peters")){
            System.out.println("\nNoah's Here ");
        }

//        See if a linkedLists have the (exact) values
        if(names.containsAll(nameCopy)){
            System.out.println("\nCollections the Same");
        }

//        Return the index of the Object

        System.out.println("\nAli index at:: " + names.indexOf("Ali Syed"));

//        Return if a list is empty or not - boolean value

        System.out.println("\nList Empty " + names.isEmpty());

//        Return number of items in the object
        System.out.println("\nHow Many:" + names.size());

//        Methods come with a PEEK value - sees if a value is there or return a null value
//        You can use ( peek() ) instead of ( get() ) to avoid errors
        System.out.println("\nLook without Error: :" + names.peek());

//        Retrieve first element and delete it from Linkedlist,  ( poll() ) removes first element
        System.out.println("\nremove first element: " + nameCopy.poll());//

        // Retrieve last element and delete it from Linkedlist,  ( pollLast() ) removes last element
        System.out.println("\nremove last element: " + nameCopy.pollLast());


//        Manipulate LinkedLists by pushing, popping the values on
        nameCopy.push("Noah Peters");
//        Chops off the first element
        nameCopy.pop();
//        Still can use the ENHANCED FOR LOOP
        for(String name : nameCopy) {
            System.out.println(name);
        }

//        Create and Object array
//        Convert the names Linkedlist to and Array
        Object[] nameArray = new Object[4];

        nameArray = names.toArray();

        System.out.println(Arrays.toString(nameArray));


//        Delete everything in a Linkedlist
        
//        names.clear();



        
    }





































}
