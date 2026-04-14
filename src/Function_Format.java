import java.awt.*;
import java.io.File;

public class Function_Format {

    // Fonts
    Font IBM, Roboto, Shadows, Special, Tomorrow, Uni, Vampiro, VT323, Workbench;

    GUI gui;

    public Function_Format(GUI gui) {
        this.gui = gui;
    }

    public void createFonts() {
        /* How to apply font
        ** format.createFonts();
        ** textArea.setFont(format.VT323.deriveFont(size));  ... without the derive the size is set to kinda big cant be bothered to work on it now will add something the future
        */

        try {
            // declare fonts
            IBM = Font.createFont( Font.TRUETYPE_FONT, new File("./res/fonts/IBMPlexSerif-SemiBold.ttf")).deriveFont(30f);
            Roboto = Font.createFont( Font.TRUETYPE_FONT, new File("./res/fonts/Roboto-Regular.ttf")).deriveFont(30f);
            Shadows = Font.createFont( Font.TRUETYPE_FONT, new File("./res/fonts/ShadowsIntoLightTwo-Regular.ttf")).deriveFont(30f);
            Special = Font.createFont( Font.TRUETYPE_FONT, new File("./res/fonts/SpecialElite-Regular.ttf")).deriveFont(30f);
            Tomorrow = Font.createFont( Font.TRUETYPE_FONT, new File("./res/fonts/Tomorrow-Regular.ttf")).deriveFont(30f);
            Uni = Font.createFont( Font.TRUETYPE_FONT, new File("./res/fonts/UnifrakturMaguntia-Regular.ttf")).deriveFont(30f);
            Vampiro = Font.createFont( Font.TRUETYPE_FONT, new File("./res/fonts/VampiroOne-Regular.ttf")).deriveFont(30f);
            VT323 = Font.createFont( Font.TRUETYPE_FONT, new File("./res/fonts/VT323-Regular.ttf")).deriveFont(30f);
            Workbench = Font.createFont( Font.TRUETYPE_FONT, new File("./res/fonts/Workbench-Regular-VariableFont_BLED,SCAN.ttf")).deriveFont(30f);

            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

            ge.registerFont(Font.createFont( Font.TRUETYPE_FONT, new File("./res/fonts/IBMPlexSerif-SemiBold.ttf")));
            ge.registerFont(Font.createFont( Font.TRUETYPE_FONT, new File("./res/fonts/Roboto-Regular.ttf")));
            ge.registerFont(Font.createFont( Font.TRUETYPE_FONT, new File("./res/fonts/ShadowsIntoLightTwo-Regular.ttf")));
            ge.registerFont(Font.createFont( Font.TRUETYPE_FONT, new File("./res/fonts/SpecialElite-Regular.ttf")));
            ge.registerFont(Font.createFont( Font.TRUETYPE_FONT, new File("./res/fonts/Tomorrow-Regular.ttf")));
            ge.registerFont(Font.createFont( Font.TRUETYPE_FONT, new File("./res/fonts/UnifrakturMaguntia-Regular.ttf")));
            ge.registerFont(Font.createFont( Font.TRUETYPE_FONT, new File("./res/fonts/VampiroOne-Regular.ttf")));
            ge.registerFont(Font.createFont( Font.TRUETYPE_FONT, new File("./res/fonts/VT323-Regular.ttf")));
            ge.registerFont(Font.createFont( Font.TRUETYPE_FONT, new File("./res/fonts/Workbench-Regular-VariableFont_BLED,SCAN.ttf")));

            System.out.println("Fonts loaded");
        }
        catch (Exception e) {
            System.out.println("Error while loading fonts ... "  + e);
        }
    }
}
