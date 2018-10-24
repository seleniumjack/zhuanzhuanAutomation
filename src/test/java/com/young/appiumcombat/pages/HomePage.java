package com.young.appiumcombat.pages;

import org.openqa.selenium.By;

/**@author Young
 * @description APP首页元素
 * */

public class HomePage {
	
	public static final By HP_DIV_DAIKUAN=By.name("帮您贷款");
	/**搜索按钮*/
	 public static final By HP_BUTTON_SEARCH = By.id("com.microsoft.bing:id/search"); 
	/**更多内容按钮*/
	 public static final By HP_BUTTON_MORE = By.id("com.microsoft.bing:id/search_homepage_hamburger"); 
	/**图片按钮*/
	 public static final By HP_BUTTON_IMAGE = By.id("com.microsoft.bing:id/hp_scope_images"); 
	/**视频按钮*/
	 public static final By HP_BUTTON_VDEDIO = By.id("com.microsoft.bing:id/hp_scope_videos"); 
	/**学术按钮*/
	 public static final By HP_BUTTON_ACADEMIC = By.id("com.microsoft.bing:id/hp_scope_academic"); 
	/**词典按钮*/
	 public static final By HP_BUTTON_DICT = By.id("com.microsoft.bing:id/hp_scope_dict");
	 /**图片故事*/
	 public static final By HP_LINK_STORY = By.id("com.microsoft.bing:id/opal_home_picture_story_text1");
	 
	 public static final By HP_IMAGE_BAR=By.className("android.widget.ImageView");
	 
	 public static final By HP_POP_CLOSE=By.id("com.taoche.yixin.app:id/img_floating_layer_close");
	 
	 //com.android.packageinstaller:id/permission_allow_button
	 public static final By HP_POP_ALLOW=By.id("com.android.packageinstaller:id/permission_allow_button");
	 
	 //点击开启 com.wuba.zhuanzhuan:id/atg android.widget.Button
	 public static final By HP_POP_LANUCH=By.className("android.widget.Button");
	 
	 
	 
	 
	

}
