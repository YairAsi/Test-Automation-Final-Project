package SanityTests;

import Extensions.uiActions;
import Extensions.verifications;
import Utilities.commonOps;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class grafanaWeb extends commonOps
{
    @Test(description = "Test01 : Login to Grafana")
    @Description ("Test description: Login to Grafana Web application")
    public void test01_login()
    {
        webFlows.login("admin", "admin");
        verifications.textInElement(grafanaMainPage.txt_mainHeading, "Home Dashboard");
    }

    @Test(description = "Test02: Verify default User")
    @Description("Test description : Verify The Default Numbers of Users (should by 1)")
    public void test02_verifyDefaultUsers()
    {
        uiActions.mouseHver(grafanaLeftMenu.btn_serverAdmin, grafanaServerAdminMenuPage.link_users);
        verifications.numberOfElements(grafanaServerAdminMainPage.rows, 1);
    }

    @Test(description = "Test03: Add and Verify Users")
    @Description("Test description : Add a new User and Verify the Number of Users 2")
    public void test03_addAndVerifyUsers()
    {
        uiActions.mouseHver(grafanaLeftMenu.btn_serverAdmin, grafanaServerAdminMenuPage.link_users);
        webFlows.createUser("Yair", "yair@gmail.com", "YairA", "123456");
        verifications.numberOfElements(grafanaServerAdminMainPage.rows, 2);
    }

    @Test(description = "Test04: Delete the last User and Verify Users")
    @Description("Test description : Delete the last User created and Verify the NUmber of Users is 1")
    public void test04_deleteAndVerifyUsers()
    {
        uiActions.mouseHver(grafanaLeftMenu.btn_serverAdmin, grafanaServerAdminMenuPage.link_users);
        webFlows.deleteLastUser();
        verifications.numberOfElements(grafanaServerAdminMainPage.rows, 1);
    }

    @Test(description = "Test04: Delete the last User and Verify Users")
    @Description("Test description : Verify Grafana's default (admin) Logo")
    public void test05_verifyLogo()
    {
        webFlows.login("admin", "admin");
        verifications.visualElement(grafanaLeftMenu.img_Avatar, "grafanaAvatar");
    }
}
