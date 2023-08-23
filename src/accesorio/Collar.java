package accesorio;

public class Collar {
    private final String size;
    private final String color;
    public Collar() {
        this.color = "Sin collar";
        this.size = "Sin collar";
    }

    public Collar(String size, String color){
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return color + " " + size;
    }
}
