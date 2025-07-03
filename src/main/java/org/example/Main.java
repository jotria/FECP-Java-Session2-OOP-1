package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<BankAccount> bankAccounts = new ArrayList<>();
        int choice;
        String returnChoice = "";
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("=== Bank Menu ===");
            System.out.println("1. Create Account");
            System.out.println("2. View All Accounts");
            System.out.println("3. Check Balance");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Exit");

            System.out.print("Enter choice (1-5): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter Account Number: ");
                    int accountNumber = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Holder Name: ");
                    String bankAccountHolderName = scanner.nextLine();

                    System.out.print("Initial deposit? (yes/no): ");
                    String initialDeposit = scanner.nextLine();

                    System.out.print("Enter initial deposit amount: ");
                    float initialDepositAmount = scanner.nextFloat();
                    scanner.nextLine();

                    System.out.println("Account created successfully!");
                    break;

                case 2:
                    break;
                default:
                    break;
            }
            System.out.print("Would you like to return to the menu? (yes/no): ");
            returnChoice = scanner.nextLine();
        } while(returnChoice.equals("yes"));
    }
}