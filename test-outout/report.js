$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ContactForm.feature");
formatter.feature({
  "line": 1,
  "name": "fill basic form",
  "description": "",
  "id": "fill-basic-form",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4241632400,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Fill the application form",
  "description": "",
  "id": "fill-basic-form;fill-the-application-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is on the Application page title is \"Basic Contact Form - myContactForm.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Enter the name and Email ID",
  "rows": [
    {
      "cells": [
        "Clinton",
        "clinton.2404@gmail.com"
      ],
      "line": 5
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "submit the form",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "validate the message \"Thank You\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Basic Contact Form - myContactForm.com",
      "offset": 42
    }
  ],
  "location": "Contactform.user_is_on_the_Application_page_title_is(String)"
});
formatter.result({
  "duration": 2826520300,
  "status": "passed"
});
formatter.match({
  "location": "Contactform.enter_the_name_and_Email_ID(DataTable)"
});
formatter.result({
  "duration": 3235802300,
  "status": "passed"
});
formatter.match({
  "location": "Contactform.submit_the_form()"
});
formatter.result({
  "duration": 2247358399,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thank You",
      "offset": 22
    }
  ],
  "location": "Contactform.validate_the_message(String)"
});
formatter.result({
  "duration": 23325600,
  "status": "passed"
});
formatter.after({
  "duration": 1654140500,
  "status": "passed"
});
});