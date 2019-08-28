package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	
	
	
	//1. Create a main method to test the other methods you write.
	
	public static void main(String[] args) {
		
		MoreArrayFun meep = new MoreArrayFun();
		
		String [] test= new String [3];
		
		test[0]= "waffles";
		test[1]= "ice cream";
		test[2]= "cookies";
		
		
		
		meep.PrintStringsRandom(test);
		
		
		
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	void PrintStrings(String[] list) {
		
		
		for (int i = 0; i < list.length; i++) {
			
			System.out.println(list[i]);
			
		}
		
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	
	void PrintStringsBackwards(String [] reverselist) {
		
		for (int i = reverselist.length-1; 0 < reverselist.length; i--) {
			
			System.out.println(reverselist[i]);
			
			
			}
		}
		

	//4. Write a method that takes an array of Strings and prints every other String in the array.
	
	void SkipString(String [] skiplist) {
		
		for (int i = 0; i < skiplist.length; i=i+2) {
			
			System.out.println(skiplist[i]);
			
		}
		
	}
	
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	
	void PrintStringsRandom(String [] randomlist) {
		
		String [] ranlist= new String [randomlist.length];
		
		int wordsPrinted= 0;
		Random ran= new Random();
		
		
		
		while(wordsPrinted<randomlist.length) {
			
			String randomWord = randomlist[ran.nextInt(randomlist.length)];
			
			boolean found = false;
			
			for (int i = 0; i < wordsPrinted; i++) {
			
				
				
				if(ranlist[i].equals(randomWord)){
					
					found=true;
					break;
				}
				
			}
			
				if(found==false) {
					
					System.out.println(randomWord);
					
					ranlist[wordsPrinted]= randomWord;
					
					wordsPrinted+=1;
				
				}
				
			
		}
		
		
	
		
	}
	
	
	
	
}
