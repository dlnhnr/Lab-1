import java.util.ArrayList;

public class Playlist {

	String name;
	
	static ArrayList<Song> playlist = new ArrayList<Song>();
	
	void printSongs() {
		for (Song song : playlist) {
			System.out.println(song);
		}
	}
	
	boolean findSong(String song) {
		if (song.getName().equals()) {
			return true;
		}
		
		else {
			return false;
		}
	}
}
