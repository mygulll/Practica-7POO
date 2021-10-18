public class Main {
    public static void main(String[] args) {
        //R por robot, P por procedimiento
        int optionR, optionP;
        Robot[] robots = new Robot[3];
        robots[0] = new MagnumOpus();
        robots[1] = new MiniPicador();
        robots[2] = new MiniCalentador();
        System.out.println("Bienvenidos a nuestro restaurant automatizado, donde los robots hacen todo por usted...");

        do{
            System.out.println("Elija el robot que desea utilizar\n" +
                    "\n0) "+ robots[0].getNombre() +
                    "\n1) "+ robots[1].getNombre() +
                    "\n2) "+ robots[2].getNombre());
            optionR = CapturaEntrada.capturarEntero("");

            System.out.println("\nGracias por elegir a nuestro robot "+robots[optionR].getNombre());
            System.out.println("Que tarea deseas que realice..." +
                    "\n0) Preparar ingredientes" +
                    "\n1) Cocinar los ingredientes" +
                    "\n2) Servir el platillo");
            optionP  = CapturaEntrada.capturarEntero("");
            switch (optionP){
                case 0:
                    robots[optionR].preparing();
                    break;
                case 1:
                    robots[optionR].cooking();
                    break;
                case 2:
                    robots[optionR].serving();
                    break;
            }
            robots[optionR].estadoRobot();
        }while(!Robot.isSuccess());
        System.out.println("Hurra!!! El plato estaba delicioso");
    }
}
