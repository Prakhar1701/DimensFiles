import java.util.Scanner;

public class dimonGentator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        float multiplyBy = scn.nextFloat();
        System.out.println("<resources>");

        for (int i = 1; i <= 1000; i++) {
            String s = "<dimen name=\"dim_" + i + "\">" + i * multiplyBy + "dp</dimen>";
            System.out.println(s);
        }

        for (int i = 1; i <= 1000; i++) {
            String f = "<dimen name=\"font_size_" + i + "\">" + i * multiplyBy + "sp</dimen>";
            System.out.println(f);
        }
        
        System.out.println("</resources>");
    }
}