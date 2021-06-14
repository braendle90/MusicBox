package at.dom.box.main;

import at.dom.box.loaders.BoxLoader;
import at.dom.box.loaders.DummyLoader;

import javax.swing.*;

public class MusicBoxFactory {

    public static MusicBox getBox(){
        BoxLoader loader = new DummyLoader();
        return loader.getBox();

    }
}
