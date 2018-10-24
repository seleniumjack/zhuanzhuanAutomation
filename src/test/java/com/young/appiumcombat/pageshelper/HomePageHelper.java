package com.young.appiumcombat.pageshelper;

import java.util.List;
import java.util.Set;

import io.appium.java_client.TouchAction;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import com.young.appiumcombat.pages.HomePage;
import com.young.appiumcombat.utils.AppiumUtil;
/**
 * 首页帮助类
 * 
 * */

public class HomePageHelper {
	//本类日志对象
	public static Logger logger = Logger.getLogger(HomePageHelper.class);
	
	/**
	 * @author Young
	 * @param appiumUtil Appium封装对象引用
	 * @param byElement 要点击的元素By对象
	 * @description 在首页上进行点击操作
	 * */
	public static  void seletCity(AppiumUtil appiumUtil){
		
		//点击摄影器材
		appiumUtil.click(By.xpath("//android.widget.TextView[contains(@text,'交通工具')]"));
		appiumUtil.pause(2);
		appiumUtil.click(By.xpath("//android.widget.TextView[contains(@text,'电动车')]"));



		appiumUtil.pause(2);
		//点击区域
		appiumUtil.click(By.xpath("//android.widget.TextView[contains(@text,'区域')]"));
		appiumUtil.pause(2);
		
		//城市集合外层
		 WebElement cityLayout=appiumUtil.findElement(By.id("com.wuba.zhuanzhuan:id/nj"));
		 appiumUtil.pause(2);
		 WebElement listCity=cityLayout.findElements(By.className("android.widget.ListView")).get(0);
		  appiumUtil.pause(2);
		 listCity.findElement(By.xpath("//android.widget.TextView[contains(@text,'上海')]")).click();
		
		appiumUtil.pause(2);
	    //点击全北京
	    appiumUtil.click(By.xpath("//android.widget.TextView[contains(@text,'全上海')]"));
	    appiumUtil.pause(2);
		//点击数码
		
	} 
	public static void  weicharLogin(AppiumUtil appiumUtil){
		//点击我的
		appiumUtil.click(By.id("com.wuba.zhuanzhuan:id/axs"));
		appiumUtil.pause(2);
		//点击立即登录
		appiumUtil.click(By.id("com.wuba.zhuanzhuan:id/a12"));
		appiumUtil.pause(2);
		//微信登录
	    appiumUtil.click(By.id("com.wuba.zhuanzhuan:id/bsu"));
	    appiumUtil.pause(2);

		//点击分类
		appiumUtil.click(By.id("com.wuba.zhuanzhuan:id/axo"));
		appiumUtil.pause(2);
	}

	//元素是否可点击
	public  static String getclickable(String keyword,WebElement element){

		try{
			return element.getAttribute(keyword);
		}catch ( Exception e){
			return null;
		}
	}
	//取消弹幕
	public static void cancelPop(AppiumUtil appiumUtil){

		//点击我的
		appiumUtil.click(By.id("com.wuba.zhuanzhuan:id/axs"));
		appiumUtil.pause(2);
		//点击设置
		appiumUtil.click(By.id("com.wuba.zhuanzhuan:id/bo1"));
		appiumUtil.pause(2);
		//关闭弹幕
		appiumUtil.clickPoint(1000,262);
		appiumUtil.pause(2);
		//点击返回
		appiumUtil.click(By.id("com.wuba.zhuanzhuan:id/p5"));
		appiumUtil.pause(2);

		//点击分类
		appiumUtil.click(By.id("com.wuba.zhuanzhuan:id/axo"));
		appiumUtil.pause(2);

	}


	//返回集合元素
	public static WebElement layOutElement(AppiumUtil appiumUtil,int index){
		WebElement recyclerElement=null;
		recyclerElement = appiumUtil.findElement(By.id("com.wuba.zhuanzhuan:id/oe"));
		List<WebElement> list=null;
		list = recyclerElement.findElements(By.className("android.widget.FrameLayout"));
		return list.get(index);
	}
	public static void testeachData(AppiumUtil appiumUtil){

		try {
			//获取数据外层元素   id：com.wuba.zhuanzhuan:id/oe
			for (int i = 0; i < 100; i++) {

				WebElement recyclerElement=null;
				recyclerElement = appiumUtil.findElement(By.id("com.wuba.zhuanzhuan:id/oe"));
				List<WebElement> list=null;
				list = recyclerElement.findElements(By.className("android.widget.FrameLayout"));
				int  count=list.size();

				//上面位置 0 165

				WebElement current = layOutElement(appiumUtil,count-1);
				int benginx = current.getLocation().x;
				int benginy = current.getLocation().y;
				//滑动
				appiumUtil.SwipToUp(benginx, benginy, 0, 220);
			}

		} catch (Exception e) {
			logger.error(e.getMessage());
		}

	}
	public static void eachData(AppiumUtil appiumUtil, String content) {

		try {
			//获取数据外层元素   id：com.wuba.zhuanzhuan:id/oe
			for (int i = 0; i < 100; i++) {

				WebElement recyclerElement=null;
				 recyclerElement = appiumUtil.findElement(By.id("com.wuba.zhuanzhuan:id/oe"));
				List<WebElement> list=null;
				list = recyclerElement.findElements(By.className("android.widget.FrameLayout"));
				int  count=list.size();
				for (int j=0;j<count;j++) {

					String clickable = getclickable("clickable",layOutElement(appiumUtil,j));
					if (clickable.equals("false")) {
						continue;
					}
					layOutElement(appiumUtil,j).click();
					appiumUtil.pause(2);

					if (appiumUtil.findElement(By.xpath("//android.widget.TextView[contains(@text,'聊一聊')]")) == null) {
						appiumUtil.click(By.id("com.wuba.zhuanzhuan:id/i1"));
						appiumUtil.pause(2);
						continue;
					}


					appiumUtil.click(By.xpath("//android.widget.TextView[contains(@text,'聊一聊')]"));
					appiumUtil.pause(2);
					// 输入聊天内容
					appiumUtil.typeContent(By.id("com.wuba.zhuanzhuan:id/bk1"), content);
					appiumUtil.pause(2);
					// 点击发送按钮
					appiumUtil.click(By.id("com.wuba.zhuanzhuan:id/bk6"));
					appiumUtil.pause(2);
					// 聊天窗口返回按钮 id：com.wuba.zhuanzhuan:id/jk

					appiumUtil.click(By.id("com.wuba.zhuanzhuan:id/jk"));
					// 产品详情点击返回 com.wuba.zhuanzhuan:id/i1
					appiumUtil.pause(2);

					appiumUtil.click(By.id("com.wuba.zhuanzhuan:id/i1"));
					appiumUtil.pause(2);


				}
				//上面位置 0 165

				WebElement current = layOutElement(appiumUtil,count-1);
				int benginx = current.getLocation().x;
				int benginy = current.getLocation().y;
				//滑动
				appiumUtil.SwipToUp(benginx, benginy, 0, 220);
			}

		} catch (Exception e) {
			logger.error(e.getMessage());
		}

	}

	//权限允许
	public static void allowPermison(AppiumUtil appiumUtil) {

		
		// 手机定位允许
		appiumUtil.click(By.id("android:id/button1"));

		//暂停两秒
		appiumUtil.pause(2);
		
		// 媒体内容允许
		appiumUtil.click(By.id("android:id/button1"));

	}

	public static void createOrder(AppiumUtil appiumUtil) {
		
		
		
		
	}
	public static void   getcontext(AppiumUtil appiumUtil){
		Set<String> contexts=appiumUtil.getcontext();
		for(String context: contexts) {
			System.out.println(context); //会打印出  NATIVE_APP（原生apphandle）和WEBVIEW_com.example.testapp(webview的 handle)
		}
		appiumUtil.context((String) contexts.toArray()[1]);
	}
	
	/**等待首页元素显示出来*/
	public static void waitHomeUI(AppiumUtil appiumUtil,int elementTimeOut){
		logger.info("正在等待APP首页元素加载");
		appiumUtil.waitForElementToLoad(elementTimeOut, HomePage.HP_BUTTON_SEARCH);
		appiumUtil.waitForElementToLoad(elementTimeOut, HomePage.HP_BUTTON_ACADEMIC);
		appiumUtil.waitForElementToLoad(elementTimeOut, HomePage.HP_BUTTON_DICT);
		appiumUtil.waitForElementToLoad(elementTimeOut, HomePage.HP_BUTTON_IMAGE);
		appiumUtil.waitForElementToLoad(elementTimeOut, HomePage.HP_BUTTON_MORE);
		appiumUtil.waitForElementToLoad(elementTimeOut, HomePage.HP_BUTTON_VDEDIO);
		appiumUtil.waitForElementToLoad(elementTimeOut, HomePage.HP_LINK_STORY);
		logger.info("APP首页元素加载完成");
	}
	
	/**验证首页部分文本内容*/
	public static void checkHomeUIText(AppiumUtil appiumUtil,String expected){
		logger.info("正在验证APP首页文本内容是否正确");
		appiumUtil.isTextCorrect(appiumUtil.getText(HomePage.HP_LINK_STORY), expected);
		logger.info("验证APP首页文本内容完成");
	}
	

}
