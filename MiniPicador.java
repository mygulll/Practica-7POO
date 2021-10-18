public class MiniPicador extends Robot{
    public MiniPicador() {
        super();
        setNombre("Mini Picador");
    }

    @Override
    public void preparing() {
        if(getGeneralState().equals("null")){
            System.out.println(getNombre() + " Ha iniciado...");
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
        System.out.println("ERROR: el modelo "+ getNombre()+" no puede realizar la accion de cocinar, elija un robot que si pueda...");
        System.out.println("Se recomienda usar los modelos Mini Calentador o Magnum Opus");
    }

    @Override
    public void serving() {
        System.out.println("ERROR: el modelo "+ getNombre()+" no puede realizar la accion de servir, elija un robot que si pueda...");
        System.out.println("Se recomienda usar los modelos Magnum Opus");
    }
}
