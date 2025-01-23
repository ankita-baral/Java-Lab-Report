public class MaxInArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 35, 50, 25};
        int max = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        System.out.println("Maximum number is: " + max);
    }
}
