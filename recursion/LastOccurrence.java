// Find the last occurrence of an element in an array.

public class LastOccurrence {
    public static int lastOccurrence(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        int isFound = lastOccurrence(arr, key, i + 1);

        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        // int[] arr = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int[] arr = {5, 5, 5, 5};
        System.out.println(lastOccurrence(arr, 5, 0));
    }
}
