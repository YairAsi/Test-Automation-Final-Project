package Helpers;

import Utilities.commonOps;
import Utilities.helperMethods;
import WorkFlows.webFlows;
import org.testng.annotations.Test;

public class visualTesting extends commonOps
{
    @Test
    public void createScreenShot()
    {
        webFlows.login("admin", "admin");
        helperMethods.takeElementScreenShot(grafanaLeftMenu.img_Avatar, "grafanaAvatar_Version1.00");
    }
}
