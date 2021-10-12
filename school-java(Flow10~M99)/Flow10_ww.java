class Flow10_ww{
   public static void main(String[] args) {
      java.util.Scanner cin = new java.util.Scanner(System.in);
      int n;
	  int i, j;
	  System.out.print("n="); n = cin.nextInt();
	  i=1;
	  while(i<=n) {
         System.out.print(i+": ");
		 j=1;
		 while(j<=n) {
		    System.out.print(j+" ");
			j=j+1;
		 }
		 System.out.println("");
		 i=i+1;
   	  }
	  System.out.println("OK");
   }
}   