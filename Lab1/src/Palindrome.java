import java.util.Scanner; //импорт сканера
public class Palindrome { //созданный класс для определения палиндромов
    public static void main(String[] args) { //метод main с целью вывода палиндромов
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] words = line.split(" ");
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            if (isPalindrome(s)) {
                System.out.println(s + " является палиндромом");
            }
            else {
                System.out.println(s + " не является палиндромом");
            }
        }
    }
    public static String reverseString(String s) { //функция записывает слово наоборот
        String reversedString = "";
        for (int x = s.length() - 1; x >= 0; x--) {
            reversedString = reversedString + s.charAt(x);
        }
        return reversedString;
    }
    public static boolean isPalindrome(String s) { //функция определяет палиндром
        if (s.equals(reverseString(s))) {
            return s.equals(reverseString(s));
        }
        else {
            return false;
        }
    }
}
