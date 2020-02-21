import java.util.ArrayList;

public class LongestString {

    public String[] arr;
    public ArrayList<String> storedName = new ArrayList<>();

    public LongestString()
    {

    }

    public LongestString(String[] array)
    {

        this.arr = array;
    }

    public String longest()
    {
        String longName = arr[0];
        int index = arr[0].length();
        System.out.println("-------------------------");

        for (int i = 0; i < arr.length; i++)
        {
            if (index <= arr[i].length())
            {
                index = arr[i].length();
                longName = arr[i];
                storedName.add(longName);

            }

        }
            String str = "";
            for (int x = 0; x < storedName.size(); x++) {
                if (longName.length() == storedName.get(x).length()) {
                    str = storedName.get(x);
                }
            }


        return str;
    }

}

