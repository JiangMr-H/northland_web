package com.northland.dao;

import com.northland.domain.Permission;
import com.northland.domain.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IRoleDao {

    /**
     * 通过用户的id查出所有对应的角色
     * @param userId
     * @return
     */
    @Select("select * from northland_web_role where id in (select roleId from northland_web_users_role where userId=#{userId})")
    public List<Role> findRoleByUserId(String userId);

    @Select("select * from northland_web_role ORDER BY id")
    List<Role> findAll() throws Exception;

    @Insert("insert into northland_web_role(id,roleName,roleDesc) values(newId(),#{roleName},#{roleDesc})")
    void save(Role role);

    @Select("select * from northland_web_role where id=#{roleId}")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "roleName",column = "roleName"),
            @Result(property = "roleDesc",column = "roleDesc"),
            @Result(property = "permissions",column = "id",javaType = java.util.List.class,many = @Many(select = "com.northland.dao.IPermissionDao.findPermissionByRoleId"))
    })
    Role findById(String roleId);

    @Select("select * from northland_web_permission where id not in (select permissionId from northland_web_role_permission where roleId=#{roleId})")
    List<Permission> findOtherPermissions(String roleId);

    @Insert("insert into northland_web_role_permission(roleId,permissionId) values(#{roleId},#{permissionId})")
    void addPermissionToRole(@Param("roleId") String roleId, @Param("permissionId") String permissionId);

    @Delete("delete from northland_web_users_role where roleId=#{roleId}")
    void deleteFromUser_RoleByRoleId(String roleId);
    @Delete("delete from northland_web_role_permission where roleId=#{roleId}")
    void deleteFromRole_PermissionByRoleId(String roleId);

    @Delete("delete from northland_web_role where id=#{roleId}")
    void deleteRoleById(String roleId);


}
