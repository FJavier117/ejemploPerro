package perro.parte;

public class Pata {
    private final String size;
    private final int numerDedos;
    private final String colorAlmohadilla;
    private final String tipo;

    public Pata(String size, int numerDedos, String colorAlmohadilla, String tipo) {
        this.size = size;
        this.numerDedos = numerDedos;
        this.colorAlmohadilla = colorAlmohadilla;
        this.tipo = tipo;
    }

    public String caminar(){
        return "";
    }

    public String correr(){
        return "";
    }

    public String brincar(){
        return "";
    }


    @Override
    public String toString() {
        return numerDedos + " " + colorAlmohadilla +" "+ tipo;
    }
}
