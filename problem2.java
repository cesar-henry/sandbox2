// Name: Cesar de Paula

public class problem2
{
    public static void main(String[] args)
    {
        // These variables each represent the powers from 1 to 4
        int a = 1, b = 2, c = 3, d = 4;
        System.out.printf("%5d %5d %5d %5d %n", a, b, c, d);
        System.out.printf("%4s %5s %5s %5s %n", "x", "x", "x", "x");
        System.out.println();

        // This for-loop will iterate each row of powers from 1 to 10
        for (int i = 1; i <= 10; i++)
        {
            int w = (int)Math.pow(i, a);
            int x = (int)Math.pow(i, b);
            int y = (int)Math.pow(i, c);
            int z = (int)Math.pow(i, d);

            System.out.printf("%5d %5d %5d %5d %n", w, x, y, z);
        }
    }
}
