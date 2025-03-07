Feature: Retrieve the status is the service
	Scenario: client makes call to GET /status
		When the client calls /status
		Then the client receives status code of 200
		And the client receives server status UP