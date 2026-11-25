<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>${cvData.fullName} - Curriculum Vitae</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <div class="container">
        <div class="cv-header">
            <h1>${cvData.fullName}</h1>
            <h2>${cvData.professionalTitle}</h2>
            <p>
                <strong>Email:</strong> ${cvData.email} | 
                <strong>Phone:</strong> ${cvData.phone} | 
                <strong>Web/Profile:</strong> ${cvData.linkedinGithub}
            </p>
        </div>

        <div class="cv-section">
            <h3>Profile Summary</h3>
            <p>${cvData.profileSummary}</p>
        </div>

        <div class="cv-section">
            <h3>Education</h3>
            <p><strong>${cvData.highestDegree}</strong> (${cvData.major})<br>
            <em>${cvData.institutionName}</em> — ${cvData.graduationYear}</p>
        </div>

        <div class="cv-section">
            <h3>Work Experience</h3>
            <p><strong>${cvData.jobTitle}</strong> at <em>${cvData.companyName}</em> (${cvData.duration})<br>
            ${cvData.achievements}</p>
        </div>

        <div class="cv-section">
            <h3>Skills</h3>
            <p><strong>Technical Skills:</strong> ${cvData.technicalSkills}</p>
            <p><strong>Soft Skills:</strong> ${cvData.softSkills}</p>
        </div>

        <div class="no-print" style="margin-top: 30px; display: flex; gap: 10px;">
            <a href="cvForm.jsp" class="btn">Create Another CV</a>
            <button onclick="window.print()" class="btn" style="background-color: #0288d1;">Print / Export to PDF</button>
        </div>
    </div>
</body>
</html>