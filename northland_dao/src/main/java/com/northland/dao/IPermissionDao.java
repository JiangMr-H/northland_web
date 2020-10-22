package com.northland.dao;

import com.northland.domain.Permission;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IPermissionDao {
    //查询与role关联的所有的权限
    @Select("select * from northland_web_permission where id in (select permissionId from northland_web_role_permission where roleId=#{id} )")
    public List<Permission> findPermissionByRoleId(String id) throws Exception;


    @Select("select * from northland_web_permission ORDER BY id")
    List<Permission> findAll() throws Exception;

    @Insert("insert into northland_web_permission(id,permissionName,url) values(newid(),#{permissionName},#{url})")
    void save(Permission permission) throws Exception;

    @Select("select * from northland_web_permission where id=#{id}")
    Permission findById(String id) throws Exception;

    @Delete("delete from northland_web_role_permission where permissionId=#{id}")
    void deleteFromRole_Permission(String id) throws Exception;

    @Delete("delete from northland_web_permission where id=#{id}")
    void deleteById(String id) throws Exception ;
}
