$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("booking.feature");
formatter.feature({
  "line": 1,
  "name": "Browsing Booking.com",
  "description": "",
  "id": "browsing-booking.com",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3687383157,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Find Elements of booking.com",
  "description": "",
  "id": "browsing-booking.com;find-elements-of-booking.com",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Browser and Booking.com page launch",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Finding no of Elements of Booking.com Web page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Printing Selected WebElements and Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingDotCom.browser_webpage_launch()"
});
formatter.result({
  "duration": 5026225747,
  "status": "passed"
});
formatter.match({
  "location": "BookingDotCom.find_webelements()"
});
formatter.result({
  "duration": 1037842556,
  "status": "passed"
});
formatter.match({
  "location": "BookingDotCom.print_webelements()"
});
formatter.result({
  "duration": 3656864215,
  "status": "passed"
});
formatter.after({
  "duration": 93948,
  "status": "passed"
});
formatter.before({
  "duration": 2334427026,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "SignUp of booking.com",
  "description": "",
  "id": "browsing-booking.com;signup-of-booking.com",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Browser and Booking.com page launch",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "SignUp process",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "SignUp Successful and close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingDotCom.browser_webpage_launch()"
});
formatter.result({
  "duration": 5807365614,
  "status": "passed"
});
formatter.match({
  "location": "BookingDotCom.signup()"
});
formatter.result({
  "duration": 9932797066,
  "status": "passed"
});
formatter.match({
  "location": "BookingDotCom.signup_success()"
});
formatter.result({
  "duration": 2185660511,
  "status": "passed"
});
formatter.after({
  "duration": 76580,
  "status": "passed"
});
formatter.before({
  "duration": 2497179582,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Search of booking.com",
  "description": "",
  "id": "browsing-booking.com;search-of-booking.com",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Browser and Booking.com page launch",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Searching Hotels on Bank holiday",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Searching Successful and close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingDotCom.browser_webpage_launch()"
});
formatter.result({
  "duration": 5472244240,
  "status": "passed"
});
formatter.match({
  "location": "BookingDotCom.search_period()"
});
formatter.result({
  "duration": 9597830034,
  "status": "passed"
});
formatter.match({
  "location": "BookingDotCom.search_success()"
});
formatter.result({
  "duration": 2173773700,
  "status": "passed"
});
formatter.after({
  "duration": 62764,
  "status": "passed"
});
});