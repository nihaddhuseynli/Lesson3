import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        boolean running = true;
        Random rand = new Random();
        int number=rand.nextInt(101);
        String name;
        System.out.print("Please enter your name:");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Let the game begin!");
        int[] numbers = {0};
        int counter = 0;

        while (running) {
            Scanner scanner = new Scanner(System.in);
            int x=0;
            String y=scanner.nextLine();
            if (y.matches("-?\\d+")) {
                x = Integer.parseInt(y);
                numbers=Arrays.copyOf(numbers,counter+1);
                numbers[counter++] = x;
                if(x==number){
                    System.out.println("Congratulations, " + name + "!");
                    running=false;
                }else{
                    if(x>number){
                        System.out.println("Your number is too big. Please, try again.");
                    }
                    else{
                        System.out.println("Your number is too small. Please, try again.");
                    }
                }
            } else {
                System.out.println("Please enter a number.");
            }
        }
        System.out.println("Your numbers: ");
        Arrays.sort(numbers);
        for(int i=counter-1; i>=0; i--){
            System.out.print(numbers[i]+" ");
        }

    }
}
