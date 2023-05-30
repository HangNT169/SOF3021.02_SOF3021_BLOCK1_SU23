<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <tr>
        <th>STT</th>
        <th>Product Code</th>
        <th>Product Name</th>
        <th>Price</th>
        <th>Category Code</th>
        <th>Ctefory Name</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
<c:forEach items="${products}" var="product" varStatus="stt" >
    <tr>
        <td>${stt.index+1}</td>
        <td>${product.productCode}</td>
        <td>${product.productName}</td>
        <td>${product.price}</td>
        <td>${product.description}</td>
        <td>${product.category.categoryCode}</td>
        <td>${product.category.categoryName1}</td>
    </tr>
</c:forEach>
    </tbody>
</table>
</body>
</html>
