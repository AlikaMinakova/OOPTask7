package L7;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.delete(7);
        list.delete(5);
        list.add(9);
        list.add(10);
        for (Entity<Integer> integerEntity : list) {
            System.out.println(integerEntity);
        }
        System.out.println();
        list.add(11);
        list.delete(6);
        list.delete();
        for (Entity<Integer> integerEntity : list) {
            System.out.println(integerEntity);
        }
    }
}
