public abstract class Robot implements Cooked, PreparedIngredients, Served{
    int bateria;
    String nombre;
    int ID;
    private static int counter;
    String lastAction = "null";
    protected static boolean success = false;
    private static String generalState = "null";

    public Robot() {
        setBateria(100);
        setLastAction("null");
        counter++;
        setID(counter);
    }

    public void setLastAction(String lastAction) {
        this.lastAction = lastAction;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public int getBateria() {
        return bateria;
    }

    public int getID() {
        return ID;
    }

    public String getLastAction() {
        return lastAction;
    }

    public void desgaste(){
        setBateria(getBateria()-10);
    }

    public void estadoRobot(){
        System.out.println("\n*** Estado del robot ***");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Identificacion: "+getID());
        System.out.println("Bateria: " + getBateria());
        System.out.println("Ultima accion realizada: " +getLastAction());
    }

    public static boolean isSuccess() {
        return success;
    }

    public static String getGeneralState() {
        return generalState;
    }

    public static void setGeneralState(String generalState) {
        Robot.generalState = generalState;
    }
}
