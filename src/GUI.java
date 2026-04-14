import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

public class GUI implements ActionListener {

    // window
    JFrame window;

    // text area
    JTextArea textArea;
    JScrollPane scrollPane; // for scroll bar

    // menu bar
    JMenuBar menuBar; // for the menu at the top where usually stuff like [Edit Help Window] is
    JMenu fileMenu, editMenu, formatMenu, colorMenu;
    // file menu
    JMenuItem iNew, iOpen, iSave, iSaveAs, iExit;
    // format menu
    JMenuItem iWrap;
    JMenu mFont, mFontSize;

    Function_File file = new Function_File(this);
    Function_Format format = new Function_Format(this);

    public static void main(String[] args) {
        new GUI();
    }

    public GUI() {
        createWindow();
        createTextArea();
        createMenuBar();
        createFileMenu();
        createFormatMenu();

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

    public void createFileMenu() {
        iNew = new JMenuItem("New");
        iNew.addActionListener(this);
        iNew.setActionCommand("New");

        iOpen = new JMenuItem("Open");
        iOpen.addActionListener(this);
        iOpen.setActionCommand("Open");

        iSave = new JMenuItem("Save");
        iSave.addActionListener(this);
        iSave.setActionCommand("Save");

        iSaveAs = new JMenuItem("Save As");
        iSaveAs.addActionListener(this);
        iSaveAs.setActionCommand("Save As");

        iExit = new JMenuItem("Exit");
        iExit.addActionListener(this);
        iExit.setActionCommand("Exit");

        fileMenu.add(iNew);
        fileMenu.add(iOpen);
        fileMenu.add(iSave);
        fileMenu.add(iSaveAs);
        fileMenu.add(iExit);
    }

    public void createFormatMenu() {
        iWrap = new JMenuItem("Word Wrap: Off");
        iWrap.addActionListener(this);
        iWrap.setActionCommand("Wrap");

        mFont = new JMenu("Font");

        format.createFonts();
        Enumeration<String> keys = format.fonts.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();

            JMenuItem iFont = new JMenuItem(key);
            iFont.addActionListener(this);
            iFont.setActionCommand("font_"+ key);

            mFont.add(iFont);
        }

        mFontSize = new JMenu("Font Size");

        formatMenu.add(iWrap);
        formatMenu.add(mFont);
        formatMenu.add(mFontSize);
    }

    // action listener(s)

    @Override
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand(); // get the command

        switch (command) {
            // file menu commands
            case "New": file.newFile(); break;
            case "Open": file.open(); break;
            case "Save": file.save(); break;
            case "Save As": file.saveAs(); break;
            case "Exit": file.exit(); break;

            // format menu commands

            // -> fonts
            case "font_IBM": System.out.println(command); break;
            case "font_Roboto": System.out.println(command); break;
            case "font_Shadows": System.out.println(command); break;
            case "font_Special": System.out.println(command); break;
            case "font_Tomorrow": System.out.println(command); break;
            case "font_UnifrakturMaguntia": System.out.println(command); break;
            case "font_Vampiro": System.out.println(command); break;
            case "font_VT323": System.out.println(command); break;
            case "font_Workbench": System.out.println(command); break;
        }
    }
}
