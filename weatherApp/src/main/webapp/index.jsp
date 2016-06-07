<html>
<body>
<h2>Hello World!</h2>

<div class="container">
  <h2> Weather Information </h2>
  <p></p>
  <p></p>
  <form:form method="POST" action="/HelloWeb/showWeather">
  <div class="dropdown">
    <button class="btn btn-default dropdown-toggle" type="button" id="menu1" data-toggle="dropdown">Choose City
    <span class="caret"></span></button>
    <select class="dropdown-menu" id="city" name="city" role="menu" aria-labelledby="menu1">
       <option value="Sydney">Sydney</option>
       <option value="Melbourne">Melbourne</option>
       <option value="Wollongong">Wollongong</option>
       <option value="">Didnt find the city ?</option>
    </select>
    <ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Sydney</a></li>
      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Melbourne</a></li>
      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Wollongong</a></li>
      <li role="presentation" class="divider"></li>
      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Didnt find the city ?</a></li>
    </ul>
  </div>
</div>
</body>
</html>
