package DAO.EmployeeCompany;

public class EmployeeManager extends EmployeDetails {
    private String dept;
    EmployeeManager(String n,int id,String sn,int sal,String dep){
        super(n,id,sn,sal);
        dept=dep;
    }
    public String getDetails(){
        return super.getDetails()+" "+dept;
    }


}
