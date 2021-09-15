package homework;

public class MaxAndMin {
    public void searchMinAndMax() {
        int[] array = {6, -63, 55, -100, 0, 17, 201};
        int min = array[0];
        int max = array[0];
        int sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < min) {
                min = array[i + 1];
            }
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > max) {
                max = array[i + 1];
            }
        }
        sum += min + max;
        System.out.println(sum);


    }
}
