package com.northland.dao;

import com.northland.domain.SysLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ISysLogDao {

    @Insert("insert into northland_web_syslog(id,visitTime,username,ip,url,executionTime,method) values(newid(),GETDATE(),#{username},#{ip},#{url},#{executionTime},#{method})")
    public void save(SysLog sysLog) throws Exception;

    @Select("select * from northland_web_sysLog ORDER BY id")
    List<SysLog> findAll() throws Exception;
}
