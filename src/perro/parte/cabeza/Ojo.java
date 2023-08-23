package perro.parte.cabeza;

public class Ojo {

    private final String color;
    private final String size;
    private final String forma;

    public  Ojo(){
        this.color = "sin ojos";
        this.size = "sin ojo";
        this.forma = "sin ojo";
    }
    public Ojo(String color, String size, String forma){
        this.color = color;
        this.size = size;
        this.forma = forma;
    }

    public String captarImage(){
        return "";
    }

    @Override
    public String toString() {
        return "Color:" + color + "Tamaño: " + size + "Forma: " + forma;
    }
}
