public class Ejercicio3 {
    public static void main(String[] args) {
        Car carro = new Car("Subaru");
        carro.lockSeatBelts();
        carro.checkSeatBelts();
        carro.start();
        carro.accelerate();
    }
}
interface Safety{
    public boolean checkSeatBelts();
    public void lockSeatBelts();
}

class Car implements Safety{
    String model;
    int mileage;
    double speed;

    public Car (String model){
        this.model = model;
    }

    public void start(){
        if(checkSeatBelts()){
            System.out.println(model + " is running");
        }
        else
            System.out.println("there was a problem starting "+model);
    }
    public void accelerate(){
        System.out.println("Accelerating");
        speed++;
    }


    @Override
    public boolean checkSeatBelts() {
        System.out.println("Seatbelts are working");
        return true;
    }

    @Override
    public void lockSeatBelts() {
        System.out.println("Seatbealts are locked");
    }
}


