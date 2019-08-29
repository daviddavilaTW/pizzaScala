package com.acme.pizza

import org.scalatest.FunSpec
import org.scalatest.BeforeAndAfter
import org.scalatest.GivenWhenThen

class PizzaSpec extends FunSpec with GivenWhenThen {

  var pizza : Pizza = _

  describe("A pizza"){

    Given("A new pizza")
    pizza = new Pizza

    When("a topping is added")
    pizza.addToppings(Topping("Salami"))

    Then("the topping should be incremented")
    assertResult(1) {pizza.getToppings.size}

    And("the topping should be what was added")
    val t = pizza.getToppings(0)
    assert(t===new Topping("Salami"))
  }

}
