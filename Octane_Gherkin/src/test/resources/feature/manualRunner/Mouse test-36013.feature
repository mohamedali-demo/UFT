#Auto generated NGA revision tag
@TID36013REV0.3.0
Feature: Buying items in shopping cart for many users
 
	Background: 
		Given: payment security system is up
 
	Scenario Outline: Many users buy items in their carts
		Given a customer named "<customer>"
		Given I am logged in as "<customer>"
		Given I have at least one item in cart
		When I try to buy items in my cart
		Then I confirm my payment method "<payment>" and proceed to checkout
 
		Examples:
		| customer | payment |
		| Jane Doe | Paypal |
		| Will Zuill | Visa |