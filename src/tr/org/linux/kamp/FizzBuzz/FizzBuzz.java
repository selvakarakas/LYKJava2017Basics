package tr.org.linux.kamp.FizzBuzz;
public class FizzBuzz{

public static void main(String[] args) {   
    for(int i = 0; i <= 16; i++) {  
    	String in ="";
    	if(i%3 == 0)
    		in += "Fizz";
    	if(i%5==0)  
    		in += "Buzz";
    	System.out.println(in + " ");
    		
    }
      
  }
}
