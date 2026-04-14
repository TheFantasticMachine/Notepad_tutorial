import java.awt.*;

public class Function_File {
    GUI gui; // declare the GUI class to use methods and variables

    // constructor
    public Function_File(GUI gui) {
        this.gui = gui;
    }

    // create new file
    public void newFile() {
        gui.textArea.setText(null);
        gui.window.setTitle("New");
    }

    // opening a file from file system
    public void open() {
        FileDialog fd = new FileDialog(gui.window, "Open file", FileDialog.LOAD); // creating the new window
        fd.setVisible(true); // make it visible
    }
}
