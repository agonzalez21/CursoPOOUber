class UberPool extends Car{

    String brand;
    String model;

    public UberPool(String pLicense, Account pDriver, String pBrand, String pModel){
        super(pLicense, pDriver);
        this.brand = pBrand;
        this.model = pModel;
    }

}