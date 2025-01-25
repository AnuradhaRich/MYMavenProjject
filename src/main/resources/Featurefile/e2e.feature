Feature: Verify Whether EndtoEnd testcase works

 Background: PreSteps to make sure user is on right state
    Given User is already logedIn with credentials "akhiljda@gmail.com" and "Password"
    
    Scenario: Add item to cart successfully
    
    Given User click on the item "Nike zoom fly" 
    When User select the item option size as "L" and color as "Green"
    Then User click on AddToCart
    
   
