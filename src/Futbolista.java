public class Futbolista extends Carrera{
    private int Dorsal;
    private String Demarcacion;

    @Override
    public void Concentrarse(){
        System.out.println("El futbolista está concentrado");
    }
    public void Viajar(){
        System.out.println("Viajando");
    }

    public Futbolista(){
    }

    public Futbolista(int pId, String pNombre, String pApellido, int pEdad, int pDorsal, String pDemarcacion) {
        super(pId, pNombre, pApellido, pEdad);
        this.Dorsal = Dorsal;
        this.Demarcacion = Demarcacion;
    }

    public int getDorsal() {
        return Dorsal;
    }

    public void setDorsal(int dorsal) {
        Dorsal = dorsal;
    }

    public String getDemarcacion() {
        return Demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        Demarcacion = demarcacion;
    }
}
