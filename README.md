# WIT

## Exercise 3.11 p.98

Account. Modify class Account (Fig. 3.8, p.85) to provide a method called withdraw that withdraws money from an Account. Ensure that the withdrawal amount does not exceed the Account’s balance. If it does, the balance should be left unchanged and the method should print a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest (Fig. 3.9, p.87) to test method withdraw.


## Exercise 3.12 p.98

Invoice. Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store. An Invoice should include four pieces of information as instance variables—a part number (type String), a part description (type String), a quantity of the item being purchased (type int) and a price per item (double). Your class should have a constructor that initializes the four instance variables. Provide a set and a get method for each instance variable. In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double value. If the quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0. Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.
