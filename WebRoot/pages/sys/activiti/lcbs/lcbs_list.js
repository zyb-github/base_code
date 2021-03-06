$(document).ready(init);

var params = "";
//普通列
var columns =  [
   				[
   				    {field:'name',title:'流程名', width:100, align:'center', sortable:false,formatter:base.datagrid.format_long_char},
   				    {field:'deploymentTime',title:'部署时间', width:100, align:'center', sortable:false,formatter:base.datagrid.format_date_ymd},
   				]
            ];            
//冻结列
var frozenColumns = [[
                    {field:'ck',checkbox:true}, 
                    {field:'seq',title:'序号', width:50, align:'center', sortable:false,formatter:base.datagrid.format_seq},
   				 	{field:'operate',title:'操作列', width:120, align:'center', sortable:false,formatter:base.datagrid.format_base},
   				    {field:'id',title:'流程id', width:100, align:'center', sortable:false},
   				 	]
                 ];

             

function init(){
	queryDataTable(params);  //查询表格数据
}
function queryDataTable(param){
	$('#dataGrid').datagrid(base.datagrid.getDataGrid({ 
		id:'dataGrid',
        title:'流程列表',
        url:getPath('gz/sys/activiti/lcbsAction/lc_list?1'+param),
        columns:columns,
        frozenColumns:frozenColumns
    }));
}
//添加
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}
//编辑
function member_edit(title,id,w,h){
	layer_show(title,'user_edit.jsp?type=view&eventid='+id,w,h);
} 
//查看
function member_show(title,id,w,h){
	layer_show(title,'user_edit.jsp?type=edit&eventid='+id,w,h);
}
//删除
function member_del(obj,id){base.form.del({
	"url":getPath('gz/sys/user/userAction/user_del?userid='+id),
})}	

/* 批量删除 */
$('#del_button').click(function() {
	var eventids = base.datagrid.getSelectField();
	if(eventids){
		member_del(null,eventids);
	}else{
		layer.msg('请选择需要删除的数据',{icon: 5,time:1500});
        return;
	}
})

function search(){
	var d = {};
	var t = $('#search_form').serializeArray();
 
	$.each(t, function() {
		d[this.name] = this.value;
	});
	params = "&strquery=" +encodeURIComponent(encodeURIComponent(JSON.stringify(d)));
	queryDataTable(params);
}
 