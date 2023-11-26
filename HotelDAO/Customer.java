package DAO.HotelDAO;
import java.util.*;
public class Customer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HotelAdmin hta = new HotelAdmin();
        HotelFact hf = new HotelFact();
        HotelInterface hi = hf.sendOrder();
        int o = 0, m = 0;
        while (o != hi.returnsize() + 1) {
            System.out.println("******************START WITH STARTERS******************");
            hi.showMenu();
            System.out.println("*******************************************************");
            o = sc.nextInt();
            if (o <= hi.returnsize()) {
                if (o == 0) {
                    System.out.println("enter the admin password ");
                    int pass = sc.nextInt();
                    if (pass == hta.gethotelPass()) {
                        System.out.print("enter the name of the item : ");
                        String a = sc.next();
                        System.out.print("enter the price of the item:");
                        int p = sc.nextInt();
                        hi.addItems(a, p);
                    }
                    else{
                        System.out.println("wrong password");
                    }
                } 
                else {
                    System.out.println("enter the number of plate");
                    int ad = sc.nextInt();
                    hi.takeTheOrder(o, ad);
                }
            } else if (o > hi.returnsize()) {
                System.out.println("----------------YOUR BILL-----------------");
                System.out.println(hi.payBill());
                System.out.println("please pay the bill :");
                o = hi.returnsize() + 1;
                while (m != 1) {
                    int x = sc.nextInt();
                    int k = hi.sendTotal(x);
                    if (k <= 0) {
                        if (k < 0) {
                            int lt = k * -1;
                            System.out.println("collect your change :" + lt);
                        }
                        System.out.println("-----------THANK YOU VSIT AGAIN-----------");
                        m = 1;
                    } else if (k > 0) {
                        System.out.println("please pay the total amount");
                        System.out.println("after paying bill the remaining amount to pay :" + k);
                    }
                }
            }
        }
    }
}
