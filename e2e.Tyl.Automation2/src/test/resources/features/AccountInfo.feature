Feature: To Test the Tyl frontend functionality

@SmokeTest @Run
  Scenario Outline: Verify if singed user is able to add items to basket and purchase
    Given open the saucedemo url in web browser
    When user should be able to see the page
    And user should be able to enter "<username>" and "<password>"
    And user submits the form
    Then user should able to select the selection for the "<productfilter>"
    And user should able to select the selection
    And user should able click on shopping cart button
    And user clicks on go to checkout button
    And user should be able to enter checkout info "<firstname>" and "<lastname>" and "<postalcode>"
    And user finish the purchase
    And user should be able to see the checkout complete page
    And close the browser
    Examples: 
      | username      | password     | productfilter       | firstname      | lastname      | postalcode |
      | standard_user | secret_sauce | Price (high to low) | test_firstname | test_lastname | IW2 3RF  |

  