package CollectionFramework;
import java.util.*;

public class ArrayListOperations{
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 15);
        System.out.println("Add: " + list);

        System.out.println("First element: " + list.get(0));
        System.out.println("Last element: " + list.get(list.size() - 1));

        list.set(0, 5);
        System.out.println("Update: " + list);

        list.remove(1);
        list.remove(Integer.valueOf(30));
        System.out.println("Remove: " + list);

        System.out.println("Size: " + list.size());
        System.out.println("Is empty: " + list.isEmpty());

        list.add(20);
        System.out.println("Contains 20: " + list.contains(20));
        System.out.println("Index of 20: " + list.indexOf(20));
        System.out.println("Last index of 20: " + list.lastIndexOf(20));

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        for (int x : list) {
            System.out.print(x + " ");
        }
        System.out.println();

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        Collections.sort(list);
        System.out.println("Ascending: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending: " + list);

        Collections.reverse(list);
        System.out.println("Reversed: " + list);

        System.out.println("Minimum: " + Collections.min(list));
        System.out.println("Maximum: " + Collections.max(list));

        System.out.println("Frequency of 20: "
                + Collections.frequency(list, 20));

        Collections.sort(list);
        int index = Collections.binarySearch(list, 20);
        System.out.println("Binary search index: " + index);

        list.addAll(Arrays.asList(40, 50, 60));
        System.out.println("Add all: " + list);

        System.out.println("Contains all [20, 40]: "
                + list.containsAll(Arrays.asList(20, 40)));

        list.removeAll(Arrays.asList(40, 50));
        System.out.println("Remove all: " + list);

        list.retainAll(Arrays.asList(20, 60));
        System.out.println("Retain all: " + list);

        Integer[] arr = list.toArray(new Integer[0]);
        System.out.println("Array: " + Arrays.toString(arr));

        Integer[] nums = {1, 2, 3, 4};
        ArrayList<Integer> newList =
                new ArrayList<>(Arrays.asList(nums));
        System.out.println("From array: " + newList);

        ArrayList<Integer> copy = new ArrayList<>(list);
        System.out.println("Copy: " + copy);

        list.replaceAll(x -> x * 2);
        System.out.println("Replace all (double): " + list);

        newList.removeIf(x -> x % 2 == 0);
        System.out.println("Remove even numbers: " + newList);

        list.clear();
        System.out.println("After clear: " + list);
        System.out.println("Is empty: " + list.isEmpty());
    }
}
