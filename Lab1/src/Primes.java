public class Primes { //созданный класс для определения простых чисел
    public static void main(String[] args) { //метод main с целью вывода простых чисел
        for (int i = 2; i < 100; i++) {
            if (isPrime(i))
                System.out.println(i + " - простое число");
        }
    }
    public static boolean isPrime(int n) { //вспомогательная функция, определяющая, простое ли число
        boolean isPrime = true;
        for (int i = 2; i <= n/i; i++) {
            if ((n % i) == 0) isPrime = false;
        }
        return isPrime;
    }
}
