package perro.parte.cabeza;

/**
 * @author FJMV
 * @version 1.0
 * Ejemplo de uso de composición
 */

public class Cabeza {
    private final Hocico hocico;
    private final Nariz nariz;
    private int numeroDeOjos;
    private int numeroDeOreja;
    private final Ojo [] ojo; //Agregación
    private final Oreja [] oreja;

    //Sobrecargamos constructor
    public Cabeza(String sizeHocico, String formaHocico,String sizeNariz, String formaNariz){
        this.hocico = new Hocico(formaHocico,sizeHocico);
        this.nariz = new Nariz(formaNariz,sizeNariz);
        this.numeroDeOjos = 0;
        this.numeroDeOreja = 0;
        this.ojo = new Ojo[2];
        this.oreja = new Oreja[2];
    }


    public String addOjo(Ojo ojo){
        if (numeroDeOjos < 2){
            this.ojo[numeroDeOjos] = ojo;
            numeroDeOjos++;
        }
        return "Ojo agregado";
    }

    public String addOreja(Oreja oreja){
        if (numeroDeOreja < 2){
            this.oreja[numeroDeOreja] = oreja;
            numeroDeOreja++;
        }
        return "Oreja agregada";
    }

    public int getNumeroDeOjos(){
        return this.ojo.length;
    }

    public int getNumeroDeOreja(){
        return this.oreja.length;
    }

    @Override
    public String toString() {
        return hocico + " " + nariz + " " + getNumeroDeOjos() + " " + ojo[1] +" "+ getNumeroDeOreja() + " " + oreja[1] ;
    }
}
