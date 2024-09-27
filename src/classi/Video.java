package classi;

import interfaces.Riproduci;

public class Video extends ElementoMultimediale implements Riproduci {
    private int durata;
    private int luminosità;
    private int volume;

    public Video(String titolo, int durata){
        super(titolo);
        this.durata=durata;
        this.luminosità=5;
        this.volume=5;
    }

    @Override
    public int getDurata() {
        return durata;
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
    public int getVolume() {
        return volume;
    }
    public void abbassaVolume(){
        if (volume>0){
            volume--;}
        System.out.println("Volume:"+ volume);
    }
    public void alzaVolume(){
        if (volume>0){
            volume++;}
        System.out.println("Volume:"+ volume);
    }

    @Override
    public void show() {

    }

    @Override
    public void play() {
        String volumeIndicator = "";
        for (int i = 0; i < volume; i++) {
            volumeIndicator += "!";
        }
        String luminositàIndicator = "";
        for (int i = 0; i < luminosità; i++) {
            luminositàIndicator += "*";
        }
        String result= "In riproduzione il video: "+ titolo + " della durata di: "+durata+" minuti "+ " Volume: "+volumeIndicator +" , "+" Luminosità: " + luminositàIndicator;
        System.out.println(result);

    }




}
