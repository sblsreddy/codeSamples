package work.laptop.hp;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Hello world!
 * First non repeated character in a word
 *  the word "stress" is input  then it should print  't'   as output .

If the word "teeter" is input  then it should print  'r'   as output .
 * Pseudo Algorithm

1.   First create the  character count hash table .
  
          For each character
            If there is no value stored in the character 
                     set it to 1 .
            else 
                     increment the value of the character by 1 .

2.  Scan the string
           For each character
           return character if the count in hash table is 1 .
           If no character have count 1 , return null 
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Please enter the word to find the non repeated charcter" );
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        char c = firstNonRepeatedCharc(word);
        System.out.println("The first non repeated charcter for the word is : " + c);
    }

	@SuppressWarnings("null")
	private static char firstNonRepeatedCharc(String word) {
		char c;		
		int length = word.length();
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for(int i=0; i < length; i++){
			c = word.charAt(i);
			if(charMap.containsKey(c))
			{
				charMap.put(c, charMap.get(c)+1);
			}else{
				charMap.put(c, 1);
			}
			
		}
		
		for(int i= 0; i < length ; i++){
			c= word.charAt(i);
			if(charMap.get(c) == 1){
				return c;
			}
		}
		
		return (Character) null;
	}
}
