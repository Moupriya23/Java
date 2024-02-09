//import required classes and packages 
import java.util.Scanner;

//create ATM class to implement the ATM functionality  
public class ATM{
    //main method starts
    public static void main(String[] args) {
        //declare and initialize balance, withdraw, and deposit  
        int balance=100000,withdraw,deposit;

        //create scanner class object to get choice of user  
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("🏧 Welcome to ATM 🏬");
            System.out.println("1️⃣ 1. For WITHDRAW");
            System.out.println("2️⃣ 2. For DEPOSIT");
            System.out.println("3️⃣ 3. For CHECK THE BALANCE");
            System.out.println("4️⃣ 4. For EXIT");
            System.out.println("Choose the operator you want perform");

            //get choice from user
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter Money to be Withdrawn");
                    //get the withdrawl money from user
                    withdraw=sc.nextInt();

                    //check whether the balance is greater than or equal to the withdrawal amount
                    if(balance>= withdraw){

                        //remove the withdrawl amount from the total balance
                        balance=balance-withdraw;
                        System.out.println("Please collect your money 💵");

                    }else{
                        //show custom error message
                        System.out.println("Insufficient Balance 😑");
                    }
                break;
                case 2:
                    System.out.println("Enter money to be deposit");

                    //get deposit amount from te user
                    deposit=sc.nextInt();

                    //add the deposit amount to the total balanace
                    balance=balance+ deposit;
                    System.out.println("Your money has been successfully deposited ✅");
                break;
                case 3:

                    //displaying the total balance of the user
                    System.out.println("Your Account Balance "+balance);
                break;
                case 4:
                    System.out.println("Thank You🙏");

                    //exit from the menu
                    System.exit(0);
                    
            }
        }
    }
}