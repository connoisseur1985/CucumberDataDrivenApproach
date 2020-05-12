$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ASUS/eclipse-workspace/FreeCRMCucumberProject/src/main/java/com/qa/feature/EntryPage.feature");
formatter.feature({
  "line": 1,
  "name": "Login to User Page",
  "description": "",
  "id": "login-to-user-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login to User Page",
  "description": "",
  "id": "login-to-user-page;login-to-user-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens the browser and website window",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on signin button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password and logs in",
  "rows": [
    {
      "cells": [
        "the.connoisseur1985@gmail.com",
        "Connoisseur1985"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "login page is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on my wishlists",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user searches for items",
  "rows": [
    {
      "cells": [
        "items"
      ],
      "line": 12
    },
    {
      "cells": [
        "t shirts"
      ],
      "line": 13
    },
    {
      "cells": [
        "chiffon"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user clicks on add to cart and checks out to open summary page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user checks out to open address page and adds new address",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user enters user credentials and save",
  "rows": [
    {
      "cells": [
        "address",
        "city",
        "postal code",
        "homephone",
        "mobilephone",
        "addressTitle"
      ],
      "line": 18
    },
    {
      "cells": [
        "abc kithe",
        "Lousiana",
        "12345",
        "123456789",
        "987654321",
        "mera nava address"
      ],
      "line": 19
    },
    {
      "cells": [
        "abc ethe",
        "Kansas",
        "12345",
        "234567890",
        "987878787",
        "mera hor nava address"
      ],
      "line": 20
    },
    {
      "cells": [
        "efg othe",
        "California",
        "98765",
        "765434567",
        "678907554",
        "mera purana address"
      ],
      "line": 21
    },
    {
      "cells": [
        "wedjkej",
        "kckldd",
        "33333",
        "23343444",
        "45555556",
        "bbggg"
      ],
      "line": 22
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user proceeds to check out and opens shipping page",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user checks out to payment and pays by wire",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user confirms order",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "browser is closed",
  "keyword": "And "
});
formatter.match({
  "location": "EntryPageStepDefinitions.user_opens_the_browser_and_website_window()"
});
formatter.result({
  "duration": 20160756800,
  "status": "passed"
});
formatter.match({
  "location": "EntryPageStepDefinitions.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 7653249000,
  "status": "passed"
});
formatter.match({
  "location": "EntryPageStepDefinitions.user_enters_and_logs_in(DataTable)"
});
formatter.result({
  "duration": 888822400,
  "status": "passed"
});
formatter.match({
  "location": "EntryPageStepDefinitions.login_page_is_opened()"
});
formatter.result({
  "duration": 3815844200,
  "status": "passed"
});
formatter.match({
  "location": "EntryPageStepDefinitions.user_clicks_on_my_wishlists()"
});
formatter.result({
  "duration": 4252522500,
  "status": "passed"
});
formatter.match({
  "location": "EntryPageStepDefinitions.user_searches_for(DataTable)"
});
formatter.result({
  "duration": 7200533400,
  "status": "passed"
});
formatter.match({
  "location": "EntryPageStepDefinitions.user_clicks_on_add_to_cart_and_checks_out_to_open_summary_page()"
});
formatter.result({
  "duration": 7952357000,
  "status": "passed"
});
formatter.match({
  "location": "EntryPageStepDefinitions.user_checks_out_to_open_address_page_and_adds_new_address()"
});
formatter.result({
  "duration": 5053658300,
  "status": "passed"
});
formatter.match({
  "location": "EntryPageStepDefinitions.user_enters_and_save(DataTable)"
});
formatter.result({
  "duration": 31275573500,
  "status": "passed"
});
formatter.match({
  "location": "EntryPageStepDefinitions.user_proceeds_to_check_out_and_opens_shipping_page()"
});
formatter.result({
  "duration": 3080127800,
  "status": "passed"
});
formatter.match({
  "location": "EntryPageStepDefinitions.user_checks_out_to_payment_and_pays_by_wire()"
});
formatter.result({
  "duration": 5126726200,
  "status": "passed"
});
formatter.match({
  "location": "EntryPageStepDefinitions.user_confirms_order()"
});
formatter.result({
  "duration": 2894930000,
  "status": "passed"
});
formatter.match({
  "location": "EntryPageStepDefinitions.browser_is_closed()"
});
formatter.result({
  "duration": 10949411400,
  "status": "passed"
});
});