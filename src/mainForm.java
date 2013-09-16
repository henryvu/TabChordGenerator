import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class mainForm extends JDialog {
    private JPanel contentPane;
    private JButton buttonGenerate;
    private JButton buttonExit;
    private JButton loadButton;
    private JButton saveButton;
    private JTextField textField1;
    private JTextArea chordWindow;
    private String songChords = "";

    public static void startGui() {
        mainForm dialog = new mainForm();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
    public mainForm() {
        setContentPane(contentPane);
        setModal(true);
        setTitle("Chord Displayer 1.1.1");
        getRootPane().setDefaultButton(buttonGenerate);

        buttonGenerate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onGenerate();
            }
        });

        buttonExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        loadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onLoad();
            }
        });

        saveButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                onSave();
            }
        });

// call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

// call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }


    private void onLoad(){

        JFrame frame = new JFrame();
        String filePath;
        JFileChooser fc = new JFileChooser();

        int returnVal = fc.showOpenDialog(frame);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            filePath = fc.getSelectedFile().getPath();

            try {
                songChords = readFileAsString(filePath);
                JOptionPane.showMessageDialog(null,"File Loaded Successfully");
            }  catch (IOException e1) {
                e1.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }

        } else {
            //
        }
        parseString();
        textField1.setText(songChords);
    }
    private void onSave(){
        JFrame frame = new JFrame();
        String filePath;
        JFileChooser fc = new JFileChooser();

        int returnVal = fc.showOpenDialog(frame);

        if (returnVal == JFileChooser.APPROVE_OPTION) {

            filePath = fc.getSelectedFile().getPath();

            PrintWriter out;
            try {
                FileWriter fw = new FileWriter(fc.getSelectedFile());
                fw.write(songChords);
                fw.flush();
                JOptionPane.showMessageDialog(null, "File Saved Successfully");
            } catch (FileNotFoundException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (IOException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }

        } else {
            //
        }
    }
    private void onGenerate() {

        char thisChord;
        songChords = textField1.getText();
        chordWindow.setText("");
        parseString();

/* Currently each for loop handles the output of one string. I will probably end up
breaking these off into individual string objects as they will get a little more
unwieldy when I have to implement minors/majors/5ths/etc. */

        chordWindow.append("  ");
        for(int i=0; i < songChords.length();i++){


// When printing out the chords on top, upper case letters are major chords and lower case letters are minor

            if ( Character.isUpperCase(songChords.charAt(i))){

                chordWindow.append(songChords.charAt(i)+"  ");

            } else if ( Character.isLowerCase(songChords.charAt(i))) {

                chordWindow.append(Character.toUpperCase(songChords.charAt(i)) + "m ");

            }
        }

        chordWindow.append(" \n--");

        for(int i=0; i < songChords.length();i++){
            thisChord = songChords.charAt(i);
            if (thisChord == 'A'){
                chordWindow.append("-");
            }else if (thisChord == 'B'){
                chordWindow.append("-");
            }else if (thisChord == 'C'){
                chordWindow.append("-");
            }else if (thisChord == 'D'){
                chordWindow.append("2");
            }else if (thisChord == 'E'){
                chordWindow.append("-");
            }else if (thisChord == 'F'){
                chordWindow.append("1");
            }else if (thisChord == 'G'){
                chordWindow.append("3");
            }else if (thisChord == 'a'){
                chordWindow.append("-");
            }else if (thisChord == 'b'){
                chordWindow.append("2");
            }else if (thisChord == 'c'){
                chordWindow.append("3");
            }else if (thisChord == 'd'){
                chordWindow.append("1");
            }else if (thisChord == 'e'){
                chordWindow.append("-");
            }else if (thisChord == 'f'){
                chordWindow.append("1");
            }else if (thisChord == 'g'){
                chordWindow.append("3");
            }

            chordWindow.append("--");
        }

        chordWindow.append("---\n--");

        for(int i=0; i < songChords.length();i++){
            thisChord = songChords.charAt(i);
            if (thisChord == 'A'){
                chordWindow.append("2");
            }else if (thisChord == 'B'){
                chordWindow.append("4");
            }else if (thisChord == 'C'){
                chordWindow.append("1");
            }else if (thisChord == 'D'){
                chordWindow.append("3");
            }else if (thisChord == 'E'){
                chordWindow.append("-");
            }else if (thisChord == 'F'){
                chordWindow.append("1");
            }else if (thisChord == 'G'){
                chordWindow.append("-");
            }else if (thisChord == 'a'){
                chordWindow.append("1");
            }else if (thisChord == 'b'){
                chordWindow.append("3");
            }else if (thisChord == 'c'){
                chordWindow.append("4");
            }else if (thisChord == 'd'){
                chordWindow.append("3");
            }else if (thisChord == 'e'){
                chordWindow.append("-");
            }else if (thisChord == 'f'){
                chordWindow.append("1");
            }else if (thisChord == 'g'){
                chordWindow.append("3");
            }

            chordWindow.append("--");

        }

        chordWindow.append("---\n--");

        for(int i=0; i < songChords.length();i++){
            thisChord = songChords.charAt(i);
            if (thisChord == 'A'){
                chordWindow.append("2");
            }else if (thisChord == 'B'){
                chordWindow.append("4");
            }else if (thisChord == 'C'){
                chordWindow.append("-");
            }else if (thisChord == 'D'){
                chordWindow.append("2");
            }else if (thisChord == 'E'){
                chordWindow.append("1");
            }else if (thisChord == 'F'){
                chordWindow.append("2");
            }else if (thisChord == 'G'){
                chordWindow.append("-");
            }else if (thisChord == 'a'){
                chordWindow.append("2");
            }else if (thisChord == 'b'){
                chordWindow.append("4");
            }else if (thisChord == 'c'){
                chordWindow.append("5");
            }else if (thisChord == 'd'){
                chordWindow.append("2");
            }else if (thisChord == 'e'){
                chordWindow.append("-");
            }else if (thisChord == 'f'){
                chordWindow.append("1");
            }else if (thisChord == 'g'){
                chordWindow.append("3");
            }

            chordWindow.append("--");
        }

        chordWindow.append("---\n--");

        for(int i=0; i < songChords.length();i++){
            thisChord = songChords.charAt(i);
            if (thisChord == 'A'){
                chordWindow.append("2");
            }else if (thisChord == 'B'){
                chordWindow.append("4");
            }else if (thisChord == 'C'){
                chordWindow.append("2");
            }else if (thisChord == 'D'){
                chordWindow.append("-");
            }else if (thisChord == 'E'){
                chordWindow.append("2");
            }else if (thisChord == 'F'){
                chordWindow.append("3");
            }else if (thisChord == 'G'){
                chordWindow.append("-");
            }else if (thisChord == 'a'){
                chordWindow.append("2");
            }else if (thisChord == 'b'){
                chordWindow.append("4");
            }else if (thisChord == 'c'){
                chordWindow.append("5");
            }else if (thisChord == 'd'){
                chordWindow.append("-");
            }else if (thisChord == 'e'){
                chordWindow.append("2");
            }else if (thisChord == 'f'){
                chordWindow.append("3");
            }else if (thisChord == 'g'){
                chordWindow.append("5");
            }

            chordWindow.append("--");
        }

        chordWindow.append("---\n--");

        for(int i=0; i < songChords.length();i++){
            thisChord = songChords.charAt(i);
            if (thisChord == 'A'){
                chordWindow.append("-");
            }else if (thisChord == 'B'){
                chordWindow.append("2");
            }else if (thisChord == 'C'){
                chordWindow.append("3");
            }else if (thisChord == 'D'){
                chordWindow.append("-");
            }else if (thisChord == 'E'){
                chordWindow.append("2");
            }else if (thisChord == 'F'){
                chordWindow.append("-");
            }else if (thisChord == 'G'){
                chordWindow.append("2");
            }else if (thisChord == 'a'){
                chordWindow.append("-");
            }else if (thisChord == 'b'){
                chordWindow.append("2");
            }else if (thisChord == 'c'){
                chordWindow.append("3");
            }else if (thisChord == 'd'){
                chordWindow.append("-");
            }else if (thisChord == 'e'){
                chordWindow.append("2");
            }else if (thisChord == 'f'){
                chordWindow.append("3");
            }else if (thisChord == 'g'){
                chordWindow.append("5");
            }

            chordWindow.append("--");
        }

        chordWindow.append("---\n--");

        for(int i=0; i < songChords.length();i++){
            thisChord = songChords.charAt(i);
            if (thisChord == 'A'){
                chordWindow.append("-");
            }else if (thisChord == 'B'){
                chordWindow.append("-");
            }else if (thisChord == 'C'){
                chordWindow.append("-");
            }else if (thisChord == 'D'){
                chordWindow.append("-");
            }else if (thisChord == 'E'){
                chordWindow.append("-");
            }else if (thisChord == 'F'){
                chordWindow.append("-");
            }else if (thisChord == 'G'){
                chordWindow.append("3");
            }else if (thisChord == 'a'){
                chordWindow.append("-");
            }else if (thisChord == 'b'){
                chordWindow.append("2");
            }else if (thisChord == 'c'){
                chordWindow.append("x");
            }else if (thisChord == 'd'){
                chordWindow.append("x");
            }else if (thisChord == 'e'){
                chordWindow.append("-");
            }else if (thisChord == 'f'){
                chordWindow.append("1");
            }else if (thisChord == 'g'){
                chordWindow.append("3");
            }

            chordWindow.append("--");
        }

        chordWindow.append("---\n");

    }
    private void parseString(){

            char thisNote;
            StringBuilder finalString = new StringBuilder();

/*
* Simple process for dumping out illegal characters. Go through the string one character at a time. If it
* is a legal character, append it. If it is illegal, skip it.
*/

            for(int i=0;i<songChords.length();i++){

                thisNote = songChords.charAt(i);

                if( (thisNote >= 65 && thisNote <= 71)||(thisNote >= 97 && thisNote <= 103)) {

                    finalString.append(thisNote);

                }
            }

            songChords = finalString.toString();

        }
    private static String readFileAsString(String filePath) throws java.io.IOException{

//Basic buffered input stream that will return the text file as a string

        byte[] buffer = new byte[(int) new File(filePath).length()];
        BufferedInputStream f;

        try {

            f = new BufferedInputStream(new FileInputStream(filePath));
            f.read(buffer);
            try { f.close(); } catch (IOException ignored) { }

        } catch (IOException ignored) {

            System.out.println("File not found or invalid path.");

        }

        return new String(buffer);
    }
    private void onCancel() {
        dispose();
    }



}
