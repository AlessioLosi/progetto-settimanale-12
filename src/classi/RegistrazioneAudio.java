package classi;

import interfaces.Riproduci;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproduci {
    private int durata;
    private int volume;

    public RegistrazioneAudio(String titolo, int durata){
        super(titolo);
        this.durata=durata;
        this.volume=5;
    }

    @Override
    public int getDurata() {
        return durata;
    }
    @Override
    public int getLuminosità() {
        return 0;
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
        String result= "In riproduzione la traccia: "+ titolo + " della durata di: "+durata+" minuti "+ ", Volume: "+volumeIndicator ;
        System.out.println(result);

    }

}
