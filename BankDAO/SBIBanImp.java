package DAO.BankDAO;

public class SBIBanImp implements CustomerInterface {
    int bal = 0;

    public void deposite(int a) {
        bal = bal + a;
    }

    public void withDraw(int b) {
        if (b <= bal) {
            bal = bal - b;
        } else {
            System.out.println("insufficent balance");
        }

    }

    public void balance() {
        System.out.println("your sbi balance is :" + bal);

    }
}
