package DAO.BankDAO;
import java.util.*;
public class ATM {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        BankOfAxis a=new BankOfAxis();
        BankOfSBI s=new BankOfSBI();
        CustomerFactory c=new CustomerFactory();
        CustomerInterface ci=c.customerFactAxis();
        CustomerInterface cs=c.customerfactSBI();
        System.out.println("select your card type : \n1.Axis Bank\n2.SBI Bank");
        int k=sc.nextInt();
        int i=0;
        if(k==1){
            System.out.println("welcome to Axis Bank \nenter your password");
            int m=sc.nextInt();
            if(m==a.axisPass()){
                do{
                    System.out.println("select any one option \n1.deposit\n2.withdraw\n3.balance\n4.exit");
                    int t=sc.nextInt();
                    if(t==1){
                        System.out.println("enter the amount to deposit");
                        int am=sc.nextInt();
                        ci.deposite(am);
                    }
                    else if(t==2){
                        System.out.println("enter the amount to withdraw");
                        int wd1=sc.nextInt();
                        ci.withDraw(wd1);
                    }
                    else if(t==3){
                        ci.balance();
                    }
                    else {
                        i++;
                    }
                }while(i<=0);
            }
            else{
                System.out.println("wrong pin");
            }
        }
        else if(k==2){
            System.out.println("welcome to SBI Bank \n enter your password");
            int n=sc.nextInt();
            if(n==s.sbiPass()){
                do{
                    System.out.println("select any one option \n1.deposit\n2.withdraw\n3.balance\n4.exit");
                    int t=sc.nextInt();
                    if(t==1){
                        System.out.println("enter the amount to deposit");
                        int d=sc.nextInt();
                        cs.deposite(d);
                    }
                    else if(t==2){
                        System.out.println("enter the amount to withdraw");
                        int wd2=sc.nextInt();
                        cs.withDraw(wd2);
                    }
                    else if(t==3){
                        cs.balance();
                    }
                    else {
                        i++;
                    }
                }while(i<=0);
            }
            else{
                System.out.println("wrong pin");
            }
        }
    }
}
