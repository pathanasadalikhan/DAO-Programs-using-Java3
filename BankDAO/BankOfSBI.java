package DAO.BankDAO;

public class BankOfSBI {
    private String name="pathan asad";
    private int pass=121314;
    private String branch="Andhra Pradesh";
    private String ifsc="9943SBI007";
    public String alldetails(){
        return "name :"+name+"password :"+pass+"branch :"+branch+"ifsc code :"+ifsc;
    }
    public int sbiPass(){
        return pass;
    }
    public String sbiName(){
        return name;
    }
    public String sbiBranch(){
        return branch;
    }
    public String sbiifsc(){
        return ifsc;
    }
}
