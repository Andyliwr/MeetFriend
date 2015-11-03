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

public abstract class YingdaoActivity extends UMWindowActivity {

	protected UMWindow Yingdao = null;
protected XVerticalLayout viewPage0 = null;
protected UMViewFlipper flipperdefine0 = null;
protected XVerticalLayout panel0 = null;
protected XHorizontalLayout panel4 = null;
protected UMLabel label0 = null;
protected UMButton button0 = null;
protected XVerticalLayout panel1 = null;
protected XVerticalLayout panel2 = null;
protected XVerticalLayout panel3 = null;
protected UMLabel label1 = null;
protected UMButton button1 = null;
protected UMLabel label2 = null;

	
	protected final static int ID_YINGDAO = 187226886;
protected final static int ID_VIEWPAGE0 = 538748983;
protected final static int ID_FLIPPERDEFINE0 = 1390805067;
protected final static int ID_PANEL0 = 1651737781;
protected final static int ID_PANEL4 = 1607586017;
protected final static int ID_LABEL0 = 1188735417;
protected final static int ID_BUTTON0 = 978048586;
protected final static int ID_PANEL1 = 509270360;
protected final static int ID_PANEL2 = 716495557;
protected final static int ID_PANEL3 = 1016426443;
protected final static int ID_LABEL1 = 1680251941;
protected final static int ID_BUTTON1 = 1163477936;
protected final static int ID_LABEL2 = 246719068;

	
	
	@Override
	public String getControllerName() {
		return "YingdaoController";
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
		  idmap.put("Yingdao",ID_YINGDAO);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("flipperdefine0",ID_FLIPPERDEFINE0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("label1",ID_LABEL1);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("label2",ID_LABEL2);

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
	
	
	
	public View getPanel4View(final UMActivity context,IBinderGroup binderGroup) {
panel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL4
,"halign","LEFT"
,"height","60.0"
,"layout-type","vbox"
,"width","fill"
,"valign","center"
);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"halign","center"
,"height","20"
,"weight","2"
,"color","#000000"
,"layout-type","hbox"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
panel4.addView(label0);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"halign","center"
,"weight","1"
,"border-radius","0"
,"width","0"
,"font-pressed-color","#459dfe"
,"height","30"
,"color","#000000"
,"layout-type","hbox"
,"background","#ffffff"
,"font-size","17"
,"value","跳过引导"
,"onclick","action:button0_onclick"
,"font-family","default"
,"valign","center"
);
panel4.addView(button0);

return panel4;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"width","fill"
,"valign","TOP"
,"background-image","yingdao1.png"
);
View panel4 = (View) getPanel4View((UMActivity)context,binderGroup);
panel0.addView(panel4);

return panel0;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup) {
panel3 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL3
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"width","fill"
,"valign","TOP"
);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"halign","center"
,"height","0"
,"weight","9"
,"color","#000000"
,"layout-type","vbox"
,"font-size","14"
,"width","32.0"
,"font-family","default"
,"valign","center"
);
panel3.addView(label1);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","center"
,"border-radius","3"
,"width","120"
,"font-pressed-color","#459dfe"
,"height","35"
,"color","#000000"
,"layout-type","vbox"
,"font-size","17"
,"background","#ffffff"
,"value","立即体验>>"
,"onclick","action:button1_onclick"
,"font-family","default"
,"valign","center"
);
panel3.addView(button1);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"halign","center"
,"height","0"
,"weight","2"
,"color","#000000"
,"layout-type","vbox"
,"font-size","14"
,"width","32.0"
,"font-family","default"
,"valign","center"
);
panel3.addView(label2);

return panel3;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup) {
panel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL2
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"width","fill"
,"valign","TOP"
,"background-image","yingdao3.png"
);
View panel3 = (View) getPanel3View((UMActivity)context,binderGroup);
panel2.addView(panel3);

return panel2;
}
public View getFlipperdefine0View(final UMActivity context,IBinderGroup binderGroup) {
flipperdefine0 = (UMViewFlipper)ThirdControl.createControl(new UMViewFlipper(context),ID_FLIPPERDEFINE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"width","fill"
,"layout","vbox"
,"viewindex","0"
,"valign","TOP"
);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup);
flipperdefine0.addView(panel0);
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"width","fill"
,"valign","TOP"
,"background-image","yingdao2.png"
);
flipperdefine0.addView(panel1);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup);
flipperdefine0.addView(panel2);

return flipperdefine0;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"background","#F7F8F8"
,"width","fill"
,"valign","TOP"
);
View flipperdefine0 = (View) getFlipperdefine0View((UMActivity)context,binderGroup);
viewPage0.addView(flipperdefine0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup) {
Yingdao = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_YINGDAO
,"orientation","vertical"
,"canvasheight","667"
,"canvaswidth","375"
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","fill"
,"layout","vbox"
,"controller","YingdaoController"
,"valign","TOP"
,"namespace","com.yonyou.meetfriend"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup);
Yingdao.addView(viewPage0);

return (UMWindow)Yingdao;
}

	
	public void actionButton0_onclick(View control, UMEventArgs args) {
    String actionid = "button0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.button0_onclick()",UMActivity.getViewId(control),args);
}
public void actionButton1_onclick(View control, UMEventArgs args) {
    String actionid = "button1_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.button3_onclick()",UMActivity.getViewId(control),args);
}


}
