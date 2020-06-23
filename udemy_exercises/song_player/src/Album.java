import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    private Song songExists(String title) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getName().equals(title)) {
                return songs.get(i);
            }
        }
        return null;
    }

    public boolean addSong(String title, double duration) {
        if (songExists(title) != null) {
            System.out.println("This song already exists on this album");
            return false;
        }
        songs.add(new Song(title, duration));
        return true;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playList) {
        if (songExists(title) != null) {
            playList.add(songExists(title));
            return true;
        }
        System.out.printf("%s is not on this album \n", title);
        return false;
    }
}
