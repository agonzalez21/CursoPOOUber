import com.sun.tools.classfile.Annotation.element_value;

class Car
{
    Integer id;
    String license;
    Account driver;
    private Integer passegenger;

    public Car(String pLicense, Account pDriver){
        this.license = pLicense;
        this.driver = pDriver;
    }

    void printDataCar(){
        if(passegenger!=null)
            System.out.println("License:" + license + " Name Driver: " + driver.name + " Passengers: " + passegenger);

    }

    public Integer getPassenger(){
        return passegenger;
    }

    public void setPassenger(Integer pPassenger){
        if(pPassenger==4)
        this.passegenger = pPassenger;
        else
        System.out.println("Pasasegos no válidos.");
    }

}