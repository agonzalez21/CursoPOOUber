class Car
{
    Integer id;
    String license;
    Account driver;
    Integer passegenger;

    public Car(String pLicense, Account pDriver){
        this.license = pLicense;
        this.driver = pDriver;
    }

    void printDataCar(){
        System.out.println("License:" + license + " Name Driver: " + driver.name);

    }

}