Feature: Registration functionality scenarios

@Register @One
Scenario: Verify if the user is able to register into the application by providig the given details

Given I launch the application
And I navigate to the Registration page
When I provide all the below details
|Firstname |Anusaya					      |
|Lastname  |Chougule				      |
|Email	   |anusayachougule1394@gmail.com |
|Telephone |1234738922                    |
|Password  |anusaya94                     |

And I select the privacy policy
And I click on Continue Button
Then I should see that the user account is successfully created