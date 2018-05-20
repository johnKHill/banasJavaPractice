public abstract class Crashable {

//    Create an Abstract class whenever every method doesn't necessarily have to be implemented to use the abstract class
    boolean carDrivable = true;

    public void youCrashed(){
        this.carDrivable = false;
    }

//    You can create abstract classes inside of an abstract class
    public abstract void setCarStrength(int carStrength);

    public abstract int getCarStrength();



    
}
