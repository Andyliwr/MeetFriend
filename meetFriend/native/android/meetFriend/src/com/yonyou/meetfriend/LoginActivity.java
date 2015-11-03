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

public abstract class LoginActivity extends UMWindowActivity {

	protected UMWindow Login = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout panel0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected XVerticalLayout panel1 = null;
protected UMImage image0 = null;
protected XHorizontalLayout panel2 = null;
protected UMImage image1 = null;
protected UMTextbox textbox0 = null;
protected XHorizontalLayout panel3 = null;
protected UMImage image2 = null;
protected UMTextbox textbox1 = null;
protected XHorizontalLayout panel4 = null;
protected UMCheckbox checkbox0 = null;
protected UMLabel label1 = null;
protected XVerticalLayout panel5 = null;
protected UMButton button2 = null;
protected UMButton button1 = null;
protected UMButton button3 = null;

	
	protected final static int ID_LOGIN = 1624613672;
protected final static int ID_VIEWPAGE0 = 793511551;
protected final static int ID_PANEL0 = 255431197;
protected final static int ID_BUTTON0 = 1320554346;
protected final static int ID_LABEL0 = 21935413;
protected final static int ID_PANEL1 = 1629715901;
protected final static int ID_IMAGE0 = 1432071345;
protected final static int ID_PANEL2 = 1659734880;
protected final static int ID_IMAGE1 = 2094602994;
protected final static int ID_TEXTBOX0 = 130571012;
protected final static int ID_PANEL3 = 1431447072;
protected final static int ID_IMAGE2 = 1559038080;
protected final static int ID_TEXTBOX1 = 842077670;
protected final static int ID_PANEL4 = 1902346003;
protected final static int ID_CHECKBOX0 = 266017805;
protected final static int ID_LABEL1 = 1707646452;
protected final static int ID_PANEL5 = 2001012670;
protected final static int ID_BUTTON2 = 651431780;
protected final static int ID_BUTTON1 = 220248295;
protected final static int ID_BUTTON3 = 1991597824;

	
	
	@Override
	public String getControllerName() {
		return "LoginController";
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
		  idmap.put("Login",ID_LOGIN);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("image0",ID_IMAGE0);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("image1",ID_IMAGE1);
  idmap.put("textbox0",ID_TEXTBOX0);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("image2",ID_IMAGE2);
  idmap.put("textbox1",ID_TEXTBOX1);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("checkbox0",ID_CHECKBOX0);
  idmap.put("label1",ID_LABEL1);
  idmap.put("panel5",ID_PANEL5);
  idmap.put("button2",ID_BUTTON2);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("button3",ID_BUTTON3);

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
	
	
	
	public View getPanel0View(final UMActivity context,IBinderGroup binderGroup) {
panel0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL0
,"halign","LEFT"
,"height","50"
,"layout-type","vbox"
,"background","#04abfb"
,"width","fill"
,"valign","center"
);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"halign","center"
,"widthwrap","56.0"
,"width","wrap"
,"font-pressed-color","#c0c0c0"
,"height","50"
,"color","#ffffff"
,"font-size","17"
,"layout-type","hbox"
,"value","< 登录"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
panel0.addView(button0);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","hbox"
,"font-size","14"
,"width","fill"
,"font-family","default"
,"valign","center"
);
panel0.addView(label0);

return panel0;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup) {
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"halign","LEFT"
,"height","50.0"
,"layout-type","vbox"
,"background","#ffffff"
,"width","fill"
,"margin-top","30"
,"valign","center"
);
image1 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE1
,"height","30"
,"layout-type","hbox"
,"width","30"
,"margin-left","20"
,"scaletype","fitxy"
,"src","username.png"
);
panel2.addView(image1);
textbox0 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX0
,"padding-left","4"
,"halign","LEFT"
,"placeholder","username"
,"width","fill"
,"font-pressed-color","#459dfe"
,"margin-right","20"
,"autofocus","autofocus"
,"maxlength","256"
,"height","40"
,"color","#167ef8"
,"background","#f2f4f0"
,"font-size","17"
,"layout-type","hbox"
,"margin-left","20"
,"font-family","default"
,"valign","center"
);
panel2.addView(textbox0);

return panel2;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup) {
panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL3
,"halign","LEFT"
,"height","50"
,"layout-type","vbox"
,"background","#ffffff"
,"width","fill"
,"margin-top","10"
,"valign","center"
);
image2 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE2
,"height","30"
,"layout-type","hbox"
,"width","30"
,"margin-left","20"
,"scaletype","fitcenter"
,"src","password.png"
);
panel3.addView(image2);
textbox1 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX1
,"padding-left","4"
,"halign","LEFT"
,"placeholder","password"
,"width","fill"
,"margin-right","20"
,"maxlength","256"
,"height","40"
,"color","#167ef8"
,"layout-type","hbox"
,"background","#f2f4f0"
,"font-size","17"
,"margin-left","20"
,"font-family","default"
);
panel3.addView(textbox1);

return panel3;
}
public View getPanel5View(final UMActivity context,IBinderGroup binderGroup) {
panel5 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL5
,"halign","right"
,"height","30"
,"layout-type","hbox"
,"background","#ffffff"
,"width","fill"
,"valign","TOP"
);
button2 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON2
,"halign","right"
,"widthwrap","70.0"
,"height","30"
,"color","#000000"
,"layout-type","vbox"
,"width","wrap"
,"font-size","13"
,"value","忘记密码？"
,"font-family","default"
,"font-pressed-color","#c0c0c0"
,"valign","center"
);
panel5.addView(button2);

return panel5;
}
public View getPanel4View(final UMActivity context,IBinderGroup binderGroup) {
panel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL4
,"padding-left","20"
,"padding-right","20"
,"halign","LEFT"
,"height","30"
,"layout-type","vbox"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
checkbox0 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_CHECKBOX0
,"height","30"
,"layout-type","hbox"
,"width","30"
,"check-on-image","checkbox_select"
,"checked","checked"
,"check-off-image","checkbox_noselect"
);
panel4.addView(checkbox0);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"content","下次自动登录"
,"halign","left"
,"height","wrap"
,"widthwrap","84.0"
,"color","#000000"
,"heightwrap","19.0"
,"layout-type","hbox"
,"font-size","13"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
panel4.addView(label1);
View panel5 = (View) getPanel5View((UMActivity)context,binderGroup);
panel4.addView(panel5);

return panel4;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"background","#ffffff"
,"width","fill"
,"valign","TOP"
);
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","100"
,"layout-type","vbox"
,"width","100"
,"scaletype","fitcenter"
,"margin-top","30"
,"src","logo.png"
);
panel1.addView(image0);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup);
panel1.addView(panel2);
View panel3 = (View) getPanel3View((UMActivity)context,binderGroup);
panel1.addView(panel3);
View panel4 = (View) getPanel4View((UMActivity)context,binderGroup);
panel1.addView(panel4);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"padding-top","3"
,"halign","center"
,"border-radius","5"
,"width","200"
,"font-pressed-color","#400040"
,"padding-bottom","6"
,"pressed-color","#c0c0c0"
,"height","40"
,"color","#000000"
,"layout-type","vbox"
,"background","#04abfa"
,"font-size","20"
,"value","登 录"
,"onclick","action:button1_onclick"
,"font-family","default"
,"margin-top","50"
,"valign","center"
);
panel1.addView(button1);
button3 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON3
,"halign","center"
,"width","fill"
,"font-pressed-color","#c0c0c0"
,"height","40"
,"color","#000000"
,"font-size","17"
,"layout-type","vbox"
,"value","还没有账号，立即注册>>"
,"onclick","action:button3_onclick"
,"font-family","default"
,"margin-top","10"
,"valign","center"
);
panel1.addView(button3);

return panel1;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"background","#ffffff"
,"width","fill"
,"valign","TOP"
);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup);
viewPage0.addView(panel0);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup);
viewPage0.addView(panel1);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup) {
Login = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_LOGIN
,"orientation","vertical"
,"canvasheight","667"
,"canvaswidth","375"
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","fill"
,"layout","vbox"
,"controller","LoginController"
,"valign","TOP"
,"namespace","com.yonyou.meetfriend"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup);
Login.addView(viewPage0);

return (UMWindow)Login;
}

	
	public void actionButton3_onclick(View control, UMEventArgs args) {
    String actionid = "button3_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.button3_onclick()",UMActivity.getViewId(control),args);
}
public void actionButton1_onclick(View control, UMEventArgs args) {
    String actionid = "button1_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.button1_onclick()",UMActivity.getViewId(control),args);
}


}
