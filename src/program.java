

public class program{


	public static void main (String[] args){
		
		chordPrinter myChords = new chordPrinter();
		
		myChords.readFile();
		myChords.parseString();
		myChords.printChords();
		
	}
	
}
