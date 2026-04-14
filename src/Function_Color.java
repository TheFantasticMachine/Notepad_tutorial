import java.awt.*;

public class Function_Color {

    GUI gui;

    public Function_Color(GUI gui) {
        this.gui = gui;
    }

    public void changeColor(String color) {

        String hexWindow = "#ffffff";
        String hexBack = "#ffffff";
        String hexFor = "#000000";

        switch (color) {
            case "White": hexWindow = "#ffffff"; hexBack = "#ffffff"; hexFor = "#000000"; break;
            case "Black": hexWindow = "#000000"; hexBack = "#000000"; hexFor = "#ffffff"; break;
            case "Purple": hexWindow = "#BF40BF"; hexBack = "#BF40BF"; hexFor = "#ffffff"; break;
        }

        gui.window.getContentPane().setBackground(Color.decode(hexWindow));
        gui.textArea.setBackground(Color.decode(hexBack));
        gui.textArea.setForeground(Color.decode(hexFor));
    }
}
