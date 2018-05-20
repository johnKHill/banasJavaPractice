public class Cats extends Animals{
    //This is called "Inheritance" bc Cat inherits/extends all methods and charactristics in the Animal super class

    public String favToy = "Yarn";

    public void playWith(){
        System.out.println("Yeah " + favToy);
    }

    public void walkaround(){
        System.out.println(this.getName() + " stalks around");

    }

    public String getToy(){
        return this.favToy;
    }

    //       ******** The Constructor Method **********
//        is Executed when an Object is created
//      Generic constructor for the Cats class / doesn't do anything
    public Cats(){

    }

    //    A more Elaborate Constructor for creating a Animals subclass for Cat class
    
    public Cats(String name, String favFood, String favToy){
       super(name, favFood);
       this.favToy = favToy;
    }
    


    










































}

