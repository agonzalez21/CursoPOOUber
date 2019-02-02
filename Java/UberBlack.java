import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car{
    
    Map<String, ArrayList<String,Integer>> typeCardAccepted;
    ArrayList<String> seatsMaterial;

    public UberBlack(String pLicense, Account pDriver, String pBrand, String pModel,Map<String, ArrayList<String,Integer>> typeCardAccepted,
    ArrayList<String> seatsMaterial){
        super(pLicense, pDriver);
        this.typeCardAccepted = typeCardAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}