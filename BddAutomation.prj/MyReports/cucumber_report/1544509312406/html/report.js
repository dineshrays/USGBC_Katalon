$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("G:/USGBC_Katalon-master/BddAutomation.prj/Include/features/USGBC/Store/Apps/verifyAppPageContents.feature");
formatter.feature({
  "name": "To Verify the content of Apps category in USGBC Online Portal.",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is to navigate to USGBC website",
  "keyword": "Given "
});
formatter.match({
  "location": "verifyAppPageContents.GivenUserIsToNavigateToUSGBCWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see the Store link to navigate to the Store page",
  "keyword": "And "
});
formatter.match({
  "location": "verifyAppPageContents.GivenUserCanSeeTheStoreLinkToNavigateToTheStorePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the Store link",
  "keyword": "When "
});
formatter.match({
  "location": "verifyAppPageContents.WhenClickOnTheStoreLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see the Store page with all the contents",
  "keyword": "Then "
});
formatter.match({
  "location": "verifyAppPageContents.ThenUserCanSeeTheStorePageWithAllTheContents()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the contents in the Apps page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User can see the APPS Image link to navigate to the APPS page",
  "keyword": "Given "
});
formatter.match({
  "location": "verifyAppPageContents.UsercanseetheAPPSImagelinktonavigatetotheAPPSpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the APPS Image link",
  "keyword": "When "
});
formatter.match({
  "location": "verifyAppPageContents.ClickontheAPPSImagelink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see the APPS page with all the product which is present in APPS",
  "keyword": "Then "
});
formatter.match({
  "location": "verifyAppPageContents.UsercanseetheAPPSpagewithalltheproductwhichispresentinAPPS()"
});
formatter.result({
  "status": "passed"
});
});