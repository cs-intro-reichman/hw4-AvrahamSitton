/**
 * A library of operations on arrays of characters (char values).
 * The library also features a string comparison method.
 */
public class ArrCharOps {
    public static void main(String[] args) {

    }

    /**
     * Prints the given array of characters, and moves the cursor to the next line.
     */
    public static void println(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    // Returns the char value at the specified index. Assume that the array is
    // non-empty.

    public static char charAt(char[] arr, int index) {
        if (arr.length == 0 || index > arr.length - 1 || index < 0) {
            return '-' + '1';
        }
        return arr[index];
    }

    // If the two arrays have the same value in every index,
    // returns true; Otherwise returns false.

    public static boolean equals(char[] arr1, char[] arr2) {
        boolean equals = false;
        int i = arr1.length - 1;
        if (arr1.length != arr2.length || arr1.length == 0 || arr2.length == 0) {
        }
        while (!equals && charAt(arr1, i) == charAt(arr2, i)) {
            i--;
            if (i == 0) {
                equals = !equals;
            }

        }
        return equals;
    }

    // Returns the index within the given array of the first occurrence of the given
    // character.
    // If no such character is found, returns -1.

    public static int indexOf(char[] arr, char ch) {
        int result = -1;
        if (arr.length == 0) {
            return result;
        }
        for (int i = 0; i < arr.length; i++) {
            if (charAt(arr, i) == ch) {
                return i;

            }

        }
        return result;
    }

    // Same as indexOf(char[], char), but starts the search in the given index.

    public static int indexOf(char[] arr, char ch, int fromIndex) {
        if (fromIndex < 0 || fromIndex > arr.length - 1 || arr.length == 0) {
            return -1;

        }
        for (int i = fromIndex; i < arr.length; i++) {
            if (ch == charAt(arr, i)) {
                return i;
            }

        }
        return -1;

    }

    // Returns the index within the given arr of the last occurrence of the given
    // character.
    // If no such character is found, returns -1.

    public static int lastIndexOf(char[] arr, char ch) {
        if (arr.length == 0) {
            return -1;

        }
        for (int i = (arr.length - 1); i >= 0; i--) {
            if (arr[i] == ch) {
                return i;

            }
        }
        return -1;
    }

    // Returns an array which is the concatanation of the two given arrays.

    public static char[] concat(char[] arr1, char[] arr2) {
        if (arr1.length == 0 && arr2.length == 0) {
            return null;
        }
        int a = arr1.length,
                b = arr2.length;

        char[] arr12 = new char[a + b];

        for (int i = 0; i < a; i++) {
            arr12[i] = arr1[i];

        }
        for (int j = 0; j < b; j++) {

            arr12[a + j] = arr2[j];

        }

        return arr12;
    }

    /*
     * Returns a new array that can be described as a sub-array of this array.
     * The sub-array begins at the specified beginIndex and extends to the character
     * at index endIndex - 1.
     * For example, if arr contains the characters "hamburger", then subArray(4, 8)
     * returns an array of
     * characters containing the characters "urge".
     */
    public static char[] subArray(char[] arr, int beginIndex, int endIndex) {
        if (arr.length == 0 || beginIndex < 0 || endIndex > arr.length || beginIndex > endIndex) {
            return new char[0];
        }

        int size = endIndex - beginIndex;

        char[] subArray = new char[size];
        for (int i = 0; i < size; i++) {
            subArray[i] = arr[beginIndex + i];

        }
        // println(subArray);

        return subArray;
    }

    /*
     * Returns a single integer that represents the given array. This integer is
     * sometimes
     * referred to as the array's "hash code". Later in the course we'll explain
     * what these
     * hash codes are used for. For now, simply implement the specification given
     * below.
     * The hash code is computed as: arr[0]*7^(n-1) + arr[1]*7^(n-2) + ... +
     * arr[n-2]*7 + arr[n-1]
     * where arr[i] is the i'th character of the array, and n is the array's length.
     * The hash value of an empty array is zero.
     */
    public static long hashCode(char[] arr) {
        long hashArray = 0;
        int n = arr.length;
        if (arr.length == 0) {
            return 0;

        } else {
            for (int i = 0; i < arr.length; i++) {

                hashArray += (arr[i] * (long) Math.pow(7, n - 1 - i));
            }
            return hashArray;
        }
    }

    /*
     * 
     * Compares the two strings lexicographically.
     * Assume that both strings are not empty.
     * 
     * Characters are compared one by one from left to right, using their numeric
     * Unicode values,
     * as follows:
     * 1. If two characters at the same position in both strings are different,
     * the string with the smaller character is considered lexicographically
     * smaller.
     * 2. If all characters in the shorter string match the corresponding characters
     * in the longer string, the shorter string is considered lexicographically
     * smaller.
     * 3. If both strings have the same characters and the same length, they are
     * considered equal.
     * 
     * Examples:
     * - "apple" is less than "banana" because 'a' comes before 'b'.
     * - "abc" is less than "abcd" because it is shorter.
     * - "hello" is equal to "hello".
     * - "date" is greater than "dark" because 't' comes after 'k'.
     *
     * @param str1 the first string to compare
     * 
     * @param str2 the second string to compare
     * 
     * @return -1 if str1 is lexicographically less than str2,
     * zero if they are equal, and 1 if str1 is
     * lexicographically greater than str2.
     * return -2 if there is an error with the input.
     * 
     */
    public static int compareTo(String str1, String str2) {
        int cunt = 0;
        if (str2.length() == 0) {
            return -2;
        }
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == str2.charAt(i)) {
                    cunt++;
                }

            }
            if (cunt == str1.length()) {
                return 0;
            }
            if (cunt < str1.length()) {

            }
            return 1;
        }

        if (str1.length() < str2.length()) {
        }
        return -1;
    }

}