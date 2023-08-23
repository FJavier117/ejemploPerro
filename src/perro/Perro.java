package perro;

import accesorio.Collar;
import perro.parte.*;
import perro.parte.cabeza.Cabeza;

public class Perro {
    private final Cabeza cabeza;
    private final Cola cola;
    private final Cuello cuello;
    private final Pata pata;
    private final Pecho pecho;
    private final Tronco tronco;
    private  final Collar collar;


    public Perro(String sizeHocico, String formaHocico,String sizeNariz, String formaNariz, String formaCola, String sizeCola,
                 String sizeCuello, String sizePata, int numerDedos, String colorAlmohadilla, String tipoPata
    ,String sizePecho, String colorPecho, String sizeTronco, String colorTronco, String sizeCollar, String colorCollar){
        this.cabeza = new Cabeza(sizeHocico,formaHocico, sizeNariz,formaNariz);
        this.cola = new Cola(formaCola,sizeCola);
        this.cuello = new Cuello(sizeCuello);
        this.pata = new Pata(sizePata,numerDedos,colorAlmohadilla,tipoPata);
        this.pecho = new Pecho(sizePecho,colorPecho);
        this.tronco = new Tronco(sizeTronco,colorTronco);
        this.collar = new Collar(sizeCollar,colorCollar);
    }

    public String addCollar(Collar collar){
        return collar.toString();
    }

    public String ladrar(){
        return " ";
    }



    @Override
    public String toString() {
        return cabeza +" "+ cola+ " "+ cuello + " " +
                pata + " " + pecho + " " + tronco + " " + collar;
    }
}
