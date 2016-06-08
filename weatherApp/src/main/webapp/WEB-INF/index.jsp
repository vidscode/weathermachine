<%@ page contentType="text/html; charset=UTF-8" %>
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
    background-image: url('/resources/images/weather.jpg');
    background-color: #cccccc;
}
</style>
<body>
<div class="navbar navbar-dark navbar-static-top" role="navigation">
      <div class="container">
        <!-- Navbar Header -->
        <div class="navbar-header">

          <a class="navbar-brand" href="/">

              <img src="/themes/demo/assets/vendor/owm/images/logo_OpenWeatherMap_orange_website.png" height="30">
          <!-- <img src="/themes/demo/assets/vendor/owm/images/OWM_logo32_32.png" style="vertical-align:bottom">
            OpenWeatherMap<span class="hidden-sm"></span> -->


            </a>
        </div> <!-- / Navbar Header -->

        <!-- Navbar Links -->
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
           <!-- <li><a href="/" class="bg-hover-color" onclick="_gaq.push(['_trackEvent', 'Navbar', 'Main', 'home']);">Home</a></li> -->
            <li><a href="/city" class="bg-hover-color" onclick="_gaq.push(['_trackEvent', 'Navbar', 'Main', 'weather']);">Weather</a></li>
            <!--<li><a href="/maps" class="bg-hover-color" onclick="_gaq.push(['_trackEvent', 'Navbar', 'Main', 'maps']);">Maps</a></li>-->

            <li class="dropdown">
              <a href="#" class="dropdown-toggle bg-hover-color" data-toggle="dropdown">Maps <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="/weathermap" class="bg-hover-color">Weather maps</a></li>
                <li><a href="http://owm.io/modis" class="bg-hover-color">Current satellite maps</a></li>
                <!--<li><a href="/help/sat.html" class="bg-hover-color">Current satellite maps</a></li>
                <li><a href="/beautifulmaps" class="bg-hover-color">Beautiful maps</a></li>-->
                <li><a href="http://owm.io/beautiful_maps" target="_blank" class="bg-hover-color">Beautiful maps</a></li>
                <li><a href="http://openweathermap.org/map_editor_2" class="bg-hover-color">Map Editor 2.0</a></li>
              </ul>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle bg-hover-color" data-toggle="dropdown">Platform <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="/owm-platform" class="bg-hover-color">OWM Big Data Platform</a></li>
                <li><a href="/technology" class="bg-hover-color">Weather technology</a></li>
              </ul>
            </li>
            <li><a href="/stations" class="bg-hover-color" onclick="_gaq.push(['_trackEvent', 'Navbar', 'Main', 'station']);">Stations</a></li>
            <li><a href="/news" class="bg-hover-color" onclick="_gaq.push(['_trackEvent', 'Navbar', 'Main', 'news']);">News</a></li>
           <li class="dropdown">
              <a href="#" class="dropdown-toggle bg-hover-color" data-toggle="dropdown">About <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="/about" class="bg-hover-color">About company</a></li>
                <li><a href="/owm-platform" class="bg-hover-color">OWM Platform</a></li>
                <li><a href="/technology" class="bg-hover-color">Big Data Technology</a></li>
                <li><a href="/models" class="bg-hover-color">Meteorological models</a></li>
                <li><a href="/datasource" class="bg-hover-color">Data sources</a></li>
              </ul>
            </li>
          </ul>

          <!-- Search Form (xs) -->
          <form class="navbar-form navbar-left visible-xs" role="search">
            <div class="form-group">
              <input type="text" class="form-control" placeholder="Search">
            </div>
            <button type="submit" class="btn btn-default">Go!</button>
          </form> <!-- / Search Form (xs) -->

        </div> <!-- / Navbar Links -->
      </div> <!-- / container -->
    </div> <!-- / navbar -->

<div>
</div></div><h2>Your Weather Library</h2>
</body>
</html>