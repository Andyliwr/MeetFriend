//
//  AppDelegate.h
//
//
//  Created by zhangyuv.
//  Copyright (c) 2013年 yonyou. All rights reserved.
//

#import <UIKit/UIKit.h>
#import <UMIOSControls/UMIOSControls.h>
#import "WXApi.h"

@class CustomUI_yingdaoController;

@interface AppDelegate:UIResponder <UIApplicationDelegate,WXApiDelegate>
@property (nonatomic,strong) UIWindow* window;
@property (nonatomic,strong) UMContainer* currentContainer;
@property (nonatomic,strong) UMPNavigationController* navigationCtl;
@property (nonatomic,strong) NSMutableDictionary* plugDict;
@property (strong) CustomUI_yingdaoController* yingdao;
- (CustomUI_yingdaoController*)yingdao BV_OBJC_METHOD_FAMILY_NONE;


//实现<UMApplicationDelegate>协议的类型
@property(nonatomic,strong)NSString *delegateClass;

#pragma mark weixin
/*
 enum WXScene {
 
 WXSceneSession  = 0,        // 聊天界面
 WXSceneTimeline = 1,        // 朋友圈
 WXSceneFavorite = 2,        // 收藏
 };
 */
@property (nonatomic,assign) enum WXScene scene;//微信分享类型

/*
 * 微信 发送消息
 */
- (void) sendTextContent:(NSString*)msg type:(NSString *)type;

/*
 * 微信 发送图片
 */
- (void) sendImageContent:(UIImage *)image type:(NSString *)type;
/*
 * 微信 发送link
 */
-(void)sendLinkContent:(NSArray *)info;
@end
