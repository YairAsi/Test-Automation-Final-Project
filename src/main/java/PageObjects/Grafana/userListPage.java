package PageObjects.Grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class userListPage
{
    @FindBy(how = How.CSS, using = "input[ng-model='user.name']")
    public WebElement txt_name;

    @FindBy(how = How.CSS, using = "input[type='email']")
    public WebElement txt_email;

    @FindBy(how = How.CSS, using = "input[ng-model='user.login']")
    public WebElement txt_userName;

    @FindBy(how = How.CSS, using = "input[type='password']")
    public WebElement txt_password;

    @FindBy(how = How.CSS, using = "button[class='btn btn-primary']")
    public WebElement btn_create;

    @FindBy(how = How.CSS, using = "button[ng-click='deleteUser(user)']")
    public WebElement btn_deleteUser;

    @FindBy(how = How.CSS, using = "button[ng-show='onConfirm']")
    public WebElement btn_confirmDelete;


}
