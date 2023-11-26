package DAO.EmployeeCompany;

public class EmployeDetails {
    private String name;
    private int empid;
    private String ssn;
    private int salary;
    EmployeDetails(String n,int id,String sn,int sal){
        name=n;
        empid=id;
        ssn=sn;
        salary=sal;
    }
    public String getDetails(){
        return "Employee Name:"+name+" "+"Employee id:"+empid+" "+"Employee ssn :"+ssn+" "+"Employee Salary:"+salary;
    }
    public String getName(){
        return name;
    }
    public int getempid(){
        return empid;
    }
    public String getssn(){
        return ssn;
    }
    public int getsalary(){
        return salary;
    }
}


