package exam;

public class week2 {
//Compound Statement:  A branch statement that is made up of a list of statements
	//In a switch(variable){case }
	  public static void main(String[] args) {
	int day = 4;
	 String str = "two"; 
	     switch(str) 
	     { 
	         case "one": 
	             System.out.println("one"); 
	             break; 
	         case "two": 
	             System.out.println("two"); 
	             
	         case "three": 
	             System.out.println("three"); 
	             break; 
	         default: 
	             System.out.println("no match"); 
	     }
	     //if a break is not stated, it will go to the next case statement
	  //while loop,s , do while loops, conditions, for loops
	  
	  int a = 0;
	  int b = a++; // b = 0; a = 1

	  a = 0;
	  b = ++a; // b = 1; a = 1
		 // The idea is that ++a increments a and returns that value, while a++ returns a's value and then increments a.
	  }
	  
	  //use System. exit() when your program encounters an unrecoverable error and there is no point in the
	  //program continuing to run. Use return when your program can gracefully recover, or when the program should perform 
	  //cleanup/closeout actions before exiting.
	  andom rnd = new Random();
	  
}