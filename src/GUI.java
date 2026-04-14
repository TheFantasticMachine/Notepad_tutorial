import javax.swing.*;
import java.util.HashMap;

public class GUI {

    // window
    JFrame window;
    JTextArea textArea;
    JScrollPane scrollPane; // for scroll bar

    public static void main(String[] args) {
        new GUI();
    }

    public GUI() {
        createWindow();
        createTextArea();

        window.setVisible(true);
    }

    public void createWindow() {
        // creating window
        window = new JFrame("Notepad app");
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void createTextArea() {
        // makes area where you can write
        textArea = new JTextArea();

        // create a scroll bar
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(BorderFactory.createEmptyBorder()); // for cleaner look

        // adds the scroll bar and the text area
        window.add(scrollPane);
    }
}
