package homework;

import java.util.Arrays;

public class FibonacciNumbers {
    public void testFibonacci () {
        int [] arrayFib = new int[20];
        arrayFib [0] = 0;
        arrayFib [1] =1;
        for (int i=2; i<arrayFib.length; i++) {
            arrayFib [i] = arrayFib[i-2] + arrayFib [i-1];
        }
        System.out.println(Arrays.toString(arrayFib));
    }

}
