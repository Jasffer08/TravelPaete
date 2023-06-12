<?php
$fname = $_POST['fname'];
$lname = $_POST['lname'];
$email = $_POST['email'];
$mob = $_POST['mob'];
$ans = $_POST['ans'];

$conn = new mysqli('localhost', 'root', '', 'message');
if($conn->connect_error) {
    echo "$conn->connect_error";
    die('Connection Failed :' .$conn->connect_error);
} else {
    $stmt = $conn->prepare("insert into message(fname, lname, email, mob, ans) values (?, ?, ?, ?, ?)");
    $stmt->bind_param("sssis", $fname, $lname, $email, $mob, $ans);
    $stmt->execute();
    echo "Registration Successfully...";
    $stmt->close();
    $conn->close();
}

?>