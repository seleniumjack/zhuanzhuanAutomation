package com.young.appiumcombat.testcases.search;
import org.testng.annotations.Test;
import com.young.appiumcombat.base.BasePrepare;
import com.young.appiumcombat.pageshelper.HomePageHelper;

public class SearchPage_001_SearchDemo_Test  extends BasePrepare{
	
	@Test
	public void searchDemo(){
		
		//首页权限设置允许
		HomePageHelper.allowPermison(appiumUtil);
		HomePageHelper.weicharLogin(appiumUtil);
		HomePageHelper.cancelPop(appiumUtil);
		HomePageHelper.seletCity(appiumUtil);
		HomePageHelper.testeachData(appiumUtil);
		//HomePageHelper.eachData(appiumUtil,"可低价出售联系我！");
	}

}
