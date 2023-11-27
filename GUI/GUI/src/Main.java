import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please Enter a Number: ");

        while(true) {
            int inp = scnr.nextInt();

            switch(inp) {
                case 1:
                    EditScholarshipGUI esGUI = new EditScholarshipGUI();
                    break;
                case 2:
                    FurtherReviewGUI frGUI = new FurtherReviewGUI();
                    break;
                case 3:
                    LoginGUI lGUI = new LoginGUI();
                    break;
                case 4:
                    PasswordResetGUI prGUI = new PasswordResetGUI();
                    break;
                case 5:
                    ProfileGUI pGUI = new ProfileGUI();
                    break;
                case 6:
                    ReviewGUI rGUI = new ReviewGUI();
                    break;
                case 7:
                    UploadGUI uGUI = new UploadGUI();
                    break;
                case 8:
                    AccountCreation acGUI = new AccountCreation();
                    break;
                case 9:
                    EditProfile epGUI = new EditProfile();
                    break;
                default:
                    break;

            }
        }
      
    }
}
