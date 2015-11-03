//
//  AppDelegate.h
//
//
//  Created by zhangyuv.
//  Copyright (c) 2013年 yonyou. All rights reserved.
//

#import "AppDelegate.h"
#import "CustomUI_yingdaoController.h"

@implementation AppDelegate
@synthesize window = _window;
@synthesize currentContainer = _currentContainer, navigationCtl = _navigationCtl, plugDict=_plugDict;
@synthesize yingdao = _yingdao;



-(NSString *)delegateClass{

    return @"";
}

- (BOOL)application:(UIApplication*)application didFinishLaunchingWithOptions:(NSDictionary*)launchOptions
{

   
    NSArray *delegateArr = [self.delegateClass componentsSeparatedByString:@","];
    for(NSString * delegate in delegateArr)
    {
        Class extendClass = NSClassFromString(delegate);
        
        if([extendClass respondsToSelector:@selector(application:didFinishLaunchingWithOptions:)])
        {
            //第三方实现UIApplicationDelegate协议
            id <UIApplicationDelegate>extendDelegate = [extendClass sharedInstance];
            [extendDelegate application:application didFinishLaunchingWithOptions:launchOptions];
        }
    }


	_plugDict = [[NSMutableDictionary alloc] initWithCapacity:1];
	_currentContainer = [[UMContainer alloc] init];
	_window = [[UIWindow alloc] initWithFrame:[[UIScreen mainScreen] bounds]];
	_window.backgroundColor = [UIColor whiteColor];
	[UMService checkVersion:nil];
	_navigationCtl = [[UMPNavigationController alloc] init];
    _navigationCtl.navigationBarHidden = YES;
    _yingdao = [[CustomUI_yingdaoController alloc] initWithParentCtl:nil];
    [_navigationCtl pushViewController:_yingdao animated:YES];
    self.window.rootViewController = _navigationCtl;

	[self.window makeKeyAndVisible];



    [UIApplication sharedApplication].applicationIconBadgeNumber = 0;
    
    // 注册推送通知
    if ([[[UIDevice currentDevice] systemVersion] floatValue] >= 8.0) {
        [application registerForRemoteNotifications];
        UIUserNotificationType notificationTypes = UIUserNotificationTypeBadge | UIUserNotificationTypeSound | UIUserNotificationTypeAlert;
        UIUserNotificationSettings *settings = [UIUserNotificationSettings settingsForTypes:notificationTypes categories:nil];
        [application registerUserNotificationSettings:settings];
    }else{
        UIRemoteNotificationType notificationTypes = UIRemoteNotificationTypeBadge | UIRemoteNotificationTypeSound | UIRemoteNotificationTypeAlert;
        [[UIApplication sharedApplication] registerForRemoteNotificationTypes:notificationTypes];
    }

	//启动动画 
    //[[UmpStartController  sharedStartAnimation] show:kUmpMoveTypeTop time:1.0];
	return YES;
}

- (void)application:(UIApplication *)application didRegisterForRemoteNotificationsWithDeviceToken:(NSData *)pToken {
    
    NSArray *delegateArr = [self.delegateClass componentsSeparatedByString:@","];
    for(NSString * delegate in delegateArr)
    {
        Class extendClass = NSClassFromString(delegate);
        
        if([extendClass respondsToSelector:@selector(application:didRegisterForRemoteNotificationsWithDeviceToken:)])
        {
            //第三方实现UIApplicationDelegate协议
            id <UIApplicationDelegate>extendDelegate = [extendClass sharedInstance];
            [extendDelegate application:application didRegisterForRemoteNotificationsWithDeviceToken:pToken];
        }
    }
    
    NSString *token = [[pToken description] stringByTrimmingCharactersInSet:[NSCharacterSet characterSetWithCharactersInString:@"<>"]];
	token = [token stringByReplacingOccurrencesOfString:@" " withString:@""];
    
    [UMSetting sharedInstance].pushtoken = token;//本地保存
    NSLog(@"regisger success:%@",token);
    //注册成功，将deviceToken保存到应用服务器数据库中
}
- (void)applicationWillResignActive:(UIApplication*)application
{
    
    NSArray *delegateArr = [self.delegateClass componentsSeparatedByString:@","];
    for(NSString * delegate in delegateArr)
    {
        Class extendClass = NSClassFromString(delegate);
        
        if([extendClass respondsToSelector:@selector(applicationWillResignActive:)])
        {
            //第三方实现UIApplicationDelegate协议
            id <UIApplicationDelegate>extendDelegate = [extendClass sharedInstance];
            [extendDelegate applicationWillResignActive:application];
        }
    }
    
    
}
- (void)applicationDidEnterBackground:(UIApplication*)application
{
    NSArray *delegateArr = [self.delegateClass componentsSeparatedByString:@","];
    for(NSString * delegate in delegateArr)
    {
        Class extendClass = NSClassFromString(delegate);
        
        if([extendClass respondsToSelector:@selector(applicationDidEnterBackground:)])
        {
            //第三方实现UIApplicationDelegate协议
            id <UIApplicationDelegate>extendDelegate = [extendClass sharedInstance];
            [extendDelegate applicationDidEnterBackground:application];
        }
    }
}
- (void)applicationWillEnterForeground:(UIApplication*)application
{
    
    NSArray *delegateArr = [self.delegateClass componentsSeparatedByString:@","];
    for(NSString * delegate in delegateArr)
    {
        Class extendClass = NSClassFromString(delegate);
        
        if([extendClass respondsToSelector:@selector(applicationWillEnterForeground:)])
        {
            //第三方实现UIApplicationDelegate协议
            id <UIApplicationDelegate>extendDelegate = [extendClass sharedInstance];
            [extendDelegate applicationWillEnterForeground:application];
        }
    }
}
- (void)applicationDidBecomeActive:(UIApplication*)application
{
    
    NSArray *delegateArr = [self.delegateClass componentsSeparatedByString:@","];
    for(NSString * delegate in delegateArr)
    {
        Class extendClass = NSClassFromString(delegate);
        
        if([extendClass respondsToSelector:@selector(applicationDidBecomeActive:)])
        {
            //第三方实现UIApplicationDelegate协议
            id <UIApplicationDelegate>extendDelegate = [extendClass sharedInstance];
            [extendDelegate applicationDidBecomeActive:application];
        }
    }
}
- (void)applicationWillTerminate:(UIApplication*)application
{
    
    NSArray *delegateArr = [self.delegateClass componentsSeparatedByString:@","];
    for(NSString * delegate in delegateArr)
    {
        Class extendClass = NSClassFromString(delegate);
        
        if([extendClass respondsToSelector:@selector(applicationWillTerminate:)])
        {
            //第三方实现UIApplicationDelegate协议
            id <UIApplicationDelegate>extendDelegate = [extendClass sharedInstance];
            [extendDelegate applicationWillTerminate:application];
        }
    }
}

- (void)application:(UIApplication *)application didFailToRegisterForRemoteNotificationsWithError:(NSError *)error {

    NSArray *delegateArr = [self.delegateClass componentsSeparatedByString:@","];
    for(NSString * delegate in delegateArr)
    {
        Class extendClass = NSClassFromString(delegate);
        
        if([extendClass respondsToSelector:@selector(application:didFailToRegisterForRemoteNotificationsWithError:)])
        {
            //第三方实现UIApplicationDelegate协议
            id <UIApplicationDelegate>extendDelegate = [extendClass sharedInstance];
            [extendDelegate application:application didFailToRegisterForRemoteNotificationsWithError:error];
        }
    }
}

- (void)application:(UIApplication *)application didReceiveRemoteNotification:(NSDictionary *)userInfo {

    NSArray *delegateArr = [self.delegateClass componentsSeparatedByString:@","];
    for(NSString * delegate in delegateArr)
    {
        Class extendClass = NSClassFromString(delegate);
        
        if([extendClass respondsToSelector:@selector(application:didReceiveRemoteNotification:)])
        {
            //第三方实现UIApplicationDelegate协议
            id <UIApplicationDelegate>extendDelegate = [extendClass sharedInstance];
            [extendDelegate application:application didReceiveRemoteNotification:userInfo];
        }
    }
}

- (void)application:(UIApplication *)application didReceiveRemoteNotification:(NSDictionary *)userInfo fetchCompletionHandler:(void (^)(UIBackgroundFetchResult))completionHandler {
    
    NSArray *delegateArr = [self.delegateClass componentsSeparatedByString:@","];
    for(NSString * delegate in delegateArr)
    {
        Class extendClass = NSClassFromString(delegate);
        
        if([extendClass respondsToSelector:@selector(application:didReceiveRemoteNotification:fetchCompletionHandler:)])
        {
            //第三方实现UIApplicationDelegate协议
            id <UIApplicationDelegate>extendDelegate = [extendClass sharedInstance];
            [extendDelegate application:application didReceiveRemoteNotification:userInfo fetchCompletionHandler:completionHandler];
        }
    }
}

- (void)application:(UIApplication *)application didReceiveLocalNotification:(UILocalNotification *)notification {


    NSArray *delegateArr = [self.delegateClass componentsSeparatedByString:@","];
    for(NSString * delegate in delegateArr)
    {
        Class extendClass = NSClassFromString(delegate);
        
        if([extendClass respondsToSelector:@selector(application:didReceiveLocalNotification:fetchCompletionHandler:)])
        {
            //第三方实现UIApplicationDelegate协议
            id <UIApplicationDelegate>extendDelegate = [extendClass sharedInstance];
            [extendDelegate application:application didReceiveLocalNotification:notification];
        }
    }
}

#pragma mark weixin

-(void) onReq:(BaseReq*)req
{
    if([req isKindOfClass:[GetMessageFromWXReq class]])
    {
        
    }
    else if([req isKindOfClass:[ShowMessageFromWXReq class]])
    {
        
    }
    
}

-(void) onResp:(BaseResp*)resp
{
    //可以省略
    if([resp isKindOfClass:[SendMessageToWXResp class]])
    {
    }else if([resp isKindOfClass:[GetMessageFromWXReq class]]){
        
    }
    
}



- (void) sendTextContent:(NSString*)msg type:(NSString *)type
{
    if ([WXApi isWXAppInstalled] && [WXApi isWXAppSupportApi]) {
        
        SendMessageToWXReq* req = [[SendMessageToWXReq alloc] init];
        req.text = msg;
        req.bText = YES;
        req.scene = WXSceneSession;
        if ([type isEqualToString:@"friend"]) {
            req.scene = WXSceneTimeline;
        }

        
        if ([WXApi sendReq:req]) {//发送图片
            
            NSLog(@"发送文字成功!");
        }
        
    }else{
        
        UIAlertView *alView = [[UIAlertView alloc]initWithTitle:@"" message:@"你的iPhone上还没有安装微信,无法使用此功能，使用微信可以方便的把你喜欢的作品分享给好友。" delegate:self cancelButtonTitle:@"取消" otherButtonTitles:@"免费下载微信", nil];
        [alView show];
        
    }
}

- (void) sendImageContent:(UIImage *)image type:(NSString *)type
{
    
    if ([WXApi isWXAppInstalled] && [WXApi isWXAppSupportApi]) {
        
        WXMediaMessage *message = [WXMediaMessage message];
        
        [message setThumbImage:image];
        
        WXImageObject *ext = [WXImageObject object];
        ext.imageData = UIImagePNGRepresentation(image);
        
        message.mediaObject = ext;
        
        SendMessageToWXReq* req = [[SendMessageToWXReq alloc] init];
        req.bText = NO;
        req.message = message;

        req.scene = WXSceneSession;
        if ([type isEqualToString:@"friend"]) {
            req.scene = WXSceneTimeline;
        }
        
        if ([WXApi sendReq:req]) {//发送图片
            
        }else{
            
            UIAlertView *alView = [[UIAlertView alloc]initWithTitle:@"提示" message:@"分享失败" delegate:self cancelButtonTitle:@"确定" otherButtonTitles:nil, nil];
            [alView show];
        }
        
    }else{
        
        UIAlertView *alView = [[UIAlertView alloc]initWithTitle:@"" message:@"你的iPhone上还没有安装微信,无法使用此功能，使用微信可以方便的把你喜欢的作品分享给好友。" delegate:self cancelButtonTitle:@"取消" otherButtonTitles:@"免费下载微信", nil];
        [alView show];
        
    }
    
    
}

-(void)sendLinkContent:(NSArray *)info
{
    
    NSString * url = [info objectAtIndex:0];
    NSString * title = [info objectAtIndex:1];
    NSString * des = [info objectAtIndex:2];
    UIImage * image = [info objectAtIndex:3];
    NSString * type = [info objectAtIndex:4];
    
    
    if ([WXApi isWXAppInstalled] && [WXApi isWXAppSupportApi]) {
        
        WXMediaMessage *message = [WXMediaMessage message];
        message.title = title;
        message.description = des;
        if (image) {
            [message setThumbImage:image];
        }
        
        WXWebpageObject *ext = [WXWebpageObject object];
        ext.webpageUrl = url;
        
        message.mediaObject = ext;
        
        SendMessageToWXReq* req = [[SendMessageToWXReq alloc] init];
        req.bText = NO;
        req.message = message;
        req.scene = WXSceneSession;
        if ([type isEqualToString:@"friend"]) {
            req.scene = WXSceneTimeline;
        }
        
        if ([WXApi sendReq:req]) {
            
            NSLog(@"发送link成功!");
        }
        
    }else{
        
        UIAlertView *alView = [[UIAlertView alloc]initWithTitle:@"" message:@"你的iPhone上还没有安装微信,无法使用此功能，使用微信可以方便的把你喜欢的作品分享给好友。" delegate:self cancelButtonTitle:@"取消" otherButtonTitles:@"免费下载微信", nil];
        [alView show];
        
    }
    
    
}


- (void) sendNonGifContent
{
    WXMediaMessage *message = [WXMediaMessage message];
    [message setThumbImage:[UIImage imageNamed:@"res5thumb.png"]];
    
    WXEmoticonObject *ext = [WXEmoticonObject object];
    NSString *filePath = [[NSBundle mainBundle] pathForResource:@"res5" ofType:@"jpg"];
    ext.emoticonData = [NSData dataWithContentsOfFile:filePath];
    
    message.mediaObject = ext;
    
    SendMessageToWXReq* req = [[SendMessageToWXReq alloc] init];
    req.bText = NO;
    req.message = message;
    req.scene = _scene;
    
    [WXApi sendReq:req];
}

/*! @brief 处理微信通过URL启动App时传递的数据
 *
 * 需要在 application:openURL:sourceApplication:annotation:或者application:handleOpenURL中调用。
 * @param url 微信启动第三方应用时传递过来的URL
 * @param delegate  WXApiDelegate对象，用来接收微信触发的消息。
 * @return 成功返回YES，失败返回NO。
 */
- (BOOL)application:(UIApplication *)application handleOpenURL:(NSURL *)url
{

    NSArray *delegateArr = [self.delegateClass componentsSeparatedByString:@","];
    for(NSString * delegate in delegateArr)
    {
        Class extendClass = NSClassFromString(delegate);
        
        if([extendClass respondsToSelector:@selector(application:handleOpenURL:)])
        {
            //第三方实现UIApplicationDelegate协议
            id <UIApplicationDelegate>extendDelegate = [extendClass sharedInstance];
            [extendDelegate application:application handleOpenURL:url];
        }
    }


    return  [WXApi handleOpenURL:url delegate:self];
}

/*! @brief 处理微信通过URL启动App时传递的数据
 *
 * 需要在 application:openURL:sourceApplication:annotation:或者application:handleOpenURL中调用。
 * @param url 微信启动第三方应用时传递过来的URL
 * @param delegate  WXApiDelegate对象，用来接收微信触发的消息。
 * @return 成功返回YES，失败返回NO。
 */
- (BOOL)application:(UIApplication *)application openURL:(NSURL *)url sourceApplication:(NSString *)sourceApplication annotation:(id)annotation
{



    NSArray *delegateArr = [self.delegateClass componentsSeparatedByString:@","];
    for(NSString * delegate in delegateArr)
    {
        Class extendClass = NSClassFromString(delegate);
        
        if([extendClass respondsToSelector:@selector(application:openURL:sourceApplication:annotation:)])
        {
            //第三方实现UIApplicationDelegate协议
            id <UIApplicationDelegate>extendDelegate = [extendClass sharedInstance];
            [extendDelegate application:application openURL:url sourceApplication:sourceApplication annotation:annotation];
        }
    }
    

    BOOL isSuc = [WXApi handleOpenURL:url delegate:self];
    NSLog(@"url %@ isSuc %d",url,isSuc == YES ? 1 : 0);
    
    if ([sourceApplication hasPrefix:@"com.ufida.uap"]) {//用友桌面
        
        [[NSUserDefaults standardUserDefaults] setBool:YES forKey:@"UALogin"];//UA桌面	
        
        NSDictionary * dic = [[NSDictionary alloc] init];
        
        if ([url query] != nil) {
            
            dic = (NSDictionary *)[self getJsonFromUrl:[url query]];
        }
        
        if ([[dic allKeys] containsObject:@"massotoken"]) {//唯一标识
            
            NSString * masstoken = [dic valueForKey:@"massotoken"];
            if (masstoken != nil) {
                
                [[NSUserDefaults standardUserDefaults] setObject:masstoken forKey:@"massotoken"];
            }
        }
        if ([[dic allKeys] containsObject:@"host"] && [[dic allKeys] containsObject:@"port"]) {//ip
            
            NSString * host = [dic valueForKey:@"host"];
            NSString * port = [dic valueForKey:@"port"];
            
            if (host != nil && port != nil ) {
                
                [UMSetting sharedInstance].serverUrl = [NSString stringWithFormat:@"http://%@:%@/",host,port];
            }
        }

    }
    

    
    
    return  YES;
}
/*
 *  write by dingh
 *
 * @prama
 *         json  url query
 *         eg:   masstoken=111&user=demo&pass=00
 
 @return dictionary
 */
-(NSMutableDictionary *)getJsonFromUrl:(NSString *)json{
    
    NSMutableDictionary * list = [[NSMutableDictionary alloc] init];
    
    NSArray * arr = [[NSArray alloc] init];
    arr = [json componentsSeparatedByString:@"&"];
    
    for (int i=0; i< arr.count; i++) {
        
        NSString * obj = [arr objectAtIndex:i];
        
        NSRange  range = [obj rangeOfString:@"="];
        
        if (range.length > 0) {
            
            NSString * key = [obj substringToIndex:range.location];
            NSString * value = [obj substringFromIndex:range.location+1];
            
            [list setValue:value forKey:key];
            
        }
        
    }
    
    return list;
}
@end
