# Sierpinski Triangle Generator in Java

This Java program generates a Sierpinski triangle pattern and writes it to a file. The main components of the program include importing necessary classes, defining the main class `triangleSierpenski`, and implementing its methods. The generation of the Sierpinski Triangle is based on the principle that it's essentially the Pascal triangle taken modulo 2, as discussed in this paper: [Pascal's Triangle and Modulo Prime Powers](https://arxiv.org/pdf/1708.07429.pdf#:~:text=Pascal's%20triangle%20is%20a%20well,is%20considered%20modulo%20prime%20powers). In this representation, even numbers are considered "spaces" and odd numbers "1".

## Class Definition: `triangleSierpenski`

### Main Method

- **Purpose**: Generates a Sierpinski triangle pattern and writes it to a file named `triangle.txt` in the `semaine 0` directory.
- **Parameters**: `String[] args` - Command line arguments (not used in this code).
- **Process**:
  - It generates the triangle pattern by calling `triangleSierpenski(BigInteger.valueOf(128))`, which calculates the pattern up to a depth of 128 lines.
  - Uses `BufferedWriter` and `FileWriter` to write the generated pattern to the specified file path.

### Factorial Method

- **Purpose**: Calculates the factorial of a given number using recursion.
- **Parameters**: `BigInteger n` - The number to calculate the factorial for.
- **Return Value**: `BigInteger` - The factorial of the given number.

### Combination Method

- **Purpose**: Calculates the combination (n choose k) of two given numbers, important for generating the Sierpinski triangle pattern.
- **Parameters**:
  - `BigInteger n` - The total number of items.
  - `BigInteger k` - The number of items to choose.
- **Return Value**: `BigInteger` - The combination of the two given numbers.

### triangleSierpenski Method

- **Purpose**: Generates a Sierpinski triangle pattern of a given depth.
- **Parameters**: `BigInteger depth` - The depth of the Sierpinski triangle.
- **Return Value**: `String` - The Sierpinski triangle pattern as a string.
- **Process**:
  - Iterates through each level of depth, generating a line of the triangle pattern based on the combination of `n` and `k` and whether it's even or odd (mod 2).
  - Appends "1" for odd combinations and a space for even, building up the pattern line by line.
