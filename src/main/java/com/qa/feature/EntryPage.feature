Feature: Login to User Page

Scenario: Login to User Page

Given user opens the browser and website window
When user clicks on signin button
Then user enters username and password and logs in
|the.connoisseur1985@gmail.com|Connoisseur1985|
Then login page is opened
Then user clicks on my wishlists
Then user searches for items
| items   |	
| t shirts|
|chiffon|
Then user clicks on add to cart and checks out to open summary page
Then user checks out to open address page and adds new address
Then user enters user credentials and save
|address	|city		|postal code|homephone| mobilephone	|addressTitle			|
| abc kithe |Lousiana 	| 12345		|123456789|	987654321	|mera nava address		|
|abc ethe   | Kansas 	| 12345		|234567890| 987878787	|mera hor nava address	|
| efg othe  | California| 98765 	|765434567| 678907554	|mera purana address	|
| wedjkej   |	kckldd	|33333		|23343444 |45555556		|bbggg					|

Then user proceeds to check out and opens shipping page
Then user checks out to payment and pays by wire
Then user confirms order
And browser is closed 
