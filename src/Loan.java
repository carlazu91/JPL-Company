public abstract class Loan implements LoanConstants {
    //instant variables
    protected int loanNumber;
    protected String lastName;
    protected double loanAmount;
    protected double interestRate;
    protected int term;

    //Constructor
    public Loan(int loanNumber, String lastName, double loanAmount, int term) {
        this.loanNumber = loanNumber;
        this.lastName = lastName;
        this.loanAmount = loanAmount;
        this.term = term;
    }

    //toString Method
    public String toString() {
        String result;
        result = "Loan Number: " + loanNumber + " Last Name: " + lastName + " Loan Amount: "  +
                loanAmount + " Year Terms: " + term;
        return result;
    }

    //equals method
    public boolean equals(Loan loan){
        if (this.loanNumber == loan.loanNumber &&
                lastName.equals(loan.lastName) &&
                loanAmount==loan.loanAmount &&
                term == loan.term)
            return true;
        else
            return false;
    }
}
