public class Document2
 {
        char m=70;
         char i ,j;
         
          public void Pattern7()
          {
              System.out.println("\n Pattern7");
              for(i=65;j<=m;i++)
              {
                  for(j=m;j>=i;j--)
                  {
                      System.out.print(j+ " ");
                  }
                  System.out.println();
              }
          }
          public static void main(String[] args)
           {
            Document2 d = new Document2();
            d.Pattern7();
           }
              
              
    
}
