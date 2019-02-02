class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        UberX uberX = new UberX("AMQ123",new Account("Andres Herrera", "AND123"),"Chevrolet","Sonic");
        
        uberX.setPassenger(2);
        uberX.printDataCar();
/*
        Car car2 = new Car("qWE567", new Account("Andres Herrera", "ANDA876"));
        
        car2.passegenger = 3;
        car2.printDataCar();
*/
    }
}