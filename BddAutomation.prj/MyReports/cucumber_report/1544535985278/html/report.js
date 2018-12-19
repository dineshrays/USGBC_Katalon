$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("G:/USGBC_Katalon-master/BddAutomation.prj/Include/features/USGBC/Store/Exam/verifyExamPageContents.feature");
formatter.feature({
  "name": "To Verify the content of Exam category in USGBC Online Portal.",
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
  "name": "To Verify the contents in the Exams Page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User can see the Store link to navigate to the Store page",
  "keyword": "Given "
});
formatter.match({
  "location": "verifyAppPageContents.GivenUserCanSeeTheStoreLinkToNavigateToTheStorePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the Store link",
  "keyword": "And "
});
formatter.match({
  "location": "verifyAppPageContents.WhenClickOnTheStoreLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see the Exams Image link to navigate to the Exams page",
  "keyword": "And "
});
formatter.match({
  "location": "verifyExamPageContents.UsercanseetheExamsImagelinktonavigatetotheExamspage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the Exams Image link",
  "keyword": "When "
});
formatter.match({
  "location": "verifyExamPageContents.ClickontheExamsImagelink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see the Exams page with all the product which is present in Exams",
  "keyword": "Then "
});
formatter.match({
  "location": "verifyExamPageContents.UsercanseetheExamspagewithalltheproductwhichispresentinExams()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see the Exams filter checked by Default in the Filters Category list",
  "keyword": "And "
});
formatter.match({
  "location": "verifyExamPageContents.UsercanseetheExamsfiltercheckedbyDefaultintheFiltersCategorylist()"
});
formatter.result({
  "status": "passed"
});
});