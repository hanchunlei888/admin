<@override name="view_title">用户中心</@override>
<@override name="view_body">

<div id="toolbar" class="page_toolbar">
    <div class="searchArea ">
        车牌号:
        <input name="s_car_no" id="s_car_no" style="width: 100px;" type="text" class="txt01"/>
        日期:
        <input name="s_start_date" id="s_start_date" style="width: 100px;" type="text"
               class="txt01"/>

        <input name="s_end_date" id="s_end_date" style="width: 100px;" type="text" class="txt01"/>
        区域:
        <input type="text" style="width: 80px;" class="txt01 easyui-combobox" id="s_province"/>
        <input type="text" style="width: 80px;" class="txt01 easyui-combobox" id="s_city"
               data-options="valueField:'id',textField:'text',data:[{id:0,text:'请选择'}]"/>
        不合格项:
        <input name="s_no_qualified" id="s_no_qualified" style="width: 80px;" type="text"
               class="txt01"/>
        车型:
        <input name="s_car_model" id="s_car_model" style="width: 100px;" type="text" class="txt01"/>

        <a id="a_search" href="javascript:void(0);" plain="true" class="easyui-linkbutton"
           icon="icon-search"
           title="查询">查询
        </a>

        <a id="a_export" href="javascript:void(0);" plain="true" class="easyui-linkbutton"
           icon="icon-export"
           title="导出">导出
        </a>
    </div>
    <#--<div class="searchArea ">-->
        <#--司机所属公司:-->
        <#--<input name="s_driver_company" id="s_driver_company" style="width: 80px;" type="text"-->
               <#--class="txt01"/>-->
    <#--</div>-->
    <div class="toolbar_row">
        <a id="a_refresh" class="easyui-linkbutton" style="float:left" plain="true"
           href="javascript:;" icon="icon-reload" title="重新加载">刷新
        </a>
    </div>
</div>
<table id="list"></table>

<form id="form_export" action="" method="post" style="display:hidden;" target="_blank">
    <#--'carNo': carNo,
    'carModel': carModel,
    'driverCompany': driverCompany,
    'noQualified': noQualified,
    'startDate': startDate,
    'endDate': endDate,
    'areaSn': areaSn-->
    <input type="hidden" id="f_carNo" name="carNo" />
    <input type="hidden" id="f_carModel" name="carModel" />
    <input type="hidden" id="f_driverCompany" name="driverCompany" />
    <input type="hidden" id="f_noQualified" name="noQualified" />
    <input type="hidden" id="f_startDate" name="startDate" />
    <input type="hidden" id="f_endDate" name="endDate" />
    <input type="hidden" id="f_areaSn" name="areaSn" />
</form>
</@override>

<@override name="view_scripts">
<script type="text/javascript"
        src="${ctx}/static/js/plugins/moment.min.js"></script>
<script type="text/javascript"
        src="${ctx}/static/js/app/monitoring/history.js?_=${.now?string('yyyyMMddHHmmss')}"></script>
</@override>
<@extends name="/base/main.ftl"></@extends>