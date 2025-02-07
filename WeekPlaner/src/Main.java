import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[1][0] = "Monday";
        schedule[2][0] = "Tuesday";
        schedule[3][0] = "Wednesday";
        schedule[4][0] = "Thursday";
        schedule[5][0] = "Friday";
        schedule[6][0] = "Saturday";
        schedule[0][1] = "do homework";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][1] = "go to the gym";
        schedule[3][1] = "go on a date";
        schedule[4][1] = "hang out with friends";
        schedule[5][1] = "practice guitar";
        schedule[6][1] = "go for a walk";
        boolean isRunning = true;
        String input="";
        while(isRunning)
        {
            System.out.print("Please, input the day of the week: ");
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine().trim().toLowerCase();
            if(input.equals("exit")) {
                isRunning = false;
            }else if(input.startsWith("change") || input.startsWith("reschedule")){
                String day = input.split(" ")[1].trim().toLowerCase();
                boolean isDay = false;
                for (int i = 0; i < 7; i++) {
                    if (schedule[i][0].toLowerCase().equals(day)) {
                        System.out.print("Please, input new tasks for " + schedule[i][0] + ": ");
                        String newTask = sc.nextLine();
                        schedule[i][1] = newTask;
                        isDay = true;
                        break;
                    }
                }
                if (!isDay) {
                    System.out.println("Sorry, I don't understand you, please try again.");
                }
            } else{
                boolean isDay = false;
                for(int i=0;i<7;i++)
                {
                    if(schedule[i][0].toLowerCase().equals(input))
                    {
                        System.out.println("Your task for "+schedule[i][0]+": "+schedule[i][1]);
                        isDay = true;
                        break;
                    }
                }
                if(!isDay)
                {
                    System.out.println("Sorry, I don't understand you, please try again.");
                }
            }
        }
    }
}
