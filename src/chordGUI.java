import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class chordGUI extends JFrame {

	private static final long serialVersionUID = -8595285974270511564L;
	
	public static String getFileLocation(){
		
		//  Selecting file with JFilechooser and returning the path
		
		JFrame frame = new JFrame();
		JFileChooser fc = new JFileChooser();
		String fileLocation = new String();
		int returnVal = fc.showOpenDialog(frame); 
		
		if (returnVal == JFileChooser.APPROVE_OPTION) {
		    fileLocation = fc.getSelectedFile().getPath();
		} else {
		    //User did not choose a valid file
		}
		
		return fileLocation;
	}

	public static void printChords(String songChords){
		
		/*  I'm not sure JTextArea will end up working in this fashion.  There is no way to stylize the text
		 *  so I am at the mercy of the default formatting.  While it does display the information, everything
		 *  is skewed the further along it goes.
		 */
		
		JFrame chordFrame = new JFrame();
		JTextArea chordWindow = new JTextArea();
		chordFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		chordFrame.setSize(600, 200);
		chordFrame.add(chordWindow);
		chordFrame.setVisible(true);
		
		char thisChord;
		
		/*  Currently each for loop handles the output of one string.  I will probably end up
		    breaking these off into individual string objects as they will get a little more
			unwieldy when I have to implement minors/majors/5ths/etc.                           */
		
		chordWindow.append("  ");
		for(int i=0; i < songChords.length();i++){
		
			
			//  When printing out the chords on top, upper case letters are major chords and lower case letters are minor
			
			if ( Character.isUpperCase(songChords.charAt(i))){				
			
				chordWindow.append(songChords.charAt(i)+"  ");
			
			} else if ( Character.isLowerCase(songChords.charAt(i))) {
				
				chordWindow.append(Character.toUpperCase(songChords.charAt(i)) + "m ");
				
			}
		}
		
		chordWindow.append("   \n--");
		
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
		
}
	
