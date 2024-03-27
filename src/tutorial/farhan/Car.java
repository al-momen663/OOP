package tutorial.farhan;

public class Car extends Vichel{

    int speed;
    void carSpeed(int speed){
        this.speed = speed;
    }
    void display(){
        carSpeed(super.speed);
        System.out.println("Speed "+speed);
    }

}
