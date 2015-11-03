//
//  viewController.h
//
//
//  Created by zhangyuv.
//  Copyright (c) 2013年 yonyou. All rights reserved.
//
#include <UMIOSControls/RoyalBlue.h>
#import <UMIOSControls/UMIOSControls.h>
//#import "UMContainer.h"
#import "AppDelegate.h"













@interface mainController:UMBaseViewController

@property (nonatomic,assign) BOOL navBarHidden;
@property (nonatomic,weak) UIViewController* parentController;
@property (nonatomic,strong) UMContainer* currentContainer;
@property (nonatomic,strong) NSMutableDictionary *contextDictionary;
@property (nonatomic,readonly,strong) UMLayoutView*  viewObject;
@property (nonatomic,strong) UMLayoutView*	Main;
- (UMLayoutView*)Main BV_OBJC_METHOD_FAMILY_NONE;
@property (strong) UMLayoutView* viewPage0;
- (UMLayoutView*)viewPage0 BV_OBJC_METHOD_FAMILY_NONE;

@property (strong) UMLayoutView* panel0;
- (UMLayoutView*)panel0 BV_OBJC_METHOD_FAMILY_NONE;













@property (nonatomic,strong)UMEntityContext* context;
@property (nonatomic,strong)UMEntityContext* ctx;


@property (nonatomic,strong) UMView* listviewdefine0;

@property (nonatomic,strong) UMView* tabbar0;

@property (nonatomic,strong) UMView* label0;

@property (nonatomic,strong) UMView* label1;

@property (nonatomic,strong) UMView* imagebutton0;

@property (nonatomic,strong) UMView* imagebutton1;

@property (nonatomic,strong) UMView* tabbaritem0;

@property (nonatomic,strong) UMView* tabbaritem1;

@property (nonatomic,strong) UMView* tabbaritem2;

@property (nonatomic,strong) UMView* tabbaritem3;


- (void)dataBind:(NSString*)data;
- (id)initWithParentCtl:(UIViewController*)parentCtl;
//- (void)dispacherEventToWebview:(NSString*)params;
@end
