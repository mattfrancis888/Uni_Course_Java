package exam;

public class week10multi {
	  public static void main(String[] args) {
		  //threads are often thought as paraellel execution
//they usually do not really execute in parallel�
		  //Instead, the computer switches resources 
		  //between threads so that each one does a 
		  //little bit of computing in turn\
		  
		  
		  //may throw InterruptedException
		  //if thread is interuped when sleeping
		  
		  //run methods tells what the thread should do when it starts
		  public class MyRunnableTask implements Runnable { 
			     public void run() { 
			         // do stuff here 
			    	 try  
			            {  
			                Thread.sleep(500);  
			            }catch(InterruptedException e){System.out.println(e);}    
			            System.out.println(i);    
			        }    
			     } 
			} 
		  Thread t = new Thread(new MyRunnableTask()); 
		  t.start(); //will start and run with anew thread
		  t.run() //will start current thread
		  
		  //or
		  Thread t = new Thread(new Runnable() { 
			    public void run() { 
			        // stuff here 
			    } 
			}); 
			t.start(); 
			
			
			
			// if your class provides more functionality 
			//rather than just running as Thread, you should implement 
			//Runnable interface to provide a way to run it as Thread. 
			//If your class only goal is to run as Thread, 
			//you can extend Thread class
			//Race Conditions
			//When multiple threads change a shared variable it is
			//sometimes possible that the variable will end up with the 
			//wrong (and often unpredictable) value
			class RaceCondition extens Thread{
				RaceCodition(Counter)
			}
			
			RaceCondition[] threads = new RaceCondition[3000];
			threads[0] = new RaceCondition("hey");
			threads[1] = new RaceCondition("bye");
			threads.start();
			
			  try
		        { 
		           //wait for threads to die
				  threads.join(); 
		        } 
		  
		        catch(Exception ex) 
		        { 
		            System.out.println("Exception has " + 
		                                "been caught" + ex); 
		        } 
			  
			//output can be hey or bye
			
			//to make a thread run one at a time
			//use the keyword syncrhonized. This is called a CRITICAL REGION.
			public synchronized void increment() {
				
			}
			
			//or
			public void increment() {
				//we cans ynchronzie only some parts of our code
				synchronized(this) {
					//your code
				}
			}
			
			//by doing so, if we start this thread and have another thread running; the other thread cannot run this
		  
			
			//Transmission Control Protocol � TCP
			//�Most common network protocol on the Internet�Called a 
			//reliable protocol because it guarantees that data sent from the sender
			//is received in the same order it is sent
			
			//Server
			//Program waiting to receive input
			
			//Client
			//Program that iniaties a connection to server	
			
			//Socket describes one end of the conneciton between 2 programs over a network
			//It includes:
			//IP address (identifies remote computer)
			//port for a local computer	 (between 0 and 65545)
			//ports 0 - 1024 are restricted for os
			//uses localhost
			//Similar to file I/O, instead of FileOutputStream we use DataOutputStram
			
			serverSock.accept(); call until a client  connects();
			
			//JavaBeans is a framework that facilitates software building by connecting software components from different source
			//The Enterprise JavaBean framework extends the JavaBeans framework to more readily accommodate business applicatio
			
			Applets�Run on the client
			�Servlets�Compiled Java programs on the server
			�JSP�Dynamically compiles to Servlets and integrated with the server
	  }
}
