package corejava;


public class RepeatedChaOrNum {
	 public static void main(String[] args) {
	       
	        String input = "Ace Inspiration";
	 
	        char[] characters = input.toLowerCase().toCharArray();

	        boolean[] checked = new boolean[characters.length];

	        System.out.println("Repeated characters or numbers:");
	        
//	        for(int i=0; i<characters.length; i++) {
//	        	  int count=1;
//		        	for(int j=i+1; j<characters.length;j++) {
//		        		if (characters[i]==characters[j]) {
//		        			count++;
//		        			
//		        		}
//		        			
//		        	}if(count>1) {
//		        		System.out.print(characters[i]);
//		        	}
//		        	
//		        }

	        for (int i = 0; i < characters.length; i++) {
	            if (checked[i]) {
	                continue;
	            }
	            int count = 1; 

	            for (int j = i + 1; j < characters.length; j++) {
	                if (characters[i] == characters[j]) {
	                    count++; 
	                    checked[j] = true;
	                }
	            }

	            if (count > 1) {
	                System.out.println(characters[i] + " - " + count + " times");
	            }
	        }
	 }
}
