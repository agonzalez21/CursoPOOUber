<?php
require_once 'Account.php';
class Car{
    public $id;
    public $license;
    public $driver;
    public $passegenger;

    public function __construct($pLicense, $pDriver){
        $this->license = $pLicense;
        $this->driver=$pDriver;
    }

    public function printDataCarAsString(){
        //return "License: " . $license . " Name driver: " . $driver;
        echo "Licencia: $this->license Driver: " . $this->driver->name;
    }

}
