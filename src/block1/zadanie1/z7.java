package block1.zadanie1;

public class z7 {
    public static void main(String[] args) {
        String s1 = "stroka lala";
        System.out.println(z7(s1));
    }
    public static String z7 (String s1) {
        String s2 = "";
        for (int i = s1.length()-1; i >= 0; i--)
            s2 += s1.charAt(i);
        return s2;
    }

}
