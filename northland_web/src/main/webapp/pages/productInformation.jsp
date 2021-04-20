<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">


    <title>货品信息</title>
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"
            name="viewport">



   <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/ionicons/css/ionicons.min.css">
<%--    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/iCheck/square/blue.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/morris/morris.css">--%>
  <%--  <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/datepicker/datepicker3.css">--%>
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

<%--   <link href="../style/select/dist/css/bootstrap-select.min.css" rel="stylesheet" />--%>
    <%--<link
            href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>--%>
  <%--  <script
            src="${pageContext.request.contextPath}/style/select/js/bootstrap-select.js"></script>--%>
<%--    <script
            src="${pageContext.request.contextPath}/style/select/dist/css/bootstrap-select.css"></script>--%>
    <script
            src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
   <%-- <script
            src="${pageContext.request.contextPath}/style/select/js/bootstrap-select.js"></script>--%>
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
    <section class="content" style="height: 800px">

        <!-- .box-body -->
        <div class="box box-primary"  style="height: 100%">
            <div class="box-header with-border">
                <h3 class="box-title">列表</h3>
            </div>
            <div class="box-body" style="height: 100%" >
                <!-- 数据表格 -->
                <div class="table-box">
                    <!--工具栏-->
                  <%--  <form action="${pageContext.request.contextPath}/ProductInformation/getAll.do?SeriesName=${SeriesName}&StyleCode=${StyleCode}
                                    &MaterialShortName=${MaterialShortName}&brand=${brand}&yearNo=${yearNo}&seasonName=${seasonName}&sexName=${sexName}
                                    &selectpicker=${selectpicker}" method="post">--%>
                    <form name="form">
                        <div class="pull-left text-center ">
                            <div style="width: 80px;margin-top: 5px;float: left; padding-left: 20px;">系列：</div>
                            <input type="text" class="form-control" name="SeriesName" id="SeriesName"
                                   placeholder="系列" style="width: 160px; height: 30px; float: left;font-size: 12px;">

                            <div style="width: 80px;margin-top: 5px;float: left; padding-left: 20px;">款号：</div>
                            <input type="text" class="form-control" name="StyleCode" id="StyleCode"
                                   placeholder="款号" style="width: 160px; height: 30px; float: left; font-size: 12px;">

                            <div style="width: 80px;margin-top: 5px;float: left; margin-left: 20px">货品简称：</div>
                            <input type="text" class="form-control" name="MaterialShortName" id="MaterialShortName"
                                   placeholder="货品简称" style="width: 160px; height: 30px; float: left; font-size: 12px;" value="">

                            <div style="width: 80px;margin-top: 5px;float: left;padding-left: 20px">品牌：</div>
                            <select id="brand" class="selectpicker" multiple onmousedown="if(this.options.length>6){this.size=7}" onblur="this.size=0" onchange="this.size=0"
                                    style="width: 160px; height: 30px; float: left; font-size: 12px;" name="brand" data-actions-box="true"
                                    data-selected-text-format="count > 3">
                                <option>LOWA</option>
                                <option>ALPINA</option>
                                <option>KJUS</option>
                                <option>ZANIER</option>
                                <option>NORTHLAND</option>
                                <option>LIDAKIS</option>
                                <option>ACTIONFOX</option>
                                <option>POC</option>
                                <option>HALTI</option>
                                <option>特卖</option>
                                <option>LEKI滑雪</option>
                                <option>TRECKO</option>
                                <option>VAUHTI</option>
                                <option>VIAGPRO</option>
                                <option>LEVEL</option>
                                <option>NATURE URBAN</option>
                                <option>OTHER</option>
                                <option>LEKI徒步</option>
                                <option>HEAD</option>
                                <option>NORTHLAND.KIDS</option>
                            </select>
                            <br/>
                           <%-- <div style="width: 80px;margin: 10px;float: left; padding-left: 15px;margin-top: 20px">年份：</div>--%>
                            <select id="yearNo" name="yearNo" class="selectpicker" multiple style="margin: 20px" multiple title="年份" data-actions-box="true">
                                <option>2004</option>
                                <option>2010</option>
                                <option>2007</option>
                                <option>2021</option>
                                <option>2013</option>
                                <option>2008</option>
                                <option>2002</option>
                                <option>2016</option>
                                <option>2005</option>
                                <option>2019</option>
                                <option>2020</option>
                                <option>2014</option>
                                <option>2003</option>
                                <option>2011</option>
                                <option>2017</option>
                                <option>2006</option>
                                <option>2012</option>
                                <option>2018</option>
                                <option>2009</option>
                                <option>2015</option>
                            </select>
                          <%-- <div style="width: 80px;margin: 10px;float: left;padding-left: 15px;margin-top: 20px">季节：</div>--%>
                            <select id="seasonName" name="seasonName" class="selectpicker" multiple  title="季节" data-selected-text-format="count > 3" data-actions-box="true"
                                    style="width: 120px; height: 30px; float: left;font-size: 12px; padding-right: 30px;margin-top: 15px">
                                <option>Q1</option>
                                <option>Q2</option>
                                <option>Q3</option>
                                <option>春夏</option>
                                <option>秋冬</option>
                            </select>

                         <%--   <div style="width: 80px;margin: 10px;float: left;padding-left: 30px;margin-top: 20px">性别：</div>--%>
                            <select id="sexName" name="sexName" class="selectpicker" multiple title="性别" data-selected-text-format="count > 3" data-actions-box="true"
                                    style="width: 120px; height: 30px; float: left;font-size: 12px; padding-right: 30px;margin-top: 15px" >
                                <option>男子</option>
                                <option>女童</option>
                                <option>男</option>
                                <option>男童</option>
                                <option>男女通用</option>
                                <option>女</option>
                                <option>儿童</option>
                                <option>女子</option>
                                <option>中性</option>
                            </select>

                         <%--   <div style="width: 80px;float: left;padding-left: 25px;margin-top: 20px">滚动：</div>--%>
                            <select class="selectpicker" multiple title="滚动" data-actions-box="true"
                                    style="width: 120px; height: 30px; float: left;font-size: 12px; margin-right: 25px;margin-top: 15px" id="commoditylevelname" name="commoditylevelname">
                                <option>非滚动</option>
                                <option>滚动</option>
                            </select>

                        </div>
                        <div class="pull-right">
                            <div class="form-group form-inline">
                                <div class="btn-group">                                                               <%--onclick="fun()--%>
                                    <button type="submit" class="btn bg-olive btn-xs" title="查询" data-toggle="modal" onclick="find()"
                                            data-target="#exampleModal" data-whatever="@mdo">
                                        <i class="fa fa-file-o"></i> 查询
                                    </button>
                                    <button type="button" class="btn bg-olive btn-xs"
                                            onclick="location.href='${pageContext.request.contextPath}/ProductInformation/ExportExcel.do'">导出</button>
                                </div>
                            </div>
                        </div>
                    </form>


                    <!--工具栏/-->
                    <div style="width:100%; height: 600px; overflow:scroll;">
                        <!--数据列表-->
                        <table id="dataList"
                               class="table table-bordered table-striped table-hover dataTable text-nowrap table-responsive">
                            <thead>
                            <tr>
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
                                    <td>${productInformation.materialCode1 }</td>
                                    <td>${productInformation.materialName }</td>
                                    <td>${productInformation.materialCode2 }</td>
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
                </div>
                <!--数据列表/-->
                <!-- 数据表格 /-->
            </div>
            <!-- /.box-body -->
            <!-- .box-footer-->
            <%--<div class="box-footer">
                <div class="pagination pull-left">
                    <div class="form-group form-inline">
                        总共${pageInfo.pages}页， 每页
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
                        <li>
                            <a href="${pageContext.request.contextPath}/ProductInformation/findPage.do?page=1&size=${pageInfo.pageSize}"
                               aria-label="Previous">首页</a></li>
                        <li>
                            <a href="${pageContext.request.contextPath}/ProductInformation/findPage.do?page=${pageInfo.pageNum-1}&size=${pageInfo.pageSize}">上一页</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/ProductInformation/findPage.do?page=${pageInfo.pageNum+1}&size=${pageInfo.pageSize}">下一页</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/ProductInformation/findPage.do?page=${pageInfo.pages}&size=${pageInfo.pageSize}"
                               aria-label="Next">尾页</a></li>
                    </ul>
                </div>
            </div>--%>
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

<script type="text/javascript">
    function find()
    {
        var strBrand=[];
        var objBrand = document.getElementById("brand");
        for(var i=0;i<objBrand.options.length;i++){
            if(objBrand.options[i].selected){
                strBrand.push(objBrand.options[i].value);// 收集选中项
            }
        }
        $("#brand").val(strBrand);
        console.log(strBrand)

        var strYearNo=[];
        var objYearNo = document.getElementById("yearNo");
        for(var i=0;i<objYearNo.options.length;i++){
            if(objYearNo.options[i].selected){
                strYearNo.push(objYearNo.options[i].value);// 收集选中项
            }
        }
        $("#yearNo").val(strYearNo);
        console.log(strYearNo)

        var strSeasonName=[];
        var objSeasonName = document.getElementById("seasonName");
        for(var i=0;i<objSeasonName.options.length;i++){
            if(objSeasonName.options[i].selected){
                strSeasonName.push(objSeasonName.options[i].value);// 收集选中项
            }
        }
        $("#seasonName").val(strSeasonName);
        console.log(strSeasonName)

        var strSexName=[];
        var objSexName = document.getElementById("sexName");
        for(var i=0;i<objSexName.options.length;i++){
            if(objSexName.options[i].selected){
                strSexName.push(objSexName.options[i].value);// 收集选中项
            }
        }
        $("#sexName").val(strSexName);
        console.log(strSexName)

        var strcommoditylevelname=[];
        var objstrcommoditylevelname = document.getElementById("commoditylevelname");
        for(var i=0;i<objstrcommoditylevelname.options.length;i++){
            if(objstrcommoditylevelname.options[i].selected){
                strcommoditylevelname.push(objstrcommoditylevelname.options[i].value);// 收集选中项
            }
        }
        $("#commoditylevelname").val(strcommoditylevelname);
        console.log(strcommoditylevelname)

        $.ajax
        ({
            url: "${pageContext.request.contextPath}/ProductInformation/getAll.do",
            dataType: "json",
            type: "POST",
            data: {
                'SeriesName': $("#SeriesName").val(),
                'StyleCode': $("#StyleCode").val(),
                'MaterialShortName': $("#MaterialShortName").val(),
/*              'brand': JSON.stringify(strBrand),
                'yearNo': JSON.stringify(strYearNo),
                'seasonName': JSON.stringify(strSeasonName),
                'sexName': JSON.stringify(strSexName),
                'commoditylevelname': JSON.stringify(strcommoditylevelname)*/
            },
            success:function(data){
                console.log(data);
                alert('success');

                // 用一个变量接收返回来的list集合（vendorList）
                var operatorData=data.vendorList;
//循环这个接收集合的变量
                for(var i=0;i< operatorData.length;i++){
//将需要在输入框展示的值 拼接出来，并用一个变量接收
                    var opt='<option value="'+operatorData[i].id+'" >'+operatorData[i].vendorname+'</option>'
//将这个变量插入在id为operator的结尾处
                    $("#dataList").append(opt);
                }

                console.log(res);  //在console中查看数据
            },
            error:function(){
                alert('failed!');
            },
        });
    }
</script>

<script type="text/JavaScript">
    function fun(){

        var strBrand=[];
        var objBrand = document.getElementById("brand");
        for(var i=0;i<objBrand.options.length;i++){
            if(objBrand.options[i].selected){
                strBrand.push(objBrand.options[i].value);// 收集选中项
            }
        }
        $("#brand").val(strBrand);
        console.log(strBrand)

        var strYearNo=[];
        var objYearNo = document.getElementById("yearNo");
        for(var i=0;i<objYearNo.options.length;i++){
            if(objYearNo.options[i].selected){
                strYearNo.push(objYearNo.options[i].value);// 收集选中项
            }
        }
        $("#yearNo").val(strYearNo);
        console.log(strYearNo)


        var strSeasonName=[];
        var objSeasonName = document.getElementById("seasonName");
        for(var i=0;i<objSeasonName.options.length;i++){
            if(objSeasonName.options[i].selected){
                strSeasonName.push(objSeasonName.options[i].value);// 收集选中项
            }
        }
        $("#seasonName").val(strSeasonName);
        console.log(strSeasonName)


        var strSexName=[];
        var objSexName = document.getElementById("sexName");
        for(var i=0;i<objSexName.options.length;i++){
            if(objSexName.options[i].selected){
                strSexName.push(objSexName.options[i].value);// 收集选中项
            }
        }
        $("#sexName").val(strSexName);
        console.log(strSexName)


        var strcommoditylevelname=[];
        var objstrcommoditylevelname = document.getElementById("commoditylevelname");
        for(var i=0;i<objstrcommoditylevelname.options.length;i++){
            if(objstrcommoditylevelname.options[i].selected){
                strcommoditylevelname.push(objstrcommoditylevelname.options[i].value);// 收集选中项
            }
        }
        $("#commoditylevelname").val(strcommoditylevelname);
        console.log(strcommoditylevelname)


    }
</script>
<script
        src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/jQueryUI/jquery-ui.min.js"></script>
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
<%--<script
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
        src="${pageContext.request.contextPath}/plugins/datepicker/bootstrap-datepicker.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/slimScroll/jquery.slimscroll.min.js"></script>--%>
<%--<script
        src="${pageContext.request.contextPath}/plugins/fastclick/fastclick.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/iCheck/icheck.min.js"></script>--%>
<script
        src="${pageContext.request.contextPath}/plugins/adminLTE/js/app.min.js"></script>
<%--<script
        src="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/select2/select2.full.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>--%>

<%--<script
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
        src="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>--%>
<%--<script--%>
<%--        src="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js"></script>--%>
<link href="../style/select/dist/css/bootstrap-select.min.css" rel="stylesheet" />
<link
        href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>

<%--<script
        src="${pageContext.request.contextPath}/style/select/js/bootstrap-select.js"></script>--%>


<%--<script
        src="${pageContext.request.contextPath}/style/select/dist/css/bootstrap-select.css"></script>--%>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
<script
        src="${pageContext.request.contextPath}/style/select/js/bootstrap-select.js"></script>
<link rel="stylesheet"
      href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css">

<script>
    function changePageSize() {
        //获取下拉框的值
        var pageSize = $("#changePageSize").val();
        //向服务器发送请求，改变没页显示条数
        location.href = "${pageContext.request.contextPath}/ProductInformation/findPage.do?page=1&size="
            + pageSize;
    }

   /*  $(document).ready(function () {
        // 选择框
        $(".select2").select2();

        // WYSIHTML5编辑器
        $(".textarea").wysihtml5({
            locale: 'zh-CN'
        });
    });*/

    // 设置激活菜单
    function setSidebarActive(tagUri) {
        var liObj = $("#" + tagUri);
        if (liObj.length > 0) {
            liObj.parent().parent().addClass("active");
            liObj.addClass("active");
        }
    }

    $(document).ready(function () {

        // 激活导航位置
        setSidebarActive("admin-datalist");

        // 列表按钮
      /*  $("#dataList td input[type='checkbox']").iCheck({
            checkboxClass: 'icheckbox_square-blue',
            increaseArea: '20%'
        });*/
        // 全选操作
        /*$(".selall").click(function () {
            var clicks = $(this).is(':checked');
            if (!clicks) {
                $("#dataList td input[type='checkbox']").iCheck("uncheck");
            } else {
                $("#dataList td input[type='checkbox']").iCheck("check");
            }
            $(this).data("clicks", !clicks);
        });*/
    });

    $('.selectpicker').selectpicker({
        'selectedText':'cat',
        'noneSelectedText':'请选择',
        'deselectAllText':'全不选',
        'selectAllText': '全选',
    });
    $('.year').selectpicker({
        'selectedText':'cat',
        'noneSelectedText':'请选择',
        'deselectAllText':'全不选',
        'selectAllText': '全选',
    })

</script>
</body>

</html>
