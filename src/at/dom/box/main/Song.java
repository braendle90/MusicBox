package at.dom.box.main;

public class Song {

    private int lenght;
    private String titel;

    public Song(int lenght, String titel) {
        this.lenght = lenght;
        this.titel = titel;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
}
