package perro.parte;

public class Pecho {
    String size;
    String color;

    public Pecho(String size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return color + " " + size;
    }
}
