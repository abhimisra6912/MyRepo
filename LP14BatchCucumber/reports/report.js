$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("assignment1_LP14.feature");
formatter.feature({
  "line": 1,
  "name": "Sign Up on elearning platform and send an email",
  "description": "",
  "id": "sign-up-on-elearning-platform-and-send-an-email",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "Verify user is able to signin on Elearning platform",
  "description": "",
  "id": "sign-up-on-elearning-platform-and-send-an-email;verify-user-is-able-to-signin-on-elearning-platform",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@SDET1"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": ": User is able to navigate to the \"\u003cURL\u003e\" URL",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": ": Login to the application using \"\u003cUSERNAME\u003e\" and \"\u003cPASS\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": ": User verify the correct \"\u003cEMAIL\u003e\" is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": ": User compose the mail using \"\u003cEMAIL\u003e\", \"\u003cSUB\u003e\" and \"\u003cBODY\u003e\" send it to specific email id",
  "keyword": "And "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "sign-up-on-elearning-platform-and-send-an-email;verify-user-is-able-to-signin-on-elearning-platform;",
  "rows": [
    {
      "cells": [
        "URL",
        "FNAME",
        "LNAME",
        "EMAIL",
        "USERNAME",
        "PASS",
        "CFPASS",
        "TEXT",
        "SUB",
        "BODY"
      ],
      "line": 22,
      "id": "sign-up-on-elearning-platform-and-send-an-email;verify-user-is-able-to-signin-on-elearning-platform;;1"
    },
    {
      "cells": [
        "http://elearningm1.upskills.in/",
        "ABHI",
        "MISHRA",
        "abhimisra69@gmail.com",
        "abhi12345",
        "Abhi@12345",
        "Abhi@12345",
        "An e-mail has been sent to remind you of your login and password.",
        "TEST MAIL",
        "This is a test mail for BDD."
      ],
      "line": 23,
      "id": "sign-up-on-elearning-platform-and-send-an-email;verify-user-is-able-to-signin-on-elearning-platform;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4425538500,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Verify user is able to signin on Elearning platform",
  "description": "",
  "id": "sign-up-on-elearning-platform-and-send-an-email;verify-user-is-able-to-signin-on-elearning-platform;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@SDET1"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": ": User is able to navigate to the \"http://elearningm1.upskills.in/\" URL",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": ": Login to the application using \"abhi12345\" and \"Abhi@12345\"",
  "matchedColumns": [
    4,
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": ": User verify the correct \"abhimisra69@gmail.com\" is displayed",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": ": User compose the mail using \"abhimisra69@gmail.com\", \"TEST MAIL\" and \"This is a test mail for BDD.\" send it to specific email id",
  "matchedColumns": [
    3,
    8,
    9
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://elearningm1.upskills.in/",
      "offset": 35
    }
  ],
  "location": "assignment1_LP14.user_is_able_to_navigate_to_the_URL(String)"
});
formatter.result({
  "duration": 21364623000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abhi12345",
      "offset": 34
    },
    {
      "val": "Abhi@12345",
      "offset": 50
    }
  ],
  "location": "assignment1_LP14.login_to_the_application_using_and(String,String)"
});
formatter.result({
  "duration": 13060780100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abhimisra69@gmail.com",
      "offset": 27
    }
  ],
  "location": "assignment1_LP14.user_verify_the_correct_is_displayed(String)"
});
formatter.result({
  "duration": 148014100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abhimisra69@gmail.com",
      "offset": 31
    },
    {
      "val": "TEST MAIL",
      "offset": 56
    },
    {
      "val": "This is a test mail for BDD.",
      "offset": 72
    }
  ],
  "location": "assignment1_LP14.user_compose_the_mail_using_and_send_it_to_specific_email_id(String,String,String)"
});
formatter.result({
  "duration": 26115303000,
  "status": "passed"
});
formatter.after({
  "duration": 816167200,
  "status": "passed"
});
});