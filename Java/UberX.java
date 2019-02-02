class UberX extends Car{

    String brand;
    String model;

    public UberX(String pLicense, Account pDriver, String pBrand, String pModel){
        super(pLicense, pDriver);
        this.brand = pBrand;
        this.model = pModel;
    }

}