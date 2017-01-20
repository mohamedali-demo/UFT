#Auto generated NGA revision tag
@TID15021REV0.2.0
Feature: Buying items in shopping cart for a user

Scenario: Purchase item
	Given payment security system is up
	Given a customer named Bob
	Given I am logged in as Bob
	Given I have at least one item in cart
	When I try to buy items in my cart
	Then I confirm my payment method is Visa and proceed to checkout
