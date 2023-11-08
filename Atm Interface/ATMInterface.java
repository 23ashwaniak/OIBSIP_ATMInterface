package atm;
import java.util.Scanner;

class ATMInterface {
    public static void main(String[] args){
        int balance = 000,withdraw,deposit;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("ATM Interface By Ashwani");
            System.out.println("Choose 1 :- Withdraw Money");
            System.out.println("Choose 2 :- Deposit Money");
            System.out.println("Choose 3 :- Check Balance");
            System.out.println("Choose 4 :- Quit");
            System.out.println("Choose your desired task to perform:");

            // get choice from user
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Withdraw Money:");
                    
                withdraw = sc.nextInt();

                if(balance>=withdraw){
                    balance = balance-withdraw;
                    System.out.println("Please Collect your Money");
                }else{
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                    break;

                    case 2:
                    System.out.println("Deposit Money");
                    deposit = sc.nextInt();

                    balance = balance+deposit;
                    System.out.println("Your money Successfully deposited in your account");
                    System.out.println("");
                        break;

                        case 3:
                        System.out.println("Balance:"+balance);
                        System.out.println("");
                        break;
                        case 4:
                        System.exit(0);
                // default:
                   
                    // break;
            }
            // sc.close();
        }
        // sc.close();
    }
    
}