<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="Main" canvaswidth="375" canvasheight="667" orientation="vertical" controller="MainController" namespace="com.yonyou.meetfriend">
    <import ref="Main.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <div id="panel0">
            <slidingView id="slidingviewdefine0" visible="false" mainView="mainsvpanel" leftView="leftvspanel" rightView="sv_panel2">
                <div id="leftvspanel">
                    <div id="panel7">
                        <div id="panel8">
                            <input id="imagebutton0" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                            <input id="button1" value="登录" class="textbtnclass" type="button"/>
                            <label id="label1">&gt;</label> 
                        </div>
                        <div id="panel9">
                            <image id="image0" scaletype="fitcenter" src="dongtai.png"/>
                            <label id="label2" visible="false">shadasasda</label> 
                        </div>
                        <div id="panel10">
                            <image id="image1" scaletype="fitcenter" src="rili.png"/>
                            <input id="button2" value="好友有约" class="textbtnclass" type="button"/>
                            <label id="label3">&gt;</label> 
                        </div>
                        <div id="panel11"/> 
                    </div> 
                </div>
                <div id="mainsvpanel">
                    <div id="panel4">
                        <div id="panel1">
                            <input id="button0" class="textbtnclass" onclick="this.button0_onclick()" type="button"/>
                            <label id="label0">MeetFriend</label> 
                        </div>
                        <input id="textbox0" maxlength="256" placeholder="文本输入框" type="text"/>
                        <input id="textbox1" maxlength="256" placeholder="文本输入框" type="text"/> 
                    </div> 
                </div>
                <div id="sv_panel3"/> 
            </slidingView> 
        </div> 
    </div> 
</window>
