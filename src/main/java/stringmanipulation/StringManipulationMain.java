package stringmanipulation;

public class StringManipulationMain {

    public static void main(String[] args) {
        StringManipulation stringManipulation = new StringManipulation();

        System.out.println(stringManipulation.everyEvenCharacter("This is a String")); //Ti saSrn

        System.out.println("Ti saSrn".equals(stringManipulation.everyEvenCharacter("This is a String")));
    }
}
