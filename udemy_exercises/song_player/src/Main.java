import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> myAlbums = new ArrayList<Album>();
    private static int playingSong = 0;
    private static boolean quit = false;

    private static void playPlayList(LinkedList<Song> playList) {
            if (playList.isEmpty()) {
                System.out.println("You have no songs in your play list.");
            }
            else {
                System.out.println("Now playing " + playList.get(playingSong).getName());
            }
        }


    private static void nextSong(LinkedList<Song> playList) {
            playingSong++;
            if (playList.size() > playingSong) {
                System.out.println("Now playing " + playList.get(playingSong).getName());
            }
            else {
                playingSong = playList.size();
                System.out.println("You have reached the end of your play list.");
            }
        }


    private static void previousSong(LinkedList<Song> playList) {

            playingSong--;
            if (playingSong < 0) {
                playingSong = 0;
                System.out.println("You are at the beginning of your play list.");
            }
            else {
                System.out.println("Now playing " + playList.get(playingSong).getName());
            }
        }


    private static void repeatSong(LinkedList<Song> playList) {

            System.out.println("Now playing " + playList.get(playingSong).getName());
        }



    private static void showPlayList(LinkedList<Song> playList) {

            for (int i = 0; i < playList.size(); i++) {
                System.out.println(i + 1 + ": " + playList.get(i).getName());
            }
        }



    private static void removeSong(String title, LinkedList<Song> playList) {

            for (int i = 0; i < playList.size(); i++) {
                if (playList.get(i).getName().equals(title)) {
                    playList.remove(i);
                }
            }
        }



    private static void quit() {
        quit = true;
    }

    private static void menu(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Main Menu");
        System.out.println("1. Play play list");
        System.out.println("2. Play previous song");
        System.out.println("3. Play next song");
        System.out.println("4. Repeat current song");
        System.out.println("5. Remove song");
        System.out.println("6. Show play list");
        System.out.println("7. Quit");
        System.out.println("===============");
        System.out.print("Enter selection: ");
        choice = scanner.nextInt();

        switch(choice) {
            case 1:
                playPlayList(playList);
                System.out.println("\n\n");
                break;
            case 2:
                previousSong(playList);
                System.out.println("\n\n");
                break;
            case 3:
                nextSong(playList);
                System.out.println("\n\n");
                break;
            case 4:
                repeatSong(playList);
                System.out.println("\n\n");
                break;
            case 5:
                String title;
                System.out.println("Enter song title to remove: ");
                title = scanner.nextLine();
                removeSong(title, playList);
                System.out.println("\n\n");
                break;
            case 6:
                showPlayList(playList);
                System.out.println("\n\n");
                break;
            case 7:
                quit();
                break;
        }
    }

    public static void main(String[] args) {
        Album myAlbum1 = new Album("My Album 1");
        myAlbum1.addSong("My Song 1a", 3.35);
        myAlbum1.addSong("My Song 1b", 2.75);
        myAlbum1.addSong("My Song 1c", 4.16);
        myAlbum1.addSong("My Song 1d", 7.45);
        myAlbum1.addSong("My Song 1e", 3.16);
        myAlbum1.addSong("My Song 1f", 2.75);
        myAlbum1.addSong("My Song 1g", 3.89);
        myAlbum1.addSong("My Song 1h", 2.79);
        myAlbum1.addSong("My Song 1i", 4.23);
        myAlbum1.addSong("My Song 1j", 2.16);
        myAlbums.add(myAlbum1);

        Album myAlbum2 = new Album("My Album 2");
        myAlbum2.addSong("My Song 2a", 3.35);
        myAlbum2.addSong("My Song 2b", 2.75);
        myAlbum2.addSong("My Song 2c", 4.16);
        myAlbum2.addSong("My Song 2d", 7.45);
        myAlbum2.addSong("My Song 2e", 3.16);
        myAlbum2.addSong("My Song 2f", 2.75);
        myAlbum2.addSong("My Song 2g", 3.89);
        myAlbum2.addSong("My Song 2h", 2.79);
        myAlbum2.addSong("My Song 2i", 4.23);
        myAlbum2.addSong("My Song 2j", 2.16);
        myAlbums.add(myAlbum2);

        LinkedList<Song> myPlayList = new LinkedList<Song>();
        myAlbums.get(0).addToPlaylist("My Song 1a", myPlayList);
        myAlbums.get(0).addToPlaylist("My Song 1b", myPlayList);
        myAlbums.get(0).addToPlaylist("My Song 1c", myPlayList);
        myAlbums.get(0).addToPlaylist("My Song 1d", myPlayList);
        myAlbums.get(0).addToPlaylist("My Song 1e", myPlayList);
        myAlbums.get(1).addToPlaylist("My Song 2j", myPlayList);
        myAlbums.get(1).addToPlaylist("My Song 2i", myPlayList);
        myAlbums.get(1).addToPlaylist("My Song 2h", myPlayList);
        myAlbums.get(1).addToPlaylist("My Song 2g", myPlayList);
        myAlbums.get(1).addToPlaylist("My Song 2f", myPlayList);

        /*
        turnOn();
        showPlayList(myPlayList);
        playPlayList(myPlayList);
        nextSong(myPlayList);
        nextSong(myPlayList);
        nextSong(myPlayList);
        repeatSong(myPlayList);
        previousSong(myPlayList);
        removeSong("My Song 1d", myPlayList);
        showPlayList(myPlayList);
        */

        do {
            menu(myPlayList);
        } while (!quit);
    }
}
