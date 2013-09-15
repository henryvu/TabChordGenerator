/**
 * Created with IntelliJ IDEA.
 * User: Nick
 * Date: 9/14/13
 * Time: 11:37 PM
 */

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class chordPrinter {

    private String song;

    public void readFile(){

        String location;

// grabbing file location

        location = chordGUI.getFileLocation();

// converting the file to a string

        try {
            song = readFileAsString(location);
        } catch (IOException e) {
            e.printStackTrace();
        }

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

    public void printChords(){

        char thisChord;

/* Currently each for loop handles the output of one string. I will probably end up
breaking these off into individual string objects as they will get a little more
unwieldy when I have to implement minors/majors/5ths/etc. */

        System.out.print("  ");
        for(int i=0; i < song.length();i++){


// When printing out the chords on top, upper case letters are major chords and lower case letters are minor

            if ( Character.isUpperCase(song.charAt(i))){

                System.out.print(song.charAt(i)+"  ");

            } else if ( Character.isLowerCase(song.charAt(i))) {

                System.out.print(Character.toUpperCase(song.charAt(i)) + "m ");

            }
        }

        System.out.print(" \n--");

        for(int i=0; i < song.length();i++){
            thisChord = song.charAt(i);
            if (thisChord == 'A'){
                System.out.print("-");
            }else if (thisChord == 'B'){
                System.out.print("-");
            }else if (thisChord == 'C'){
                System.out.print("-");
            }else if (thisChord == 'D'){
                System.out.print("2");
            }else if (thisChord == 'E'){
                System.out.print("-");
            }else if (thisChord == 'F'){
                System.out.print("1");
            }else if (thisChord == 'G'){
                System.out.print("3");
            }else if (thisChord == 'a'){
                System.out.print("-");
            }else if (thisChord == 'b'){
                System.out.print("2");
            }else if (thisChord == 'c'){
                System.out.print("3");
            }else if (thisChord == 'd'){
                System.out.print("1");
            }else if (thisChord == 'e'){
                System.out.print("-");
            }else if (thisChord == 'f'){
                System.out.print("1");
            }else if (thisChord == 'g'){
                System.out.print("3");
            }

            System.out.print("--");
        }

        System.out.print("---\n--");

        for(int i=0; i < song.length();i++){
            thisChord = song.charAt(i);
            if (thisChord == 'A'){
                System.out.print("2");
            }else if (thisChord == 'B'){
                System.out.print("4");
            }else if (thisChord == 'C'){
                System.out.print("1");
            }else if (thisChord == 'D'){
                System.out.print("3");
            }else if (thisChord == 'E'){
                System.out.print("-");
            }else if (thisChord == 'F'){
                System.out.print("1");
            }else if (thisChord == 'G'){
                System.out.print("-");
            }else if (thisChord == 'a'){
                System.out.print("1");
            }else if (thisChord == 'b'){
                System.out.print("3");
            }else if (thisChord == 'c'){
                System.out.print("4");
            }else if (thisChord == 'd'){
                System.out.print("3");
            }else if (thisChord == 'e'){
                System.out.print("-");
            }else if (thisChord == 'f'){
                System.out.print("1");
            }else if (thisChord == 'g'){
                System.out.print("3");
            }

            System.out.print("--");

        }

        System.out.print("---\n--");

        for(int i=0; i < song.length();i++){
            thisChord = song.charAt(i);
            if (thisChord == 'A'){
                System.out.print("2");
            }else if (thisChord == 'B'){
                System.out.print("4");
            }else if (thisChord == 'C'){
                System.out.print("-");
            }else if (thisChord == 'D'){
                System.out.print("2");
            }else if (thisChord == 'E'){
                System.out.print("1");
            }else if (thisChord == 'F'){
                System.out.print("2");
            }else if (thisChord == 'G'){
                System.out.print("-");
            }else if (thisChord == 'a'){
                System.out.print("2");
            }else if (thisChord == 'b'){
                System.out.print("4");
            }else if (thisChord == 'c'){
                System.out.print("5");
            }else if (thisChord == 'd'){
                System.out.print("2");
            }else if (thisChord == 'e'){
                System.out.print("-");
            }else if (thisChord == 'f'){
                System.out.print("1");
            }else if (thisChord == 'g'){
                System.out.print("3");
            }

            System.out.print("--");
        }

        System.out.print("---\n--");

        for(int i=0; i < song.length();i++){
            thisChord = song.charAt(i);
            if (thisChord == 'A'){
                System.out.print("2");
            }else if (thisChord == 'B'){
                System.out.print("4");
            }else if (thisChord == 'C'){
                System.out.print("2");
            }else if (thisChord == 'D'){
                System.out.print("-");
            }else if (thisChord == 'E'){
                System.out.print("2");
            }else if (thisChord == 'F'){
                System.out.print("3");
            }else if (thisChord == 'G'){
                System.out.print("-");
            }else if (thisChord == 'a'){
                System.out.print("2");
            }else if (thisChord == 'b'){
                System.out.print("4");
            }else if (thisChord == 'c'){
                System.out.print("5");
            }else if (thisChord == 'd'){
                System.out.print("-");
            }else if (thisChord == 'e'){
                System.out.print("2");
            }else if (thisChord == 'f'){
                System.out.print("3");
            }else if (thisChord == 'g'){
                System.out.print("5");
            }

            System.out.print("--");
        }

        System.out.print("---\n--");

        for(int i=0; i < song.length();i++){
            thisChord = song.charAt(i);
            if (thisChord == 'A'){
                System.out.print("-");
            }else if (thisChord == 'B'){
                System.out.print("2");
            }else if (thisChord == 'C'){
                System.out.print("3");
            }else if (thisChord == 'D'){
                System.out.print("-");
            }else if (thisChord == 'E'){
                System.out.print("2");
            }else if (thisChord == 'F'){
                System.out.print("-");
            }else if (thisChord == 'G'){
                System.out.print("2");
            }else if (thisChord == 'a'){
                System.out.print("-");
            }else if (thisChord == 'b'){
                System.out.print("2");
            }else if (thisChord == 'c'){
                System.out.print("3");
            }else if (thisChord == 'd'){
                System.out.print("-");
            }else if (thisChord == 'e'){
                System.out.print("2");
            }else if (thisChord == 'f'){
                System.out.print("3");
            }else if (thisChord == 'g'){
                System.out.print("5");
            }

            System.out.print("--");
        }

        System.out.print("---\n--");

        for(int i=0; i < song.length();i++){
            thisChord = song.charAt(i);
            if (thisChord == 'A'){
                System.out.print("-");
            }else if (thisChord == 'B'){
                System.out.print("-");
            }else if (thisChord == 'C'){
                System.out.print("-");
            }else if (thisChord == 'D'){
                System.out.print("-");
            }else if (thisChord == 'E'){
                System.out.print("-");
            }else if (thisChord == 'F'){
                System.out.print("-");
            }else if (thisChord == 'G'){
                System.out.print("3");
            }else if (thisChord == 'a'){
                System.out.print("-");
            }else if (thisChord == 'b'){
                System.out.print("2");
            }else if (thisChord == 'c'){
                System.out.print("x");
            }else if (thisChord == 'd'){
                System.out.print("x");
            }else if (thisChord == 'e'){
                System.out.print("-");
            }else if (thisChord == 'f'){
                System.out.print("1");
            }else if (thisChord == 'g'){
                System.out.print("3");
            }


            System.out.print("--");
        }

        System.out.print("---\n");

        chordGUI.printChords(song);
    }

    public void parseString(){

        char thisNote;
        StringBuilder finalString = new StringBuilder();

/*
* Simple process for dumping out illegal characters. Go through the string one character at a time. If it
* is a legal character, append it. If it is illegal, skip it.
*/

        for(int i=0;i<song.length();i++){

            thisNote = song.charAt(i);

            if( (thisNote >= 65 && thisNote <= 71)||(thisNote >= 97 && thisNote <= 103)) {

                finalString.append(thisNote);

            }
        }

        song = finalString.toString();

    }

}
