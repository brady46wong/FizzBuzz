public class Multiples {
    public static void main(String[] args) {
        int i = 1000;

        while (i > 0) {
            boolean divBy3 = i % 3 == 0;
            boolean divBy5 = i % 5 == 0;
            if (divBy3 | divBy5) {
                System.out.println(i);
            }
            i--;
        }
    }
}
