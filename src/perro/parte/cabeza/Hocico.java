package perro.parte.cabeza;

public class Hocico {
    private final String size;
    private final String forma;

     public Hocico(String forma, String size){
         this.forma = forma;
         this.size = size;
     }

     public String triturar(){
         return "";
     }

    @Override
    public String toString() {
        return "Forma: "  + forma + "Tamaño: " + size;
    }
}
