package at.dom.box.main;

import java.util.List;

public interface Record {


    void addTitel(Song song);

    void printRecordTitel();

    void showAllTitels();

    double getLengthOfAllSongs();

    List<Song> getSongList();

}
