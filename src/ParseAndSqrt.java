public class ParseAndSqrt {
    public static void main(String[] args) {
        String number = "64";
        long result = parseAndSqrt(number);
        System.out.println(result);
    }
    public static long parseAndSqrt(String number) {
        long parsedNumber = Long.parseLong(number);
        double sqrt = Math.sqrt(parsedNumber);
        long roundedSqrt = Math.round(sqrt);
        return roundedSqrt;
    }
}
