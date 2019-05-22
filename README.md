# Java program using JUnit
### A small java project to test the credit and reward card transactions.


#### Here is the assignment instructions that I followed to make this project.

##### Develop the following application. 

##### Requirements: 
        We need to create a bank application. This bank has two types cards: Each CreditCard and RewardCard 
        has firstname, lastname, cardnumber. The difference between CreditCard and RewardCard is 
        that the RewardCard has points. So, when the customer purchases an item,
        the number of points is increased by 1 for every dollar. For instance, once the
        customers pay $20.00, the number of points is increased by 20. Come up with the design 
        of these classes and implement them. You may include your methods, however, 
        you must implement the following methods:

        •	float pay(float amount)
            	Using this method, the customer pays for a purchased item. Once an item is purchased,
              the balance of the card is increased by this amount in CreditCard. 

        •	float PayBill(float amount)
            This method is used when the customer pays the bill of the card. 
            The operation of this function is the inverse of the pay() method mentioned above, i.e. 
            the balance is decreased by “amount”.
	        However, if the type of card is a RewardCard, the number of points is also increased by min(amount).

        Both functions specified above, return the new balance.


    Your task is two implement these classes in an efficient way. 
    If you think you need to add any extra class or methods, please do so.

#### Develop test cases to test the two specified methods using Junit.
