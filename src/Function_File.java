import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class Function_File {
    GUI gui; // declare the GUI class to use methods and variables
    String filename, fileAddress;

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

        // loading the file - name and address
        if (fd.getFile() != null ) {
            filename = fd.getFile();
            fileAddress = fd.getDirectory();

            gui.window.setTitle(filename);
        }

        // loading the file - buffered reader (so the inside)
        try {
            BufferedReader br = new BufferedReader( new FileReader(fileAddress + filename) ); // reading the file by taking the address and selecting from there with the filename

            gui.textArea.setText(null);

            String line = null;

            while ((line = br.readLine()) != null) {
                gui.textArea.append(line + "\n");
            }

            br.close();
        }
        catch (Exception e) {
            System.out.println("Error when opening a file ... " + e);
        }
    }
}
