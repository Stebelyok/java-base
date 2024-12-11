// Задача:
// Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.


public class Maxmin {
    public static void main(String[] args) {
        int length = 100;
        int array[] = new int[length];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomIntNum();
        }
        
        System.out.println("Maximum = " + getMaxValue(array));
        System.out.println("Minimum = " + getMinValue(array));
        System.out.println("Average = " + getAvgValue(array));
    }

    public static int getRandomIntNum() {
        return (int)(Math.random() * 1000);
    }

    public static int getMaxValue(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }   
        }

        return max;
    }

    public static int getMinValue(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }   
        }

        return min;
    }
    
    public static int getAvgValue(int[] arr) {
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        } 

        return avg / arr.length;
    }
}