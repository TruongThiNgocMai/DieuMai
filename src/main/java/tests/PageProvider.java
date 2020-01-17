package tests;

import org.openqa.selenium.support.PageFactory;
import pages.*;
import runner.TestRunner;

public class PageProvider {

    private static LoginCustomerPage loginCustomerPage;
    private static DepositCustomerPage depositCustomerPage;
    private static WithdrawCustomerPage withdrawCustomerPage;
    private static TransactionCustomerPage transactionCustomerPage;
    private static AddCustomerPage addCustomerPage;
    private static OpenAccountPage openAccountPage;
    private static CommonPage commonPage;
    private static SearchCustomerPage searchCustomerPage;
    private static DeleteCustomerPage deleteCustomerPage;
    private static LogoutCustomerPage logoutCustomerPage;

    public static AddCustomerPage getAddCustomerPage() {
//        if (addCustomerPage == null) {
            addCustomerPage = PageFactory.initElements(TestRunner.driver, AddCustomerPage.class);
//        }
        return addCustomerPage;
    }

    public static OpenAccountPage getOpenAccountPage() {
//        if (openAccountPage == null) {
            openAccountPage = PageFactory.initElements(TestRunner.driver, OpenAccountPage.class);
//        }
        return openAccountPage;
    }

    public static CommonPage getCommonPage() {
//        if (commonPage == null) {
            commonPage = PageFactory.initElements(TestRunner.driver, CommonPage.class);
//        }
        return commonPage;
    }

    public static SearchCustomerPage getSearchCustomerPage() {
//        if (searchCustomerPage == null) {
            searchCustomerPage = PageFactory.initElements(TestRunner.driver, SearchCustomerPage.class);
//        }
        return searchCustomerPage;
    }

    public static DeleteCustomerPage getDeleteCustomerPage() {
        if (deleteCustomerPage == null) {
            deleteCustomerPage = PageFactory.initElements(TestRunner.driver, DeleteCustomerPage.class);
        }
        return deleteCustomerPage;
    }

    public static LoginCustomerPage getLoginCustomerPage(){
//        if (loginCustomerPage == null) {
            loginCustomerPage = PageFactory.initElements(TestRunner.driver, LoginCustomerPage.class);
//        }
        return loginCustomerPage;
    }

    public static DepositCustomerPage getDepositCustomerPage(){
        if (depositCustomerPage == null) {
            depositCustomerPage = PageFactory.initElements(TestRunner.driver, DepositCustomerPage.class);
        }
        return depositCustomerPage;
    }

    public static WithdrawCustomerPage getWithdrawCustomerPage(){
        if (withdrawCustomerPage == null) {
            withdrawCustomerPage = PageFactory.initElements(TestRunner.driver, WithdrawCustomerPage.class);
        }
        return withdrawCustomerPage;
    }

    public static TransactionCustomerPage getTransactionPage(){
        if (transactionCustomerPage == null) {
            transactionCustomerPage = PageFactory.initElements(TestRunner.driver, TransactionCustomerPage.class);
        }
        return transactionCustomerPage;
    }

    public static LogoutCustomerPage getLogoutCustomerPage(){
//        if (logoutCustomerPage == null) {
            logoutCustomerPage = PageFactory.initElements(TestRunner.driver, LogoutCustomerPage.class);
//        }
        return logoutCustomerPage;
    }

}
