public class Rough
 {
     public static void main(String[] args) 
     {
        
        char m=70;
        char i,j;
        for(i=65;i<=m;i++)
        {
            for(j=m;j>=i;j--)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
     }
    
}
