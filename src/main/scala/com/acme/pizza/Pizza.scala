package com.acme.pizza

import scala.collection.mutable.ArrayBuffer


class Pizza{

  private val toppings = new ArrayBuffer[Topping]

  def getToppings = toppings.toList

  def addToppings (t:Topping) {toppings += t}

  def removeToppings (t:Topping) {toppings -= t}

  def boom {throw new Exception ("Boom!") }
}