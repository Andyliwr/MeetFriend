<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="Login" canvaswidth="375" canvasheight="667" orientation="vertical" controller="LoginController" namespace="com.yonyou.meetfriend">
    <import ref="Login.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <div id="panel0">
            <input id="button0" value="&lt; 登录" class="textbtnclass" type="button"/>
            <label id="label0"/> 
        </div>
        <div id="panel1">
            <image id="image0" scaletype="fitcenter" src="logo.png"/>
            <div id="panel2">
                <image id="image1" scaletype="fitxy" src="username.png"/>
                <input id="textbox0" autofocus="autofocus" maxlength="256" placeholder="username" class="textbtnclass" type="text"/> 
            </div>
            <div id="panel3">
                <image id="image2" scaletype="fitcenter" src="password.png"/>
                <input id="textbox1" maxlength="256" placeholder="password" type="text"/> 
            </div>
            <div id="panel4">
                <input id="checkbox0" type="checkbox" checked="checked"/>
                <label id="label1">下次自动登录</label>
                <div id="panel5">
                    <input id="button2" value="忘记密码？" class="textbtnclass" type="button"/> 
                </div> 
            </div>
            <input id="button1" value="登 录" class="textbtnclass" onclick="this.button1_onclick()" type="button"/>
            <input id="button3" value="还没有账号，立即注册&gt;&gt;" class="textbtnclass" onclick="this.button3_onclick()" type="button"/> 
        </div> 
    </div> 
</window>
