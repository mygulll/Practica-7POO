public class MiniCalentador extends Robot{
    public MiniCalentador() {
        super();
        setNombre("Mini calentador");
    }

    @Override
    public void preparing() {
        System.out.println("ERROR: el modelo "+ getNombre()+" no puede realizar la accion de preparar los ingredientes, elija un robot que si pueda...");
        System.out.println("Se recomienda usar los modelos Mini Picador o Magnum Opus");
    }

    @Override
    public void cooking() {
        if(getGeneralState().equals("prepared")){
            System.out.println(getNombre() + " Ha iniciado...");
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
        System.out.println("ERROR: el modelo "+ getNombre()+" no puede realizar la accion de servir, elija un robot que si pueda...");
        System.out.println("Se recomienda usar los modelos Magnum Opus");
    }

}
