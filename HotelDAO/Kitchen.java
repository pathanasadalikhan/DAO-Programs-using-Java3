package DAO.HotelDAO;

public class Kitchen {
    static String[] name = {"1.cicken lolipop ", "2.chiken tandori ", "3.chilli chiken  ", "4.chicken nuggets",
            "5.chicken 65     ", "6.chiken kabab   ", "7.paneer tikka   ", "8.matar mashroom ", "9.mashroom pasta " };
    static int[][] price = new int[9][2];
    int total = 0,il;
    float k,ta;
    {
        price[0][0] = 200;
        price[1][0] = 280;
        price[2][0] = 150;
        price[3][0] = 240;
        price[4][0] = 300;
        price[5][0] = 320;
        price[6][0] = 210;
        price[7][0] = 140;
        price[8][0] = 190;
    }
    public String payTheBill(){
        
        System.out.println("SNO   items         Quantity  price  total Price");
        for (int i = 0; i < name.length; i++) {
            if (price[i][1] > 0) {
                System.out.println(name[i] + "     " + price[i][1] + "       " + price[i][0] + "     "
                        + price[i][1] * price[i][0]);
                total = total + (price[i][1] * price[i][0]);
            }
        }
        k = total * 0.18f;
        ta = total + k;
        il=(int)ta;
        return "total amount  :" + total+"\n"+"gst valaue    :" + k+"\n"+"total bill is :" + ta+"\n------------------------------\npay the total bill :"+il+"\n------------------------------\n"; 
    }
    public int sendTotal(int a){
        int k=il-a;
        il=k;        
        return k;
    }
    public void showMenu(){
        System.out.println("Name of the item        Price");
        for (int i = 0; i <= name.length - 1; i++) {
            System.out.printf("%-25s%03d%n", name[i], price[i][0]);
        }
        System.out.println("10.To print bill\nselect any one item to order");
    }
    public void takeTheOrder(int i,int j){
        price[i - 1][1] = price[i - 1][1] + j;
    }
}
