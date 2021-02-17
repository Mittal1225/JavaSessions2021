package FinallyConcept;

public class Finally {

	public static void main(String[] args) {
		
		
		//Finally always associated with try catch block
		//Finally will be executed all the time 
		//whether exception is coming or not finally will be executed
		//IQ - finally will be used in real time env when trying to make connection to DB it might throw some exception due to connection issue. 
		//whether work done or not it should finally flush/close out the connection. Also, use while making file connection
		
		int p = 10;
		
		try {
			
			System.out.println("this is befo9re exception");
			System.out.println("DB connection - trying to establish");
			System.out.println("DB connection - is done");
			
			int z = p/0;
			
	     }catch (ArithmeticException e) {
	    	 System.out.println("some exception is coming");
	     
	     }finally {
	    	 
	    	 System.out.println("executing finally block");
	    	 System.out.println("flush/close the connection");
	     }
		
		
		      int m = getMarks("Sharad");
		      System.out.println(m);
	}


	   //Below will return Bye and -3 instead 95 bcz finally will be executed whether exception comes or not
	

         public static int getMarks(String name) {
        	 
        	 try {
        		 
        		 if(name.equals("Neha")) {
        			 int i = 10/0;
        			 return 100;
        
             }else if(name.equals("Mittal")) {
            	 return 95;
        		 
             }else if (name.equals("Hitu")) {
            	 return 80;
             }else {
            	 return -1;
             }
        	 
        	 }catch(Exception e) {
        		 return -2;
        		 
        	 }	 finally {
        			 System.out.println("Bye");
        			 //return -3;
        		 }
        	 
        	   }	 
        	 
         } 
          	 
         