<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 1/27/2022
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>All Product</h1>
<button><a href="products?action=sortAsc">SortAsc product list</a></button>
<button><a href="products?action=sortDesc">SortDesc product list</a></button>
<button><a href="products?action=moveToCart">Move to cart</a></button>

<table>
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Price</td>
        <td>Quantity</td>
        <td>Description</td>
        <td>Action</td>
    </tr>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.getId()}</td>
            <td>${product.getName()}</td>
            <td>${product.getPrice()}</td>
            <td>${product.getQuantity()}</td>
            <td>${product.getDescription()}</td>
            <td><button><a href="">Add to cart</a></button></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
