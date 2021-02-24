Feature: fill basic form
Scenario: Fill the application form
	Given user is on the Application page title is "Basic Contact Form - myContactForm.com" 
	Then Enter the name and Email ID
		| Clinton | clinton.2404@gmail.com |
	Then submit the form
	Then validate the message "Thank You"
	
