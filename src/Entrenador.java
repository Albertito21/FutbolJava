public class Entrenador extends Carrera{
    private String Federacion;

    @Override
    public void Concentrarse(){
        System.out.println("El entrenador está concentrado");
    }
    public void Viajar(){
        System.out.println("Viajando");
    }
    public void dirigirPartido(){
        System.out.println("El entrenador dirige el partido");
    }
    public void dirigirEntrenamiento(){
        System.out.println("El entrenador dirige el entrenamiento");
    }

    public Entrenador() {
    }

    public Entrenador(int pId, String pNombre, String pApellido, int pEdad, String pFederacion) {
        super(pId, pNombre, pApellido, pEdad);
        this.Federacion = Federacion;
    }

    public String getFederacion() {
        return Federacion;
    }

    public void setFederacion(String federacion) {
        Federacion = federacion;
    }
}
