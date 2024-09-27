package classi;

import interfaces.Riproduci;

public class Immagine  extends ElementoMultimediale implements Riproduci {
    private int luminosità;


    public Immagine(String titolo) {
        super(titolo);
        this.luminosità = 5;
    }

    @Override
    public int getDurata() {
        return 0;
    }

    @Override
    public int getVolume() {
        return 0;
    }

    @Override
    public int getLuminosità() {
        return luminosità;
    }
    public void alzaLuminosità(){
        luminosità++;
        System.out.println("Luminosità:"+ luminosità);
    }
    public void abbassaLuminosità(){
        if (luminosità>0){
            luminosità--;}
        System.out.println("Luminosità:"+ luminosità);
    }

    @Override
    public void play() {

    }

    @Override
    public void show() {
        String luminositàIndicator = "";
        for (int i = 0; i < luminosità; i++) {
            luminositàIndicator += "*";
        }
        String result= "Nome Immagine: "+ titolo + " , "+"Luminosità:" + luminositàIndicator;
        System.out.println(result);

    }

}
