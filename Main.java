import java.util.*;

public class Main 
{
    static Scanner obj = new Scanner(System.in);
    static String sUser, sPass, lUser, lPass;
   public static void main(String[] args) {
   System.out.println("WELCOME TO SMARTHOME AUTOMATION..");     
        int i;
        do {
            System.out.println("\n 1. Sign In \n 2. Login In \n 3. Exit \n");
            i = obj.nextInt();
            obj.nextLine();
            switch(i){
                case 1: 
                signIn();
                break;
                case 2:
                login();
                break;
                case 3:
                System.out.println("Exit");
                break;
                default:
                System.out.println("Invalid Request..");
            }
        } while (i!=3);
        check();
    }

    static void signIn(){
        System.out.println("SIGN IN !!");
        System.out.print("\n Username : ");
        sUser = obj.nextLine();
        obj.nextLine();
        System.out.print("\n Password : ");
        sPass = obj.nextLine();
    }
    static void login()
    {
        System.out.println("LOGIN !!");
        System.out.print("\n Username : ");
        lUser = obj.nextLine();
        obj.nextLine();
        System.out.print("\n Password : ");
        lPass = obj.nextLine();
    }
    static void check()
    {
        if((sUser != null && sUser.equals(lUser)) && (sPass != null && sPass.equals(lPass)))
        {
            System.out.println("You have successfully Logged In");
            System.out.println("Hello "+sUser+"!!");
            Systemm ss = new Systemm();
            ss.command();
        }
        else{
            System.out.println("Check you Username and Password");
        }
    }
    
}