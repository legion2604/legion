package OOP_practic.Cafe

class Pizza(val price: Int, val ingredients: MutableList<String>,val cookingtime: Int, val topping: Boolean):MenuItem {
    private fun addMilk() {
       if (topping) ingredients.add("topping")
    }

    override fun getPrice() {
        println("Пицца стоит $price")
    }

    override fun getIngredients() {
        println("Ингридиенты пиццы: $ingredients")
    }

    override fun getCookingTime() {
        println("Ваше пицца приготовится за $cookingtime")
    }

    override fun getCalories() {
        println("Ваше пицца содержит ${ingredients.size*50}")
    }

}