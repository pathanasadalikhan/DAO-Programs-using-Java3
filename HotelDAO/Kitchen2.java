package DAO.HotelDAO;

import java.util.ArrayList;
import java.util.List;

// import java.util.*;
public class Kitchen2 implements HotelInterface {
    static List<Integer> count = new ArrayList<>();
    static List<String> name = new ArrayList();
    static List<Integer> price = new ArrayList();
    int total, il, lt, co;
    float k, ta;
    {
        name.add("chicken lolipop  ");
        name.add("chicken tandori  ");
        name.add("chilli chicken   ");
        name.add("chicken nuggets  ");
        name.add("chicken 65       ");
        name.add("chicken kabab    ");
        name.add("panner tikka     ");
        name.add("matar mashroom   ");
        name.add("mashroom pasta   ");
        count.add(0);
        count.add(0);
        count.add(0);
        count.add(0);
        count.add(0);
        count.add(0);
        count.add(0);
        count.add(0);
        count.add(0);
        price.add(200);
        price.add(280);
        price.add(150);
        price.add(240);
        price.add(300);
        price.add(320);
        price.add(210);
        price.add(140);
        price.add(190);
    }

    public void addItems(String a, int b) {
        name.add(a);
        price.add(b);
        count.add(0);
    }

    public void showMenu() {
        System.out.println("0.if you are admin press zero to add items");
        for (int i = 0; i < name.size(); i++) {
            System.out.print(i + 1 + ".");
            System.out.printf("%-25s%3d%n", name.get(i), price.get(i));
            co = i + 2;
        }
        System.out.println(co + ".to print bill");
    }

    public void takeTheOrder(int i, int j) {
        int ik = i - 1;
        lt = count.get(ik) + j;
        count.set(ik, lt);
    }

    public String payBill() {
        int s=1;
        System.out.println("SNO   items         Quantity  price  total Price");
        for (int i = 0; i < name.size(); i++) {
            if (count.get(i) > 0) {
                System.out.println(
                         s+ "." + name.get(i) + "     " + count.get(i) + "       " + price.get(i) + "     "
                                + count.get(i) * price.get(i));
                total = total + (count.get(i) * price.get(i));
                s++;
            }
            
        }

        k = total * 0.18f;
        ta = total + k;
        il = (int) ta;
        return "total amount  :" + total + "\n" + "gst valaue    :" + k + "\n" + "total bill is :" + ta
                + "\n------------------------------\npay the total bill :" + il + "\n------------------------------\n";
    }

    public int sendTotal(int a) {
        int k = il - a;
        il = k;
        return k;
    }

    public int returnsize() {
        int lpr = price.size();
        return lpr;
    }
}
