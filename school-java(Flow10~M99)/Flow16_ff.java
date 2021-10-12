class Flow16_ff{
   public static void main(String[] args) {
      java.util.Scanner cin = new java.util.Scanner(System.in);
      int n;
	  int i, j;
	  System.out.print("n="); n = cin.nextInt();
	  for(i=1; i<=n; i=i+1) {
         System.out.print(i+": ");
		 for(j=10+i; j<=90+i; j=j+10) {
		    System.out.print(j+" ");
		 }
		 System.out.println("");
   	  }
	  System.out.println("OK");
   }
}   