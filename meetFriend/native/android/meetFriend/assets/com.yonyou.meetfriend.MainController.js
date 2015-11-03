//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.yonyou.meetfriend.MainController');
com.yonyou.meetfriend.MainController = function() {
    com.yonyou.meetfriend.MainController.initializeBase(this);
    this.initialize();
}
function com$yonyou$meetfriend$MainController$initialize(){
    //you can programing by $ctx API
    //get the context data through $ctx.get()
    //set the context data through $ctx.push(json)
    //set the field of the context through $ctx.put(fieldName, fieldValue)
    //get the parameter of the context through $ctx.param(parameterName)
    //Demo Code:
    //    var str = $ctx.getString();      //获取当前Context对应的字符串
    //    alert($ctx.getString())          //alert当前Context对应的字符串
    //    var json = $ctx.getJSONObject(); //获取当前Context，返回值为json
    //    json["x"] = "a";        //为当前json增加字段
    //    json["y"] = [];           //为当前json增加数组
    //    $ctx.push(json);            //设置context，并自动调用数据绑定
    //    
    //    put方法需手动调用databind()
    //    var x = $ctx.get("x");    //获取x字段值
    //    $ctx.put("x", "b");     //设置x字段值
    //    $ctx.put("x", "b");     //设置x字段值
    //    $ctx.databind();            //调用数据绑定才能将修改的字段绑定到控件上
    //    var p1 = $param.getString("p1");   //获取参数p2的值，返回一个字符串
    //    var p2 = $param.getJSONObject("p2");   //获取参数p3的值，返回一个JSON对象
    //    var p3 = $param.getJSONArray("p3");   //获取参数p1的值，返回一个数组
    
    //your initialize code below...
    
}
    
function com$yonyou$meetfriend$MainController$evaljs(js){
    eval(js)
}
var isopen = false;//定义isopen记录当前侧边栏是否被打开
function com$yonyou$meetfriend$MainController$button0_onclick(sender, args){
	if(isopen){
		$id("slidingviewdefine0").set("openleftview", "false");
	}else{
		$id("slidingviewdefine0").set("openleftview", "true");
	}
	isopen = !isopen;
}
com.yonyou.meetfriend.MainController.prototype = {
    button0_onclick : com$yonyou$meetfriend$MainController$button0_onclick,
    initialize : com$yonyou$meetfriend$MainController$initialize,
    evaljs : com$yonyou$meetfriend$MainController$evaljs
};
com.yonyou.meetfriend.MainController.registerClass('com.yonyou.meetfriend.MainController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
