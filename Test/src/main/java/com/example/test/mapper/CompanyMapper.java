package com.example.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import com.example.test.model.Company;

@Mapper
public interface CompanyMapper {

    @Insert("insert into company (name,description,jobs,reviews)values(#{name},#{description},#{jobs},#{reviews})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    public void addCompany(Company company);

    @Select("slect * from company where id=#{id}")
    @Results(value ={@Result(property="name",column = "name"),
               @Result(property = "description",column = "description"),
               @Result(property = "jobs", javaType = List.class, column = "company_id",
               many=@Many(select="com.example.test.mapper.JobMapper.selectJobsByCompanyId")),
                // @Result(property = "reviews",javaType = List.class,column = "reviews",
                //         many=@Many(select="com.example.test.mapper.JobMapper.selectJobsByCompanyId"))
                    })

              Company getCompanyById(@Param("id")Integer id);



 }
 