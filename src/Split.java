/*
 * David Huang
 * November 2022
 * Splits a string value to recieve the information (words) from within
 */

import java.util.Arrays;
import java.util.Arrays.*;
public class Split {

	// Your task Part 0
	public static void main(String[] args) {
	
		//It's a method that acts on a string, <StringName>.split(<sp>);
		//Where sp is the string where the string splits and it returns an array
//		String[] sp1 = ("I like apples!").split(" "); // it will split at spaces and return an array of ["I","like","apples!"]
//		System.out.println(Arrays.toString(sp1));
		
		//What happens if you "I reallyreally likeapples".split("really") ?
//		String[] sp2 = "I really like really red apples!".split("really"); // it will split at the word "really" and return an array of ["I "," like ","red apples!"]
//		System.out.println(Arrays.toString(sp2));
		
		//Part 1 Tests:
	    System.out.println(getFilling("applespineapplesbreadmayohambreadcheese"));
	    System.out.println(getFilling("breadmayobread"));
	    System.out.println(getFilling("applesbreadmayobread"));
	    System.out.println(getFilling("breadhambreadcheese"));
	    System.out.println(getFilling("breadbread"));
	    System.out.println(getFilling("breadcheese"));
	    System.out.println(getFilling("hamcheesebread"));
	    System.out.println(getFilling("cheese"));
	    System.out.println(getFilling("breadcheesebreadhambread"));
	    System.out.println(getFilling("hambreadmayobaconbreadavocadobread"));
	    
	    System.out.println();

	    //Part 2 Tests
	    System.out.println(getFilling2("apples bread mayo bread"));
	    System.out.println(getFilling2("bread ham bread cheese"));
	    System.out.println(getFilling2("bread bread"));
	    System.out.println(getFilling2("bread cheese"));
	    System.out.println(getFilling2("ham bread mayo bacon bread avocado bread"));
	
	}
	
		//play around with String.split!
		
		//Your task Part 1:
	public static String getFilling(String smushSando) {
		
		// Write a method that take in a string like
		// smushSando = "applespineapplesbreadlettucetomatobaconmayohambreadcheese";
		
		String breadOut = "";
		int breads = 0;
		for (int i = 0; i<smushSando.length()-4; i++) {
			if(smushSando.substring(i,i+5).equals("bread")) {
				breads++;
			}
		}
		String[] spBread = smushSando.split("bread");
		if(breads == 0 || breads == 1) {
			breadOut = "Not a sandwich";
		}else if(breads == 2 && spBread.length == 1) {
			breadOut = spBread[0];
		}else if(breads == 2 && spBread.length >= 2) {
			breadOut = spBread[1];
		}else if(breads >= 3) {
			int breadCount = 1;
			while(breadCount<breads) {
				breadOut += spBread[breadCount];
				breadCount++;
			}
		}
		return breadOut;
		
	}
//		/* describing a sandwich.
//		* Use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
//		* What if it's a fancy sandwich with multiple pieces of bread?
//		*/
	
	//Your task pt 2:
	public static String getFilling2(String spaceSando) {
		
		String breadOut = "";
		int breads = 0;
		String[] spaceSplit = spaceSando.split(" ");
		String stBread = "";
		for (int i = 0; i<spaceSplit.length; i++) {
			if(spaceSplit[i].equals("bread")) {
				breads++;
			}
			stBread += spaceSplit[i];
		}
		String[] spBread = stBread.split("bread");
		if(breads == 0 || breads == 1) {
			breadOut = "Not a sandwich";
		}else if(breads == 2 && spBread.length == 1) {
			breadOut = spBread[0];
		}else if(breads == 2 && spBread.length >= 2) {
			breadOut = spBread[1];
		}else if(breads >= 3) {
			int breadCount = 1;
			while(breadCount<breads) {
				breadOut += spBread[breadCount];
				breadCount++;
			}
		}
		return breadOut;
	}	
			
//		/*Write a method that take in a string like
//		*/ "apples pineapples bread lettuce tomato bacon mayo ham bread cheese"
//		/* describing a sandwich
//		* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside.
//		* The output for the example above should be lettucetomatobaconmayoham
//		* You should call the method from part one in order to increase your reuse of code and reduce the complexity of part 2.
//		*/

}
