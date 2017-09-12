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


        Iterator<Integer> iterator = list.iterator();

        for (Integer i :
                list) {
            if (i.equals(1)) {
                System.out.println("1 found");
            } else {
                System.out.println("found" + i);
            }
        }

        System.out.println("Second feature");

        System.out.println("Third feature");

        System.out.println("Fourth feature");

        System.out.println("Fifth feature");
    }
}
