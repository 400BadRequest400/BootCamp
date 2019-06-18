package amazonPackageTest;

import amazonPackage.Account;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountTest extends CommonAPI {

    Account account;

    @BeforeMethod
    public void init(){
        account = PageFactory.initElements(driver, Account.class);
    }
    @Test(enabled = true)
    public void setSigninTest(){
        account.setSignin();
    }
}