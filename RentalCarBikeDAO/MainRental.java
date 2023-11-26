package DAO.RentalCarBikeDAO;

import java.util.Scanner;

public class MainRental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RentalFact rf=new RentalFact();
        RentalInterface rc=rf.access();
        int o = 0;
        while (o != 3) {
            System.out.println("select any one option \n1.sign up\n2.log in\n3.exit");
            o = sc.nextInt();
            if (o == 1) {
                System.out.println("enter name of the customer");
                String a = sc.next();
                System.out.println("enter the pan card number");
                String b = sc.next();
                System.out.println("enter the phone number");
                long c = sc.nextLong();
                System.out.println("set a password to your account");
                String d = sc.next();
                rc.addCustDetails(a, b, c, d);
            } 
            else if (o == 2) {
                System.out.println("enter your name : ");
                String a = sc.next();
                System.out.println("enter your password : ");
                String b = sc.next();
                boolean ti = rc.checkCustomer(a, b);
                if (ti == true) {
                    int op=0;
                    while(op!=6){
                        System.out.println("select any one type \n1.pick Car\n2.pick Bike\n3.return Bike \n4.return Car\n5.menu\n6.log out ");
                        op = sc.nextInt();
                        if (op == 1) {
                            rc.carMenu();
                            System.out.print("select Car : ");
                            int p = sc.nextInt();
                            System.out.print("for how many days you want that Car : ");
                            int q = sc.nextInt();
                            rc.pickCar(p, q);
                        } 
                        else if (op == 2) {
                            rc.bikeMenu();
                            System.out.print("select bike : ");
                            int p = sc.nextInt();
                            System.out.print("for how many days you want that bike : ");
                            int q = sc.nextInt();
                            rc.pickBike(p, q);
                        }
                        else if(op==3){
                            System.out.print("enter your bike unique id : ");
                            String rdb = sc.next();
                            boolean t = rc.bikeReturn(rdb);
                            rc.addBike(t, rdb);
                        }else if (op == 4) {
                            System.out.print("enter your car unique id : ");
                            String rdc = sc.next();
                            boolean p = rc.carReturn(rdc);
                            rc.addCar(p, rdc);
                        } 
                        else if(op==5){
                            System.out.println("select one menu \n1.Car Menu\n2.Bike Menu");
                            int lt=sc.nextInt();
                            if(lt==1){
                                rc.carMenu();
                            }
                            else if(lt==2){
                                rc.bikeMenu();
                            }
                            else{
                                System.out.println("invalid menu");
                            }
                        }
                    
                        else if (op == 6) {
                            op = 6;
                        }
                    }
                } 
                else {
                    System.out.println("invalid username or password");
                }
            } 
            else if (o == 3) {
                o = 3;
            }
        }
    }
}
