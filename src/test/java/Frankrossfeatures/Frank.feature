Feature: Add the product into cart and place partial Payment Wallet+COD

  #Background:
  #Given before myscenario
  #When i open browser
  @Hooks
  Scenario Outline: Login to payment screen
    Given Open the Chrome and launch the application
    Given Click the Login button
    When Enter the Mobile number "<Mobilenumber>"
    And Enter the OTP "<OTP>"
    And Login should be success
    When Click the Deleiver to
    When Enter the Pincode
    When Click the Check button
    When Click the Search box and search the product
    When Adding a quantity
    And Click the cart icon
    Then Click the Proceed button in cart
    And Select the address and Deleivery slot
    And click the Pay on Deleivery
    And Click the confirm order
    Then Payment is successfull

    Examples: 
      | Mobilenumber | OTP  |
      |   8608076922 |2581 |
  #|   7904567348 | 7611 |
  #|   8610495170 | 5560 |
  #|   8248803864 | 5609 |
  #
  #Scenario Outline: Check the product quanity
  #Given Open the Chrome and launch the application
  #When Click the Deleiver to
  #When Enter the Pincode
  #When Click the Check button
  #When Click the Search box and search the product
  #When Adding a quantity
  #Then check the product stock
  
  #Scenario Outline: Unsuccessful Login with Invalid entries
  #Given Open the Chrome and launch the application
  #When Click the Login button
  #And Enter the Mobile number "<Mobilenumber>"
  #And Enter the OTP "<OTP>"
  #But user entered wrong OTP
  #Then login must be unsuccessfull
  #
  #Examples:
  #| Mobilenumber | OTP  |
  #|   8608076922 | 5040 |
  #Scenario: Verify the COD Payment is Sucessfull
    #Given: Open the chrome and launch the application
    #Given Click the Login button
    #When Enter the Mobile number "<Mobilenumber>"
    #And Enter the OTP "<OTP>"
    #And Login should be success
    #When Click the Deleiver to
    #When Enter the Pincode
    #And Click the Check button
    #And Click the Search box and search the product
    #And Adding a quantity
    #And Click the cart icon
    #Then Click the Proceed button in cart
    #And Select the address and Deleivery slot
    #And click the Pay on Deleivery
    #And Click the confirm order
    #Then Payment is successfull
#
    #Examples: 
      #| Mobilenumber | OTP  |
      #|   8608076922 | 5040 |
