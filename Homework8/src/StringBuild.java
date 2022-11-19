import static java.lang.String.valueOf;

public class StringBuild {
    public static void main(String[] args) {
        int a = 3, b = 56;
        StringBuilder str = new StringBuilder();
        System.out.println(str.append(a).append("+").append(b).append("=").append(a+b));
        str.delete(0, str.length());
        System.out.println(str.append(a).append("-").append(b).append("=").append(a-b));
        str.delete(0, str.length());
        System.out.println(str.append(a).append("*").append(b).append("=").append(a*b));
        str.replace(4 , 5, " равно ");
        System.out.println(str);

    }
}
