$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/carSearch.feature");
formatter.feature({
  "name": "validation of car search page",
  "description": "  In order to validate car search\n  as a buyer\n  I navigate http://www.carsguide.com.au",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Searching for a new car",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the home page http://www.carsguide.com.au for carsguide website",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.CarSearchSteps.i_am_on_the_home_page_http_www_carsguide_com_au_for_carsguide_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I move to buy + sell",
  "keyword": "When "
});
formatter.match({
  "location": "steps.CarSearchSteps.i_move_to_buy_sell()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Search Cars",
  "keyword": "And "
});
formatter.match({
  "location": "steps.CarSearchSteps.i_click_on_Search_Cars()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Any Make as \"BMW\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.CarSearchSteps.i_select_Any_Make_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Any Model as \"1 Series\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.CarSearchSteps.i_select_Any_Model_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Any Location as \"NSW - Sydney\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.CarSearchSteps.i_select_Any_Location_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select price(max) as \"$10,000\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.CarSearchSteps.i_select_price_max_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Find My Next Car button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.CarSearchSteps.i_click_on_Find_My_Next_Car_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see list of searched cars",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.CarSearchSteps.i_should_see_list_of_searched_cars()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page title should be \"Bmw 1 Series Under 10000 for Sale Sydney NSW | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.CarSearchSteps.the_page_title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});