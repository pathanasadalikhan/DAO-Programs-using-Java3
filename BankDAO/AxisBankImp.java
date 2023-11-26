package DAO.BankDAO;

public class AxisBankImp implements CustomerInterface {
    
    int bal=2000;
    int i=0;
    public void deposite(int a){
        bal=bal+a;
    }
    public void withDraw(int b){
        if(b<=bal){
            bal=bal-b;
        }
        else{
            System.out.println("insufficent balance");
        }
    }
    public void balance(){
        System.out.println("balance is "+bal);
    }
}
