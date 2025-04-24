import java.util.LinkedList;
import java.util.Iterator;


public class SpecificValue {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(20);

        System.out.println("Original List: " + list);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(20)) {
                iterator.remove();

            }
        }

        System.out.println("New List: " + list);



        
}
}