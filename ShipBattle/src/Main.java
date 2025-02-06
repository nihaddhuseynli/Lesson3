import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        char[][] grid = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                grid[i][j] = '-';
            }
        }
        System.out.println("All set. Get ready to rumble!");
        boolean isRunning = true;
        Random random = new Random();
        int targetX = random.nextInt(5) + 1;
        Random random1 = new Random();
        int targetY = random1.nextInt(5) + 1;
        while (isRunning) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter coordinates: ");
            String input = scanner.nextLine();
            String[] coordinates = input.split(" ");
            if (coordinates.length == 2) {
                try {
                    int x = Integer.parseInt(coordinates[0]);
                    int y = Integer.parseInt(coordinates[1]);
                    if (x >= 1 && x <= 5 && y >= 1 && y <= 5) {
                        if (x == targetX && y == targetY) {
                            System.out.println("You have won!");
                            isRunning = false;
                            grid[x - 1][y - 1] = 'x';
                        } else {
                            grid[x - 1][y - 1] = '*';
                        }
                        for (int i = 0; i < 5; i++) {
                            System.out.print(i + " | ");
                        }
                        System.out.println("5 |");
                        for (int i = 0; i < 5; i++) {
                            System.out.print(i + 1 + " | ");
                            for (int j = 0; j < 5; j++) {
                                System.out.print(grid[i][j]);
                                if (j < 4) {
                                    System.out.print(" | ");
                                }
                            }
                            System.out.println(" |");
                        }
                    } else {
                        System.out.println("Please enter valid numbers between 1 and 5.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter valid numbers.");
                }
            } else {
                System.out.println("Please enter two numbers separated by a space.");
            }
        }

    }
}