class Flow13_ff{
   public static void main(String[] args) {
      java.util.Scanner cin = new java.util.Scanner(System.in);
      int n;
	  int i, j;
	  System.out.print("n="); n = cin.nextInt();
	  for(i=1; i<=n; i=i+1) {
         System.out.print(i+": ");
		 System.out.print("[ ");
		 for(j=1; j<=n; j=j+1) {
		    System.out.print(j+" ");
		 }
		 System.out.print("] ");
		 System.out.print("( ");
		 for(j=1; j<=n; j=j+1){
		    System.out.print(i+" ");
		 }
		 System.out.println(") ");
   	  }
	  System.out.println("OK");
   }
}   