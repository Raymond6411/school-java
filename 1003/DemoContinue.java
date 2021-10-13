class DemoContinue{
   public static void main(String[] args){
      java.util.Scanner cin= new java.util.Scanner(System.in);
      int n, skip;
      int i, j;
      System.out.print("n="); n=cin.nextInt();
      System.out.print("skip="); skip=cin.nextInt();
      count=0;
      for(i=1; i<=n; i++){
         if(i==skip) continue;
         for(j=1; j<=n; j=j+1) {
            System.out.print("("+i+","+j+")");
         }
         System.out.println();
      }
   }
}