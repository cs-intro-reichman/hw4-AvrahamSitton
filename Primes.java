public class Primes {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        primeFilter(x);

    }

    public static void primeFilter(int x) {
        int cunt = 0;
        boolean[] indexOfPrime = new boolean[x + 1];
        for (int i = 2; i <= x; i++)
            indexOfPrime[i] = true;

        for (int i = 2; i * i <= x; i++) {
            if (indexOfPrime[i]) {
                for (int j = i * i; j <= x; j += i) {
                    indexOfPrime[j] = false;
                }
            }

        }

        for (int i = 2; i <= x; i++) {
            if (indexOfPrime[i] == true) {
                System.out.println(i);
                cunt++;
            }
        }
        System.out
                .println(
                        "There are " + cunt + " prime numbers between 2 and " + x + ". (" + (int) (cunt*1.0/x * 100.0) + "% are primes)");
    }

}
