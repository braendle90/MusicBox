package at.dom.box.gui.WindowsGui;

import at.dom.box.main.MusicBox;

import javax.swing.*;

public class MainFrame {

    private MusicBox musicBox;

    private JPanel panel;
    private JFrame mainFrame;

    public MainFrame(MusicBox musicBox) {

        this.musicBox = musicBox;
        mainFrame = new JFrame("Music Box");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(600, 500);
        CreatePanel(musicBox);


        mainFrame.setVisible(true);
    }

    public void CreatePanel(MusicBox musicBox){
        this.panel = new MainPanel(musicBox);
        this.mainFrame.add(this.panel);


    }


}
