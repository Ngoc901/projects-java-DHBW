package ProgrammingPractice;


enum Level{
    LOW,
    MEDIUM,
    HIGH
}

public class Enums {
    //enum is a special "class" that represents a group of constants (unchangeable variables, like final variables)
    //enums is short for "enumerations", which means "specifically listed"

    Level myVar = Level.LOW;

    public static void print(){
        Level myVar = Level.LOW;
        switch (myVar){
            case LOW:
                System.out.println("Low");
                break;
            case MEDIUM:
                System.out.println("Medium");
                break;
            case HIGH:
                System.out.println("High");
                break;
        }
    }

    public static void loopingThrough(){
        for(Level myVar : Level.values()){
            System.out.println(myVar);
        }
    }
}
