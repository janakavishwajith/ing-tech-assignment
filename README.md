# ing-tech-assignment
This is an Springboot application,
You can directly run the application by running the Starter.java, which contains the Main method.

I couldn't finish the Front End forms due to some personal priorities came through in the last week.
Anyway, I started with adding thymeleaf dependencies and controllers, but I couldn't complete it, hope to complete it within next two three days if time permits.


----REST Endpoints are----

Read all accounts,
GET localhost:8080/accounts

Add new account,

POST localhost:8080/accounts

Request Body, JSON
{
	"accountHolderId": 1,
  "accountBalance": 500,
  "accountType": "SAVINGS_ACCOUNT",
  "currency": "LKR",
  "branchCode": "AB",
  "openDate": "2019-05-21",
  "joinAccount": false,
  "joinAccountHolder": -1
}


Read one account

GET localhost:8080/accounts/{account-number}


Thanks

