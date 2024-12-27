package Collections.Set;

import java.util.LinkedHashSet;

public class LinkedHashSettest {
    public static void main(String[] args) {

        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();

        // 1. add() - Add elements to the LinkedHashSet
        linkedSet.add("Apple");
        linkedSet.add("Banana");
        linkedSet.add("Cherry");
        linkedSet.add("Apple"); // Duplicate, will not be added
        System.out.println("Initial LinkedHashSet: " + linkedSet);

        // 2. remove() - Remove a specific element
        linkedSet.remove("Banana");
        System.out.println("After Removing Banana: " + linkedSet);

        // 3. size() - Get the size of the LinkedHashSet
        int size = linkedSet.size();
        System.out.println("Size of the LinkedHashSet: " + size);

        // 4. contains() - Check if an element exists
        boolean hasApple = linkedSet.contains("Apple");
        System.out.println("Contains Apple? " + hasApple);

        // 5. isEmpty() - Check if the LinkedHashSet is empty
        boolean isEmpty = linkedSet.isEmpty();
        System.out.println("Is the LinkedHashSet Empty? " + isEmpty);

        // 6. clear() - Remove all elements
        linkedSet.clear();
        System.out.println("After Clearing the LinkedHashSet: " + linkedSet);

        // 7. addAll() - Add all elements from another collection
        LinkedHashSet<String> newSet = new LinkedHashSet<>();
        newSet.add("Grapes");
        newSet.add("Pineapple");
        linkedSet.addAll(newSet);
        System.out.println("After Adding All New Elements: " + linkedSet);

        // 8. iterator() - Iterate through the elements
        System.out.println("Iterating through LinkedHashSet:");
        for (String fruit : linkedSet) {
            System.out.println(fruit);
        }
    }
}
