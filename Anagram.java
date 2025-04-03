package Ab52Access2;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s1= "fantastic";
	
	char []c1= s1.toCharArray();
	System.out.println("Array c1 before sorting is -> "+Arrays.toString(c1));
	Arrays.sort(c1);
	System.out.println("Array c1 after sorting is -> "+Arrays.toString(c1));
	
	}
	
	
	
}	


