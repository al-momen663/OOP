package tutorial;
import java.util.ArrayList;
import java.util.Collections;
public class SortingArray {
        public static void main(String[] args) {
            // Sample ArrayList
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(66);
            numbers.add(56);
            numbers.add(39);
            numbers.add(78);
            numbers.add(90);
            numbers.add(100);
            numbers.add(4);
            numbers.add(6);

            System.out.println("Unsorted ArrayList: " + numbers);

            // Sort the ArrayList in ascending order (default)
            Collections.sort(numbers);

            System.out.println("Sorted ArrayList: " + numbers);
        }
}
