package DAO.BankDAO;

public class CustomerFactory {
    public CustomerInterface customerFactAxis(){
        return new AxisBankImp();
    }
    public CustomerInterface customerfactSBI(){
        return new SBIBanImp();
    }
}
