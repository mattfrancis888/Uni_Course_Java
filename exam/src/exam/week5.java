package exam;

public class week5 {

	  public static void main(String[] args) {
		  //original class is the base class
		  //new class is the derivced class(or subclass that extends base class) (automaticly has the varialbes/methods the base class has)
		  //return types cannot be changed when overiding a method
		  //but in java 5+ this can be done with a covarient return type
		  
		  //IMPORTANT:
		 //The access permission of an overridden method can be changed from private in the base class 
		  //to public (or some other more permissive access) in the derived class
		  //BUT it canot e changed from public in the base class to private/more restrictive in the derived class
		  
		  
		  //this can be used to invoke a construcotr, such as in lab 6
		  //Encapsulation and Inheritance Pitfall:
		  //�An instance variable that is private in a base class is not accessible by name
		  //in the definition of a method in any other class, not even in a method definition of a derived class
		  //An option to acess is is to use mutator methods like the public setters/getters in the parent class
		  
		  //if you have a base class that has a protected method, a derived class in a different package can access the variable. But if the derived
		  //class creates an object of the base class, it cannot access the variable name
		  
		  //overriding equals
		  //https://gyazo.com/10ecd26d47cd2391691c9413ee7ebb51
		  
		  //you cannot call multiple supers
		  //it is only valid to use super to invoke a method from a direct parent
		  //Repeating super will not invoke a method from some other ancestor class
		  //super.super.toString() == illegal!
		  
		  //instaceOf vs getClass for objects
		  //instanceOf works if parent.equals(child), but not vice versa
		  
		  //getClass() returns the class literaly
	  }
}
