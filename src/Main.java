import classi.Immagine;
import classi.RegistrazioneAudio;
import classi.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Immagine[] immagini = {
                new Immagine("Foto1"),
                new Immagine("Foto2"),
                new Immagine("Foto3")
        };

        Video[] video = {
                new Video("Interstellar", 7),
                new Video("Inception", 9)
        };

        RegistrazioneAudio[] audio = {
                new RegistrazioneAudio("it's okay, i'm okay", 3),
                new RegistrazioneAudio("All Too Well", 10)
        };

        Scanner scanner = new Scanner(System.in);
        boolean continua = true;

        while (continua) {
            System.out.println("Scegli cosa vuoi fare:");
            System.out.println("1 - Mostra immagini");
            System.out.println("2 - Riproduci video");
            System.out.println("3 - Riproduci audio");
            System.out.println("0 - Esci");

            System.out.print("Inserisci la tua scelta: ");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    mostraImmagini(scanner, immagini);
                    break;
                case 2:
                    riproduciVideo(scanner, video);
                    break;
                case 3:
                    riproduciAudio(scanner, audio);
                    break;
                case 0:
                    continua = false;
                    System.out.println("Uscita dal programma.");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }

        scanner.close();
    }

    private static void mostraImmagini(Scanner scanner, Immagine[] immagini) {
        System.out.println("Immagini disponibili:");
        for (int i = 0; i < immagini.length; i++) {
            System.out.println((i + 1) + " - " + immagini[i].getTitolo());
        }
        System.out.print("Scegli un'immagine da vedere: ");
        int sceltaImmagine = scanner.nextInt();
        scanner.nextLine();

        if (sceltaImmagine > 0 && sceltaImmagine <= immagini.length) {
            Immagine img = immagini[sceltaImmagine - 1];
            img.show();
            modificaLuminosita(scanner, img);
            img.show();
        } else {
            System.out.println("Scelta non valida.");
        }
    }

    private static void riproduciVideo(Scanner scanner, Video[] video) {
        System.out.println("Video disponibili:");
        for (int i = 0; i < video.length; i++) {
            System.out.println((i + 1) + " - " + video[i].getTitolo());
        }
        System.out.print("Scegli un video da riprodurre: ");
        int sceltaVideo = scanner.nextInt();
        scanner.nextLine();

        if (sceltaVideo > 0 && sceltaVideo <= video.length) {
            Video vid = video[sceltaVideo - 1];
            vid.play();
            modificaVolumeVideo(scanner, vid);
            modificaLuminosita(scanner, vid);
            vid.play();
        } else {
            System.out.println("Scelta non valida.");
        }
    }


    private static void riproduciAudio(Scanner scanner, RegistrazioneAudio[] audio) {
        System.out.println("Audio disponibili:");
        for (int i = 0; i < audio.length; i++) {
            System.out.println((i + 1) + " - " + audio[i].getTitolo());
        }
        System.out.print("Scegli un audio da riprodurre: ");
        int sceltaAudio = scanner.nextInt();
        scanner.nextLine();

        if (sceltaAudio > 0 && sceltaAudio <= audio.length) {
            RegistrazioneAudio aud = audio[sceltaAudio - 1];
            aud.play();
            modificaVolumeAudio(scanner, aud);
            aud.play();
        } else {
            System.out.println("Scelta non valida.");
        }
    }


    private static void modificaVolumeAudio(Scanner scanner, RegistrazioneAudio audio) {
        boolean continuaVolume = true;

        while (continuaVolume) {
            System.out.println("Vuoi modificare il volume? (si/no)");
            String risposta = scanner.nextLine().trim().toLowerCase();

            if (risposta.equals("si")) {
                System.out.println("Vuoi alzare o abbassare il volume? (alza/abbassa)");
                String azione = scanner.nextLine().trim().toLowerCase();

                if (azione.equals("abbassa")) {
                    audio.abbassaVolume();
                } else if (azione.equals("alza")) {
                    audio.alzaVolume();
                } else {
                    System.out.println("Comando non riconosciuto.");
                }

                audio.play();
            } else if (risposta.equals("no")) {
                continuaVolume = false;
                System.out.println("Fine modifica volume.");
            } else {
                System.out.println("Risposta non valida. Per favore, rispondi 'si' o 'no'.");
            }
        }
    }


    private static void modificaVolumeVideo(Scanner scanner, Video video) {
        boolean continuaVolume = true;

        while (continuaVolume) {
            System.out.println("Vuoi modificare il volume del video? (si/no)");
            String risposta = scanner.nextLine().trim().toLowerCase();

            if (risposta.equals("si")) {
                System.out.println("Vuoi alzare o abbassare il volume? (alza/abbassa)");
                String azione = scanner.nextLine().trim().toLowerCase();

                if (azione.equals("abbassa")) {
                    video.abbassaVolume();
                } else if (azione.equals("alza")) {
                    video.alzaVolume();
                } else {
                    System.out.println("Comando non riconosciuto.");
                }

                video.play();
            } else if (risposta.equals("no")) {
                continuaVolume = false;
                System.out.println("Fine modifica volume.");
            } else {
                System.out.println("Risposta non valida. Per favore, rispondi 'si' o 'no'.");
            }
        }
    }


    private static void modificaLuminosita(Scanner scanner, Immagine immagine) {
        boolean continuaLuminosita = true;

        while (continuaLuminosita) {
            System.out.println("Vuoi modificare la luminosità? (si/no)");
            String risposta = scanner.nextLine().trim().toLowerCase();

            if (risposta.equals("si")) {
                System.out.println("Vuoi aumentare o diminuire la luminosità? (aumenta/diminuisci)");
                String azione = scanner.nextLine().trim().toLowerCase();

                if (azione.equals("diminuisci")) {
                    immagine.abbassaLuminosità();
                } else if (azione.equals("aumenta")) {
                    immagine.alzaLuminosità();
                } else {
                    System.out.println("Comando non riconosciuto.");
                }

                immagine.play();
            } else if (risposta.equals("no")) {
                continuaLuminosita = false;
                System.out.println("Fine modifica luminosità.");
            } else {
                System.out.println("Risposta non valida. Per favore, rispondi 'si' o 'no'.");
            }
        }
    }


    private static void modificaLuminosita(Scanner scanner, Video video) {
        boolean continuaLuminosita = true;

        while (continuaLuminosita) {
            System.out.println("Vuoi modificare la luminosità del video? (si/no)");
            String risposta = scanner.nextLine().trim().toLowerCase();

            if (risposta.equals("si")) {
                System.out.println("Vuoi aumentare o diminuire la luminosità? (aumenta/diminuisci)");
                String azione = scanner.nextLine().trim().toLowerCase();

                if (azione.equals("diminuisci")) {
                    video.abbassaLuminosità();
                } else if (azione.equals("aumenta")) {
                    video.alzaLuminosità();
                } else {
                    System.out.println("Comando non riconosciuto.");
                }

                video.play();
            } else if (risposta.equals("no")) {
                continuaLuminosita = false;
                System.out.println("Fine modifica luminosità.");
            } else {
                System.out.println("Risposta non valida. Per favore, rispondi 'si' o 'no'.");
            }
        }
    }
}