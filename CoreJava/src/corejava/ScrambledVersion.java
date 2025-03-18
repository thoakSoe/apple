package corejava;

public class ScrambledVersion {

	    public static void main(String[] args) {
	        String input = "I want to drink water right now at once.";
	        
	        String[] words = input.split(" ");
	        
	        StringBuilder scrambledSentence = new StringBuilder();
	        
	        for (String word : words) {
	            if (word.length() > 3) {
	                scrambledSentence.append(scrambleWord(word)).append(" ");
	            } else {
	                scrambledSentence.append(word).append(" ");
	            }
	        }
	        
	        System.out.println(scrambledSentence.toString());
	    }

	    public static String scrambleWord(String word) {
	        char firstLetter = word.charAt(0);
	        char lastLetter = word.charAt(word.length() - 1);
	        if(lastLetter=='.') {
	        	word=word.substring(0,word.length()-1);
	        	  lastLetter = word.charAt(word.length() - 1);
	        	  
	        	String middle = word.substring(1, word.length() - 1);
		        
		        String scrambledMiddle = new StringBuilder(middle).reverse().toString();
		        
		        String scrambledWord = firstLetter + scrambledMiddle + lastLetter;
		        
		        return scrambledWord.concat(".");
	        }else {
	        
	        String middle = word.substring(1, word.length() - 1);
	        
	        String scrambledMiddle = new StringBuilder(middle).reverse().toString();
	        
	        String scrambledWord = firstLetter + scrambledMiddle + lastLetter;
	        return scrambledWord;
	        }
	    }
	
}