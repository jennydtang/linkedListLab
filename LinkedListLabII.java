package linkedLab2;

import java.util.Collections;
import java.util.LinkedList;

//5_13_2020
public class LinkedListLabII {
    // Declare variables in class scope
    public static void main(String[] args) {
        // void is a return type; is it going to return a value and if it does, what
        // type of value is it going to be? Void doesn't return a value where youcalled
        // the method.
        LinkedList<String> list1 = new LinkedList<>();

        // list #2
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("this");
        list2.add("is");
        list2.add("list2");

        // #1 Boolean check if it is empty
        System.out.println(list1.isEmpty());

        // Let's make a new method
        // Call it below
        // System.out.println("This is from the main method.");
        System.out.println(isItEmpty(list1));

        // #2
        addNode(list1, "Testing our second method");
        addNode(list1, "Another test of our method");
        System.out.println(list1);

        // #3
        makeEmpty(list1);
        System.out.println(list1);

        // #4
        printNodes(list1);
        System.out.println(list1);

        // #5 Remove from a certain index
        addNode(list1, "Remove this index");
        removeThisIndex(list1, 0);
        System.out.println(list1);

        // #6 Delete occurence of an item
        addNode(list1, "Remove this");
        addNode(list1, "Remove this");
        addNode(list1, "Leave this");
        removeThis(list1, "Remove this");
        System.out.println(list1);

        // #7
        addThisFirst(list1, "First Item");
        System.out.println(list1);

        // #8
        addAfterIndex(list1, 0, "hey");
        System.out.println(list1);

        // #9
        appendThisList(list1, list2);
        System.out.println(list1);

        // #10
        printReverse(list2);
        System.out.println(list2);

    }

    // the new method below. Method: blocks of codes that are executed over and over
    // again.
    // Public is a modifier that defines who can use this method
    // Static: another modifier; if you don't include it, you have to instantiate a
    // new object
    public static boolean isItEmpty(LinkedList<String> list) {
        // System.out.println("The isItEmpty just ran");
        if (list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Add method
    public static void addNode(LinkedList<String> list, String nodeData) {
        list.add(nodeData);
    }

    // Make Empty Method
    public static String makeEmpty(LinkedList<String> list) {
        if (list.size() == 0) {
            return "List was already empty";
        } else {
            list.clear();
            return "The List is now empty";
        }
    }

    // Print Nodes
    public static void printNodes(LinkedList<String> list) {
        for (String String : list) {
            System.out.println(String);
        }

    }

    // Remove index
    public static void removeThisIndex(LinkedList<String> list, Integer index) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
            if (i == index) {
                list.remove(i);
            }
        }
    }

    // Remove item
    public static void removeThis(LinkedList<String> list, String oldData) {
        do {
            list.remove(oldData);
        } while (list.contains(oldData));

    }

    // Add to Head
    public static void addThisFirst(LinkedList<String> list, String nodeData) {
        list.addFirst(nodeData);
    }

    // Add after an index
    public static void addAfterIndex(LinkedList<String> list, Integer index, String nodeData) {
        for (int i = 0; i < list.size(); i++) {
            if (i == index) {
                i++;
                list.add(i, nodeData);
            }
        }
    }

    // Adding to the List
    public static void appendThisList(LinkedList<String> list, LinkedList<String> otherList) {
        list.addAll(otherList);
    }

    // Print Reverse
    public static void printReverse(LinkedList<String> list) {
        for (String String : list) {
            Collections.reverse(list);
        }

    }

}