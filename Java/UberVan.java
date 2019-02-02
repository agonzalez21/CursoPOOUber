import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car{
    
    Map<String, ArrayList<String,Integer>> typeCardAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String pLicense, Account pDriver, String pBrand, String pModel,Map<String, ArrayList<String,Integer>> typeCardAccepted,
    ArrayList<String> seatsMaterial){
        super(pLicense, pDriver);
        this.typeCardAccepted = typeCardAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}