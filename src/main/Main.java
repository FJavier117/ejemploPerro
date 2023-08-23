package main;

import perro.parte.cabeza.Ojo;
import perro.parte.cabeza.Oreja;
import perro.raza.Chihuahua;

public class Main {
    public static void main(String[] args) {
        Chihuahua chihuahua = new Chihuahua("10cm","Ovalado","3cm","Larga","10cm","10cm","10cm diametro","10cm",4,"negro","corta","10cm","cafe","20cm","cafe");
        chihuahua.setOjo(new Ojo());
        chihuahua.setOjo(new Ojo());
        chihuahua.setOreja(new Oreja());
        chihuahua.setOreja(new Oreja());
        System.out.println(chihuahua);
    }
}
