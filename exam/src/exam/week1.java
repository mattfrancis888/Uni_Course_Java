package exam;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class week1 {
	  public static void main(String[] args) {
		    System.out.println("Hello world!");
		    int a = 821 / 10;
			System.out.println( a % 10);
			int counter = 0;
		
			System.out.println(counter);
				
		    System.out.printf("%5s %n", "E");
		    System.out.printf("%3.2f ",14444.223);
		    System.out.printf("%13.2f ",14444.223);
		    
		    //use number format for money
		    NumberFormat moneyFormater2 =
		    		 NumberFormat.getCurrencyInstance(Locale.US);


		    System.out.println(moneyFormater2.format(19.8));
		    System.out.println(moneyFormater2.format(19.81111));
		    
//		    $19.80
//		    $19.81

		    
		    //You can use decimal format to format decilmals
		    //# means optional value
		    
//Scanner keyboard = new Scanner(System.in);
//		    double d1 = keyboard.nextDouble();
//		    int numberOfPods = keyboard.nextInt();
		    // keyboard.nextLine();
		    
		    Scanner keyboard = new Scanner(System.in);
		    //Using nextInt() and nextline together with an input of
		    //2
		    //Heads are better than
		    //1 head.
		    int n = keyboard.nextInt();
		    String s1 = keyboard.nextLine();
		    String s2 = keyboard.nextLine();
		    System.out.println(s1);
		    System.out.println(s2);
		    
		    // will return
		    //n will be equal to "2",
		    //s1 will be equal to "", and
		    //s2 will be equal to "heads are better than"
		    
		    //We can use another nextLIne() to get rid of the "%n"
		    
//		    keyboard.useDelimiter("#####"); explained in (we omit the # in input)
				    //https://stackoverflow.com/questions/28766377/how-do-i-use-a-delimiter-with-scanner-usedelimiter-in-java

	  
	  }
}
