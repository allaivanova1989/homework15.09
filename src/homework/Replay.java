package homework;

import java.util.Arrays;

public class Replay {
    public void searchReplay() {
        int[] arrayInt = new int[30];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = ((int) (Math.random() * 20));
        }
        int maxFrequent = 0;
        int num = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            int frequent = 0;
            for (int j = 0; j < arrayInt.length; j++) {
                if (arrayInt[i] == arrayInt[j]) {
                    frequent++;
                }
                if (frequent > maxFrequent) {
                    maxFrequent = frequent;
                    num = arrayInt[i];
                }
            }
        }
        System.out.println(Arrays.toString(arrayInt));
        System.out.println(num);

    }

}
