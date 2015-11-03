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

public abstract class RegisterActivity extends UMWindowActivity {

	protected UMWindow Register = null;
protected XVerticalLayout viewPage0 = null;
protected XVerticalLayout panel0 = null;
protected XHorizontalLayout panel1 = null;
protected UMButton button0 = null;
protected UMImage image0 = null;
protected XHorizontalLayout panel2 = null;
protected UMLabel label0 = null;
protected UMTextbox textbox0 = null;
protected XHorizontalLayout panel3 = null;
protected UMLabel label1 = null;
protected UMTextbox textbox1 = null;
protected XHorizontalLayout panel4 = null;
protected UMLabel label2 = null;
protected UMTextbox textbox3 = null;
protected XHorizontalLayout panel5 = null;
protected UMLabel label3 = null;
protected UMTextbox textbox2 = null;
protected XHorizontalLayout panel6 = null;
protected UMLabel label4 = null;
protected UMTextbox textbox4 = null;
protected UMButton button1 = null;

	
	protected final static int ID_REGISTER = 824872966;
protected final static int ID_VIEWPAGE0 = 984237500;
protected final static int ID_PANEL0 = 95596871;
protected final static int ID_PANEL1 = 906023937;
protected final static int ID_BUTTON0 = 582546228;
protected final static int ID_IMAGE0 = 985113514;
protected final static int ID_PANEL2 = 297575729;
protected final static int ID_LABEL0 = 1808172986;
protected final static int ID_TEXTBOX0 = 343481337;
protected final static int ID_PANEL3 = 1319229645;
protected final static int ID_LABEL1 = 1716724182;
protected final static int ID_TEXTBOX1 = 473376634;
protected final static int ID_PANEL4 = 279727361;
protected final static int ID_LABEL2 = 526594420;
protected final static int ID_TEXTBOX3 = 1458684810;
protected final static int ID_PANEL5 = 2040238174;
protected final static int ID_LABEL3 = 1366122169;
protected final static int ID_TEXTBOX2 = 1445314916;
protected final static int ID_PANEL6 = 1569396187;
protected final static int ID_LABEL4 = 499487253;
protected final static int ID_TEXTBOX4 = 250119444;
protected final static int ID_BUTTON1 = 145041641;

	
	
	@Override
	public String getControllerName() {
		return "RegisterController";
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
		  idmap.put("Register",ID_REGISTER);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("image0",ID_IMAGE0);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("label0",ID_LABEL0);
  idmap.put("textbox0",ID_TEXTBOX0);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("label1",ID_LABEL1);
  idmap.put("textbox1",ID_TEXTBOX1);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("label2",ID_LABEL2);
  idmap.put("textbox3",ID_TEXTBOX3);
  idmap.put("panel5",ID_PANEL5);
  idmap.put("label3",ID_LABEL3);
  idmap.put("textbox2",ID_TEXTBOX2);
  idmap.put("panel6",ID_PANEL6);
  idmap.put("label4",ID_LABEL4);
  idmap.put("textbox4",ID_TEXTBOX4);
  idmap.put("button1",ID_BUTTON1);

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
	
	
	
	public View getPanel1View(final UMActivity context,IBinderGroup binderGroup) {
panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL1
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
,"font-pressed-color","#459dfe"
,"height","44"
,"color","#ffffff"
,"font-size","17"
,"layout-type","hbox"
,"value","< 注册"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
panel1.addView(button0);

return panel1;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup) {
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"padding-right","15"
,"halign","LEFT"
,"height","40"
,"layout-type","vbox"
,"width","fill"
,"margin-bottom","5"
,"margin-top","20"
,"valign","center"
);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"content","用户名："
,"halign","right"
,"height","40"
,"color","#000000"
,"layout-type","hbox"
,"font-size","14"
,"background","#ffffff"
,"width","90"
,"font-family","default"
,"valign","center"
);
panel2.addView(label0);
textbox0 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX0
,"padding-left","4"
,"halign","LEFT"
,"height","40"
,"maxlength","256"
,"color","#167ef8"
,"placeholder",""
,"layout-type","hbox"
,"background","#f2f4f0"
,"font-size","17"
,"width","fill"
,"font-family","default"
);
panel2.addView(textbox0);

return panel2;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup) {
panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL3
,"padding-right","15"
,"halign","LEFT"
,"height","40"
,"layout-type","vbox"
,"width","fill"
,"margin-bottom","5"
,"valign","center"
);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"content","密码："
,"halign","right"
,"height","40"
,"color","#000000"
,"layout-type","hbox"
,"font-size","14"
,"background","#ffffff"
,"width","90"
,"font-family","default"
,"valign","center"
);
panel3.addView(label1);
textbox1 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX1
,"padding-left","4"
,"halign","LEFT"
,"height","40"
,"maxlength","256"
,"color","#167ef8"
,"placeholder",""
,"layout-type","hbox"
,"background","#f2f4f0"
,"font-size","17"
,"width","fill"
,"font-family","default"
);
panel3.addView(textbox1);

return panel3;
}
public View getPanel4View(final UMActivity context,IBinderGroup binderGroup) {
panel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL4
,"padding-right","15"
,"halign","LEFT"
,"height","40"
,"layout-type","vbox"
,"width","fill"
,"margin-bottom","5"
,"valign","center"
);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"content","确认密码："
,"halign","right"
,"height","40"
,"color","#000000"
,"layout-type","hbox"
,"font-size","14"
,"background","#ffffff"
,"width","90"
,"font-family","default"
,"valign","center"
);
panel4.addView(label2);
textbox3 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX3
,"padding-left","4"
,"halign","LEFT"
,"height","40"
,"maxlength","256"
,"color","#167ef8"
,"placeholder",""
,"layout-type","hbox"
,"background","#f2f4f0"
,"font-size","17"
,"width","fill"
,"font-family","default"
);
panel4.addView(textbox3);

return panel4;
}
public View getPanel5View(final UMActivity context,IBinderGroup binderGroup) {
panel5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL5
,"padding-right","15"
,"halign","LEFT"
,"height","40"
,"layout-type","vbox"
,"width","fill"
,"margin-bottom","5"
,"valign","center"
);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"content","手机："
,"halign","right"
,"height","40"
,"color","#000000"
,"layout-type","hbox"
,"font-size","14"
,"background","#ffffff"
,"width","90"
,"font-family","default"
,"valign","center"
);
panel5.addView(label3);
textbox2 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX2
,"padding-left","4"
,"halign","LEFT"
,"height","40"
,"maxlength","256"
,"color","#167ef8"
,"placeholder",""
,"layout-type","hbox"
,"background","#f2f4f0"
,"font-size","17"
,"width","fill"
,"font-family","default"
);
panel5.addView(textbox2);

return panel5;
}
public View getPanel6View(final UMActivity context,IBinderGroup binderGroup) {
panel6 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL6
,"padding-right","15"
,"halign","LEFT"
,"height","40"
,"layout-type","vbox"
,"width","fill"
,"margin-bottom","10"
,"valign","center"
);
label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL4
,"content","邮箱："
,"halign","right"
,"height","40"
,"color","#000000"
,"layout-type","hbox"
,"font-size","14"
,"background","#ffffff"
,"width","90"
,"font-family","default"
,"valign","center"
);
panel6.addView(label4);
textbox4 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX4
,"padding-left","4"
,"halign","LEFT"
,"height","40"
,"maxlength","256"
,"color","#167ef8"
,"placeholder",""
,"layout-type","hbox"
,"background","#f2f4f0"
,"font-size","17"
,"width","fill"
,"font-family","default"
);
panel6.addView(textbox4);

return panel6;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"background","#ffffff"
,"width","fill"
,"valign","TOP"
);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup);
panel0.addView(panel1);
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","80"
,"layout-type","vbox"
,"width","80"
,"scaletype","fitcenter"
,"margin-top","10"
,"src","logo.png"
);
panel0.addView(image0);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup);
panel0.addView(panel2);
View panel3 = (View) getPanel3View((UMActivity)context,binderGroup);
panel0.addView(panel3);
View panel4 = (View) getPanel4View((UMActivity)context,binderGroup);
panel0.addView(panel4);
View panel5 = (View) getPanel5View((UMActivity)context,binderGroup);
panel0.addView(panel5);
View panel6 = (View) getPanel6View((UMActivity)context,binderGroup);
panel0.addView(panel6);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","center"
,"border-radius","5"
,"width","200"
,"font-pressed-color","#400040"
,"pressed-color","#c0c0c0"
,"height","40"
,"color","#000000"
,"layout-type","vbox"
,"font-size","17"
,"background","#04abfa"
,"value","立即注册"
,"font-family","default"
,"valign","center"
);
panel0.addView(button1);

return panel0;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"width","fill"
,"background","#F5F5F5"
,"valign","TOP"
);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup);
viewPage0.addView(panel0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup) {
Register = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_REGISTER
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","fill"
,"layout","vbox"
,"controller","RegisterController"
,"valign","TOP"
,"namespace","com.yonyou.meetfriend"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup);
Register.addView(viewPage0);

return (UMWindow)Register;
}

	
	

}
