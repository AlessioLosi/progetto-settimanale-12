import classi.Immagine;
import classi.RegistrazioneAudio;
import classi.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Immagine img = new Immagine("Foto1");
        Video vid = new Video("Intersellar", 245);
        RegistrazioneAudio audio = new RegistrazioneAudio("it's okay, i'm okay", 3);
        RegistrazioneAudio audio1 = new RegistrazioneAudio("All Too Well", 10);

        Scanner scanner = new Scanner(System.in);
        boolean continua = true;

        while (continua) {
            System.out.println("Scegli cosa vuoi fare:");
            System.out.println("1 - Mostra immagine");
            System.out.println("2 - Riproduci video");
            System.out.println("3 - Riproduci audio");
            System.out.println("4 - Riproduci audio");
            System.out.println("0 - Esci");

            System.out.print("Inserisci la tua scelta: ");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    img.show();
                    modificaLuminosita(scanner, img);
                    img.show();
                    break;

                case 2:
                    vid.play();
                    modificaVolumeVideo(scanner, vid);
                    modificaLuminosita(scanner, vid);
                    vid.play();
                    break;

                case 3:
                    audio.play();
                    modificaVolumeAudio(scanner, audio);
                    audio.play();
                    break;
                case 4:
                    audio1.play();;
                    modificaVolumeAudio1(scanner,audio1);
                    audio1.play();
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
                System.out.println("Risposta non valida. Per favore, rispondi 'sì' o 'no'.");
            }
        }
    }
    private static void modificaVolumeAudio1(Scanner scanner, RegistrazioneAudio audio1) {
        boolean continuaVolume = true;

        while (continuaVolume) {
            System.out.println("Vuoi modificare il volume? (si/no)");
            String risposta = scanner.nextLine().trim().toLowerCase();

            if (risposta.equals("si")) {
                System.out.println("Vuoi alzare o abbassare il volume? (alza/abbassa)");
                String azione = scanner.nextLine().trim().toLowerCase();

                if (azione.equals("abbassa")) {
                    audio1.abbassaVolume();
                } else if (azione.equals("alza")) {
                    audio1.alzaVolume();
                } else {
                    System.out.println("Comando non riconosciuto.");
                }

                audio1.play();
            } else if (risposta.equals("no")) {
                continuaVolume = false;
                System.out.println("Fine modifica volume.");
            } else {
                System.out.println("Risposta non valida. Per favore, rispondi 'sì' o 'no'.");
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
                System.out.println("Risposta non valida. Per favore, rispondi 'sì' o 'no'.");
            }
        }
    }

    private static void modificaLuminosita(Scanner scanner, Immagine immagine) {
        boolean continuaLuminosita = true;

        while (continuaLuminosita) {
            System.out.println("\nVuoi modificare la luminosità? (si/no)");
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
