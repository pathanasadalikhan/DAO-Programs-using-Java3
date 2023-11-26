package DAO.EmployeeCompany;

public class EmployeImp implements EmployeeInterface{
    EmployeDetails[] e=new EmployeDetails[3];
    int ind=0;
    public void addEmployee(EmployeDetails ed){
        e[ind]=ed;
        ind++;
    }
    public EmployeDetails[] allEmployee(){
        return e;
    }
    public EmployeDetails employeeById(int empid){
        EmployeDetails e1=null;
        for(EmployeDetails e:e){
            if(empid==e.getempid()){
                e1=e;
            }
        }
        return e1;
    }
}
