<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dynamic Online CV Builder - Input Form</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <div class="container">
        <div class="sample-link-container">
            <a href="CVServlet?action=sample" class="btn">Preview Sample CV</a>
        </div>
        
        <h1>Online CV Builder</h1>
        <p>Fill out the form below to generate your professional Curriculum Vitae dynamically.</p>
        
        <form action="CVServlet" method="post">
            <fieldset>
                <legend>Personal Information</legend>
                <div class="form-group">
                    <label>Full Name *:</label>
                    <input type="text" name="fullName" required value="${submittedBean.fullName}">
                </div>
                <div class="form-group">
                    <label>Professional Title:</label>
                    <input type="text" name="professionalTitle" value="${submittedBean.professionalTitle}">
                </div>
                <div class="form-group">
                    <label>Email Address *:</label>
                    <input type="email" name="email" required value="${submittedBean.email}">
                </div>
                <div class="form-group">
                    <label>Phone Number:</label>
                    <input type="text" name="phone" value="${submittedBean.phone}">
                </div>
                <div class="form-group">
                    <label>LinkedIn / GitHub URL:</label>
                    <input type="text" name="linkedinGithub" value="${submittedBean.linkedinGithub}">
                </div>
                <div class="form-group">
                    <label>Profile Summary:</label>
                    <textarea name="profileSummary">${submittedBean.profileSummary}</textarea>
                </div>
            </fieldset>

            <fieldset>
                <legend>Education</legend>
                <div class="form-group">
                    <label>Highest Degree *:</label>
                    <input type="text" name="highestDegree" required value="${submittedBean.highestDegree}">
                </div>
                <div class="form-group">
                    <label>Institution Name:</label>
                    <input type="text" name="institutionName" value="${submittedBean.institutionName}">
                </div>
                <div class="form-group">
                    <label>Graduation Year:</label>
                    <input type="text" name="graduationYear" value="${submittedBean.graduationYear}">
                </div>
                <div class="form-group">
                    <label>Major / Field:</label>
                    <input type="text" name="major" value="${submittedBean.major}">
                </div>
            </fieldset>

            <fieldset>
                <legend>Work Experience</legend>
                <div class="form-group">
                    <label>Most Recent Job Title:</label>
                    <input type="text" name="jobTitle" value="${submittedBean.jobTitle}">
                </div>
                <div class="form-group">
                    <label>Company Name:</label>
                    <input type="text" name="companyName" value="${submittedBean.companyName}">
                </div>
                <div class="form-group">
                    <label>Duration:</label>
                    <input type="text" name="duration" value="${submittedBean.duration}">
                </div>
                <div class="form-group">
                    <label>Key Responsibilities / Achievements:</label>
                    <textarea name="achievements">${submittedBean.achievements}</textarea>
                </div>
            </fieldset>

            <fieldset>
                <legend>Skills</legend>
                <div class="form-group">
                    <label>Technical Skills (comma-separated) *:</label>
                    <input type="text" name="technicalSkills" required placeholder="e.g. Java, Python, SQL" value="${submittedBean.technicalSkills}">
                </div>
                <div class="form-group">
                    <label>Soft Skills:</label>
                    <input type="text" name="softSkills" placeholder="e.g. Communication, Leadership" value="${submittedBean.softSkills}">
                </div>
            </fieldset>

            <button type="submit">Generate CV</button>
        </form>
    </div>
</body>
</html>