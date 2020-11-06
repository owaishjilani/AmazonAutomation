Feature: Access Amazon site and add an Apple device to cart with the range of 2,500 - 9,999

Scenario: Access Amazon site and purchase a mobile phone
Given user navigates to Amazon site
Then user navigated to Mobile Phones
And user selects the price range of above AED two thousand five hundred
Given user selects the brand Apple
Then user selects the product
And user clicks on Buy Now
Given user enters email address
Then user clicks on continue button
Then user enters password
Then user clicks on sign in button
Then user selects Use this address
Given user selects add card detail cta
And user enters card number
And user enters name on card
And user selects expiry date from the dropdown
Then user clicks on add your card button