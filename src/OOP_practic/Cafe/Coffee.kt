package OOP_practic.Cafe

class Coffee(val price: Int, val ingredients: MutableList<String>,val cookingtime: Int, val milk: Boolean) : MenuItem {
   private fun addMilk() {
      if (milk)  ingredients.add("milk")
    }

    override fun getPrice() {
        println("Кофе стоит $price")
    }

    override fun getIngredients() {
        println("Ингридиенты кофе: $ingredients")
    }

    override fun getCookingTime() {
        println("Ваше кофе приготовится за $cookingtime")
    }

    override fun getCalories() {
        println("Ваше кофе содержит ${ingredients.size*10}")
    }

}