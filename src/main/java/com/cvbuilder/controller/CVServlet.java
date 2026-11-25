/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.cvbuilder.controller;

import com.cvbuilder.model.CVBean;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;

public class CVServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String action = request.getParameter("action");
        
        // Handle Sample Template generation (GET flow)[cite: 4]
        if ("sample".equals(action)) {
            CVBean sampleBean = new CVBean();
            sampleBean.setFullName("Xavier Bin Ali");
            sampleBean.setProfessionalTitle("Computer Science Student & Software Developer");
            sampleBean.setEmail("xavier@gmail.com");
            sampleBean.setPhone("+6012-345 6789");
            sampleBean.setLinkedinGithub("github.com/xavier-dev");
            sampleBean.setProfileSummary("Motivated computer science student with a strong foundation in database management, software engineering principles, and enterprise Java programming.");
            
            sampleBean.setHighestDegree("Bachelor of Computer Science (Hons.)");
            sampleBean.setInstitutionName("Universiti Teknologi MARA (UiTM)");
            sampleBean.setGraduationYear("2028");
            sampleBean.setMajor("Computer Science");
            
            sampleBean.setJobTitle("Software Engineering Intern / Developer");
            sampleBean.setCompanyName("Tech Solutions Sdn. Bhd.");
            sampleBean.setDuration("2025 - Present");
            sampleBean.setAchievements("Developed dynamic Java EE web components and optimized relational database schemas.");
            
            sampleBean.setTechnicalSkills("Java, Python, SQL, HTML/CSS, JavaScript, Git");
            sampleBean.setSoftSkills("Problem Solving, Team Collaboration, Adaptability");
            
            request.setAttribute("cvData", sampleBean);
            RequestDispatcher dispatcher = request.getRequestDispatcher("cvView.jsp");
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("cvForm.jsp");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        
        // Instantiate and populate Model Bean
        CVBean cvBean = new CVBean();
        cvBean.setFullName(request.getParameter("fullName"));
        cvBean.setProfessionalTitle(request.getParameter("professionalTitle"));
        cvBean.setEmail(request.getParameter("email"));
        cvBean.setPhone(request.getParameter("phone"));
        cvBean.setLinkedinGithub(request.getParameter("linkedinGithub"));
        cvBean.setProfileSummary(request.getParameter("profileSummary"));
        
        cvBean.setHighestDegree(request.getParameter("highestDegree"));
        cvBean.setInstitutionName(request.getParameter("institutionName"));
        cvBean.setGraduationYear(request.getParameter("graduationYear"));
        cvBean.setMajor(request.getParameter("major"));
        
        cvBean.setJobTitle(request.getParameter("jobTitle"));
        cvBean.setCompanyName(request.getParameter("companyName"));
        cvBean.setDuration(request.getParameter("duration"));
        cvBean.setAchievements(request.getParameter("achievements"));
        
        cvBean.setTechnicalSkills(request.getParameter("technicalSkills"));
        cvBean.setSoftSkills(request.getParameter("softSkills"));
        
        // Execute validation rules
        if (cvBean.validate()) {
            request.setAttribute("cvData", cvBean);
            RequestDispatcher dispatcher = request.getRequestDispatcher("cvView.jsp");
            dispatcher.forward(request, response);
        } else {
            request.setAttribute("errorMessage", "Validation failed! Please make sure Full Name, Email, Degree, and Technical Skills are filled out correctly.");
            request.setAttribute("submittedBean", cvBean);
            RequestDispatcher dispatcher = request.getRequestDispatcher("cvError.jsp");
            dispatcher.forward(request, response);
        }
    }
}