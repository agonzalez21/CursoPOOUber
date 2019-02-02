<?php
require_once 'Car.php';
class UberBlack extends Car{

    public $typeCardAccepted;
    public $seatsMaterial;

    public function __constructor($pLicense, $pDriver, $pTypeCardAccepted, $pSeatsMaterial){
        parent:: __constructor($pLicense, $pDriver);
        $this->typeCardAccepted = $pTypeCardAccepted;
        $this->seatsMaterial = $pSeatsMaterial;
    }

}