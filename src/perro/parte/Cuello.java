package perro.parte;

public class Cuello {
    private final String size;

    public Cuello(String size){
        this.size = size;
    }

    public String moverCuello(){
        return "";
    }

    @Override
    public String toString() {
        return size;
    }
}
