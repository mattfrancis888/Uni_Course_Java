package exam;

public class week6 {
	//polymorphism, cloning part 1 and abstract classes
	
	  public static void main(String[] args) {
		  //relatinship between method call and method definiton
		  
		  //static or early binding = binding is revolved at compile time
		  //Such as method overloading
		  
		  //dynamic or late binding - bindign takes place in exectution 
		  //Such as method overriding (the toString override method is an example too)
		  //late binding does not apply to static, final or private methods. (Since you cannot override these methods)
		  //You can create an identical method with the same name in the child however.
		  //for static, final or private methods, java uses static binding
		  
		  //in static methods, if you have
		  //class Sale:
		  //public static void announcement( ){System.out.println("Sale class");}
		 
		//class Discount extends Sale
			  //public static void announcement( ){System.out.println("DiscountSale class");}
		  
		  //sale = discount
		  //sale.announcement() will give you "Sale class"; 
		  
		  //Example below
		    Animal myAnimal = new Animal();
		    Animal myPig = (Animal) new Pig(); //upcasting (always allowed by default, no need to state (Animal) )
		    Animal myDog = new Dog();
		        
		    myAnimal.animalSound();
		    myPig.animalSound();
		    myDog.animalSound();
		    //From: https://www.w3schools.com/java/showjava.asp?filename=demo_polymorphism
		    
		    //final modifier
		    //A method marked final indicats that the method cannot be overriden
		    //A class marked final indicates that it  cannot be used as a base class from which to derive any other classe
		    
		    //Upcasting and downcating
		    //Down casting
//		    Animal animal = new Dog();
//		    Dog castedDog = (Dog) animal
		    //Invalid downcasting that will return ClassCastException:
		    //Animal animal = new Animal();
		   // Dog notADog = (Dog) animal;
		    //you can use instanceof to see if downcasting is legitimate; obj instanceof classname
		    
		    //Upcasting:
		    //SaleVariable saleVariable = new SaleVariable() // base class
		    //DiscountSale discountVariable = new DiscountSale("paint", 15,10); //derived class
		     //saleVariable = discountVariable;  or saleVariabl = new DiscoutnSale(..);
		    
		    //COPY CONSTRUCTORS
		    //https://www.baeldung.com/java-copy-constructor
		    //normal constructor
//			public Complex(double re, double im) { 
//				this.re = re; 
//				this.im = im; 
//			} 
//			
//		    //copy constructor
		   // private Date startDate;
//			public Complex(Complex c) {  
//				System.out.println("Copy constructor called"); 
//				re = c.re; 
//				im = c.im; 
		    	//if we have instacne variables, we can make it into a deep copy by doing; or else it will give you a shallow copy	
		    	//this.startDate = new Date(employee.startDate.getTime());
		    //https://www.baeldung.com/java-copy-constructor
//			} 
		    
		    //in main:
//			Complex c1 = new Complex(10, 15); 
//			
//			// Following involves a copy constructor call 
//			Complex c2 = new Complex(c1); 
		   
		    
		    //CLONING METHOD THAT'S USED WITH COPY CONSTRUCTORS:
		    //clone method: public Complex clone(){return new Sale(this);}
		    //original.clone(); or (ClassName) original.clone() is fine
		    
		    //prior to java there were no Covariants; so it was public Object clone(){return new Sale(this);}
		    //Complex copy = (Complex) original.clone();
		    
		    //pitfall:
		    //where b is an array of Sales
		    //if a[i] contains derived classes of Sale(eg; DiscountSale)
		    //dont do b[i] = new Sale(a[i]);  //will only return a plain Sale object rather than the derived clsass
		    //do b[i] = (a[i].clone()); //Wil return DiscountSale
		    ////The reason this works is because the method clone has the same name in all classes, and polymorphism works with method nam
		    
		  
		
		    //abstract class:
		    //abstract class matt{
		    	//public abstract double getPay();
		    //abstract methods cannot be private, but non-abstract methods in the abstract class can be private
		    //abstract calss can have a constructor:
//		    abstract class Product { 
//		        int multiplyBy;
//		        public Product( int multiplyBy ) {
//		            this.multiplyBy = multiplyBy;
//		        }
//
//		        public int mutiply(int val) {
//		           return multiplyBy * val;
//		        }
//		    }
//
//		    class TimesTwo extends Product {
//		        public TimesTwo() {
//		            super(2);
//		        }
//		    }
	  }
			
	  }


class Animal {
	  public static void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Pig extends Animal {
	  public  void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
	}

	class Dog extends Animal {
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
	}
