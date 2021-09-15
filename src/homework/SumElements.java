package homework;

public class SumElements {
    public void searchSumEl() {
        int[] arrayEl = {17, 65, -52, -64, 126, -205, 68, 99};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arrayEl.length; i++) {
            if (i % 2 == 0) {
                sum1 += arrayEl[i];
            }
            if (i % 2 != 0) {
                sum2 += arrayEl[i];
            }
        }
        System.out.println("Разница между суммой элементов, стоящих на четных и нечетных местах составляет: " + (sum1 - sum2));

    }
}
