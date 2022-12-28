package scripts;

import org.testng.annotations.Test;

import genericLibraries.StepGroup;
import pompages.Addtocart;
import pompages.SkillraryDemoLogin;
import pompages.SkillrrayLogin;

public class Testcase1 extends StepGroup{
	
	@Test
	public void tc1(){
	SkillrrayLogin l=new SkillrrayLogin(driver);
	l.gearsButton();
	l.demoskillraryapp();
	
	SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
	driverutilies.switchTabs(driver);
	driverutilies.mouseHover(driver,sd.getCoursetab());
	sd.seleniumtraiingbtn();
	
	Addtocart ad=new Addtocart(driver);
	driverutilies.doubleclick(driver,ad.getAddbtn());
	ad.addtocartbutton();
	driverutilies.alertpopup(driver);
	}

}