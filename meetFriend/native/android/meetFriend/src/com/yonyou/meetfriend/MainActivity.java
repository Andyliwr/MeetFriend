package com.yonyou.meetfriend;

import com.yonyou.uap.um.application.ApplicationContext;
import com.yonyou.uap.um.base.*;
import com.yonyou.uap.um.common.*;
import com.yonyou.uap.um.third.*;
import com.yonyou.uap.um.control.*;
import com.yonyou.uap.um.core.*;
import com.yonyou.uap.um.binder.*;
import com.yonyou.uap.um.runtime.*;
import com.yonyou.uap.um.lexer.*;
import com.yonyou.uap.um.widget.*;
import com.yonyou.uap.um.widget.UmpSlidingLayout.SlidingViewType;
import com.yonyou.uap.um.log.ULog;
import java.util.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.webkit.*;
import android.content.*;
import android.graphics.*;
import android.widget.ImageView.ScaleType;

public abstract class MainActivity extends UMWindowActivity {

	protected UMWindow Main = null;
protected XVerticalLayout viewPage0 = null;
protected XVerticalLayout panel0 = null;
protected UmpSlidingLayout slidingviewdefine0 = null;
protected UmpSlidingLinearLayout leftvspanel = null;
protected XVerticalLayout panel7 = null;
protected XHorizontalLayout panel8 = null;
protected UMImageButton imagebutton0 = null;
protected UMButton button1 = null;
protected UMLabel label1 = null;
protected XHorizontalLayout panel9 = null;
protected UMImage image0 = null;
protected UMLabel label2 = null;
protected XHorizontalLayout panel10 = null;
protected UMImage image1 = null;
protected UMButton button2 = null;
protected UMLabel label3 = null;
protected XHorizontalLayout panel11 = null;
protected UmpSlidingLinearLayout mainsvpanel = null;
protected XVerticalLayout panel4 = null;
protected XHorizontalLayout panel1 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMTextbox textbox0 = null;
protected UMTextbox textbox1 = null;
protected UmpSlidingLinearLayout sv_panel3 = null;

	
	protected final static int ID_MAIN = 325859966;
protected final static int ID_VIEWPAGE0 = 2135991766;
protected final static int ID_PANEL0 = 437215669;
protected final static int ID_SLIDINGVIEWDEFINE0 = 1952828106;
protected final static int ID_LEFTVSPANEL = 1031108658;
protected final static int ID_PANEL7 = 1261873459;
protected final static int ID_PANEL8 = 1589821447;
protected final static int ID_IMAGEBUTTON0 = 1221580434;
protected final static int ID_BUTTON1 = 1940272964;
protected final static int ID_LABEL1 = 726149632;
protected final static int ID_PANEL9 = 283667845;
protected final static int ID_IMAGE0 = 201419438;
protected final static int ID_LABEL2 = 2065770175;
protected final static int ID_PANEL10 = 1956627313;
protected final static int ID_IMAGE1 = 1027566711;
protected final static int ID_BUTTON2 = 1188812072;
protected final static int ID_LABEL3 = 1889265737;
protected final static int ID_PANEL11 = 1223054523;
protected final static int ID_MAINSVPANEL = 626193540;
protected final static int ID_PANEL4 = 862500050;
protected final static int ID_PANEL1 = 1712757212;
protected final static int ID_BUTTON0 = 236123523;
protected final static int ID_LABEL0 = 164481097;
protected final static int ID_TEXTBOX0 = 146288132;
protected final static int ID_TEXTBOX1 = 624761160;
protected final static int ID_SV_PANEL3 = 1985583173;

	
	
	@Override
	public String getControllerName() {
		return "MainController";
	}
	
	@Override
	public String getContextName() {
		return "";
	}

	@Override
	public String getNameSpace() {
		return "com.yonyou.meetfriend";
	}

	protected void onCreate(Bundle savedInstanceState) {
		ULog.logLC("onCreate", this);
		super.onCreate(savedInstanceState);
        onInit(savedInstanceState);
        
	}
	
	@Override
	protected void onStart() {
		ULog.logLC("onStart", this);
		
		super.onStart();
	}

	@Override
	protected void onRestart() {
		ULog.logLC("onRestart", this);
		
		super.onRestart();
	}

	@Override
	protected void onResume() {
		ULog.logLC("onResume", this);
		
		super.onResume();
	}

	@Override
	protected void onPause() {
		ULog.logLC("onPause", this);
		
		super.onPause();
	}

	@Override
	protected void onStop() {
		ULog.logLC("onStop", this);
		
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		ULog.logLC("onDestroy", this);
		
		super.onDestroy();
	}
	
	public  void onInit(Bundle savedInstanceState) {
		ULog.logLC("onInit", this);
		UMActivity context = this;
		registerControl();
		this.getContainer();
		
		/*
		 new Thread() {
			 public void run() {
				 UMPDebugClient.startServer();
			 }
		 }.start();
		*/
		String sys_debug = ApplicationContext.getCurrent(this).getValue("sys_debug");
		if (sys_debug != null && sys_debug.equalsIgnoreCase("true")) {
			UMPDebugClient.waitForDebug();
		}

		IBinderGroup binderGroup = this;
		currentPage = getCurrentWindow(context, binderGroup);
super.setContentView(currentPage);

		
	}
	
	private void registerControl() {
		  idmap.put("Main",ID_MAIN);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("slidingviewdefine0",ID_SLIDINGVIEWDEFINE0);
  idmap.put("leftvspanel",ID_LEFTVSPANEL);
  idmap.put("panel7",ID_PANEL7);
  idmap.put("panel8",ID_PANEL8);
  idmap.put("imagebutton0",ID_IMAGEBUTTON0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("label1",ID_LABEL1);
  idmap.put("panel9",ID_PANEL9);
  idmap.put("image0",ID_IMAGE0);
  idmap.put("label2",ID_LABEL2);
  idmap.put("panel10",ID_PANEL10);
  idmap.put("image1",ID_IMAGE1);
  idmap.put("button2",ID_BUTTON2);
  idmap.put("label3",ID_LABEL3);
  idmap.put("panel11",ID_PANEL11);
  idmap.put("mainsvpanel",ID_MAINSVPANEL);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("textbox0",ID_TEXTBOX0);
  idmap.put("textbox1",ID_TEXTBOX1);
  idmap.put("sv_panel3",ID_SV_PANEL3);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		
	}
	
	public void onDatabinding() {
		ULog.logLC("onDatabinding", this);
		super.onDatabinding();
		
	}
	
	@Override
	public void onReturn(String methodName, Object returnValue) {
		
	}

	@Override
	public void onAfterInit() {
		ULog.logLC("onAfterInit", this);
		
		onLoad();
	}
	
		@Override
	public Map<String,String> getPlugout(String id) {
		XJSON from = this.getUMContext();
		Map<String,String> r = super.getPlugout(id);
		
		return r;	
	}
	
	
	
	public View getPanel8View(final UMActivity context,IBinderGroup binderGroup) {
panel8 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL8
,"border-bottom-width","2"
,"halign","LEFT"
,"height","80"
,"layout-type","vbox"
,"width","fill"
,"valign","center"
,"border-bottom-color","#bfffff"
);
imagebutton0 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON0
,"halign","center"
,"width","60"
,"icon-width","50"
,"istogglebutton","false"
,"font-pressed-color","#00a1ea"
,"imagebuttontype","icon"
,"icon-height","50"
,"height","60"
,"color","#919191"
,"layout-type","hbox"
,"font-size","10"
,"margin-left","10"
,"icon-background-image","manzu.png"
,"value","图标名称"
,"icon-pressed-image","button_image_touch"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
panel8.addView(imagebutton0);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","center"
,"widthwrap","36.0"
,"width","wrap"
,"font-pressed-color","#459dfe"
,"height","44"
,"color","#ffffff"
,"font-size","17"
,"layout-type","hbox"
,"value","登录"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
panel8.addView(button1);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"content",">"
,"halign","right"
,"height","fill"
,"color","#ffffff"
,"layout-type","hbox"
,"font-size","20"
,"width","fill"
,"font-family","default"
,"font-weight","bold"
,"valign","center"
);
panel8.addView(label1);

return panel8;
}
public View getPanel9View(final UMActivity context,IBinderGroup binderGroup) {
panel9 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL9
,"border-bottom-width","2"
,"halign","LEFT"
,"height","25"
,"layout-type","vbox"
,"width","fill"
,"valign","center"
,"border-bottom-color","#bfffff"
);
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","18"
,"layout-type","hbox"
,"width","18"
,"margin-left","20"
,"scaletype","fitcenter"
,"src","dongtai.png"
);
panel9.addView(image0);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"content","shadasasda"
,"halign","left"
,"height","20"
,"visible","false"
,"color","#ffffff"
,"layout-type","hbox"
,"font-size","11"
,"width","fill"
,"margin-left","5"
,"font-family","default"
,"valign","center"
);
panel9.addView(label2);

return panel9;
}
public View getPanel10View(final UMActivity context,IBinderGroup binderGroup) {
panel10 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL10
,"halign","LEFT"
,"height","40"
,"layout-type","vbox"
,"background","#8000ff"
,"width","fill"
,"margin-top","10"
,"valign","center"
);
image1 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE1
,"height","30"
,"layout-type","hbox"
,"width","30"
,"margin-left","20"
,"scaletype","fitcenter"
,"src","rili.png"
);
panel10.addView(image1);
button2 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON2
,"halign","center"
,"widthwrap","64.0"
,"width","wrap"
,"font-pressed-color","#459dfe"
,"height","40"
,"color","#ffffff"
,"font-size","15"
,"layout-type","hbox"
,"value","好友有约"
,"margin-left","5"
,"font-family","default"
,"valign","center"
);
panel10.addView(button2);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"content",">"
,"halign","right"
,"height","fill"
,"color","#ffffff"
,"layout-type","hbox"
,"font-size","20"
,"width","fill"
,"font-family","default"
,"valign","center"
);
panel10.addView(label3);

return panel10;
}
public View getPanel7View(final UMActivity context,IBinderGroup binderGroup) {
panel7 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL7
,"halign","left"
,"height","fill"
,"layout-type","vbox"
,"background","#8000ff"
,"width","fill"
,"valign","TOP"
);
View panel8 = (View) getPanel8View((UMActivity)context,binderGroup);
panel7.addView(panel8);
View panel9 = (View) getPanel9View((UMActivity)context,binderGroup);
panel7.addView(panel9);
View panel10 = (View) getPanel10View((UMActivity)context,binderGroup);
panel7.addView(panel10);
panel11 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL11
,"halign","LEFT"
,"height","60.0"
,"layout-type","vbox"
,"background","#8000ff"
,"width","120.0"
,"valign","center"
);
panel7.addView(panel11);

return panel7;
}
public View getLeftvspanelView(final UMActivity context,IBinderGroup binderGroup) {
leftvspanel = (UmpSlidingLinearLayout)ThirdControl.createControl(new UmpSlidingLinearLayout(context),ID_LEFTVSPANEL
,"halign","left"
,"height","fill"
,"layout-type","vbox"
,"layout","vbox"
,"width","fill"
,"valign","TOP"
,"slidingtype","left"
);
View panel7 = (View) getPanel7View((UMActivity)context,binderGroup);
leftvspanel.addView(panel7);

return leftvspanel;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup) {
panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL1
,"halign","LEFT"
,"height","50"
,"layout-type","vbox"
,"background","#04abfa"
,"width","fill"
,"valign","center"
);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"halign","center"
,"width","29"
,"font-pressed-color","#459dfe"
,"height","25"
,"color","#00a1ea"
,"font-size","17"
,"layout-type","hbox"
,"margin-left","10"
,"onclick","action:button0_onclick"
,"font-family","default"
,"valign","center"
,"background-image","chouti.png"
);
panel1.addView(button0);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"content","MeetFriend"
,"halign","center"
,"height","25"
,"widthwrap","82.0"
,"color","#000000"
,"layout-type","hbox"
,"font-size","14"
,"width","wrap"
,"font-family","sans"
,"valign","center"
);
panel1.addView(label0);

return panel1;
}
public View getPanel4View(final UMActivity context,IBinderGroup binderGroup) {
panel4 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL4
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"background","#ffffff"
,"width","fill"
,"valign","TOP"
);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup);
panel4.addView(panel1);
textbox0 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX0
,"padding-left","4"
,"halign","LEFT"
,"height","44"
,"maxlength","256"
,"color","#167ef8"
,"placeholder","文本输入框"
,"layout-type","vbox"
,"font-size","17"
,"background","#ffffff"
,"width","200"
,"font-family","default"
);
panel4.addView(textbox0);
textbox1 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX1
,"padding-left","4"
,"halign","LEFT"
,"height","44"
,"maxlength","256"
,"color","#167ef8"
,"placeholder","文本输入框"
,"layout-type","vbox"
,"font-size","17"
,"background","#ffffff"
,"width","200"
,"font-family","default"
);
panel4.addView(textbox1);

return panel4;
}
public View getMainsvpanelView(final UMActivity context,IBinderGroup binderGroup) {
mainsvpanel = (UmpSlidingLinearLayout)ThirdControl.createControl(new UmpSlidingLinearLayout(context),ID_MAINSVPANEL
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"layout","vbox"
,"width","fill"
,"valign","TOP"
,"slidingtype","main"
);
View panel4 = (View) getPanel4View((UMActivity)context,binderGroup);
mainsvpanel.addView(panel4);

return mainsvpanel;
}
public View getSlidingviewdefine0View(final UMActivity context,IBinderGroup binderGroup) {
slidingviewdefine0 = (UmpSlidingLayout)ThirdControl.createControl(new UmpSlidingLayout(context),ID_SLIDINGVIEWDEFINE0
,"halign","center"
,"height","fill"
,"visible","false"
,"layout-type","vbox"
,"layout","vbox"
,"width","fill"
,"mainview","mainsvpanel"
,"leftview","leftvspanel"
,"valign","TOP"
,"rightview","sv_panel2"
);
View leftvspanel = (View) getLeftvspanelView((UMActivity)context,binderGroup);
slidingviewdefine0.addView(leftvspanel);
View mainsvpanel = (View) getMainsvpanelView((UMActivity)context,binderGroup);
slidingviewdefine0.addView(mainsvpanel);
sv_panel3 = (UmpSlidingLinearLayout)ThirdControl.createControl(new UmpSlidingLinearLayout(context),ID_SV_PANEL3
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"layout","vbox"
,"width","fill"
,"valign","TOP"
);
slidingviewdefine0.addView(sv_panel3);

return slidingviewdefine0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"width","fill"
,"valign","TOP"
);
View slidingviewdefine0 = (View) getSlidingviewdefine0View((UMActivity)context,binderGroup);
panel0.addView(slidingviewdefine0);

return panel0;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"background","#F5F5F5"
,"width","fill"
,"valign","TOP"
);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup);
viewPage0.addView(panel0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup) {
Main = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_MAIN
,"orientation","vertical"
,"canvasheight","667"
,"canvaswidth","375"
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","fill"
,"layout","vbox"
,"controller","MainController"
,"valign","TOP"
,"namespace","com.yonyou.meetfriend"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup);
Main.addView(viewPage0);

return (UMWindow)Main;
}

	
	public void actionButton0_onclick(View control, UMEventArgs args) {
    String actionid = "button0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.button0_onclick()",UMActivity.getViewId(control),args);
}


}
