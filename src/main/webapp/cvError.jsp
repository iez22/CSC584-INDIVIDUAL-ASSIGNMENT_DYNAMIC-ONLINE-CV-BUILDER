<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Validation Error</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <div class="container" style="border-top: 5px solid #d32f2f;">
        <h2 style="color: #d32f2f;">Validation Error</h2>
        <p style="background-color: #ffebee; padding: 12px; border-left: 4px solid #d32f2f; color: #c62828;">
            ${errorMessage}
        </p>
        <p>Please return to the form and ensure all mandatory fields (Full Name, Email, Highest Degree, and Technical Skills) are correctly filled out.</p>
        <br>
        <a href="cvForm.jsp" class="btn">Back to Form</a>
    </div>
</body>
</html>