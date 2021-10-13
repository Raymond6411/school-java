class Demobreak{
   public static void main(String[] args){
      java.util.Scanner cin= new java.util.Scanner(System.in);
      int n, num;
      int i, j, count;
      System.out.print("n="); n=cin.nextInt();
      System.out.print("num="); num=cin.nextInt();
      count=0;
Outerloop:
      for(i=1; i<=n; i++){
         for(j=1; j<=n; j=j+1) {
            System.out.print("("+i+","+j+")");
            count=count+1;
            if(count > num) break Outerloop;
            if(j>=i+1) break;
         }
         System.out.println();
      }
   }
}