package at.dom.box.gui;

import at.dom.box.main.MusicBox;
import at.dom.box.main.Record;

import java.util.List;
import java.util.Scanner;

public class ConsoleGUI implements GUI{
    private MusicBox musicBox;

    @Override
    public void start() {
        int input;
        String searchString;
        List<Record> recordList;

        System.out.println("1 search for record");
        System.out.println("2 get sum of music");
        System.out.println("3 load a record");
        System.out.println("4 play a record");


        Scanner scanner = new Scanner(System.in);

        input = scanner.nextInt();

        if (input == 1) {
            System.out.println("Write the name of the title your looking for:");
            searchString = scanner.next();
            musicBox.searchRecord(searchString);
        }

        if (input == 2) {
            System.out.println(musicBox.getSumOfMusic());
        }

        if (input == 3) {
            musicBox.ausgabeRecordList();

            System.out.println("Choose a record");
            searchString = scanner.next();


            //musicBox.load(4);
            //musicBox.loadRecords(recordACDC);

            musicBox.loadRecords(musicBox.getActualRecord());
            recordList = musicBox.getRecordlist();

            //musicBox.loadRecords(musicBox.setActualRecord(searchString));

            System.out.println(musicBox.getActualRecord());

        }
        if (input == 4) {

        }



//
//        System.out.println();
//        System.out.println("suche nach dem at.dom.box.main.Song moenytalks");
//        musicBox.searchRecord("moneytalks");
//
//        musicBox.ausgabeRecordList();
//
//        System.out.println("Ausgbe Länge alles titel und records");
//
//        System.out.println(musicBox.getSumOfMusic());
//
//        //musicBox.removeRecord(recordACDC);
//
//        musicBox.ausgabeRecordList();
//
//
//        //musicBox.loadRecords(recordACDC);
//        musicBox.load(4);

//        //test
//        System.out.println("dominik");
//
//        System.out.println("hello i am stefan");
//        System.out.println("second");
    }

    @Override
    public void setBox(MusicBox box) {
        this.musicBox = box;
    }
}
