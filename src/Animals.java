//    Animals is super used to make subclasses/copies of change those copies
//    Has to be protected so the subclasses are able to access the super class

public class Animals{

    private String name = "Animal";
    public String favFood = "Food";
    //    Its possible to override the super class methods --- use the "final" keyword so a subclass can do so and
//    not be changed by any subclasses
    protected final void changeName(String newName){
        this.name = name;
    }


    protected final String getName(){
        return this.name;
    }


    public void eatStuff(){
        System.out.println("Yum " + favFood);
    }


    public void walkaround(){
        System.out.println(this.name + " walks around");
    }

    //       ******** The Constructor Method **********
//        is Executed when an Object is created
//      Generic constructor for the Animals class / doesn't do anything
    public Animals(){

    }


//    A more Elaborate Constructor
    public Animals(String name, String favFood){
        this.changeName(name);
        this.favFood = favFood;
    }





}
