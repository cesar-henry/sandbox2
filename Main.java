// Name: Cesar de Paula

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);

        System.out.println("How many days are there in this month? ");
        int days = kbd.nextInt();
        kbd.nextLine();

        System.out.println("On what day of the week does the month start?");
        System.out.println("Please write the full name of the day.");
        String start = kbd.nextLine();

        System.out.printf("%3s %2s %2s %2s %2s %2s %2s %n", "Su", "M", "T", "W", "Th", "F", "Sa");

        // Each digit from 0-6 represents how many empty spaces should be iterated before the first day to show which day of the week the month begins on.
        int startIndex = -1;
        if (start.equalsIgnoreCase("sunday"))
            startIndex = 0;
        else if (start.equalsIgnoreCase("monday"))
            startIndex = 1;
        else if (start.equalsIgnoreCase("tuesday"))
            startIndex = 2;
        else if (start.equalsIgnoreCase("wednesday"))
            startIndex = 3;
        else if (start.equalsIgnoreCase("thursday"))
            startIndex = 4;
        else if (start.equalsIgnoreCase("friday"))
            startIndex = 5;
        else if (start.equalsIgnoreCase("saturday"))
            startIndex = 6;
        for (int k = 0; k < startIndex; k++)
            System.out.printf("%3s", " ");

        // This while-loop ensures that each iteration of each week will loop until the month is complete
        int currentDayOfWeek = 1;
        while (currentDayOfWeek <= days)
        {
            for (int i = startIndex; i <= 6; i++)    // the loop control variable is set equal to the starIndex so that the first few days of the month can be iterated from the starting day
            {
                System.out.printf("%3d", currentDayOfWeek);
                currentDayOfWeek++;
                if (currentDayOfWeek > days) // This if statement breaks out of the for-loop once the number of days inputted has been reached
                    break;
                if (i == 6) // This if statement creates a new line each time the program reaches saturday on the calendar
                {
                    System.out.print("\n");
                }
            }
            startIndex = 0;  // This resets the loop control variable so that a full week can be iterated after the first week of the month
        }
    }
}