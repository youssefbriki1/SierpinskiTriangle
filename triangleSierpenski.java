import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.math.BigInteger;

/**
 * This class generates a Sierpinski triangle pattern and writes it to a file.
 */
public class triangleSierpenski {

    /**
     * The main method of the program.
     * It generates the Sierpinski triangle pattern and writes it to a file.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        String filePath = "semaine 0\\triangle.txt";
        String triangle = triangleSierpenski(BigInteger.valueOf(128));
        try (BufferedWriter writer = new BufferedWriter
        (new FileWriter(filePath))) {
            // Write the triangle string to the file
            writer.write(triangle);
            System.out.println("The content has been written to the file.");
        } catch (IOException e) {
            // Handle input/output exceptions (IOException)
            e.printStackTrace();
        }
    }

    /**
     * Calculates the factorial of a given number.
     *
     * @param n The number to calculate the factorial for.
     * @return The factorial of the given number.
     */
    public static BigInteger factorial(BigInteger n) {
        if (n.compareTo(BigInteger.ONE) <= 0) {
            return BigInteger.ONE;
        } else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }

    /**
     * Calculates the combination of two given numbers.
     *
     * @param n The total number of items.
     * @param k The number of items to choose.
     * @return The combination of the two given numbers.
     */
    public static BigInteger combination(BigInteger n, BigInteger k) {
        if (n.equals(k) || k.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {
            if (k.compareTo(BigInteger.ZERO) > 0 && n.compareTo(k) >= 0) {
                return factorial(n)
                        .divide(factorial(k)
                                .multiply(factorial(n.subtract(k))));
            } else {
                return BigInteger.ZERO;
            }
        }
    }

    /**
     * Generates a Sierpinski triangle pattern of a given depth.
     *
     * @param depth The depth of the Sierpinski triangle.
     * @return The Sierpinski triangle pattern as a string.
     */
    public static String triangleSierpenski(BigInteger depth) {
        String triangle = "";
        for (BigInteger n = BigInteger.ZERO; n.compareTo(depth) < 0; n = n.add(BigInteger.ONE)) {
            for (BigInteger k = BigInteger.ZERO; k.compareTo(n) <= 0; k = k.add(BigInteger.ONE)) {
                if (combination(n, k).mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
                    triangle += " ";
                } else {
                    triangle += "1";
                }

            }
            triangle += "\n";
        }
        return triangle;
    }
}
