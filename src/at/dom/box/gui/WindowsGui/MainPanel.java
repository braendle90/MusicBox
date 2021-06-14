package at.dom.box.gui.WindowsGui;

import at.dom.box.main.MusicBox;
import at.dom.box.main.Record;
import at.dom.box.main.ToMuchRecordsException;
import at.dom.box.main.VinylRecord;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel {

    private MusicBox musicBox;
    private JTextField textField;
    private JButton button;

    String recordsText = "";
    

    public MainPanel(MusicBox musicBox) {

        this.musicBox = musicBox;
        setBackground(Color.lightGray);
        createLabel("Schallplatten name:");
        createTextField();
        addJButton();


    }

    public void createLabel(String text) {

        this.add(new JLabel(text));
    }

    public void createLabelWithRecords() {



        for (Record record: musicBox.getRecordlist()) {
            recordsText.concat(record.getRecordTitel());

        }

        this.add(new JLabel(recordsText));
    }

    public void createTextField() {

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(100, 30));
        this.add(textField);

    }

    public void addJButton() {
        button = new JButton("add");
        this.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (textField.getText().length() > 0) {
                    Record newRecord = new VinylRecord(3, textField.getText());
                    System.out.println(textField.getText());

                    try {
                        musicBox.addRecord(newRecord);
                        createLabelWithRecords();
                    } catch (ToMuchRecordsException toMuchRecordsException) {
                        toMuchRecordsException.printStackTrace();
                    }

                }


            }
        });



    }

}
