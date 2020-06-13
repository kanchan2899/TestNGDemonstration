package dataproviderpackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestClass {

    @Test(dataProvider = "login Data")
    public void testLogin(String username, String password){
        System.out.println("Username is " + username + " and password is " + password);
    }

    @DataProvider(name = "login Data")
    public Object[][] loginData(){
        String[][] data = {{"AdminUser", "AdminPassword" }, {"CustomerName", "CustomerPassword"}};
        return data;
    }
}
