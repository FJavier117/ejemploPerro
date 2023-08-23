package perro.parte;

public class Tronco {
    private String size;
    private String color;

    public Tronco(String size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return color + " " + size;
    }
}
