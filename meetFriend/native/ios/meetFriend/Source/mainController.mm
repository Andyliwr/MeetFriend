//
//  viewController.m
//
//
//  Created by zhangyuv.
//  Copyright (c) 2013年 yonyou. All rights reserved.
//

#import "mainController.h"














@interface mainController ()
{
    BOOL isResum;//适配安卓resum事件
    BOOL isDialog;//dialog标记
}
@end

@implementation mainController
@synthesize navBarHidden = _navBarHidden;
@synthesize viewObject = _viewObject;
@synthesize Main = _Main;
@synthesize parentController = _parentController;
@synthesize currentContainer=_currentContainer;
@synthesize contextDictionary = _contextDictionary;
@synthesize context=_context;
@synthesize ctx = _ctx;

@synthesize viewPage0 = _viewPage0;

@synthesize panel0 = _panel0;












static NSString *controllerC = @"MainController";

static NSString *namespaceC = @"com.yonyou.meetfriend";

static NSString *ModelName = @"";


- (id)initWithParentCtl:(UIViewController*)parentCtl
{
    self = [super initWithNibName:nil bundle:nil];
    if (self) {
        if(parentCtl){
            self.parentController = parentCtl;
        }else{
            self.parentController = self;
        }
        _navBarHidden = YES;
        self.navigationItem.hidesBackButton = YES;
        _viewObject = [[UMLayoutView alloc] init];
        _Main = _viewObject;

            _viewObject.layoutType = Layout_vbox;

    _viewObject.weightUMPView = 0;
    _viewObject.paddingLeft = 0;
    _viewObject.paddingTop = 0;
    _viewObject.paddingRight = 0;
    _viewObject.paddingBottom = 0;
    _viewObject.marginLeft = 0;
    _viewObject.marginTop = 0;
    _viewObject.marginRight = 0;
    _viewObject.marginBottom = 0;//0;
    _viewObject.vAlignUMP = ALIGN_TOP;
    _viewObject.hAlignUMP = ALIGN_CENTER;
    _viewObject.frame = CGRectMake(0, 0, [[UIScreen mainScreen] applicationFrame].size.width, [[UIScreen mainScreen] applicationFrame].size.height);
    _viewObject.bVisible = YES;
    _viewObject.disabled = NO;
    _viewObject.readOnly = NO;
    //_viewObject.isHeightFill = YES;
    //_viewObject.isWidthFill = YES;
    _viewObject.isHeightWrap = NO;
    _viewObject.isWidthWrap = NO;
       _viewObject.backgroundColor = [UIColor clearColor];

	   _viewObject.layoutType = Layout_vbox;


        _context = [[UMEntityContext alloc]init];
        _ctx = _context;
  		self.xnamespace = namespaceC;
        self.controllerid = controllerC;

         
    }
	return self;
}

#pragma mark  initview

- (void)initChilds
{
    _viewPage0 = [[UMLayoutView alloc] init];
    _viewPage0.controlId = @"viewPage0";
    _viewPage0.layoutType = Layout_vbox;
    [(UMLayoutView*)_Main addSubUMView:_viewPage0];
     //设置控件基本属性
    [UMCompatible initCommonProperty:_viewPage0 info:[NSDictionary dictionaryWithObjectsAndKeys:
                          @"0",@"weightUMPView",
                          @"0",@"paddingLeftUMP",
                          @"0",@"paddingTopUMP",
                          @"0",@"paddingRightUMP",
                          @"0",@"paddingBottomUMP",
                          @"0",@"marginLeft",
                          @"0",@"marginTop",
                          @"0",@"marginRight",
                          @"0",@"marginBottom",
                          @"ALIGN_TOP",@"valignUMP",
                          @"ALIGN_CENTER",@"halignUMP",
                          @"YES",@"visible",
                          @"NO",@"disabled",
                          @"NO",@"readOnly",
                          @"YES",@"isHeightFill",
                          @"YES",@"isWidthFill",
                          @"NO",@"isHeightWrap", 
                          @"NO",@"isWidthWrap",
                          @"0",@"left",
                          @"0",@"top",
                          @"0",@"width",
                          @"0",@"height",
                          @"",@"color",
                          [UIColor colorWithRed:0.96862745 green:0.972549 blue:0.972549 alpha:1],@"backgroundColor",
                          @"",@"backgroundImagePath",
                          [UIColor clearColor],@"background_color_dis",
                          @"",@"border-top-style",
                          @"",@"border-top-width",
                          @"",@"border-top-color",
                          @"",@"border-left-style",
                          @"",@"border-left-width",
                          @"",@"border-left-color",
                          @"",@"border-right-style",
                          @"",@"border-right-width",
                          @"",@"border-right-color",
                          @"",@"border-bottom-style",
                          @"",@"border-bottom-width",
                          @"",@"border-bottom-color",
                          @"",@"display",
                          @"",@"gradient",
                          @"0",@"border-radius",
                          nil] container:self];




    _panel0 = [[UMLayoutView alloc] init];
    _panel0.controlId = @"panel0";
    _panel0.layoutType = Layout_hbox;
    [(UMLayoutView*)_viewPage0 addSubUMView:_panel0];
     //设置控件基本属性
    [UMCompatible initCommonProperty:_panel0 info:[NSDictionary dictionaryWithObjectsAndKeys:
                          @"0",@"weightUMPView",
                          @"0",@"paddingLeftUMP",
                          @"0",@"paddingTopUMP",
                          @"0",@"paddingRightUMP",
                          @"0",@"paddingBottomUMP",
                          @"0",@"marginLeft",
                          @"0",@"marginTop",
                          @"0",@"marginRight",
                          @"0",@"marginBottom",
                          @"ALIGN_CENTER",@"valignUMP",
                          @"ALIGN_LEFT",@"halignUMP",
                          @"YES",@"visible",
                          @"NO",@"disabled",
                          @"NO",@"readOnly",
                          @"NO",@"isHeightFill",
                          @"YES",@"isWidthFill",
                          @"NO",@"isHeightWrap", 
                          @"NO",@"isWidthWrap",
                          @"0",@"left",
                          @"0",@"top",
                          @"0",@"width",
                          @"40",@"height",
                          @"",@"color",
                          [UIColor colorWithRed:0.18039216 green:0.18039216 blue:0.18039216 alpha:1],@"backgroundColor",
                          @"",@"backgroundImagePath",
                          [UIColor clearColor],@"background_color_dis",
                          @"",@"border-top-style",
                          @"",@"border-top-width",
                          @"",@"border-top-color",
                          @"",@"border-left-style",
                          @"",@"border-left-width",
                          @"",@"border-left-color",
                          @"",@"border-right-style",
                          @"",@"border-right-width",
                          @"",@"border-right-color",
                          @"",@"border-bottom-style",
                          @"",@"border-bottom-width",
                          @"",@"border-bottom-color",
                          @"",@"display",
                          @"",@"gradient",
                          @"0",@"border-radius",
                          nil] container:self];




// --listviewdefine0
    _listviewdefine0 = [UMControl creatControl:@"UMXTableView" container:self  params:@{
                          @"bindfield":@"sourceWeixin",
                          @"id":@"listviewdefine0",
                          @"halign":@"center",
                          @"weight":@"1",
                          @"height":@"0",
                          @"onitemcreate":@"listviewdefine0_onitemcreate",
                          @"width":@"fill",
                          @"layout":@"Layout_vbox",
                          @"valign":@"TOP",@"value":@"                     "}];
    [(UMLayoutView*)_viewPage0 addSubUMXView:_listviewdefine0];

// --tabbar0
    _tabbar0 = [UMControl creatControl:@"UMXTabBar" container:self  params:@{
                          @"id":@"tabbar0",
                          @"halign":@"CENTER",
                          @"height":@"49",
                          @"width":@"fill",
                          @"background":@"#ffffff",
                          @"layout":@"Layout_hbox",
                          @"bg_r":@"1.0",
                          @"bg_b":@"1.0",
                          @"valign":@"top",
                          @"bg_g":@"1.0",@"value":@"                                                         "}];
    [(UMLayoutView*)_viewPage0 addSubUMXView:_tabbar0];

// --label0
    _label0 = [UMControl creatControl:@"UMXLabel" container:self  params:@{
                          @"halign":@"center",
                          @"widthwrap":@"157.0",
                          @"width":@"wrap",
                          @"font_size":@"20",
                          @"txt_r":@"1.0",
                          @"id":@"label0",
                          @"txt_g":@"1.0",
                          @"height":@"wrap",
                          @"font_family":@"ArialMT",
                          @"color":@"#ffffff",
                          @"heightwrap":@"29.0",
                          @"font-size":@"20",
                          @"margin-left":@"15",
                          @"font-family":@"default",
                          @"txt_b":@"1.0",
                          @"valign":@"center",@"value":@"微信(#{weiNum})"}];
    [(UMLayoutView*)_panel0 addSubUMXView:_label0];

// --label1
    _label1 = [UMControl creatControl:@"UMXLabel" container:self  params:@{
                          @"halign":@"center",
                          @"weight":@"1",
                          @"width":@"0",
                          @"font_size":@"14",
                          @"txt_r":@"0.0",
                          @"id":@"label1",
                          @"txt_g":@"0.0",
                          @"height":@"20",
                          @"color":@"#000000",
                          @"font_family":@"ArialMT",
                          @"font-size":@"14",
                          @"font-family":@"default",
                          @"txt_b":@"0.0",
                          @"valign":@"center",@"value":@""}];
    [(UMLayoutView*)_panel0 addSubUMXView:_label1];

// --imagebutton0
    _imagebutton0 = [UMControl creatControl:@"UMXImageButton" container:self  params:@{
                          @"p_txt_r":@"0.1764706",
                          @"text-align":@"left",
                          @"font_size":@"10",
                          @"font-pressed-color":@"#2dbb69",
                          @"pressed-color":@"#000000",
                          @"imagebuttontype":@"icon",
                          @"id":@"imagebutton0",
                          @"txt_g":@"0.5686275",
                          @"p_txt_b":@"0.4117647",
                          @"height":@"fill",
                          @"font_family":@"ArialMT",
                          @"font-size":@"10",
                          @"icon-background-image":@"weixin_search.png",
                          @"txt_b":@"0.5686275",
                          @"p_txt_g":@"0.73333335",
                          @"halign":@"center",
                          @"width":@"50",
                          @"txt_r":@"0.5686275",
                          @"icon-width":@"25",
                          @"pressed_r":@"0.0",
                          @"istogglebutton":@"false",
                          @"icon-height":@"25",
                          @"color":@"#919191",
                          @"pressed_g":@"0.0",
                          @"pressed_b":@"0.0",
                          @"icon-pressed-image":@"weixin_search.png",
                          @"font-family":@"default",
                          @"valign":@"center",
                          @"checked":@"false",
                          @"icon-text-spacing":@"3",@"value":@""}];
    [(UMLayoutView*)_panel0 addSubUMXView:_imagebutton0];

// --imagebutton1
    _imagebutton1 = [UMControl creatControl:@"UMXImageButton" container:self  params:@{
                          @"p_txt_r":@"0.1764706",
                          @"text-align":@"left",
                          @"font_size":@"10",
                          @"font-pressed-color":@"#2dbb69",
                          @"pressed-color":@"#000000",
                          @"imagebuttontype":@"icon",
                          @"id":@"imagebutton1",
                          @"txt_g":@"0.5686275",
                          @"p_txt_b":@"0.4117647",
                          @"height":@"fill",
                          @"font_family":@"ArialMT",
                          @"font-size":@"10",
                          @"icon-background-image":@"weixin_add.png",
                          @"txt_b":@"0.5686275",
                          @"p_txt_g":@"0.73333335",
                          @"halign":@"center",
                          @"width":@"50",
                          @"txt_r":@"0.5686275",
                          @"icon-width":@"25",
                          @"pressed_r":@"0.0",
                          @"istogglebutton":@"false",
                          @"icon-height":@"25",
                          @"color":@"#919191",
                          @"pressed_g":@"0.0",
                          @"icon-pressed-image":@"weixin_add.png",
                          @"onclick":@"imagebutton1_onclick",
                          @"pressed_b":@"0.0",
                          @"font-family":@"default",
                          @"valign":@"center",
                          @"checked":@"false",
                          @"icon-text-spacing":@"3",@"value":@""}];
    [(UMLayoutView*)_panel0 addSubUMXView:_imagebutton1];

// --tabbaritem0
    _tabbaritem0 = [UMControl creatControl:@"UMXTabBarItem" container:self  params:@{
                          @"p_txt_r":@"0.1764706",
                          @"text":@"微信",
                          @"weight":@"1",
                          @"width":@"0",
                          @"font_size":@"12",
                          @"txt_r":@"0.5686275",
                          @"icon-width":@"25",
                          @"font-pressed-color":@"#2dbb69",
                          @"txt_g":@"0.5686275",
                          @"id":@"tabbaritem0",
                          @"tabbaritemtype":@"icontext",
                          @"icon-height":@"25",
                          @"height":@"47",
                          @"p_txt_b":@"0.4117647",
                          @"color":@"#919191",
                          @"font_family":@"ArialMT",
                          @"font-size":@"12",
                          @"icon-background-image":@"weixin.png",
                          @"icon-pressed-image":@"weixin_touch.png",
                          @"font-family":@"default",
                          @"txt_b":@"0.5686275",
                          @"checked":@"true",
                          @"icon-text-spacing":@"3",
                          @"p_txt_g":@"0.73333335",@"value":@""}];
    [(UMLayoutView*)_tabbar0 addView:_tabbaritem0];

// --tabbaritem1
    _tabbaritem1 = [UMControl creatControl:@"UMXTabBarItem" container:self  params:@{
                          @"p_txt_r":@"0.1764706",
                          @"text":@"通讯录",
                          @"weight":@"1",
                          @"width":@"0",
                          @"font_size":@"12",
                          @"txt_r":@"0.5686275",
                          @"icon-width":@"25",
                          @"font-pressed-color":@"#2dbb69",
                          @"txt_g":@"0.5686275",
                          @"id":@"tabbaritem1",
                          @"tabbaritemtype":@"icontext",
                          @"icon-height":@"25",
                          @"height":@"47",
                          @"p_txt_b":@"0.4117647",
                          @"color":@"#919191",
                          @"font_family":@"ArialMT",
                          @"font-size":@"12",
                          @"icon-background-image":@"weixin_contact.png",
                          @"icon-pressed-image":@"weixin_contact_touch.png",
                          @"font-family":@"default",
                          @"txt_b":@"0.5686275",
                          @"icon-text-spacing":@"3",
                          @"p_txt_g":@"0.73333335",@"value":@""}];
    [(UMLayoutView*)_tabbar0 addView:_tabbaritem1];

// --tabbaritem2
    _tabbaritem2 = [UMControl creatControl:@"UMXTabBarItem" container:self  params:@{
                          @"p_txt_r":@"0.1764706",
                          @"text":@"发现",
                          @"weight":@"1",
                          @"width":@"0",
                          @"font_size":@"12",
                          @"txt_r":@"0.5686275",
                          @"icon-width":@"25",
                          @"font-pressed-color":@"#2dbb69",
                          @"txt_g":@"0.5686275",
                          @"id":@"tabbaritem2",
                          @"tabbaritemtype":@"icontext",
                          @"icon-height":@"25",
                          @"height":@"47",
                          @"p_txt_b":@"0.4117647",
                          @"color":@"#919191",
                          @"font_family":@"ArialMT",
                          @"font-size":@"12",
                          @"icon-background-image":@"weixin_find.png",
                          @"icon-pressed-image":@"weixin_find_touch.png",
                          @"font-family":@"default",
                          @"txt_b":@"0.5686275",
                          @"icon-text-spacing":@"3",
                          @"p_txt_g":@"0.73333335",@"value":@""}];
    [(UMLayoutView*)_tabbar0 addView:_tabbaritem2];

// --tabbaritem3
    _tabbaritem3 = [UMControl creatControl:@"UMXTabBarItem" container:self  params:@{
                          @"p_txt_r":@"0.1764706",
                          @"text":@"我",
                          @"weight":@"1",
                          @"width":@"0",
                          @"font_size":@"12",
                          @"txt_r":@"0.5686275",
                          @"icon-width":@"25",
                          @"font-pressed-color":@"#2dbb69",
                          @"txt_g":@"0.5686275",
                          @"id":@"tabbaritem3",
                          @"tabbaritemtype":@"icontext",
                          @"icon-height":@"25",
                          @"height":@"47",
                          @"p_txt_b":@"0.4117647",
                          @"color":@"#919191",
                          @"font_family":@"ArialMT",
                          @"font-size":@"12",
                          @"icon-background-image":@"weixin_mine.png",
                          @"icon-pressed-image":@"weixin_mine_touch.png",
                          @"font-family":@"default",
                          @"txt_b":@"0.5686275",
                          @"icon-text-spacing":@"3",
                          @"p_txt_g":@"0.73333335",@"value":@""}];
    [(UMLayoutView*)_tabbar0 addView:_tabbaritem3];


    [_viewObject adjustSize];
}

#pragma mark view on load

- (void)viewDidLoad
{
	[super viewDidLoad];
    [SysContext getInstance].CurrentViewController = self;



    //dialog优化，设置半透明背景色
    if(!isDialog){

         if ([[[UIDevice currentDevice] systemVersion] floatValue] >= 7) {
            self.view.bounds = CGRectMake(0, -20, self.view.frame.size.width, self.view.frame.size.height );
         }
    }else{

        //半透明蒙板
        UIView * bgview = [[UIView alloc] initWithFrame:self.view.frame];
        [bgview setBackgroundColor:[UIColor grayColor]];
        [bgview setOpaque:YES];
        [bgview setAlpha:0.5];
        [self.view addSubview:bgview];

    }

	[self.view addSubview:_viewObject.view];
    [self initChilds];
    


  
    












    //加载JS
    AppDelegate* appDelegate = (AppDelegate*)[[UIApplication sharedApplication] delegate];
    _currentContainer = [appDelegate currentContainer];
   //[self performSelectorInBackground:@selector(umOnload) withObject:nil];
}
-(void)umOnload{

    @autoreleasepool {
    
        AppDelegate* appDelegate = (AppDelegate*)[[UIApplication sharedApplication] delegate];
        _currentContainer = [appDelegate currentContainer];
        
        _currentContainer.controllerName = [[namespaceC stringByAppendingString:@"."]stringByAppendingString:controllerC];
        [_currentContainer initCurrentViewController:_currentContainer.controllerName];
        
        [_currentContainer initCurrentViewContext:[[namespaceC stringByAppendingString:@"."]stringByAppendingString:ModelName]];
        
        
        
        //JS同步加载完成 回到主线程 刷新UI
        [self performSelectorOnMainThread:@selector(umload) withObject:nil waitUntilDone:YES];
        
  
    }
}
-(void)umload{

     [self viewpage0_onload:nil  args:nil];













}
- (void)viewWillAppear:(BOOL)animated
{
    [self resignFirstResponder];
    [super viewWillAppear:animated];
    [SysContext getInstance].CurrentViewController = self;

    if (isResum) {//第二次进入调用
          
    }else {
        isResum = YES;
    }
    [_viewObject umviewAppear];
    [UIApplication sharedApplication].keyWindow.backgroundColor = [UIColor colorWithHexString:@"#ffffff"];
    
    if([[UIColor getWhiteBlackByHexString:@"#ffffff"] isEqual:[UIColor blackColor]])
    {
        [[UIApplication sharedApplication] setStatusBarStyle:UIStatusBarStyleDefault];
    }
    else
    {
        [[UIApplication sharedApplication] setStatusBarStyle:UIStatusBarStyleLightContent];
    }

}
- (void)viewDidAppear:(BOOL)animated
{
	[super viewDidAppear:animated];
}
-(void)viewWillDisappear:(BOOL)animated
{
    [super viewWillDisappear:animated];
    
    [_viewObject vmviewDisappear];
}
- (void)viewDidUnload
{
	[super viewDidUnload];
}

#pragma mark  databind

- (void)dataBind:(NSString*)data{
    if(data !=nil){
        [_context updateCtx:data];
 _ctx = _context;

    }
    
    


[self umcontrol:_listviewdefine0 controlid:@"listviewdefine0" bindfield:@"sourceWeixin"];










    [self bindAll];
   [_viewObject clearFinishedAdjustSize];
   [_viewObject adjustSize];
}

#pragma mark  actions

- (void)listviewdefine0_onitemcreate:(id<UMViewControl>)sender args:(XEventArgs *)args{
if(args==nil) {
  args = [[XEventArgs alloc] init:self];
}
[args setInvoke:[self getInvokeInfo:@"listviewdefine0_onitemcreate" method:@"this.onlistviewdefine0ItemCreate()" sender:sender]];

 [args putValue:@"true" forKey:@"issystem"];

 [args putValue:@"javascript" forKey:@"language"];
[UMCommonSevice callSeviceWithMethod:args];

}
- (void)imagebutton1_onclick:(id<UMViewControl>)sender args:(XEventArgs *)args{
if(args==nil) {
  args = [[XEventArgs alloc] init:self];
}
[args setInvoke:[self getInvokeInfo:@"imagebutton1_onclick" method:@"this.btnMenu_onclick()" sender:sender]];

 [args putValue:@"true" forKey:@"issystem"];

 [args putValue:@"javascript" forKey:@"language"];
[UMCommonSevice callSeviceWithMethod:args];

}
- (void)viewpage0_onload:(id<UMViewControl>)sender args:(XEventArgs *)args{
if(args==nil) {
  args = [[XEventArgs alloc] init:self];
}
[args setInvoke:[self getInvokeInfo:@"viewpage0_onload" method:@"this.viewPage0_onload()" sender:sender]];

 [args putValue:@"true" forKey:@"issystem"];

 [args putValue:@"javascript" forKey:@"language"];
[UMCommonSevice callSeviceWithMethod:args];

}



















#pragma mark  InterfaceOrientation

- (BOOL)shouldAutorotateToInterfaceOrientation:(UIInterfaceOrientation)toInterfaceOrientation
{
    return YES;
}
- (BOOL)shouldAutorotate
{
    return YES;
}
- (NSUInteger)supportedInterfaceOrientations
{
    //旋转Bug  return UIInterfaceOrientationMaskPortrait;

    return UIInterfaceOrientationMaskPortrait;
}


-(void)willRotateToInterfaceOrientation:(UIInterfaceOrientation)toInterfaceOrientation duration:(NSTimeInterval)duration
{

   //dialog和viewcontroller共用一份模版，添加判断
   if(!isDialog){

    CGRect frame;
    self.willOrientation = toInterfaceOrientation;
    frame = [self frameForOrientation];
    self.viewObject.frame = frame;
    [self.viewObject clearFinishedAdjustSize];
    [self.viewObject adjustSize];

    [_viewObject umviewAppear];
    [self operateOrientationViewDidAppear];
  }
}

#pragma mark  摇一摇

-(BOOL)canBecomeFirstResponder
{
    return YES;
}
- (void) motionBegan:(UIEventSubtype)motion withEvent:(UIEvent *)event
{
    
    if (motion == UIEventSubtypeMotionShake) {
        //NSLog(@"摇一摇");
        
        
    }
}

#pragma mark container

-(void)onInit{
    [_currentContainer onInit:controllerC];
}
-(void)onLoad{
    [_currentContainer onLoad:controllerC];
}
-(void)onDataBinding{
    //here do databinding
    NSString *context = [_currentContainer getModel:ModelName];
    _contextDictionary = [context objectFromJSONString];
    if(_contextDictionary != nil)
        [self dataBind:[_contextDictionary JSONString]];
}
-(void)onComplete{
    [_currentContainer onComplete:controllerC];
}
-(id)valueByBindfield:(NSString*)bindingfield
{
    return [_contextDictionary objectForKey:bindingfield];
}

@end
