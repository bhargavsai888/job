package com.example.test.service;

import java.util.List;

import com.example.test.model.Company;

public interface CompanyService {

     void addCompany(Company company);


   List<Company> getAllCompanies();
   boolean updateCompany(Company company, Long id);
  
   boolean deleteCompanyById(Long id);
   Company getCompanyById(Long id);
}
