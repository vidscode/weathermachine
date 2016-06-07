    <!DOCTYPE html>
    <html>
    <head>
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
      <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </head>
    <body>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <html>
    <title>Weather Information Channel</title>
    </head>
    <body style="background-image: url("/weather2.jpg");background-color: #cccccc;">

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
        <table style="width:400px;margin:100px;">
        <form:form method="POST" action="/weatherApp/findWeather" role="form">
            <tr><td>Cities:</td></tr>
             <tr>
                <td>
                <div class="form-group">
                    <form:select path="name" onchange="this.form.submit()" class="form-control">
                      <form:option value="" label="--SELECT --" />
                      <ul class="dropdown-menu">
                      <c:forEach var="city" items="${cities}" varStatus="index">
                        <li> <form:option value="${city.name}" /></li>
                      </c:forEach>
                      </ul>
                    </form:select>
                    <script type="javascript">
                        <noscript><input type="submit" value="Submit"></noscript>
                     </script>
                    </div>
                 </td>
             </tr>
        </form:form>
        </table>
        </div>
    </body>
    </html>