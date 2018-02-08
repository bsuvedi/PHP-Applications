<?php


$dsn='mysql:host=localhost;dbname=cs230';
$username='webuser';
$password='d0nkey5';

    $college = $_POST['college'];
    $cclass = $_POST['cclass'];
    $cyear = $_POST['cyear'];

   
    $q1 = $_POST['q1'];
    $q2 = $_POST['q2'];
    $q3 = $_POST['q3'];
    $q4 = $_POST['q4'];
    $q5 = $_POST['q5'];
    $q6 = $_POST['q6'];
    $q7 = $_POST['q7'];
    $q8 = $_POST['q8'];
    $q9 = $_POST['q9'];
    $q10 = $_POST['q10'];
    
    
    
        
    $apple = $_POST['apple'];
    if ($apple=="apple"){
            $apple=1;
        }
        else{
                $apple=0;
            }        

    $windows = $_POST['windows'];
        if ($windows=="windows"){
            $windows=1;
        }
        else{
                $windows=0;
            }
    $linux = $_POST['linux'];
            if ($linux=="linux"){
            $linux=1;
        }
        else{
                $linux=0;
            }

    $cable = $_POST['cable'];
            if ($cable == "cable"){
                
                $cable = 1;
            } else {
                $cable = 0;
            }

   $tv = $_POST['tv'];
             if ($tv == "tv"){
                 $tv = 1;
                 
             }else {
                 $tv = 0;
                 
             }
$phone = $_POST['phone'];
             if ($phone == "phone"){
                 $phone = 1;
                 
             }else {
                 $phone = 0;
                 
             }
$office = $_POST['office'];
             if ($office == "office"){
                 $office = 1;
                 
             }else {
                 $office = 0;
                 
             }



try{
$db= new PDO($dsn, $username, $password);


$query= "INSERT Into studsurv1 (college, cclass, cyear, havetv, havecable, havephone, havewindows, haveapple, havelinux, haveoffice, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10)
VALUES ('$college', '$cclass', '$cyear','$tv','$cable','$phone','$windows','$apple','$linux','$office','$q1','$q2','$q3','$q4','$q5','$q6','$q7','$q8','$q9','$q10');"; 

    $queryResult= $db->query($query) or die('Error querying');

?>

    
        
<html>
<head>
<body>
    
    Thank you very much for your time. You information has been entered into the database!!.
    
    <?php
    }


catch (PDOException $e){    
    echo "Connected failed";
}

 

?>

</body>
    

</html>
