/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

/**
 *
 * @author prasanna arla
 */
public class Loan {

    private String accountHolderName;
    private double loanAmount;
    private double intrestRate;

    public Loan(String accountHolderName, double loanAmount, double intrestRate) {
        this.accountHolderName = accountHolderName;
        this.loanAmount = loanAmount;
        this.intrestRate = intrestRate;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getIntrestRate() {
        return intrestRate;
    }

    public void setIntrestRate(double intrestRate) {
        this.intrestRate = intrestRate;
    }

    public double principleAmount() {
        double amount = 0.0;
        amount = (loanAmount * 12 * intrestRate) / 100;
        return amount;
    }

    @Override
    public String toString() {
        return "accountHolderName=" + accountHolderName + ", loanAmount=" + loanAmount + ", intrestRate=" + intrestRate + ", principleAmount=" + principleAmount();
    }

}
