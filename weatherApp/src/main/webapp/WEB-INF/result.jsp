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
<body>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
