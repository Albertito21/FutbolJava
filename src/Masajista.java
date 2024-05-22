public class Masajista extends Carrera{
    private String Titulacion;
    private Integer añosExperiencia;

    @Override
    public void Concentrarse(){
        System.out.println("El entrenador está concentrado");
    }
    public void Viajar(){
        System.out.println("Viajando");
    }
    public void darMasaje(){
        System.out.println("Dar masajes");
    }

    public Masajista() {
    }

    public Masajista(int pId, String pNombre, String pApellido, int pEdad, String pTitulacion, Integer pAñosExperiencia) {
        super(pId, pNombre, pApellido, pEdad);
        this.Titulacion = Titulacion;
        this.añosExperiencia = añosExperiencia;

    }

    public String getTitulacion() {
        return Titulacion;
    }

    public void setTitulacion(String titulacion) {
        Titulacion = titulacion;
    }

    public Integer getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(Integer añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
}
