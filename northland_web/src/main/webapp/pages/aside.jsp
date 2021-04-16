<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<style type="text/css">
	aside {
       width: 50px;
		height: 119%;
	}

</style>
<aside class="main-sidebar">
	<!-- sidebar: style can be found in sidebar.less -->
	<section class="sidebar">
		<!-- Sidebar user panel -->
		<div class="user-panel">
			<div class="pull-left image">
				<img src="${pageContext.request.contextPath}/img/user2-160x160.jpg"
					class="img-circle" alt="User Image">
			</div>
			<div class="pull-left info">
				<p>
					<security:authentication property="principal.username"></security:authentication>
				</p>
				<a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
			</div>
		</div>

		<!-- sidebar menu: : style can be found in sidebar.less -->
		<ul class="sidebar-menu" style="height: 100%">
			<li class="header">菜单</li>
			<li id="admin-index"><a
				href="${pageContext.request.contextPath}/pages/main.jsp"><i
					class="fa fa-dashboard"></i> <span>首页</span></a></li>

			<li class="treeview"><a href="#"> <i class="fa fa-cogs"></i>
					<span>系统管理</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>


			</a>
				<ul class="treeview-menu">
					<security:authorize access="hasRole('ADMIN')">
					<li ><a
						href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=10"> <i
							class="fa fa-circle-o"></i> 用户管理
					</a></li>
					<li ><a
						href="${pageContext.request.contextPath}/role/findAll.do?page=1&size=10"> <i
							class="fa fa-circle-o"></i> 角色管理
					</a></li>
					<li ><a
						href="${pageContext.request.contextPath}/permission/findAll.do?page=1&size=10">
							<i class="fa fa-circle-o"></i> 资源权限管理
					</a></li>
					<li ><a
						href="${pageContext.request.contextPath}/sysLog/findAll.do?page=1&size=10"> <i
							class="fa fa-circle-o"></i> 访问日志
					</a></li>
					</a></li>
					</security:authorize>
				</ul>
			</li>
			<li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
					<span>地址修改</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">
					<security:authorize access="hasAnyRole('AddressModification','ADMIN')">
					<li id="system-setting"><a
						href="${pageContext.request.contextPath}/pages/Select.jsp"> <i
							class="fa fa-circle-o"></i> 调拨单与JIT地址修改
					</a>
					</li>
					</security:authorize>
					<security:authorize access="hasAnyRole('CustomerInfo','ADMIN')">
						<li id="system-setting"><a
								href="${pageContext.request.contextPath}/pages/Customer_Infor.jsp"> <i
								class="fa fa-circle-o"></i> 零售顾客信息修改
						</a>
						</li>
					</security:authorize>
				</ul>
			</li>
			<li class="treeview"><a href="#"> <i class="fa fa-cogs"></i>
				<span>货品信息</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">
					<security:authorize access="hasAnyRole('ProductInformation','ADMIN')">
						<li id="system-setting"><a
								href="${pageContext.request.contextPath}/pages/productInformation.jsp"> <i
								class="fa fa-circle-o"></i> 货品信息管理
						</a>
						</li>
					</security:authorize>
				</ul>
			</li>

		</ul>
	</section>
	<!-- /.sidebar -->
</aside>
