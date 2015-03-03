
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

import javax.swing.JOptionPane;

import static java.lang.System.out;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;


public class Numerology {
	

	static int pathOfDestiny;
	static int soul;
	static int outerPersonality;
	static int lifeLesson;
	
	//method to get name
	public static String getName (){
			String name = JOptionPane.showInputDialog("enter a name in the following format 'james carlos rodgers'");
			return name;
	}
	//method to get birthdate
	public static String getBirthdate ()
	{
			String birthday =JOptionPane.showInputDialog("enter a bithdate in the following format '6-19-1977'");
			return birthday;
	}
	
	//convert string to individual numbers
	

			
				public static int getFinalNum(int totalOfChars)
				{
				int sumOfChars = 0;	
				if (totalOfChars >=10)
				{
					if (totalOfChars >= 100)
					{
						int firstNum = (totalOfChars / 100);
						int secondNum = ((totalOfChars / 10) /10);
						int thirdNum = (totalOfChars % 100);
						sumOfChars = (firstNum + secondNum + thirdNum);
					}
					int firstNumThree = (totalOfChars / 10);
					int secondNumThree = (totalOfChars % 10);
					sumOfChars = (firstNumThree + secondNumThree);
				}			
		
				else {
					sumOfChars = totalOfChars;
					out.println("else = " + totalOfChars + " should = " + sumOfChars);
				}
				while(sumOfChars>=10)
				{
					int firstNumTwo = (sumOfChars / 10);
					int secondNumTwo = (sumOfChars % 10);
					sumOfChars = (firstNumTwo + secondNumTwo);
					out.println("whileStatement " + sumOfChars);
					}
				
				out.println("return= " + sumOfChars);
				return sumOfChars;
				
			}
				
				
				//method to convert char to int
	public static int convertToInt (char inputChar)
	{
		int outputInt = 0;
		
		switch (inputChar) {
		case 'a':
			outputInt = 1;
			break;
		case 'b':
			outputInt = 2;
			break;
		case 'c':
			outputInt = 3;
			break;
		case 'd':
			outputInt = 4;
			break;
		case 'e':
			outputInt = 5;
			break;
		case 'f':
			outputInt = 6;
			break;
		case 'g':
			outputInt = 7;
			break;
		case 'h':
			outputInt = 8;
			break;
		case 'i':
			outputInt = 9;
			break;
		case 'j':
			outputInt = 1;
			break;
		case 'k':
			outputInt = 2;
			break;
		case 'l':
			outputInt = 3;
			break;
		case 'm':
			outputInt = 4;
			break;
		case 'n':
			outputInt = 5;
			break;
		case 'o':
			outputInt = 6;
			break;
		case 'p':
			outputInt = 7;
			break;
		case 'q':
			outputInt = 8;
			break;
		case 'r':
			outputInt = 9;
			break;	
		case 's':
			outputInt = 1;
			break;
		case 't':
			outputInt = 2;
			break;
		case 'u':
			outputInt = 3;
			break;
		case 'v':
			outputInt = 4;
			break;
		case 'w':
			outputInt = 5;
			break;
		case 'x':
			outputInt = 6;
			break;
		case 'y':
			outputInt = 7;
			break;
		case 'z':
			outputInt = 8;
			break;
		}
		return outputInt;
		
	}
	public static int convertNumToInt (char inputChar)
	{
		int outputInt = 0;
		
		switch (inputChar) {
		case '1':
			outputInt = 1;
			break;
		case '2':
			outputInt = 2;
			break;
		case '3':
			outputInt = 3;
			break;
		case '4':
			outputInt = 4;
			break;
		case '5':
			outputInt = 5;
			break;
		case '6':
			outputInt = 6;
			break;
		case '7':
			outputInt = 7;
			break;
		case '8':
			outputInt = 8;
			break;
		case '9':
			outputInt = 9;
			break;
		}
		return outputInt;
	}
	
	static class ResultsFrame extends JFrame implements ActionListener {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		JButton restart = new JButton ("Run Again?");
		
		
		public ResultsFrame () {
			setTitle("These Are Your Numbers");
			//setTitle("These are your Numbers")// why wont this work?
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			add(new JLabel("Path of Destiny Number is "));
			add(new JLabel("" + pathOfDestiny));
			add(new JLabel("Soul Number is "));
			add(new JLabel("" + soul));
			add(new JLabel("Outer Personality Number is "));
			add(new JLabel("" + outerPersonality));
			add(new JLabel("Life Lesson Number is "));
			add(new JLabel("" + lifeLesson));
			add(new JLabel(""));
			add(restart);
			restart.addActionListener(this);
			setLayout(new GridLayout(5, 2, 20, 3));
			
			pack();
			setVisible(true);
			setLocationRelativeTo(null);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			main (null);
		}

			
		

	}
		
				
			public static void main(String[] args) {
		// TODO Auto-generated method stub
				int addCharInt = 0;
				int soulAddCharInt = 0;
				int OPAddCharInt = 0;
				
				//get name
				String name = getName();
				//convert string to Char array
				CharacterIterator nameChars = new StringCharacterIterator(name);
				for (char ch = nameChars.first(); ch != CharacterIterator.DONE; ch = nameChars.next()) {
					if (ch != ' ') {
						char lowerCh = Character.toLowerCase(ch);
						int charInt = convertToInt (lowerCh);
						addCharInt = (addCharInt + charInt);
//get vowels for soul number
						if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u' || lowerCh == 'y'){
							int soulCharInt = convertToInt (lowerCh);
							soulAddCharInt = (soulAddCharInt + soulCharInt);
							}
//take remaining letters for OuterPersonality number
						else {
							int OPCharInt = convertToInt (lowerCh);
							OPAddCharInt = (OPAddCharInt + OPCharInt);
							
						}
						
					}
										
				}
				out.println (addCharInt);
				
//get birthday			
				String birthdate = getBirthdate();
				int addNumCharInt = 0;
				
				CharacterIterator birthdateChars = new StringCharacterIterator(birthdate);
				for (char ch = birthdateChars.first(); ch != CharacterIterator.DONE; ch = birthdateChars.next())
				{
					if (ch!= ' '){
				
					int numCharInt = convertNumToInt(ch);
					addNumCharInt = (addNumCharInt + numCharInt);
					}
					out.println("numCharInt " + addNumCharInt);
					}
			
//get numerology
				pathOfDestiny = getFinalNum(addCharInt);
				soul = getFinalNum(soulAddCharInt);
				outerPersonality = getFinalNum(OPAddCharInt);
				lifeLesson = getFinalNum(addNumCharInt);
//Output numerology				
				
					new ResultsFrame();
		       
			
			}
			
			}
