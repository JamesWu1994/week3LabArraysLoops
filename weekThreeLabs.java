
public class weekThreeLabs {

	public static void main(String[] args) {
		//create an array with following values: 1, 5, 2, 8, 13, 6
		int[] array = {1, 5, 2, 8, 13, 6};
	
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//print out first element
		System.out.println(array[0]);
		
		//print out last element
		System.out.println(array[array.length - 1]);
		
		//print out at position 6
		//System.out.println(array[6]);
		//error and must be commented out for the program to continue to execute

		//print out at position -1
		//System.out.println(array[-1]);
		//error and must be commented out for the program to continue to execute
		//for loop that prints out each element
		
		//an enhanced for loop that prints out each element
		for (int number : array) {
			System.out.println(number);
		}
		
		//create a variable called sum and write a loop that adds each element in the array to the sum
		double sum = 0;
		for(int number : array) {
			sum += number;
		}
		System.out.println(sum);
		
		//a new variable called average and assigns the average value of the array to it
		double average = sum /array.length;
		System.out.println(average);
		
		//write an enhanced for loop that prints out each number that's odd
		for (int number : array) {
			if (number % 2 ==1) {
				System.out.println(number);	
			}
		}
		
		//create an array with these names and calculate the sum of the letters in the array
		String[] names = {"Sam", "Sally", "Thomas", "Robert"};
		
		int sumLetters = 0;
		for (String name : names) {
			sumLetters += name.length();
		}
		
		//a method that prints out a greeting
		greeting("James");
		
		//a method that prints out a greeting, don't print in the method
		System.out.println(hi("James"));
		//the first method doesn't return anything, hence public static void, while the second returns something
		
		//method that returns true if the length of the string is greater than int
		System.out.println(stringLongerThanNum("James", 3));
		
		//a method that takes an array of a string and returns true if the string exists in the array
		System.out.println(arrayString(names, "Hi"));
		
		//method that returns the smallest number in the array
		System.out.println(getSmallestNumber(array));
		
		//returns the average
		double[] x = {1.34, 4.56, 6.67};
		System.out.println(returnAverage(x));
		
		//get the length of the strings in the array
		int[] arrayLength = strLengths(names);
		for (int number : arrayLength) {
			System.out.println(number);
		}
		
		//a method that returns true if the sum of letters for all strings with even amount of letters is greater than those with odd ones
		System.out.println(evenCharGreaterThanSum(names));
		
		//a method that'll return true if the string is a palindrome
		System.out.println(isPalindrome("Goku"));
	}
	
	public static boolean isPalindrome(String string) {
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				return false;
			}
		} return true;
	}

	public static void greeting(String name) {
		System.out.println("Hello, " + name + "!");
	}
	
	public static String hi(String name) {
		return "Hi, " + name + "!";
	}
	
	public static boolean stringLongerThanNum(String string, int num) {
		return string.length() > num;
	}
	
	public static boolean arrayString(String[] array, String string) {
		for (String str : array) {
			if (str.equals(string)) {
			return true;
		} 
		}
		return false; }
	public static int getSmallestNumber(int[] numbers) {
		int smallest = numbers[0];
		for (int number : numbers) {
			if (number < smallest) {
			smallest = number;
		}
	}
	return smallest;
}
	public static double returnAverage(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		return sum / array.length;
	}
	public static int[] strLengths(String[] strings) {
		int[] results = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			results[i] = strings[i].length();
		}
		return results;
	}
	public static boolean evenCharGreaterThanSum(String[] array) {
		int even = 0;
		int odd = 0;
		
	for (String string : array) {
		if (string.length() % 2 == 0) {
			even += string.length();
		} else {
			odd += string.length();
		}
	} return even > odd;
	}
} 