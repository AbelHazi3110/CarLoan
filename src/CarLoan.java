public class CarLoan {
    public static void main(String[] args) {

        int carLoan = 100000;
        int loanLength = 16;
        int interestRate = 2;
        int downPayment = 300;
        if(downPayment >= carLoan) {
            System.out.println("The car can be paid in full.");
        }
        else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = monthlyBalance * interestRate / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
        }
    }
}