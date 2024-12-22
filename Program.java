public class Program{
    public static void main(String[] args) {
   
        int sum = 0;
        int count = 0;
        while (count <= 100) {
            sum += 2 * count;
            count++;
        }
        System.out.println("Sum of first 100 even numbers: " + sum);

    }

}