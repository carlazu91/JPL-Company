public class PersonalLoan extends Loan{
    private double interestRate;

    //Constructor
    public PersonalLoan(int loanNumber, String lastName, double loanAmount, int term, double prime) {
        super(loanNumber, lastName, loanAmount, term);
        this.interestRate = ((prime / 100) + 0.02) * 100;
    }

    //toString Method
    public String toString(){
        return super.toString() + " with an interest rate of: " + interestRate + "%";
    }
}
