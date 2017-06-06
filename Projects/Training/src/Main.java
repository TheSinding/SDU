import CircularBufferThread.CircularBufferMain;
import comparators.pingoTheComparator.PingoMain;
import libs.Program;
import libs.Welcome;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by thesinding on 6/5/17.
 */

public class Main {
    public static void main(String[] args) {
        boolean handoff = false;
        ArrayList<Program> programs = new ArrayList<>();
        programs.add(null);
        programs.add(new Program(new CircularBufferMain(), "Thread testing 1 - Random numbers"));
        programs.add(new Program(new PingoMain(), "Comparator Testing - Something with names.. Arh.. I dont know"));
        Welcome.printWelcome();

        while (!handoff){
            Welcome.printPrograms(programs);
            System.out.println("\nEnter Number");
            System.out.print("> ");
            Scanner input = new Scanner(System.in);
            try {
                int choice = input.nextInt();
                switch (choice){
                    case 0:
                        System.out.println("\nThank You");
                        System.out.println("Bye bye, please come again.");
                        System.exit(0);
                        break;
                    default:
                        try {
                            System.out.println("Wait while we are starting " + programs.get(choice).getName() + "!");
                            Thread.sleep((long) 2000);
                            System.out.println("\nThank You");
                            System.out.println("Bye bye, please come again. \n\n#################################\n");
                            Thread.sleep((long) 1000);
                            handoff = true;
                            programs.get(choice).getProgram().startProgram();
                        } catch (IndexOutOfBoundsException e){
                            System.out.println("Fucking idiot... The option " + choice + " does not fucking exist, you fucking moron!");
                            System.out.println("Learn how to fucking read!");
                        }
                        break;
                }
            }catch (NumberFormatException e){
                System.out.printf("Idiot!!");
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
