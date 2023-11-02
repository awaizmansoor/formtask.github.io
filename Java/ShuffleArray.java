import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int n = numbers.length;
        Random random = new Random();

        
        for (int i = 0; i < n - 1; i++) {
            int j = i + random.nextInt(n - i);
        
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

        
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
