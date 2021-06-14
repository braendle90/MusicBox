package at.dom.box.main;

import java.util.ArrayList;
import java.util.List;

public class VinylRecord implements Record {


    private List<Song> songList;
    private double lengthOfSong;
    private double lengthOfAllSongs;
    private int id = 0;
    private String recordTitel;

    public VinylRecord(String recordTitel) {

        this.recordTitel = recordTitel;

        this.songList = new ArrayList<>();
    }


    public VinylRecord(double lengthOfSong, String recordTitel) {


        this.recordTitel = recordTitel;
    }


    public void printRecordTitel() {

        System.out.println(recordTitel);
    }


    public void addTitel(Song song) {

        this.songList.add(song);
        this.lengthOfAllSongs += song.getLenght();


    }

    public void showAllTitels(){

        for (Song song: songList) {

            System.out.println(song.getTitel());

        }
    }

    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }

    public double getLengthOfAllSongs() {


        return lengthOfAllSongs;
    }

    public void setLengthOfAllSongs(double lengthOfAllSongs) {
        this.lengthOfAllSongs = lengthOfAllSongs;
    }


    public double getLengthOfSong() {
        return lengthOfSong;
    }

    public void setLengthOfSong(double lengthOfSong) {
        this.lengthOfSong = lengthOfSong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecordTitel() {
        return recordTitel;
    }

    public void setRecordTitel(String recordTitel) {
        this.recordTitel = recordTitel;
    }
}
