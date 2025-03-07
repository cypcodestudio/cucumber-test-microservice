Feature: Retrieve the valid in the service
	Scenario: client makes call to GET /valid
		When the client calls /valid
		Then the client receives valid code of 200
		And the client receives server valid SUCCESS