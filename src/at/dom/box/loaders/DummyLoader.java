package at.dom.box.loaders;

import at.dom.box.main.MusicBox;
import at.dom.box.main.*;
import at.dom.box.main.Record;


import javax.swing.*;

public class DummyLoader implements BoxLoader{

    @Override
    public MusicBox getBox() {
        MusicBox musicBox = new MusicBox();

        Record recordACDC = new VinylRecord("ACDC");
        // add the title to one plate
        recordACDC.addTitel(new Song(3,"hells bells"));
        recordACDC.addTitel(new Song(3,"highway to hell"));
        recordACDC.addTitel(new Song(3,"moneytalks"));
        recordACDC.addTitel(new Song(3,"shoot to thrill"));
        recordACDC.addTitel(new Song(3,"Tunderstruck"));


        Record recordPinkFloyd = new VinylRecord("PinkFloyd");
        recordPinkFloyd.addTitel(new Song(3,"Another Brick in the wall"));
        recordPinkFloyd.addTitel(new Song(3,"Wish you were here"));
        recordPinkFloyd.addTitel(new Song(3,"hey you"));
        recordPinkFloyd.addTitel(new Song(3,"learning to fly"));

        System.out.println();
        System.out.println("Show all titel ACDC ");
        recordACDC.showAllTitels();

        System.out.println();
        System.out.println("Show all titel:Pink Floyd ");
        recordPinkFloyd.showAllTitels();

        //add alll plates to the musicbox

        try {
            musicBox.addRecord(recordPinkFloyd);
            musicBox.addRecord(recordACDC);
            musicBox.addRecord(recordPinkFloyd);
            musicBox.addRecord(recordPinkFloyd);
        } catch (ToMuchRecordsException e) {
            //e.printStackTrace();
            System.out.println("proglem..." + e.getLocalizedMessage());
        }
        return musicBox;
    }
}
