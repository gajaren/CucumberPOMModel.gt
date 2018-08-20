$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Valid Login Feature",
  "description": "",
  "id": "free-crm-login-feature;free-crm-valid-login-feature",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters \"gajaren\" and \"*Test123#\" and clicks on login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Home page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "check contacts tab on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_login_page()"
});
formatter.result({
  "duration": 23865601646,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gajaren",
      "offset": 13
    },
    {
      "val": "*Test123#",
      "offset": 27
    }
  ],
  "location": "LoginStepDefinition.user_enters_username_and_password_and_clicks_on_login_button(String,String)"
});
formatter.result({
  "duration": 8219720,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.sendKeys(Unknown Source)\r\n\tat com.crm.Pages.LoginPage.enterUsernamePassword(LoginPage.java:29)\r\n\tat com.crm.StepDefinition.LoginStepDefinition.user_enters_username_and_password_and_clicks_on_login_button(LoginStepDefinition.java:30)\r\n\tat ✽.When User enters \"gajaren\" and \"*Test123#\" and clicks on login button(Login.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefinition.home_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.check_contacts_tab_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 11,
  "name": "Free CRM Invalid login",
  "description": "",
  "id": "free-crm-login-feature;free-crm-invalid-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User enters Invalid username and password and clicks on login button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User not logged in and stays on the same page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_login_page()"
});
formatter.result({
  "duration": 47845148706,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_Invalid_username_and_password_and_clicks_on_login_button()"
});
formatter.result({
  "duration": 1583982721,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_not_logged_in_and_stays_on_the_same_page()"
});
formatter.result({
  "duration": 10014078,
  "error_message": "junit.framework.AssertionFailedError\r\n\tat junit.framework.Assert.fail(Assert.java:55)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:22)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:31)\r\n\tat com.crm.StepDefinition.LoginStepDefinition.user_not_logged_in_and_stays_on_the_same_page(LoginStepDefinition.java:64)\r\n\tat ✽.Then User not logged in and stays on the same page(Login.feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});