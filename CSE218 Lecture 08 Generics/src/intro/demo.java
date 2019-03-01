package intro;

import java.util.ArrayList;

public class demo {

	public static void main(String[] args) {
		//makes inference don't have to put string for second array list
		//Angle bracket is generic
		ArrayList<String> theList = new ArrayList<>();
		theList.add("Hi");
//		theList.add(1); //auto boxing
//		theList.add(new Integer(1)); //line 12 is line 13
//		theList.add(1.1);//line 14 is 15
//		theList.add(new Double(1.1));
		//Bag<Student>
		
		//String str1 =  theList.get(0);
		//cannot cast integer to string, Runtime error
		//String str2 =  theList.get(1);
		
	}

}
