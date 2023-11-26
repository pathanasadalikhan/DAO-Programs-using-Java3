package DAO.EmployeeCompany;
import java.util.*;
public class EmployeClient {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        EmployeDetails e1=new EmployeeManager("asad", 12345, "121AS331", 45000,"Software developer");
        EmployeDetails e2=new EmployeeDirector("ikram", 121314, "121AS332", 42000, "data analist",10000);
        EmployeDetails e3=new EmployeeManager("charan", 1213111, "121AS333", 38500, "Frontend developer");
        EmployeFactory ef=new EmployeFactory();
        EmployeeInterface ei=ef.empfactory();
        ei.addEmployee(e1);
        ei.addEmployee(e2);
        ei.addEmployee(e3);
        EmployeDetails[] e=ei.allEmployee();
        for(EmployeDetails e5:e){
            System.out.println(e5.getDetails());
        }
        System.out.println("enter the id to search");
        EmployeDetails ed=ei.employeeById(sc.nextInt());
        if(ed==null){
            System.out.println("there is no employee with that id");
        }
        else{
            System.out.println("id found \nallow access");
        } 
    }
}
