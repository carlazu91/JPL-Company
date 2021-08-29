import java.util.Scanner;

public class CreateLoans implements LoanConstants{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, accountNumber, amount, term;
        String lastName;

        System.out.println("Welcome to " + companyName);

        System.out.println("Please enter the current Prime Rate:");
        double currentPrimeRate = sc.nextDouble();

        Loan loans[] = new Loan[2];
        for (int n=0; n<loans.length; n++){
            System.out.println("Is this a Business loan (1) or a Personal loan(2)?");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter account number:");
                accountNumber = sc.nextInt();

                System.out.println("Enter Last Name:");
                lastName = sc.next();

                System.out.println("Enter Amount:");
                amount = sc.nextInt();
                if (amount > loanAmountMax) {
                    System.out.println("Invalid amount, please enter amount less than " + loanAmountMax);
                    System.out.println("Enter Amount:");
                    amount = sc.nextInt();
                }

                System.out.println("Enter Term length: ");
                term = sc.nextInt();
                if (term != shortTerm && term != mediumTerm && term != longTerm) {
                    term = shortTerm;
                }

                BusinessLoan b1 = new BusinessLoan(accountNumber, lastName, amount, term, currentPrimeRate);
                loans[n] = b1;
            }
            else if (choice == 2) {
                System.out.println("Enter account number:");
                accountNumber = sc.nextInt();

                System.out.println("Enter Last Name:");
                lastName = sc.next();

                System.out.println("Enter Amount:");
                amount = sc.nextInt();
                if(amount > loanAmountMax){
                    System.out.println("Invalid amount, please enter amount less than " + loanAmountMax);
                    System.out.println("Enter Amount:");
                    amount = sc.nextInt();}

                System.out.println("Enter Term length: ");
                term = sc.nextInt();
                if(term != shortTerm && term != mediumTerm && term != longTerm){
                    term = shortTerm;}

                PersonalLoan p1 = new PersonalLoan(accountNumber,lastName,amount,term,currentPrimeRate);
                loans[n] = p1;
            }
        }

        System.out.println("Welcome to " + companyName);
        for(int n=0;n<loans.length;n++)
        {
            System.out.println(loans[n]);
        }
    }
}