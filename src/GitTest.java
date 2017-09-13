import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GitTest {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        for (Integer i : list) {
            if (i.equals(1)) {
                int x = i * 8 + 5;
                System.out.println(x + "found");
            } else {
                int a = i + 2; 
                System.out.println("found" + a);
            }
        }

        System.out.println("Second feature");

        System.out.println("Third feature");

        System.out.println("Fourth feature");

        System.out.println("Fifth feature");

        System.out.println("Sixth feature");
        
        System.out.println("Seventh feature");

        System.out.println("Nineth feature");

        System.out.println("Pisze cos z developa");

        System.out.println("Tenth feature");
        
        System.out.println("Twelth feature");

    }
}
