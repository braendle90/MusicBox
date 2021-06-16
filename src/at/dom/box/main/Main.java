package at.dom.box.main;

import at.dom.box.gui.ConsoleGUI;
import at.dom.box.gui.GUI;
import at.dom.box.gui.WindowsGUi;

public class Main {

    public static void main(String[] args) {



        MusicBox musicBox = MusicBoxFactory.getBox();
        GUI gui = new WindowsGUi();
        gui.setBox(musicBox);
        gui.start();




/*
        System.out.println("Records removed");

        musicBox.ausgabeRecordList();
*/

    }
}
