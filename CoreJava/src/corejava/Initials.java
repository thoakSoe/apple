package corejava;

public class Initials {
	 public static void main(String[] args) {
	        String name = "ace inspiration";
	        
	        String[]namepart = name.split(" ");
	        StringBuilder initial = new StringBuilder();
	        for (String part: namepart) {
	        	initial.append(part.charAt(0));
	        }
	        String result=initial.toString().toUpperCase();
	        
	        System.out.println(result);
	      
//	        String[] nameParts = name.split(" ");
//	        
//	        StringBuilder initials = new StringBuilder();
//	        
// 
//	        for (String part : nameParts) {
//	       
//	                initials.append(part.charAt(0)); 
//	            
//	        }
//	     	    
//	        String initialsStr = initials.toString().toUpperCase();
//	        
//	        System.out.println("Initials: " + initialsStr);
//	        
//	       
	 }

}
