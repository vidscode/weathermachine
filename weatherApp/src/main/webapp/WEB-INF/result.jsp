<!DOCTYPE html>
<html lang="en">
<head>
  <title>Weather Report</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<style>
body  {
    background-image: url('/weatherApp/weather.jpg');
    background-color: #cccccc;
}
</style>
<body style="background-image: url("weather.gif");">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
       <a class="navbar-brand" h#">Weather Central</a>
    </div>
    <ul class="nav navbar-nav">
      <li ="active"><a href="/weatherApp/City">Home</a></li>
      <li><a href="#">Contact Us</a></li>
      <li><a href="#">About Us</a> </li>
      <li><a href="#">Best Holiday destinations</a></li>
     </ul>
     <ul class="nav navbar-nav navbar-right">
      <liref="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="#"><span class="glyphiconhicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
<div class="container">



  <h2>weather in ${weather.city}</h2>

  <table class="table table-hover">
    <thead>
      <tr>
        <th>City</th>
        <th>Description</th>
        <th>Temperature</th>
        <th>Wind Speed (km/h)</th>
        <th>Date and time</th>
        <th> Rain </th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>${weather.city}</td>
        <td>${weather.description}</td>
        <td>${weather.temperature}</td>
        <td>${weather.windSpeedPerHour}</td>
        <td>${weather.date}</td>
        <td>${weather.isItRaining}</td>
      </tr>
    </tbody>
  </table>
</div>

</body>
</html>
