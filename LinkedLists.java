import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

public class LinkedLists {
    
    public static LinkedList<Character> convertToLinkedList(String input) {
        LinkedList<Character> charList = new LinkedList<>();
        for (char c : input.toCharArray()) {
            charList.addLast(c);
        }
        return charList;
    }

    public static LinkedList<Character> reverseLinkedList(LinkedList<Character> originalList) {
        LinkedList<Character> reversedList = new LinkedList<>();
        for (Character c : originalList) {
            reversedList.addFirst(c);
        }
        return reversedList;
    }

    public static void printReversedList(LinkedList<Character> reversedList) {
        Iterator<Character> iterator = reversedList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or sentence: ");
        String input = scanner.nextLine();
        
        LinkedList<Character> charList = convertToLinkedList(input);
        LinkedList<Character> reversedList = reverseLinkedList(charList);
        System.out.print("Your reverse word or sentence: ");
        printReversedList(reversedList);
        
        scanner.close();
    }
}
