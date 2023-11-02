public class ArrayUtils{


    public static <T> void exchangeElements(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            // Check if the indices are valid
            System.out.println("Invalid indices.");
            return;
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"apple", "banana", "cherry", "date"};

        // Exchange elements in the integer array
        exchangeElements(intArray, 1, 3);
        System.out.println("Integer Array after exchange:");
        for (Integer num : intArray) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Exchange elements in the string array
        exchangeElements(strArray, 0, 2);
        System.out.println("String Array after exchange:");
        for (String str : strArray) {
            System.out.print(str + " ");
        }
    }
}
