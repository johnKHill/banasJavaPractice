public class Vehicle extends Crashable implements Drivable, Cloneable{

//    The implement methods have to be created for anything that implements the Drivable interface
//    You must define everything that is inside the interface
//    Any method based off an interface, must be atleast as visible as the inteface itself
//    These methods are to always be public
//    Then, start defining what the methods will do
//    Place extends in the Vehicle/super to implement the abstract class
//    Clone a Vehicle by defining Clonable in the super/cloneable class and define the method called Clone

    int numOfWheels = 2;
    double theSpeed = 0;

    int carStrength = 0;


//    ***** Default Constructor *****
    public Vehicle() {

    }


    public int getWheels(){
        return this.numOfWheels;
    }

    public void setWheels(int numWheels){
         this.numOfWheels = numWheels;
    }

    public double getSpeed(){
        return this.theSpeed;
    }

    public void setSpeed(double speed){
        this.theSpeed = speed;
    }


//    ********* THE CONSTRUCTOR **********
    public Vehicle(int wheels, int speed){

        this.numOfWheels = wheels;
        this.theSpeed = speed;
    }

    //    abstract classes
    public void setCarStrength(int carStrength){
         this.carStrength = carStrength;
    }

    public int getCarStrength(){
         return this.carStrength;
    }

//    Override toString Method with the declared number of wheels above
    public String toString(){
        return "Num of Wheels: " + this.numOfWheels;
    }

//    Clone Method - you have to catch the exception
//    Everytime I want to use the clone method, I will have to do this
    public Object clone(){
//        create a car
       Vehicle car;

//       Cast it in the try method with the super
       try{
           car = (Vehicle) super.clone();
       }
       catch (CloneNotSupportedException e){
           return null;
       }
        return car;
    }

}
