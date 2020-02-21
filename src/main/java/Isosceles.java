public class Isosceles {

    public void  Isosscles(int num)
    {
        for (int i = 1 ;i <= num;i++)
        {
            //for(int j = num -1;j>=i;j--)
            for(int j=i ; j < num; j++)
            {
                System.out.print(" ");
            }
            for (int x =1 ;x <(i*2);x++)
            {
                System.out.print("# ");
            }
            System.out.println("\n");
        }
    }
}
