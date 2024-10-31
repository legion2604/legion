package OOP_practic.Cafe

class Salad(val price: Int, val ingredients: List<String>, val cookingtime: Int) : MenuItem {

    override fun getPrice() {
        println("Салат стоит $price")
    }

    override fun getIngredients() {
        println("Ингридиенты салата: $ingredients")
    }

    override fun getCookingTime() {
        println("Ваш салат приготовится за $cookingtime")
    }

    override fun getCalories() {
        println("Ваш салат содержит ${ingredients.size * 5}")
    }
}