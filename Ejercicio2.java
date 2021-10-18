public class Ejercicio2 {
    public static void main(String[] args) {
        Animal [][] animales = new Animal[2][2];
        animales[0][0] = new Pollo();
        animales[0][1] = new Pollo();
        animales[1][0] = new Largarto();
        animales[1][1] = new Perro();

        System.out.println("***Impresion con for ***");
        for (int i = 0; i < animales.length; i++) {
            for (int j = 0; j < animales.length; j++) {
                System.out.printf("[%d] [%d]\n", i,j);
                animales[i][j].eat();
            }
        }
        System.out.println("***Impresion para cada ***");
        animales[0][0].eat();
        animales[0][1].eat();
        animales[1][0].eat();
        animales[1][1].eat();


    }
}
abstract class Animal{
    //An abstract method can't have a body
    public abstract void eat();
    public abstract void sleep();

}

class Pollo extends Animal{

    @Override
    public void eat() {
        System.out.println("Pollito eating");
    }

    @Override
    public void sleep() {

    }
}
class Largarto extends Animal{

    @Override
    public void eat() {
        System.out.println("lagarto eating");
    }

    @Override
    public void sleep() {

    }
}
class Perro extends Animal{

    @Override
    public void eat() {
        System.out.println("Perrito eating");
    }

    @Override
    public void sleep() {

    }
}