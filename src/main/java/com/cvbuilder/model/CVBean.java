/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cvbuilder.model;

import java.io.Serializable;

public class CVBean implements Serializable {
    private static final long serialVersionUID = 1L;
    
    //Personal Info
    private String fullName;
    private String professionalTitle;
    private String email;
    private String phone;
    private String linkedinGithub;
    private String profileSummary;
    
    //Education
    private String highestDegree;
    private String institutionName;
    private String graduationYear;
    private String major;
    
    //Experience
    private String jobTitle;
    private String companyName;
    private String duration;
    private String achievements;
    
    //Skills
    private String technicalSkills;
    private String softSkills;
    
    //Zero-argument Constructor
    public CVBean() {}
    
    //Validation logic as required
    public boolean validate() {
      if (fullName == null || fullName.trim().isEmpty()) return false;
      if (email == null || email.trim().isEmpty() || !email.contains("@")) return false;
      if  (highestDegree == null || highestDegree.trim().isEmpty()) return false;
      if (technicalSkills == null || technicalSkills.trim().isEmpty()) return false;
      return true;
    }
    
    //Getters and Setters
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getProfessionalTitle() { return professionalTitle; }
    public void setProfessionalTitle(String professionalTitle) { this.professionalTitle = professionalTitle; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getLinkedinGithub() { return linkedinGithub; }
    public void setLinkedinGithub(String linkedinGithub) { this.linkedinGithub = linkedinGithub; }

    public String getProfileSummary() { return profileSummary; }
    public void setProfileSummary(String profileSummary) { this.profileSummary = profileSummary; }

    public String getHighestDegree() { return highestDegree; }
    public void setHighestDegree(String highestDegree) { this.highestDegree = highestDegree; }

    public String getInstitutionName() { return institutionName; }
    public void setInstitutionName(String institutionName) { this.institutionName = institutionName; }

    public String getGraduationYear() { return graduationYear; }
    public void setGraduationYear(String graduationYear) { this.graduationYear = graduationYear; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public String getJobTitle() { return jobTitle; }
    public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }

    public String getAchievements() { return achievements; }
    public void setAchievements(String achievements) { this.achievements = achievements; }

    public String getTechnicalSkills() { return technicalSkills; }
    public void setTechnicalSkills(String technicalSkills) { this.technicalSkills = technicalSkills; }

    public String getSoftSkills() { return softSkills; }
    public void setSoftSkills(String softSkills) { this.softSkills = softSkills; }
}
