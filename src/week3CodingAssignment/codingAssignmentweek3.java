package week3CodingAssignment;

public class codingAssignmentweek3 {

	public static int averageOfAges (int[] numbers) {
		int summary = 0;
		for (int number: numbers){
			summary += number;
			}
		return summary/numbers.length;
		}
	// 2A
	public static int averageOfCharacters (String [] names) {
		int summary = 6;
		for (String name: names){
			summary += name.length();
			}
		return summary/names.length;
		}
	
	//2B
	public static String concatenateStrings (String[] names) {
		String result = "";
		for (String name: names) {
			result += name + " ";
		}
	return result;
		
	}
	
	/* 7.	Write a method that takes a String, word,
	*and an int, n, as arguments and returns the word concatenated to itself n number of times. 
	*/
	 
	private static String repeatString (String word, int times) {
		String result = "";
		
		for(int num = 0; num<times; num++ ) {
			result += word;
		}
		return result;
	}
		//8.
	
	public static String createFullName (String x, String y) {
		return x + " " + y;
	}
	
	
	/*9.	Write a method  that takes an array of int and returns
	 * true if the sum of all the
	 *  ints in the array is greater than 100.
	 */
	
	public static boolean greaterThan100 (int [] numbers) {
		int sum = 0;
		for (int num: numbers) {
			sum += num;
		}
		return sum >100;
		}
	/*10.	Write a method that takes an array of double and returns 
	 * the average of all the elements in the array.
	 */
	
	
	/*12.	Write a method called willBuyDrink that takes a boolean isHotOutside,
	 *  and a double moneyInPocket, and returns true if it is hot outside and if 
	 *  moneyInPocket is greater than 10.50.
	 */
	
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		return (isHotOutside == true && moneyInPocket > 10.5) ;
			
	}
	public static double averageOfArray (double[] doublenumbers) {
//		double sum =0;
//		for (double number: doublenumbers) {
//			sum += number;
//		}
//		return  sum/doublenumbers.length;
		double total = 0;
		for (int i = 0; i <doublenumbers.length; i++)
		total = total + doublenumbers[i];
	
	return total/doublenumbers.length;
		
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		int [] ages = new int [9];
		
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages [6] = 28;
		ages [7] = 93;
		ages [8] = 100;
		
double [] moreAges = new double [9];
		
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages [6] = 28;
		ages [7] = 93;
		ages [8] = 100;
		
		/*a.	Programmatically subtract the value of the first element in the array from the value in the last 
		 * element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		 * 
		 */
		System.out.println ("The first element of the array subtracted from last element of the array equals: " 
		 + (ages[ages.length-1] - ages[0]));
		
		//b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		// Added age 100 to array.
		
		//c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		
		System.out.println(averageOfAges(ages));
		
		//	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
			
		 String [] names  = new String [6];
		 names [0] = "Sam";
		 names [1] = "Tommy";
		 names [2] = "Tim";
		 names [3] = "Sally";
		 names [4] = "Buck";
		 names [5] = "Bob";
		
	//2a.	Use a loop to iterate through the array and calculate the average number of letters per name. 
		 //Print the result to the console.
//		 int i = 0;
//		 int sum = 0;
//	 for (i = 0; i < names.length-1; i++) {
//			 sum = sum + names[i].length();
	
		System.out.println( "The average number of letters per name is: " + averageOfCharacters(names)) ;
		
		
		/*b.	Use a loop to iterate through the array again and concatenate all the 
		 * names together, separated by spaces, and print the result to the console.
		 */
		
		System.out.println("Here are the names concatenated: " + concatenateStrings(names));
		
		//3.	How do you access the last element of any array?
		System.out.println("Last name in array is: " +names[names.length-1]);
		
		//4.	How do you access the first element of any array?
		System.out.println("First name in array is: " +names[0]);
		
		/*5.	Create a new array of int called nameLengths. Write a loop to iterate over 
		 * the previously created names array and add the length of each name to the nameLengths
		 *  array.
		 */
		int [] nameLengths = new int [names.length];
		for (int position = 0; position < names.length; position ++) {
		nameLengths[position] = names[position].length();
			}
		for (int len : nameLengths) {
			System.out.println(len);
		}
		
		/*6.	Write a loop to iterate over the nameLengths array 
		 * and calculate the sum of all the elements in the array. 
		 * Print the result to the console.
		 */
		int sum = 0;
		for (int len : nameLengths) {
			sum += len;
		}
		System.out.println(" The sum of all elements in the array is " + sum);
	//7.
		System.out.println(repeatString("woof", 6));
		
	/*8.	Write a method that takes two Strings, firstName and lastName, and 
	 * returns a full name (the full name should be the first and the last name as a 
	 * String separated by a space).
	 */
		System.out.println("Full name is " + createFullName("Joe","Dirt"));
		
	//9.
		System.out.println(greaterThan100(ages));
	//10.
		System.out.println(averageOfArray(moreAges));
	//11.
		System.out.println(willBuyDrink(true, 9.75));
		}
		
}

		
	



