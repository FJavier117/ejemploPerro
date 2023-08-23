package perro.parte;

public class Cola {
    private final String size;
    private final String forma;

    public Cola(String forma, String size){
        this.forma = forma;
        this.size = size;
    }

    public String moverCola(){
        return "";
    }

    @Override
    public String toString() {
        return size + " " + forma;
    }
}
