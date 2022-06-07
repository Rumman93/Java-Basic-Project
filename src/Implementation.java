// important import statements
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Implementation {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;
    //constructor with parameter
    Implementation(String cname,String cid)
    {
        customerName=cname;
        customerId=cid;
    }
    // welcome message
    void welcome()
    {

        System.out.println("Welcome to Binary Bank Limited ");
        System.out.println("Branch Location  : Malibagh ");
        java.util.Date date = new java.util.Date();
        System.out.println(date);

        System.out.println("Name : "+customerName);
        System.out.println("Customer Id : "+customerId);
        System.out.println("Current Balance : "+balance);
    }

    //Deposit Money
    void deposit(int amount)
    {
        if(amount>0)
        {
            balance+=amount;
            previousTransaction=amount;
        }
    }

    //Withdraw Money
    void withdraw(int amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance-=amount;
            previousTransaction=-amount;
        }
    }

    //Previous Transaction
    void getPreviousTransaction()
    {
        if(previousTransaction>0)
        {
            System.out.println(" Money Deposited : "+previousTransaction+"  Taka ");
        }
        else if(previousTransaction<0)
        {
            System.out.println(" Money Withdrawn : "+previousTransaction+"  Taka ");
        }
        else
        {
            System.out.println("No Transactions Occuered ");
        }
    }

    // Option
    void showDetails()
    {
        char option='\0';
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Choose the Menu :");
        System.out.println("Press A for Deposit Money");
        System.out.println("Press B for Withdraw Money");
        System.out.println("Press C for see Previous Transaction ");
        System.out.println("Press D for Exit");


        do {

            System.out.print(" Enter an Option : ");
            char option1=sc.next().charAt(0);
            option=Character.toUpperCase(option1);
            int amount;
            switch (option)
            {
                case 'A':

                    welcome();
                    System.out.println("====================================");
                    System.out.print("Enter Amount to Deposit : ");
                    amount=sc.nextInt();
                    deposit(amount);
                    System.out.println(" Money Deposited Successfully ");
                    System.out.println("New Balance is  :"+balance);

                    System.out.println("====================================");

                    break;

                case 'B':

                    welcome();
                    System.out.println("====================================");
                    System.out.println("Enter Amount to Withdraw ");
                    amount=sc.nextInt();
                    withdraw(amount);
                    System.out.println(" Money Withdrawn Successfully ");
                    System.out.println("New Balance is  :"+balance);

                    System.out.println("====================================");

                    break;

                case 'C':

                    welcome();
                    System.out.println("====================================");
                    getPreviousTransaction();
                    System.out.println();
                    System.out.println("====================================");

                    break;
                case 'D':
                    System.out.println();
                    System.out.println("Thank you for banking with us!");
                    System.out.println("====================================");
                    System.out.println();
                    break;
                default:
                    System.out.println();
                    System.out.println("====================================");
                    System.out.println("you Entered Wrong Option ");
                    System.out.println("====================================");

                    break;
            }
        }while (option!='D');

    }

}
