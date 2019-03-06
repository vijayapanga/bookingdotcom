Feature: Browsing Booking.com
  Scenario: Find Elements of booking.com
    Given Browser and Booking.com page launch
    When Finding no of Elements of Booking.com Web page
    Then Printing Selected WebElements and Close browser

  Scenario: SignUp of booking.com
    Given Browser and Booking.com page launch
    When SignUp process
    Then SignUp Successful and close browser

  Scenario: Search of booking.com
    Given Browser and Booking.com page launch
    When Searching Hotels on Bank holiday
    Then Searching Successful and close Browser

