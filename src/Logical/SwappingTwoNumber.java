package Logical;

public class SwappingTwoNumber {
	
	
	
	
	
	
	 public static void main(String[] args) {
		int a=10, b=20;
		
		System.out.println("Before Swapping   "+a+" "+b);
		
		//logic-1 -By Using Third Variable
		
		/*int t=a;
		    a=b;
		    b=t;*/
		
		//Logic-2 -- WithOut Using third Variable
		
		a=a+b;  //10+20=30
		b=a-b;  //30-20=10 
		a=a-b; // 30-10=20
				    
		    
		    
		System.out.println("After Swapping   "+a+" "+b);    

		 
	}

}
