package mang;
public class lapmang{
    public static void main(String[] args) {
        int[] input = {23, 34, 65, 4};
        int[] output = stutter(input);
        System.out.print("Mang lap lai : ");
        for (int num : output) {
            System.out.print(num + " ");
        }
    }
    public static int[] stutter(int[] numbers) {
        int[] result = new int[2 * numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[2 * i] = numbers[i];
            result[2 * i + 1] = numbers[i];
        }
        
        return result;
    }
}
