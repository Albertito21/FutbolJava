public class App {
    public static void main(String[] args) {
        Futbolista obj = new Futbolista();
        obj.setId(1);
        obj.setNombre("Angel");
        obj.setApellido("Sosa");
        obj.setEdad(21);
        obj.setDorsal(11);
        obj.setDemarcacion("Portero");
        System.out.println("Su nombre es: " + obj.getNombre() + " Su apellido es: " + obj.getApellido() + " Su edad es: "
                + obj.getEdad() + " Su dorsal es: " + obj.getDorsal() + " Su demarcacion es: " + obj.getDemarcacion());
        obj.jugarPartido();

        Entrenador objj = new Entrenador();
        objj.setId(1);
        objj.setNombre("Miguel");
        objj.setApellido("Lopez");
        objj.setEdad(45);
        objj.setFederacion("Epañol");
        System.out.println("El nombre del estrenador es: " + objj.getNombre() + " Su apellido es: " + objj.getApellido()
                + " Su edad es: " + objj.getEdad() + " Su federacion es: " + objj.getFederacion());
        objj.dirigirPartido();

        Masajista objt = new Masajista();
        objt.setId(1);
        objt.setNombre("Luis");
        objt.setApellido("Perez");
        objt.setEdad(30);
        objt.setTitulacion("Masajista");
        objt.setAñosExperiencia(10);
        System.out.println("El nombre del masajista es: " + objt.getNombre() + " Su apellido es: " + objt.getApellido()
                + " Su edad es: " + objt.getEdad() + " Su titulacion es: " + objt.getTitulacion()
                + " Sus años de experiencia es: " + objt.getAñosExperiencia());
        objt.darMasaje();
    }
}
