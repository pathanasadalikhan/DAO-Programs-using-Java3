package DAO.RentalCarBikeDAO;

public class RentalFact {
    public RentalInterface access(){
        return new RentalImp();
    }
}
