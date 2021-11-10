import javax.swing.*;

public class VirtualPiano {

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame();


        PianoLayout pianoLayout = new PianoLayout();
        mainFrame.setTitle("Simple Piano by A10909001");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.add(pianoLayout);
//        mainFrame.setSize(800, 600);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }
}
