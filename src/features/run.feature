Feature: Computation

Scenario: Adding 2 and 1


Given user entered 2,1,+
When user clicked the submit button
Then Result is 3

Scenario: Subtracting 1 from 3


Given user entered 3,1,-
When user clicked the submit button
Then Result is 2


Scenario: Multiplying 2 by 1


Given user entered 2,1,*
When user clicked the submit button
Then Result is 2



Scenario: Dividing 6 by 2


Given 6,2,/
When user clicked the submit button
Then Result is 3



Scenario: solving (5+4)*2


Given 5,4,+,2,*
When user clicked the submit button
Then Result is 18



Scenario: solving (4*2)+5


Given 4,2,*,5,+
When user clicked the submit button
Then Result is 13


Scenario: Divide 5 by 0


Given user entered 5,0,/
When user clicked the submit button
Then Error message "Division by ZERO is invalid" will be displayed
