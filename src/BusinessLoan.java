public class BusinessLoan extends Loan{
    private double interestRate;

    //Constructor
    public BusinessLoan(int loanNumber, String lastName, double loanAmount, int term, double prime) {
        super(loanNumber, lastName, loanAmount, term);
        this.interestRate = ((prime / 100) + 0.01) * 100;
    }

    //toString Method
    public String toString () {
        return super.toString() + " with an interest rate of: " + interestRate + "%";
    }
}