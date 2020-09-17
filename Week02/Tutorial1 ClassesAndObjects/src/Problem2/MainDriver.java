package Problem2;

import java.util.Scanner;

/*************************************************************************
 *                           Luke Docwra 17019043                         *
 *                             2020 HND Tutorial                          *
 *                               Problem2                                 *
 *************************************************************************/

public class MainDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 1 - Rectangle Class, 2 - For Circle Class or 3 - To Exit");
        int choice = scanner.nextInt();
        boolean exit = false;

        do{
            switch (choice) {
                case 1:
                    Rectangle r = new Rectangle();
                    r.displayInformation();
                    System.out.println("Please enter 1 - Rectangle Class, 2 - For Circle Class or 3 - To Exit");
                    choice = scanner.nextInt();
                    break;
                case 2:
                    Circle c = new Circle();
                    c.displayInformation();
                    System.out.println("Please enter 1 - Rectangle Class, 2 - For Circle Class or 3 - To Exit");
                    choice = scanner.nextInt();
                    break;

                case 3:
                    System.out.println("Exiting now");
                    exit = true;
                    break;
                default:
                    System.out.println("Please enter 1,2 or 3");
            }
        }while(exit = false);
    }
}


