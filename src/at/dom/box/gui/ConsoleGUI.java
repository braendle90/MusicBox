package at.dom.box.gui;

import at.dom.box.main.MusicBox;

public class ConsoleGUI implements GUI{
    private MusicBox musicBox;

    @Override
    public void start() {


        System.out.println();
        System.out.println("suche nach dem at.dom.box.main.Song moenytalks");
        musicBox.searchRecord("moneytalks");

        musicBox.ausgabeRecordList();

        System.out.println("Ausgbe Länge alles titel und records");

        System.out.println(musicBox.getSumOfMusic());

        //musicBox.removeRecord(recordACDC);

        musicBox.ausgabeRecordList();


        //musicBox.loadRecords(recordACDC);
        musicBox.load(4);

        //test
        System.out.println("dominik");

    }

    @Override
    public void setBox(MusicBox box) {
        this.musicBox = box;
    }
}
