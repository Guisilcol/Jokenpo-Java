package main;

import view.MainGUI;

/**
 * Main class where all GUIs and other settings  will be initialized.
 * @author guilherme
 */
public class Main {
    public static void main(String [] args){
        
        MainGUI mainGui = new MainGUI();
        mainGui.setVisible(true);        
    }
}
