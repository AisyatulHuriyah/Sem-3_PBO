package Jobsheet_3;

public class TestCooperative
{
    public static void main(String[] args)
    {
        Member member1 = new Member("111333444", "Donny", 5000000);

        //Menampilkan Data Awal pakai getter
        System.out.println("Member Name: " + member1.getName());
        System.out.println("Loan Limit: " + member1.getLimitLoan());

        //coba coba fitur pinjam
        System.out.println("\nBorrow 10,000,000...");
        member1.borrow(10000000);

        //coba pinjam 4jt
        System.out.println("\nBorrow 4,000,000...");
        member1.borrow(4000000);
        System.out.println("Current loan amount: " + member1.getLoanAmount());

        //nah ini coba bayar 200rb tapi ga bisa
        System.out.println("\nPaying 200,000 installments");
        member1.installment(200000);
        System.out.println("Current loan amount: " + member1.getLoanAmount());

        //nah ini coba bayar 1jt tapi bisa
        System.out.println("\nPaying 1,000,000 installments");
        member1.installment(1000000);
        System.out.println("Current loan amount: " + member1.getLoanAmount());

        //ini bayar 3jt jadi sisa nya itu 0
        System.out.println("\nPaying 3,000,000 installments");
        member1.installment(3000000);
        System.out.println("Current loan amount: " + member1.getLoanAmount());
    }
}