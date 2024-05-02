Feature: MyTravelapplication
  I want to use this template for my feature file

  @Logintest
  Scenario: To Check the title of the page and to validate the string in child window 
    Given To navigate to login page
    When To check the title of the Page
    When i navigate to the new page and verify title
    

  @test2
  Scenario Outline: Book Ticket
    Given To navigate to login page
    When I click the dropdown and select country from "<from>" to "<To>"
    Then I choose flight with lowest amount
    #And I check the amount is in format
    #And I verify the booking id

    Examples: 
      |from | To | 
      |Mexico City| London|