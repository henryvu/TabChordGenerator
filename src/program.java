/**
 * Created with IntelliJ IDEA.
 * User: Nick
 * Date: 9/14/13
 * Time: 11:35 PM
 */
public class program {

        public static void main (String[] args){

            chordPrinter myChords = new chordPrinter();

            myChords.readFile();
            myChords.parseString();
            myChords.printChords();

        }
}
