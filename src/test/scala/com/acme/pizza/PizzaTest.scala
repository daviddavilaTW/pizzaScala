package com.acme.pizza

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter

class PizzaTest extends FunSuite with BeforeAndAfter{
  var pizza : Pizza = _

  before{
    pizza = new Pizza

  }

  test ("new pizza has zero toppings"){
    assert(pizza.getToppings.size === 0)
  }

  test ("adding one topping"){
    pizza.addToppings(Topping("salami"))
    assert(pizza.getToppings.size == 1)
    //info("Se añade sin novedad el topping")
  }

  test ("test pizza pricing") (pending)

  test ("catching an exception"){
    val thrown = intercept [Exception]{
      pizza.boom
    }
    assert(thrown.getMessage
      === "Boom!")
  }

}

