package com.example.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.test.model.Job;

@Mapper
public interface JobMapper {
     @Insert("insert into job (title,description,maxsalary,minsalary,location,company_id)values(#{title},#{description},#{maxsalary},#{minsalary},#{location},#{company_id})")
     @Options(useGeneratedKeys = true,keyProperty = "id")
    public void createJob(Job job);

    @Select("select *from Job where company_id=#{companyId}")
   List<Job> selectJobsByCompanyId(@Param("companyId") Integer companyId);
}
