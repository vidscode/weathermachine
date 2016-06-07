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
                    <form:select path="name" class="selectpicker show-tick" data-style="btn-success">
                      <form:option value="" label="--SELECT --" />
                      <c:forEach var="city" items="${cities}" varStatus="index">
                        <form:option value="${city.name}" />
                      </c:forEach>
                    </form:select>
                 </td>
             </tr>
             <tr>
                <td><input type="submit" name="submit" value="Submit"></td>
             </tr>
        </form:form>
    </body>
    </html>