package fran0880_l07;
public class ArrayTest_5 {

	  public static void main(String[] args) {
	    int[] first = { 1, 3, 5, 7, 9 };
	    int[] second = first;
	    int[][] third = {{}};
	    //
	    System.out.println("first:");
//	    System.out.println(first);

	    for (int i = 0; i < first.length; i++) {
	      System.out.println(first[i]);
	    }

	    System.out.println("second:");

	    for (int i = 0; i < second.length; i++) {
	      System.out.println(second[i]);
	    }
	    
	    System.out.println("third:");
	    third[0] = first;
	    for (int[] array : third) {
	    	for(int val: array) {
	    		System.out.println(val);
	    	}
	    }
	    //System.out.println(third[0]);
	  }
	}