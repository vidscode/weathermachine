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
    <body>
        <h2>Your Weather Information</h2>

        <form:form method="POST" action="/weatherApp/findWeather">
             <tr>
                <td>Please select:</td>
                <td>
                <div class="dropdown">
                    <form:select path="name" onchange="this.form.submit()">
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
    </body>
    </html>