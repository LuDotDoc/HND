import java.util.Scanner;

public class Tutorial1 {
    public static void main(String[] args)
    {
        int value=0;
        for (int x=0;x<40;x++)
        {
            value = (int)(Math.random()*10) + 1;
            System.out.print(value+" ");
        }

        Scanner kboard = new Scanner(System.in);
        String choice ="";
        System.out.print("Do you wish to continue y/n? ");
        choice = kboard.next();
        while (choice.equalsIgnoreCase("y"))
        {
            System.out.println("Hello");
            System.out.print("Do you wish to continue y/n? ");
            choice = kboard.next();
        }
        System.out.println("Bye");

    }

}
