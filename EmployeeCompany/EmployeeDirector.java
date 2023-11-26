package DAO.EmployeeCompany;

public class EmployeeDirector extends EmployeeManager{
    public double bonous;
    EmployeeDirector(String n,int id,String sn,int sal,String dep,double boun){
        super(n, id, sn, sal, dep);
        bonous=boun;
    }
    public String getDetails(){
        return super.getDetails()+" "+bonous;
    } 
}
