package com.jobsearch.service;

import com.jobsearch.model.Company;
import com.jobsearch.util.FileUtils;
import java.util.List;

public class CompanyService {
    public List<Company> getCompaniesHiringFreshersInBangalore() {
        // This would typically read from a database or API
        // For demo, we'll use a JSON file
        return FileUtils.loadCompaniesFromJson("src/main/resources/companies.json");
    }
    
    public void displayCompanies(List<Company> companies) {
        System.out.println("\nCompanies Hiring Freshers in Bengaluru:");
        System.out.println("----------------------------------------");
        companies.stream()
            .filter(Company::isHiresFreshers)
            .forEach(company -> {
                System.out.println("Name: " + company.getName());
                System.out.println("Website: " + company.getWebsite());
                System.out.println("Careers Page: " + company.getCareersPage());
                System.out.println("----------------------------------------");
            });
    }
}
