<?php

require_once 'Car.php';
require_once 'uberX.php';
require_once 'Account.php';
require_once 'uberPool.php';

$uberX = new UberX("CVB123",new Account("Andres Herrera","AND456"), "Cherolet","Spark");
$uberX->printDataCarAsString();

$uberPool = new UberPool("TYU567",new Account("Andrea Ferran","NADA765"), "Dodge","Attitude");
$uberPool->printDataCarAsString();

