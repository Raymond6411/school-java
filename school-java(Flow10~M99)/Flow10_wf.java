class Flow10_wf{
   public static void main(String[] args) {
      java.util.Scanner cin = new java.util.Scanner(System.in);
      int n;
	  int i, j;
	  System.out.print("n="); n = cin.nextInt();
	  i=1;
	  while(i<=n) {
         System.out.print(i+": ");
		 for(j=1; j<=n; j=j+1) {
		    System.out.print(j+" ");
		 }
		 System.out.println("");
		 i=i+1;
   	  }
	  System.out.println("OK");
   }
}   