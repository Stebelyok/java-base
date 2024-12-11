// Задача:
// Отсортировать массив

public class Sorting {
    public static void main(String args[]) {
        int length = 10;
        int array[] = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomIntNum();            
        }

        simpleSort(array);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\n");
        }
    }

    public static int getRandomIntNum() {
        return (int)(Math.random() * 1000);
    }

    public static void simpleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}