package libs;

import interfaces.StartProgramInterface;

/**
 * Created by thesinding on 6/6/17.
 */
public class Program {
    StartProgramInterface program;
    String desciption;
    String name;

    public Program(StartProgramInterface program, String desciption) {
        this.program = program;
        this.desciption = desciption;

        // All this for a fucking name...
        char[] tempCharArray = this.program.getClass().getSimpleName().toCharArray();
        String tempString = "";
        for(int i = 0; i <= tempCharArray.length - 1; i++){
            if(Character.isUpperCase(tempCharArray[i]) && i != 0 ){
                tempString += " " + tempCharArray[i];
            } else {
                tempString += tempCharArray[i];
            }
        }
        tempString = tempString.replace("Main", "");
        this.name = tempString;
    }

    public Program(StartProgramInterface program, String desciption, String customName) {
        this.program = program;
        this.desciption = desciption;
        this.name = customName;
    }


    public StartProgramInterface getProgram() {
        return program;
    }

    public void setProgram(StartProgramInterface program) {
        this.program = program;
    }

    public String getDesciption() {
        return desciption;
    }

    public String getName(){

        return this.name;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }
}
