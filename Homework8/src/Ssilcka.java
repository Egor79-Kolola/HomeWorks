import java.util.Scanner;
import java.util.regex.Pattern;

public class Ssilcka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String link = "^http[s]?://\\w+\\.com[/]?$";
        System.out.println(Pattern.matches(link, str));
    }
}
