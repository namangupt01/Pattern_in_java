
    * 
   * * 
  * * * 
 * * * * 
* * * * * 







public class Pascal {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=5;i++)
        {
            for(int spaces =5-i;spaces>=1;spaces--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}


