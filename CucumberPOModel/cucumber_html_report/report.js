$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/Contacts.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Contacts Feature file",
  "description": "",
  "id": "free-crm-contacts-feature-file",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Add new contacts",
  "description": "",
  "id": "free-crm-contacts-feature-file;add-new-contacts",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User clicks on new contact from Contact dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User fills form and click save",
  "rows": [
    {
      "cells": [
        "Company",
        "Position"
      ],
      "line": 7
    },
    {
      "cells": [
        "Sears",
        "Junior"
      ],
      "line": 8
    },
    {
      "cells": [
        "Sears",
        "senior"
      ],
      "line": 9
    },
    {
      "cells": [
        "PierianDx",
        "Senior"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "new contact is added",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactsStepDefinition.user_is_on_Home_page()"
});
formatter.result({
  "duration": 49444214282,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepDefinition.user_clicks_on_new_contact_from_Contact_dropdown()"
});
formatter.result({
  "duration": 1194975902,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepDefinition.user_fills_form_and_click_save(DataTable)"
});
formatter.result({
  "duration": 4183031166,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepDefinition.new_contact_is_added()"
});
formatter.result({
  "duration": 595840,
  "error_message": "java.lang.NullPointerException\r\n\tat com.crm.StepDefinition.ContactsStepDefinition.new_contact_is_added(ContactsStepDefinition.java:65)\r\n\tat ✽.Then new contact is added(src/test/resources/feature/Contacts.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ContactsStepDefinition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});