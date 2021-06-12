Feature: Sign Up on elearning platform and send an email

	@SDET
  Scenario Outline: Verify user is able to signup on Elearning platform
    Given : User is able to navigate to the "<URL>" URL
    When : User signs up by entering mandatory "<FNAME>","<LNAME>","<EMAIL>","<USERNAME>","<PASS>" and "<CFPASS>"
    And : User validates the Successful Signup "<TEXT>" message
    
   Examples:
   |URL														 |FNAME|LNAME |EMAIL                |USERNAME |PASS      |CFPASS    |TEXT|
   |http://elearningm1.upskills.in/|ABHI |MISHRA|abhimisra69@gmail.com|abhi12345|Abhi@12345|Abhi@12345|An e-mail has been sent to remind you of your login and password.|
   
   
   @SDET1
  Scenario Outline: Verify user is able to signin on Elearning platform
    Given : User is able to navigate to the "<URL>" URL
    When : Login to the application using "<USERNAME>" and "<PASS>"
    Then : User verify the correct "<EMAIL>" is displayed
    And : User compose the mail using "<EMAIL>", "<SUB>" and "<BODY>" send it to specific email id
    
   Examples:
   |URL														 |FNAME|LNAME |EMAIL                |USERNAME |PASS      |CFPASS    |TEXT|SUB|BODY|
   |http://elearningm1.upskills.in/|ABHI |MISHRA|abhimisra69@gmail.com|abhi12345|Abhi@12345|Abhi@12345|An e-mail has been sent to remind you of your login and password.|TEST MAIL|This is a test mail for BDD.|
    
