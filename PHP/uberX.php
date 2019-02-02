<?php
require_once 'Car.php';

class UberX extends Car{
    public $brand;
    public $model;

    public function __construct($pLicence, $driver, $pBrand,$pModel)
    {
        parent:: __construct($pLicence,$driver);
        $this->brand=$pBrand;
        $this->model =$pModel;
    }
}