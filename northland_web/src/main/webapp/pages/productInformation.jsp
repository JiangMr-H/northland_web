<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<!-- 页面meta -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">




<title>货品信息</title>
<%--<meta name="description" content="AdminLTE2定制版">
<meta name="keywords" content="AdminLTE2定制版">--%>




<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"
	name="viewport">

 <%-- <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>--%>


<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/ionicons/css/ionicons.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/iCheck/square/blue.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/morris/morris.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/datepicker/datepicker3.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.theme.default.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/select2/select2.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/adminLTE/css/AdminLTE.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/adminLTE/css/skins/_all-skins.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.skinNice.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/bootstrap-slider/slider.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">
</head>

<body class="hold-transition skin-purple sidebar-mini">

<!-- 页面头部 -->
<jsp:include page="header.jsp"></jsp:include>
<!-- 页面头部 /-->
<!-- 导航侧栏 -->
<jsp:include page="aside.jsp"></jsp:include>

<div class="content-wrapper">
			<!-- 内容头部 -->
			<section class="content-header">
				<h1>
					货品信息 <small>数据列表</small>
				</h1>
			</section>
			<!-- 内容头部 /-->

			<!-- 正文区域 -->
			<section class="content">

				<!-- .box-body -->
				<div class="box box-primary">
					<div class="box-header with-border">
						<h3 class="box-title">列表</h3>
					</div>
					<div class="box-body">
						<!-- 数据表格 -->
						<div class="table-box">
							<!--工具栏-->
							<form action="${pageContext.request.contextPath}/ProductInformation/getAll.do" method="post">
							<div class="pull-left text-center ">
								<div style="width: 80px;margin-top: 5px;float: left;margin-left: 30px">系列：</div>
								<input type="text" class="form-control"  name="billNo" id="SeriesName"
									   placeholder="系列" style="width: 200px; float: left;margin-right: 30px" value="">
								<div style="width: 80px;margin-top: 5px;float: left;margin-left: 30px">款号：</div>
								<input type="text" class="form-control"  name="billNo" id="StyleCode"
									   placeholder="款号" style="width: 200px; float: left;margin-right: 30px" value="">
								<div style="width: 80px;margin-top: 5px;float: left;margin-left: 30px">货品简称：</div>
								<input type="text" class="form-control"  name="billNo" id="MaterialShortName"
									   placeholder="货品简称" style="width: 200px; float: left;margin-right: 30px" value="">
							<%--	<div style="width: 80px;margin-top: 10px;float: left;margin-left: 30px">品牌：</div>
								<div style="width: 80px;margin-top: 10px;float: left;margin-left: 30px">年份：</div>
								<div style="width: 80px;margin-top: 10px;float: left;margin-left: 30px">季节：</div>
								<div style="width: 80px;margin-top: 10px;float: left;margin-left: 30px">性别：</div>
								<div style="width: 80px;margin-top: 10px;float: left;margin-left: 30px">是否滚动款：</div>--%>
							</div>
								<div class="pull-right">
									<div class="form-group form-inline">
										<div class="btn-group">
											<button type="submit"  class="btn btn-default" title="查询" data-toggle="modal" data-target="#exampleModal" data-whatever="@mdo">
												<i class="fa fa-file-o"></i> 查询
											</button>
										</div>
									</div>
								</div>
							</form>

							<!--工具栏/-->

							<!--数据列表-->
							<table id="dataList"
								   class="table table-bordered table-striped table-hover dataTable text-nowrap table-responsive">
								<thead>
								<tr>
									<th class="" style="padding-right: 0px;"><input
											id="selall" type="checkbox" class="icheckbox_square-blue">
									</th>
									<th class="text-center">MaterialCode</th>
									<th class="text-center">货品全称</th>
									<th class="text-center">货号</th>
									<th class="text-center">款号</th>
									<th class="text-center">货品简称</th>
									<th class="text-center">品牌</th>
									<th class="text-center">类别</th>
									<th class="text-center">系列</th>
									<th class="text-center">子系列</th>
									<th class="text-center">项目</th>
									<th class="text-center">主项目</th>
									<th class="text-center">子项目</th>
									<th class="text-center">款型</th>
									<th class="text-center">年份</th>
									<th class="text-center">季节</th>
									<th class="text-center">批发价</th>
									<th class="text-center">零售价</th>
									<th class="text-center">计划成本</th>
									<th class="text-center">货品现值</th>
									<th class="text-center">性别</th>
									<th class="text-center">颜色</th>
									<th class="text-center">单位</th>
									<th class="text-center">上市日期</th>
									<th class="text-center">颜色别名</th>
									<th class="text-center">尺码类别</th>
									<th class="text-center">计提时间</th>
									<th class="text-center">是否滚动款</th>
									<th class="text-center">对应尺码</th>
									<th class="text-center">吊牌价</th>
								</tr>
								</thead>
								<tbody>
								<c:forEach items="${pageInfo.list}" var="productInformation">
									<tr>
										<td><input name="ids" type="checkbox"></td>
										<td>${productInformation.materialCode }</td>
										<td>${productInformation.materialName }</td>
										<td>${productInformation.styleCode }</td>
										<td>${productInformation.materialShortName }</td>
										<td>${productInformation.cardName }</td>
										<td>${productInformation.kindName }</td>
										<td>${productInformation.seriesName }</td>
										<td>${productInformation.subSeries }</td>
										<td>${productInformation.itemName }</td>
										<td>${productInformation.mainProject }</td>
										<td>${productInformation.subItem }</td>
										<td>${productInformation.modelName }</td>
										<td>${productInformation.yearNo }</td>
										<td>${productInformation.seasonName }</td>
										<td>${productInformation.wholePrice }</td>
										<td>${productInformation.retailPrice }</td>
										<td>${productInformation.costPrice }</td>
										<td>${productInformation.nowPrice }</td>
										<td>${productInformation.sexName }</td>
										<td>${productInformation.colorName }</td>
										<td>${productInformation.unitName }</td>
										<td>${productInformation.saleDate }</td>
										<td>${productInformation.colorName2 }</td>
										<td>${productInformation.sizeTypeName }</td>
										<td>${productInformation.sizeSection }</td>
										<td>${productInformation.commodityLevelName }</td>
										<td>${productInformation.correspondingSize }</td>
										<td>${productInformation.quotePrice }</td>
									<%--	<c:if test="${msg!=null }">
											${msg }<br />
										</c:if>--%>
									</tr>
								</c:forEach>
								</tbody>
							</table>
							</div>
							<!--数据列表/-->
						<!-- 数据表格 /-->
					</div>
					<!-- /.box-body -->
					<!-- .box-footer-->
					<div class="box-footer">
						<div class="pull-left">
							<div class="form-group form-inline">
								总共${pageInfo.pages}页，  每页
								<select class="form-control" id="changePageSize" onchange="changePageSize()">
									<option></option>
									<option>5</option>
									<option>10</option>
									<option>15</option>
									<option>20</option>
								</select> 条
							</div>
						</div>

						<div class="box-tools pull-right">
							<ul class="pagination">
								<li><a href="${pageContext.request.contextPath}/ProductInformation/getAll.do?page=1&size=${pageInfo.pageSize}" aria-label="Previous">首页</a></li>
								<li><a href="${pageContext.request.contextPath}/ProductInformation/getAll.do?page=${pageInfo.pageNum-1}&size=${pageInfo.pageSize}">上一页</a></li>
								<%--<c:forEach begin="${pageNum+1}" end="${pageInfo.pageNum+1}" var="pageNum">
									<li><a href="${pageContext.request.contextPath}/ProductInformation/getAll.do?page=${pageNum}&size=${pageInfo.pageSize}">${pageNum}</a></li>
								</c:forEach>--%>
								<li><a href="${pageContext.request.contextPath}/ProductInformation/getAll.do?page=${pageInfo.pageNum+1}&size=${pageInfo.pageSize}">下一页</a></li>
								<li><a href="${pageContext.request.contextPath}/ProductInformation/getAll.do?page=${pageInfo.pages}&size=${pageInfo.pageSize}" aria-label="Next">尾页</a></li>
							</ul>
						</div>
					</div>
					<!-- /.box-footer-->
				</div>
			</section>
</div>
			<!-- 正文区域 /-->
			<!-- 底部侧栏 -->
			<footer class="main-footer">
				<div class="pull-right hidden-xs">
					<b>Version</b> 1.0.8
				</div>
				<strong>Copyright &copy; 2014-2017 <a
						href="http://www.itcast.cn">研究院研发部</a>.
				</strong> All rights reserved.
			</footer>
			<!-- 底部侧栏 /-->

	<script
		src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/jQueryUI/jquery-ui.min.js"></script>
	<script>
		$.widget.bridge('uibutton', $.ui.button);
	</script>
	<script
		src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/raphael/raphael-min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/morris/morris.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/sparkline/jquery.sparkline.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/knob/jquery.knob.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/daterangepicker/moment.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/datepicker/bootstrap-datepicker.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/slimScroll/jquery.slimscroll.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/fastclick/fastclick.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/iCheck/icheck.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/adminLTE/js/app.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/select2/select2.full.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/markdown.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/to-markdown.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/ckeditor/ckeditor.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.extensions.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/datatables/jquery.dataTables.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/chartjs/Chart.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.resize.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.pie.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.categories.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/bootstrap-slider/bootstrap-slider.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js"></script>
	<script>
        function changePageSize() {
            //获取下拉框的值
            var pageSize = $("#changePageSize").val();
            //向服务器发送请求，改变没页显示条数
            location.href = "${pageContext.request.contextPath}/ProductInformation/getAll.do?page=1&size="
                + pageSize;
        }
        $(document).ready(function() {
			// 选择框
			$(".select2").select2();

			// WYSIHTML5编辑器
			$(".textarea").wysihtml5({
				locale : 'zh-CN'
			});
		});

		// 设置激活菜单
		function setSidebarActive(tagUri) {
			var liObj = $("#" + tagUri);
			if (liObj.length > 0) {
				liObj.parent().parent().addClass("active");
				liObj.addClass("active");
			}
		}

		$(document).ready(function() {

			// 激活导航位置
			setSidebarActive("admin-datalist");

			// 列表按钮
			$("#dataList td input[type='checkbox']").iCheck({
				checkboxClass : 'icheckbox_square-blue',
				increaseArea : '20%'
			});
			// 全选操作
			$("#selall").click(function() {
				var clicks = $(this).is(':checked');
				if (!clicks) {
					$("#dataList td input[type='checkbox']").iCheck("uncheck");
				} else {
					$("#dataList td input[type='checkbox']").iCheck("check");
				}
				$(this).data("clicks", !clicks);
			});
		});
	</script>
</body>

</html>
