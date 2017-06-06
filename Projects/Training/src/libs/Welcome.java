package libs;

import com.sun.org.apache.xpath.internal.SourceTree;
import interfaces.StartProgramInterface;

import java.util.ArrayList;

/**
 * Created by thesinding on 6/6/17.
 */
public class Welcome {
    private static final String FORMAT = " %-10s | %-25s | %-100s\n";
    private static final String WELCOMEFORMAT = "# %-40s #\n";

    public static void printWelcome(){
        System.out.printf(WELCOMEFORMAT, "----------------------------------------");
        System.out.printf(WELCOMEFORMAT, "Hello, this is the SDU project selector");
        System.out.printf(WELCOMEFORMAT, "All written by Simon Sinding");
        System.out.printf(WELCOMEFORMAT, "Copyright only Simon 2017, so fuck you!");
        System.out.printf(WELCOMEFORMAT, "----------------------------------------");
        System.out.printf(WELCOMEFORMAT, "Want help?");
        System.out.printf(WELCOMEFORMAT, "How about no?!");
        System.out.printf(WELCOMEFORMAT, "......");
        System.out.printf(WELCOMEFORMAT, "Eh.. Okay!");
        System.out.printf(WELCOMEFORMAT, "Type the number of the program you want");
        System.out.printf(WELCOMEFORMAT, "to run!");
        System.out.printf(WELCOMEFORMAT, "----------------------------------------");
    }

    public static void printPrograms(ArrayList<Program> programs) {
        System.out.println();
        System.out.printf(FORMAT, "Option", "Name",  "Description");
        System.out.printf(FORMAT, "----------", "-------------------------",  "-------------------------");
        System.out.printf(FORMAT, "0", "Exit",  "What do you think it does?! Idiot!");

        for(Program program : programs){
            if(program != null){
                System.out.printf(FORMAT, programs.indexOf(program), program.getName(), program.getDesciption() );
            }
        }
    }
}
