<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">

</head>
<body>
<h2>Production Discount</h2>

<form action="/discount" method="post">
    <div class="row">
        <div class="col">
            <label>Product Description</label>
            <input type="text" name="Description" class="form-control" >
        </div>
        <div class="col">
            <label>List Price </label>
            <input type="text" name="Price" class="form-control" value="0">
        </div>
        <div class="col">
            <label>Discount Percent</label>
            <input type="text" name="Percent" class="form-control" value="0">
        </div>

    </div>
    <button type="submit" class="btn btn-primary" value="calculator">Calculator</button>
</form>
</body>
</html>