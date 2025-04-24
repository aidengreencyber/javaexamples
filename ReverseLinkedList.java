import java.util.LinkedList;
import java.util.Collections;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original List: " + list);

        Collections.reverse(list);

        System.out.println("Reversed List: " + list);
    }
}