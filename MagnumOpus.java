public class MagnumOpus extends Robot {

    public MagnumOpus() {
        super();
        setNombre("Magnum Opus");
    }

    @Override
    public void preparing() {
        if(getGeneralState().equals("null")){
            System.out.println("Preparando ingredientes...");
            System.out.println("Cortando carne...");
            System.out.println("Picando verduras...");
            System.out.println("Todos los ingredientes estan listos");
            this.lastAction = "prepared";
            setGeneralState("prepared");
            desgaste();
        }
        else{
            System.out.println("ERROR: Los ingredientes ya fueron preparados");
        }
    }

    @Override
    public void cooking() {
        if(getGeneralState().equals("prepared")){
            System.out.println("Cocinando platillo...");
            System.out.println("Platillo perfectamente cocinado, listo para servir.");
            setLastAction("cooked");
            setGeneralState("cooked");
            desgaste();
        }
        else{
            switch (getGeneralState()){
                case "null":
                    System.out.println("ERROR: No se ha preparado los ingredientes todavia...");
                    break;
                case "cooked":
                    System.out.println("ERROR: el platillo ya fue previamente cocinado");
                    break;
            }
        }
    }

    @Override
    public void serving() {
        if(getGeneralState().equals("cooked")){
            System.out.println("Sirviendo el platillo...");
            setLastAction("served");
            setGeneralState("served");
            desgaste();
            success = true;
        }
        else{
            switch (getGeneralState()){
                case "null":
                    System.out.println("ERROR: No se ha preparado los ingredientes todavia...");
                break;
                case "served":
                    System.out.println("ERROR: el platillo ya fue previamente servido");
                break;
                case "prepared":
                    System.out.println("ERROR: No se ha cocinado el platillo todavia... ");
                    break;
            }
        }

    }
}
