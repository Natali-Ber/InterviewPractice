public class primeNumber {

        public static void main(String[] args) {
            get_prime_numbers(13);
        }

        public static boolean is_prime(int number){

            if (number == 1) return false;

            for (int i=2; i<number; i++){
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static void get_prime_numbers(int max){
            int[] primes;
            for (int i = 1; i<=max; i++) {
                if (is_prime(i))
                {
                    System.out.println(i);
                }
            }
        }
    }