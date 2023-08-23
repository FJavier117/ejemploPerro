package perro.raza;

import perro.Perro;

public class Chihuahua extends Perro {
    public Chihuahua(String sizeHocico, String formaHocico, String sizeNariz, String formaNariz, String formaCola, String sizeCola, String sizeCuello, String sizePata, int numerDedos, String colorAlmohadilla, String tipoPata, String sizePecho, String colorPecho, String sizeTronco, String colorTronco) {
        super(sizeHocico, formaHocico, sizeNariz, formaNariz, formaCola, sizeCola, sizeCuello, sizePata, numerDedos, colorAlmohadilla, tipoPata, sizePecho, colorPecho, sizeTronco, colorTronco);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
