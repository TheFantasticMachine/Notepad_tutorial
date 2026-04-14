import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

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

        filename = null;
        fileAddress = null;
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

            String line;

            while ((line = br.readLine()) != null) {
                gui.textArea.append(line + "\n");
            }

            br.close();
        }
        catch (Exception e) {
            System.out.println("Error when opening a file ... " + e);
        }
    }

    public void save() {
        if (filename == null) {
            // new file -> call save as coz it has the same effect
            saveAs();
        }
        else {
            try {
                // filename and fileAddress are filled thanks to open method and we just dont open the window and overwrite the existing file
                FileWriter fw = new FileWriter(fileAddress + filename);
                fw.write(gui.textArea.getText());
                fw.close();
            }
            catch (Exception e) {
                System.out.println("Error when saving a file ... " + e);
            }
        }
    }

    public void saveAs() {
        FileDialog fd = new FileDialog(gui.window, "Save As", FileDialog.SAVE);
        fd.setVisible(true);

        if (fd.getFile() != null) {
            filename = fd.getFile();
            fileAddress = fd.getDirectory();
            gui.window.setTitle(filename);
        }

        try {
            FileWriter fw = new FileWriter(fileAddress + filename);
            fw.write(gui.textArea.getText());
            fw.close();
        }
        catch (Exception e) {
            System.out.println("Error when saving a file ... " + e);
        }
    }

    public void exit() {
        System.exit(0);
    }
}
