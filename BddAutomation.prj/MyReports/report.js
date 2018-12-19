$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/USGBC/Store/Apps/verifyAppPageContents.feature");
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
formatter.scenarioOutline({
  "name": "To verify the contents in the App page when searched for a product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Click on the APPS Image link",
  "keyword": "Given "
});
formatter.step({
  "name": "user can see the search bar to search for products",
  "keyword": "And "
});
formatter.step({
  "name": "user give \u003cinput\u003e in search bar to search",
  "keyword": "When "
});
formatter.step({
  "name": "user click on the search image",
  "keyword": "And "
});
formatter.step({
  "name": "I need to see the webpage",
  "keyword": "And "
});
formatter.step({
  "name": "user can see related products as the \u003cinput\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "input"
      ]
    },
    {
      "cells": [
        "tap"
      ]
    },
    {
      "cells": [
        "trane"
      ]
    },
    {
      "cells": [
        "Autodesk"
      ]
    },
    {
      "cells": [
        "tracker"
      ]
    }
  ]
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
  "name": "To verify the contents in the App page when searched for a product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Click on the APPS Image link",
  "keyword": "Given "
});
formatter.match({
  "location": "verifyAppPageContents.ClickontheAPPSImagelink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can see the search bar to search for products",
  "keyword": "And "
});
formatter.match({
  "location": "verifyAppPageContents.usercanseethesearchbartosearchforproducts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user give tap in search bar to search",
  "keyword": "When "
});
formatter.match({
  "location": "verifyAppPageContents.usergiveinputinsearchbartosearch(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the search image",
  "keyword": "And "
});
formatter.match({
  "location": "verifyAppPageContents.userclickonthesearchimage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to see the webpage",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user can see related products as the tap",
  "keyword": "Then "
});
formatter.match({
  "location": "verifyAppPageContents.usercanseerelatedproductsastheinput(String)"
});
formatter.result({
  "status": "skipped"
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
  "name": "To verify the contents in the App page when searched for a product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Click on the APPS Image link",
  "keyword": "Given "
});
formatter.match({
  "location": "verifyAppPageContents.ClickontheAPPSImagelink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can see the search bar to search for products",
  "keyword": "And "
});
formatter.match({
  "location": "verifyAppPageContents.usercanseethesearchbartosearchforproducts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user give trane in search bar to search",
  "keyword": "When "
});
formatter.match({
  "location": "verifyAppPageContents.usergiveinputinsearchbartosearch(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the search image",
  "keyword": "And "
});
formatter.match({
  "location": "verifyAppPageContents.userclickonthesearchimage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to see the webpage",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user can see related products as the trane",
  "keyword": "Then "
});
formatter.match({
  "location": "verifyAppPageContents.usercanseerelatedproductsastheinput(String)"
});
formatter.result({
  "status": "skipped"
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
  "name": "To verify the contents in the App page when searched for a product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Click on the APPS Image link",
  "keyword": "Given "
});
formatter.match({
  "location": "verifyAppPageContents.ClickontheAPPSImagelink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can see the search bar to search for products",
  "keyword": "And "
});
formatter.match({
  "location": "verifyAppPageContents.usercanseethesearchbartosearchforproducts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user give Autodesk in search bar to search",
  "keyword": "When "
});
formatter.match({
  "location": "verifyAppPageContents.usergiveinputinsearchbartosearch(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the search image",
  "keyword": "And "
});
formatter.match({
  "location": "verifyAppPageContents.userclickonthesearchimage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to see the webpage",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user can see related products as the Autodesk",
  "keyword": "Then "
});
formatter.match({
  "location": "verifyAppPageContents.usercanseerelatedproductsastheinput(String)"
});
formatter.result({
  "status": "skipped"
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
  "name": "To verify the contents in the App page when searched for a product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Click on the APPS Image link",
  "keyword": "Given "
});
formatter.match({
  "location": "verifyAppPageContents.ClickontheAPPSImagelink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can see the search bar to search for products",
  "keyword": "And "
});
formatter.match({
  "location": "verifyAppPageContents.usercanseethesearchbartosearchforproducts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user give tracker in search bar to search",
  "keyword": "When "
});
formatter.match({
  "location": "verifyAppPageContents.usergiveinputinsearchbartosearch(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the search image",
  "keyword": "And "
});
formatter.match({
  "location": "verifyAppPageContents.userclickonthesearchimage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to see the webpage",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user can see related products as the tracker",
  "keyword": "Then "
});
formatter.match({
  "location": "verifyAppPageContents.usercanseerelatedproductsastheinput(String)"
});
formatter.result({
  "status": "skipped"
});
});