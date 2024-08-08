package com.example.test.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.dao.CompanyDao;
import com.example.test.model.Company;
import com.example.test.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService{
   
    @Autowired
   private CompanyDao companyDao;

    @Override
    public void addCompany(Company company) {
         companyDao.addCompany(company);
        
    }

    @Override
    public List<Company> getAllCompanies() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllCompanies'");
    }

    @Override
    public boolean updateCompany(Company company, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCompany'");
    }

    @Override
    public boolean deleteCompanyById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCompanyById'");
    }

    @Override
    public Company getCompanyById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCompanyById'");
    }

//we are calling daoImpl methods and implement logic


}
