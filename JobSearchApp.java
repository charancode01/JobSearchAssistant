package com.jobsearch;

import com.jobsearch.model.Company;
import com.jobsearch.service.CompanyService;
import com.jobsearch.service.ResumeService;
import java.util.List;

public class JobSearchApp {
    public static void main(String[] args) {
        CompanyService companyService = new CompanyService();
        ResumeService resumeService = new ResumeService();
        
        // Get companies hiring freshers in Bangalore
        List<Company> companies = companyService.getCompaniesHiringFreshersInBangalore();
        companyService.displayCompanies(companies);
        
        // Generate resume
        resumeService.generateResume("src/main/resources/resume_template.md", "MyResume.pdf");
        
        System.out.println("\nResume generated successfully!");
    }
}
