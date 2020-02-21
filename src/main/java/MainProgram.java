import java.util.*;


public class MainProgram {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("--------------");

        EvenOrOdd even = new EvenOrOdd();
        System.out.println("Please Enter Number");
        int num1 = scanner.nextInt();

        even.EvenOrOdd(num1);

        Square square = new Square();
        System.out.println("--------------");
        System.out.println("Square now");
        square.square(2);

        System.out.println("--------------");
        square.square(4);

        System.out.println("--------------");

        Triangle triangle = new Triangle();
        System.out.println("Triangle now");
        triangle.Triangle(2);

        System.out.println("--------------");
        triangle.Triangle(4);

        System.out.println("--------------");

        Isosceles isosceles = new Isosceles();
        System.out.println("Pyramid now");
        isosceles.Isosscles(2);

        System.out.println("--------------");
        isosceles.Isosscles(4);

        System.out.println("--------------");


        System.out.println("Longest String");

        String[] names = {"the", "quick", "brown", "fox", "ate", "my", "chickens"};
        LongestString longest = new LongestString(names);

       String word = longest.longest();
        System.out.println(word);

        CombineTwoArrays combine = new CombineTwoArrays();


        System.out.println("--------------");
        System.out.println("Combination two strings");


        int [] array1 ={11, 22, 33};
        int [] array2 ={1, 2, 3};

        combine.combinearrays(array1, array2);

        String[] array = {"write", "Good", "Code", "Every", "day"};
        Frame frame = new Frame(array);
        frame.StartWords();



    }
}


