<?php

class Account{
    public $id;
    public $document;
    public $name;
    public $email;
    public $password;

    public function __construct($pName,$pDocument){
       $this->name= $pName;
       $this->document= $pDocument;
    }

}