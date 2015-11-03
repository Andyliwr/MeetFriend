//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.yonyou.meetfriend.LoginController');
com.yonyou.meetfriend.LoginController = function() {
    com.yonyou.meetfriend.LoginController.initializeBase(this);
    this.initialize();
}
function com$yonyou$meetfriend$LoginController$initialize(){
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
    
function com$yonyou$meetfriend$LoginController$evaljs(js){
    eval(js)
}
function com$yonyou$meetfriend$LoginController$button1_onclick(sender, args){
	$view.open({
             "viewid" : "com.yonyou.meetfriend.Main",
             "isKeep" : "false",
 	});
}
function com$yonyou$meetfriend$LoginController$button3_onclick(sender, args){
	$view.open({
             "viewid" : "com.yonyou.meetfriend.Register",
             "isKeep" : "false",
 	});
}
com.yonyou.meetfriend.LoginController.prototype = {
    button3_onclick : com$yonyou$meetfriend$LoginController$button3_onclick,
    button1_onclick : com$yonyou$meetfriend$LoginController$button1_onclick,
    initialize : com$yonyou$meetfriend$LoginController$initialize,
    evaljs : com$yonyou$meetfriend$LoginController$evaljs
};
com.yonyou.meetfriend.LoginController.registerClass('com.yonyou.meetfriend.LoginController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
