<?php
require_once 'Car.php';
class UberPool extends Car{
    public $brand;
    public $model;

    public function __constructor($pLicense,$pDriver,$pBrand,$pModel){
        parent::__constructor($pLicense, $pDriver);
        $this->brand = $pBrand;
        $this->model = $pModel;
    }

}