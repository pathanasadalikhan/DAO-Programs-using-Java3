package DAO.RentalCarBikeDAO;

public interface RentalInterface {
    public void addBike(boolean a, String b);
    public void addCar(boolean a, String b);
    public void carMenu();
    public void bikeMenu();
    public void addCustDetails(String a, String b, long c, String d);
    public void showCustomer();
    public boolean checkCustomer(String a, String b);
    public void pickBike(int a, int b);
    public void pickCar(int a, int b);
    public boolean bikeReturn( String c);
    public boolean carReturn( String c);
}
