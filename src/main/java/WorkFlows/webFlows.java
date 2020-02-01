package WorkFlows;

import Extensions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;

public class webFlows extends commonOps
{
    @Step ("Login grafana flow")
    public static void login(String user, String pass)
    {
        uiActions.updateText(grafanaLogin.txt_userName, user);
        uiActions.updateText(grafanaLogin.txt_password, pass);
        uiActions.click(grafanaLogin.btn_login);
        uiActions.click(grafanaLogin.btn_skip);
    }

    @Step ("Create a new User")
    public static void createUser(String name, String email, String userNme, String password)
    {
        uiActions.click(grafanaServerAdminMainPage.btn_addNewUser);
        uiActions.updateText(grafanaUserListPage.txt_name, name);
        uiActions.updateText(grafanaUserListPage.txt_email, email);
        uiActions.updateText(grafanaUserListPage.txt_userName, userNme);
        uiActions.updateText(grafanaUserListPage.txt_password, password);
        uiActions.click(grafanaUserListPage.btn_create);
    }

    @Step ("Delete last User from Users table")
    public static void deleteLastUser()
    {
        uiActions.click(grafanaServerAdminMainPage.rows.get(grafanaServerAdminMainPage.rows.size()-1));
        uiActions.click(grafanaUserListPage.btn_deleteUser);
        uiActions.click(grafanaUserListPage.btn_confirmDelete);
    }
}
