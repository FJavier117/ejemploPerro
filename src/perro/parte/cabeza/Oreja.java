package perro.parte.cabeza;

public class Oreja {
    private final String forma;
    private final String size;

    public Oreja(String forma, String size){
        this.forma = forma;
        this.size = size;
    }

    public String captarSonido(){
        return "";
    }

    @Override
    public String toString() {
        return "forma: " + forma + "tamaño: " + size;
    }
}
