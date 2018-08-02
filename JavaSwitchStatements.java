public class JavaSwitchStatements {
    public static void main(String[] args) {

        String day = "Sundayreugheruigh";
        doSomething(day);

    }

    public static void doSomething(String day){

        switch(day){
            case "Monday":
                System.out.println("Its Monday");
                break;

            case "Tuesday":
                System.out.println("We're past Monday");
                break;

            case "Wednesday":
                System.out.println("Its the middle of the week");

            case "Thursday":
                System.out.println("We're past the middle of the week");
                break;

            default:
                System.out.println("Its the end of the week or you haven't entered in a proper day");
        }

    }
}