import java.util.Scanner;

public class BankingProgram {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        double currentbalance=0.0;
        boolean isrunning=true;
        while(isrunning){
            
            System.out.println("****************");
            System.out.println("BANKING PROGRAM");
            System.out.println("****************\n");
            
            System.out.println("1.Show Balance\n2.Deposit\n3.Withdraw\n4.Exit\n\n");
            
            System.out.println("Enter choice(1-4): ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.printf("Current Balance: $%.4f\n\n", currentbalance);
                    
                    break;
                case 2:
                    
                    System.out.println("Enter amount to be deposited: ");
                    double deposit=scan.nextDouble();
                    if(deposit<0){
                        System.out.println("The amount cant be negative");
                    }
                    else{
                        currentbalance=deposit+currentbalance;

                    }
                    
                    break;

                case 3:
                    System.out.println("Enter amount to be withdrawn: ");
                    double withdraw=scan.nextDouble();
                    if(withdraw>currentbalance){
                        System.out.println("You dont have sufficient balance");
                    }
                    else{
                        currentbalance=currentbalance-withdraw;

                    }
                    
                    break;
                
                case 4:
                    isrunning=false;
                    break;
                    
                    
            
                default:
                    System.out.println("Invalid number! \n");
                }

        


        }
        System.out.println("\n***************************************");
        System.out.println("Thank you for using our banking system! ");
        System.out.println("***************************************");
        

    }
}
