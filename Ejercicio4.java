public class Ejercicio4 {
    public static void main(String[] args) {
        Carros carro = new Carros("Subaru");
        carro.toggleLights();
        carro.checkLights();
        carro.lockSeatBelts();
        carro.checkSeatBelts();
        carro.start();
        carro.accelerate();
    }
}

interface Safetyy{
    public boolean checkSeatBelts();
    public void lockSeatBelts();
}

interface  SafetyLights extends Safetyy{
    public void checkLights();
    public void toggleLights();
}

class Carros implements SafetyLights{
    String model;
    int mileage;
    double speed;

    public Carros(String model){
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

    @Override
    public void checkLights() {
        System.out.println("Luces en orden");
    }

    @Override
    public void toggleLights() {
        System.out.println("Toggled");
    }
}


