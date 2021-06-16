package at.dom.box.main;

import java.util.ArrayList;
import java.util.List;

public class MusicBox {


    private int actualpPlates = 0;
    private static final int MAXPLATES = 50;
    private double holePlaytime = 0;
    private List<Record> recordlist;
    private Record actualRecord;


    public MusicBox() {

        this.recordlist = new ArrayList<>();

    }

    //test Methode

    public void ausgabeRecordList() {

        for (Record record : recordlist) {

            record.printRecordTitel();

        }


    }


    public void addRecord(Record record) throws ToMuchRecordsException{

        this.actualpPlates++;

        if (actualpPlates <= MAXPLATES) {

            this.recordlist.add(record);

            System.out.printf("Es ist %s Platte eingelgelt:\n", actualpPlates);

        } else {
            throw new ToMuchRecordsException("Maximalanzahl von 50 überscrhittennn...");


        }


    }


    public void removeRecord(Record record) {

        this.actualpPlates--;

        this.recordlist.remove(record);


    }

    public Record searchRecord(String titel) {

        String tempTitel;

        // find at.dom.box.main.Song in Records


        for (Record record : recordlist) {

            System.out.println("Recordlist foreach");


            for (Song song : record.getSongList()) {


                if (song.getTitel().contains(titel)) {
                    System.out.println("Es wurde gefunden der TItel ist:" + titel);

                    return record;
                }


                /*

                if (song.contains(titel)) {

                    System.out.println("Es wurde gefunden der TItel ist:" + titel);



                }*/
            }

        }


        // TODO: 14.06.21
        //bitte noch ändern sollte nicht null übergeben

        return null;

    }

    public void loadRecords(Record record){

        actualRecord = record;

    }

    public void load(int num){

        if (actualRecord != null) {

            System.out.println( actualRecord.getSongList().get(num).getTitel());
        }
        else {
            System.out.println("Es wurde keine Platte eingelegt!!!");
        }

    }


    public double getSumOfMusic() {


        for (Record record : recordlist) {


            holePlaytime += record.getLengthOfAllSongs();


        }


        return holePlaytime;
    }

    public int getActualpPlates() {
        return actualpPlates;
    }

    public void setActualpPlates(int actualpPlates) {
        this.actualpPlates = actualpPlates;
    }

    public int getMAXPLATES() {
        return MAXPLATES;
    }

    public double getHolePlaytime() {
        return holePlaytime;
    }

    public void setHolePlaytime(double holePlaytime) {
        this.holePlaytime = holePlaytime;
    }

    public List<Record> getRecordlist() {
        return recordlist;
    }

    public void setRecordlist(List<Record> recordlist) {
        this.recordlist = recordlist;
    }

    public Record getActualRecord() {
        return actualRecord;
    }

    public void setActualRecord(Record actualRecord) {
        this.actualRecord = actualRecord;
    }

    /*
    public void searchRecord(String title){


    }*/

}
