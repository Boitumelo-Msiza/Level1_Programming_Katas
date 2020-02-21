
import java.util.ArrayList;

public class CombineTwoArrays {

        public void combinearrays(int[] arra1,int[] array2)
        {
            ArrayList<Integer> combineArray = new ArrayList();
            int index = 0;
            for (int i = 0;i < arra1.length;i++)
            {
                combineArray.add(arra1[i]);
                for (int x = i; x <=i;x++)
                {
                    combineArray.add(array2[x]);
                }
            }
            System.out.println(combineArray);
        }
    }


