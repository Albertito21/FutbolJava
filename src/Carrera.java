public class Carrera {
    private int Id;
    private String Nombre;
    private String Apellido;
    private int Edad;

    public void Concentrarse(){
        System.out.println("El jugador está concentrado");
    }
    public void Viajar(){
        System.out.println("Viajando");
    }
    public void jugarPartido(){
        System.out.println("El futbolista juega");
    }
    public void Entrenar(){
        System.out.println("El futbolista entrena");
    }

    public Carrera() {
    }

    public Carrera(int pId, String pNombre, String pApellido, int pEdad) {
        Id = pId;
        Nombre = pNombre;
        Apellido = pApellido;
        Edad = pEdad;
    }

    public int getId() {
        return Id;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public int getEdad() {
        return Edad;
    }


    public void setId(int id) {
        Id = id;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
}
