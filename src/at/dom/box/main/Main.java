package at.dom.box.main;

import at.dom.box.gui.ConsoleGUI;
import at.dom.box.gui.GUI;

public class Main {

    public static void main(String[] args) {



        MusicBox musicBox = MusicBoxFactory.getBox();
        GUI gui = new ConsoleGUI();
        gui.setBox(musicBox);
        gui.start();




/*
        System.out.println("Records removed");

        musicBox.ausgabeRecordList();
*/

    }
}
