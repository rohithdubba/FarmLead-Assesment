# FarmLead-Assesment
#Instructions

The testing activity  is categorized into Manual and Automation

Manual Testing :

The excel file "FarmLead_Testcase.xlsx" has all the Test Cases with the steps and the status attached in the email.

AutomationTesting :

The folder "FarmLead-Assesment" has the maven project with the automation code for the test cases Tc006&TC009.

Clone the repository in the eclipse IDE 

Right click on the cloned local repository,select Import Projects,click finish.

Once the import is Done successfully, maven project will be visible with the project structure in the Package Explorer of the Eclipse IDE.

Go to Testng.xml and run as"TestngSuite".

The code will get executed and the results will be displayed in the console.

To View the TestNg reports Go to "test-output" folder and  and view click on the index.html file

Code Explanation:
The automation code validates the login functionlity  and error messages functinality.
In our case,as email is not a registered one ,the concerned error messages get displayed .
If we provide a valid email,login functionality works,the test code for thisfunctionality is covered in this script.

Note: 
If facing any issue in executing the test case,the browser driver should be updated as per your local browser version.


