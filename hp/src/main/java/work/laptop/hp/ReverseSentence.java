package work.laptop.hp;

public class ReverseSentence {

	public static void main(String[] args) {
		String sentence = "The sky is blue";
		String reversed = reverseWord(sentence);
		System.out.println(sentence + " reversing words in sentence using array " + reversed);
		//System.out.println(sentence + " reversing words in sentence using StringBuffer " + sbufer(sentence));
		//System.out.println(sentence + " reversing words in sentence using StringBuffer " + sbuilder(sentence));
	}

	private static String sbuilder(String sentence) {
		String words = sentence ;
		StringBuilder sbuffer = new StringBuilder(words).reverse();
		return sbuffer.toString();
	}

	private static String sbufer(String sentence) {
		String words = sentence ;
		StringBuffer sbuffer = new StringBuffer(words).reverse();
		return sbuffer.toString();
	}

	private static String reverseWord(String sentence) {
		String array[] = sentence.split(" ");
		System.out.println("length "+ array.length );
		StringBuilder sb = new StringBuilder();
		for ( int i= array.length-1; i>= 0; i--){
			if(!array[i].equals("")){
				sb.append(array[i]).append(" ");
			}
		}
		return sb.toString();		
	}

}
