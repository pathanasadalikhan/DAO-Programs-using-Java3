package DAO.EmployeeCompany;

public interface EmployeeInterface {
    public void addEmployee(EmployeDetails ed);
    public EmployeDetails[] allEmployee();
    public EmployeDetails employeeById(int empid);
}
