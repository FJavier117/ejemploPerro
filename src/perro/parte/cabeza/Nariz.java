package perro.parte.cabeza;

public class Nariz {
    private final String forma;
    private  final String size;

    public Nariz(String forma, String size){
        this.forma = forma;
        this.size = size;
    }

    public String oler(){
        return "";
    }

    @Override
    public String toString() {
        return "Forma: " + forma + "Tamaño: " + size;
    }
}
