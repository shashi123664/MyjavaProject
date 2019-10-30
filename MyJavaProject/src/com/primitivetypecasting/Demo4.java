class Demo4
 {
	 public static void main(String [] args)
	 {
			 for(int n1=200,n2=300;n1<=n2;n1++)
		 {
			 if(isEven(n1))
				 System.out.println("even no is  " + n1);
		     if (isMultiple3(n1))
				 System.out.println("Multiple of 3 is  " +n1);
		     if (isPrime(n1))
			     System.out.println(" prime number is  " +n1);
			 
		
	 }
			
		 public static boolean isEven(int n1)
		 {
			 return(n1%2==0);
		 }
		 public static boolean isMultiple3(int n1)
	 {
			 return (n1%3==0);
	 }
	 public static boolean isPrime(int n1)
	 {
		 int count=0;
		 for(int i=1 ;i<=n1;i++)
		 {
			 if(n1%i==0)
				 count++;
		 }
		 return(count==2);
	 }
	 }
	     
