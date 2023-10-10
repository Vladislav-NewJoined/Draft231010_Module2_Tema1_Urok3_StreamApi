import java.util.stream.IntStream;

public class Draft_Task2_1_3_0_Whole_Video {
    public static void main(String[] args) {
        int[] array = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int summary = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                summary += array[i];
            }
        }
        System.out.println(summary);

        System.out.println(IntStream.of(array).filter((a) -> a > 0).sum());
    }
}