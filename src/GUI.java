import javax.swing.*;

public class GUI {

    // window
    JFrame window;
    JTextArea textArea;
    JScrollPane scrollPane; // for scroll bar
    JMenuBar menuBar; // for the menu at the top where usually stuff like [Edit Help Window] is
    JMenu fileMenu, editMenu, formatMenu, colorMenu;

    public static void main(String[] args) {
        new GUI();
    }

    public GUI() {
        createWindow();
        createTextArea();
        createMenuBar();

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

    public void createMenuBar() {
        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        formatMenu = new JMenu("Format");
        colorMenu = new JMenu("Color");

        // add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(formatMenu);
        menuBar.add(colorMenu);


        // add to window by setting it as its menu bar
        window.setJMenuBar(menuBar);
    }
}
