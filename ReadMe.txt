Improvement I can think off in website
-------------------------------------------------------
1. Name text field also excepting numbers, special characters which it shouldn’t that why I included it in the happy path for now.

2. On submitting the invalid email its throwing exception whereas it should be handled gracefully with an error message.

3.Also when you submit your enquiry on hitting submit button user should get a success message whereas it is returning to same form and its a bit confusing for user whether his enquiry got submitted or not.

4. Also when I am trying to verify contactPage.nameText.getText(), it is returning Name  Email, whereas it should return only Name.It will be a request to Developer to look.

5. Also submit button - Design wise I am really not sure why we have play button on it.


How to run
---------------------------------------------------
Go to project directory and run with below command
mvn test

----------------------------------------------------

Running tests using
---------------------
Firefox 47.0.5
Mac


