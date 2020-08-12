package cp213;

/**
 * A simple linked deque structure of <code>T</code> objects. Only the
 * <code>T</code> value contained in the deque is visible through the standard
 * deque methods. Extends the <code>DoubleLink</code> class, which already
 * defines the front node, rear node, length, isEmpty, and iterator.
 *
 * @author - your name here -
 * @author David Brown
 * @version 2019-01-26
 *
 * @param <T>
 *            this data structure value type.
 */
public class DoubleDeque<T> extends DoubleLink<T> {
	  public static void main(final String[] args) {
		  DoubleDeque<String> deque= new DoubleDeque<String>();
		  deque.addFront("Hi");
		  //deque.addFront("Hi2");
		  deque.addRear("Bye");
		  System.out.println(deque.removeFront());
		  System.out.println(deque.peekFront());
		  System.out.println(deque.peekRear());
	  }

    /**
     * Adds a value to the front of a deque.
     *
     * @param value
     *            value to add to the front of the deque.
     */
	
	 
	//this.front/rear is in DoubleLink

    //Doublenode: 2nd param, is prev, 3rd param is next
    public void addFront(final T value) {
	// your code here
    	//Dequeue is a circular queue, so front's next would always point to this.rear
    		this.front =  new DoubleNode<T>(value, null, this.front);
    		this.length += 1;
    	
    }

    /**
     * Adds a value to the rear of a deque.
     *
     * @param value
     *            value to add to the rear of the deque.
     */
    public void addRear(final T value) {
	// your code here    	
    		this.rear =  new DoubleNode<T>(value, this.rear, null);
    		this.length += 1;
    }

    /**
     * Returns the value at the front of a deque.
     *
     * @return the value at the front of the deque.
     */
    public T peekFront() {
	// your code here
    	return this.front.getValue();
    }

    /**
     * Returns the value at the rear of a deque.
     *
     * @return the value at the rear of the deque.
     */
    public T peekRear() {
	// your code here'
    	return this.rear.getValue();
    }

    /**
     * Removes and returns the value at the front of a deque.
     *
     * @return the value that has been removed.
     */
    
    public T removeFront() {
	// your code here
  
    	
    	DoubleNode<T> removedNode = this.front;
    	if(this.isEmpty()) {
    		 System.out.println("Deque underflow! unable to remove front.");
    		 return null;
    	}  else if(this.getLength() == 1) {
    		this.front = this.rear;
    	}
    	else {
    		
    		this.front = this.front.getPrev();
    		//System.out.println(this.front);
    	}
    	this.length -= 1;
    	return removedNode.getValue();
    	
    	
    }

    /**
     * Removes and returns the value at the rear of a deque.
     *
     * @return the value that has been removed.
     */
    public T removeRear() {
	// your code here

    	DoubleNode<T> removedNode = this.rear;
    	if(this.isEmpty()) {
    		 System.out.println("Deque underflow! unable to remove rear.");
    		 return null;
    	} else if(this.getLength() == 1) {
    		this.rear = this.front;
    	} else {
    		this.rear = this.rear.getPrev();
    	}
    	this.length -= 1;
    	return removedNode.getValue();
    }
}
