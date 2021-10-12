class Flow18_ff{
   public static void main(String[] args) {
      java.util.Scanner cin = new java.util.Scanner(System.in);
      int n;
	  int i, j;
	  System.out.print("n="); n = cin.nextInt();
	  for(i=n; i>=1; i=i-1) {
         System.out.print(i+": ");
		 for(j=10+n; j>=10; j=j-1) {
		    System.out.print("["+i+"]");
			System.out.print("("+j+")");
		 }
		 System.out.println("");
   	  }
	  System.out.println("OK");
   }
}   