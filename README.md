# assignment

Used technologies:

Java 8 , spring boot, H2 (in memory db), Lombok

Endpoints:

/account/allAccounts/{customerId}
/account/allTransactions/{accountNo}

DB Tables:

account
customer_account
account_transactions

Used one customer 11112222 and linked all the accounts mentioned in coding assignment sent to me.

Transactions are avaialble for the below accounts
1232223212
321143048
347786244
585309209

Sample:

http://localhost:8080/account/allAccounts/11112222
http://localhost:8080/account/allTransactions/1232223212
