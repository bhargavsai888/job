package com.example.test.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.test.dao.CompanyDao;
import com.example.test.mapper.CompanyMapper;
import com.example.test.model.Company;


@Repository
public class CompanyDaoImpl implements CompanyDao {

    @Autowired
private CompanyMapper companyMapper;

    @Override
    public void addCompany(Company company) {
       companyMapper.addCompany(company);
        
    }

}
