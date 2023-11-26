package DAO.EmployeeCompany;

public class EmployeFactory {
    public EmployeeInterface empfactory(){
        return new EmployeImp();
    }
}
