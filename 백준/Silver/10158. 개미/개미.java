import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int h = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int t = sc.nextInt();

        int currentX = (t + p) % (2 * w);
        int currentY = (t + q) % (2 * h);
        if(currentX > w) currentX = 2 * w - currentX;
        if(currentY > h) currentY = 2 * h - currentY;

        System.out.println(currentX + " " + currentY);


    }
}
