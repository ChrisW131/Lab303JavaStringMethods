// TRIM () - The Java string trim() method removes the leading and trailing spaces. It checks the Unicode value of the space character (‘\u0020’) before and after the string. If it exists, then remove the spaces and return the omitted string.

public class Trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="  hello   "; 
		System.out.println(s1+"how are you");        // without trim() 
		System.out.println(s1.trim()+"how are you"); // with trim() 


	}

}
//In the above code, the first print statement will print “hello how are you” while the second statement will print “hello how are you” using the trim() function.