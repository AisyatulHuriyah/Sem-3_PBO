package Jobsheet_3;

public class Member {
    //pakai private supaya data tidak bisa diakses langsung dari luar class
    private String idCardNumber;
    private String name;
    private int limitLoan;
    private int loanAmount;

    // Constructor
    public Member(String idCardNumber, String name, int limitLoan) {
        this.idCardNumber = idCardNumber;
        this.name = name;
        this.limitLoan = limitLoan;
        this.loanAmount = 0;
    }

    public String getName() {
        return name;
    }

    public int getLimitLoan() {
        return limitLoan;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    // Method untuk meminjam uang
    public void borrow(int amount) {
        if (loanAmount + amount > limitLoan) {
            System.out.println("Sorry, maximum loan amount exceeded.");
        } else {
            loanAmount += amount;
        }
    }

    // Method untuk mengangsur/membayar pinjaman
    public void installment(int amount) {
        //Angsuran minimal 10% dari pinjaman saat ini
        if (amount < (loanAmount * 0.1)) {
            System.out.println("Sorry, the installment must be 10% of the loan amount.");
        } else {
            loanAmount -= amount;
        }
    }   
}