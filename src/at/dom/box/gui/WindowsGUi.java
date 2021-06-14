package at.dom.box.gui;

import at.dom.box.gui.WindowsGui.MainFrame;
import at.dom.box.main.MusicBox;

import javax.swing.*;

public class WindowsGUi implements GUI{

    private MusicBox musicBox = new MusicBox();



    @Override
    public void start() {

        MainFrame mainFrame = new MainFrame(musicBox);



    }

    @Override
    public void setBox(MusicBox box) {
    }
}
