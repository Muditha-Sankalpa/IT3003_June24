import java.util.Scanner;

public class s_17316_thanuan {
    public static void main(String arr[]){
        System.out.print("enter student id");
        Scanner sc = new Scanner(System.in);
        String s_id = input.nextLine();

        System.out.print("enter student name");
        Scanner sc = new Scanner(System.in);
        String s_name = input.nextLine();

        System.out.print("enter student Email");
        Scanner sc = new Scanner(System.in);
        String s_email = input.nextLine();

        System.out.println("Select couce type");
        System.out.println("1.online");
        System.out.println("2.physical");

        if(Option == 1) {
            System.out.println("Option 1");
        } else if(Option ==2) {
            System.out.println("Option 2");
        } else {
            System.out.println("invalid input");
        }


    switch(Option) {
        case 1:
            System.out.print("enter o_cource id");
            Scanner sc = new Scanner(System.in);
            String o_c_id = input.nextLine();

            System.out.print("enter o_cource name");
            Scanner sc = new Scanner(System.in);
            String cource_name = input.nextLine();

            System.out.print("enter o_cource fee");
            Scanner sc = new Scanner(System.in);
            Double o_c_fee = input.nextDouble();
            break;

        case 2:
            System.out.print("enter p_cource id");
            Scanner sc = new Scanner(System.in);
            String p_c_id = input.nextLine();

            System.out.print("enter p_cource name");
            Scanner sc = new Scanner(System.in);
            String cource_name = input.nextLine();

            System.out.print("enter p_cource fee");
            Scanner sc = new Scanner(System.in);
            Double p_c_fee = input.nextDouble();
            break;
        default:
            System.out.println("Invalid");
        }
    }


    System.out.println("---------------------");
    System.out.println("Registration Summary");
    System.out.println("---------------------");
    System.out.println("Student :" + s_name);
    System.out.println("Cource:" + c_name);
    System.out.println("Cource Type" + Option);
    System.out.println("Total Fee:" + Fee);
}






