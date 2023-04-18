package com.example.mod10recyclerview.bo

/**
 * @param rimSize in inches
 * @param batterySize in Ah
 */
data class Tuning(
    val baseCar : String,
    val color: String,
    val rimSize: Int,
    val batteryCapacity: Int,
    val owner: String = "Christophe",
    val dbMax: Float,
    val horsePower: Float,
    val imageUrl:String
)


val arrayListTuning = arrayListOf(
    Tuning("Renault 21", "grise", 21, 5, "Christophe", 13.5f, 90.0f, "https://img.over-blog-kiwi.com/0/93/23/39/20170430/ob_afccee_18209113-1524099324298404-652453166579.jpg"),
    Tuning("Nissan Skyline GT-R R34", "bleue", 65, 2, "Brian O'Conner", 18.5f, 330.0f, "https://cdn.shopify.com/s/files/1/0888/2222/products/R34-1_1200x.jpg?v=1571720539"),
    Tuning("Toyota Supra", "blanche", 70, 2, "Dominic Toretto", 17.0f, 280.0f, "https://www.carscoops.com/wp-content/uploads/2021/01/Toyota-Supra-MKIV-Tuned-1-1024x555.jpg"),
    Tuning("Mitsubishi Lancer Evolution", "bleue", 20, 5, "Mia Toretto", 14.5f, 330.0f, "https://cdn.bringatrailer.com/wp-content/uploads/2019/02/2006_mitsubishi_lancer_evo_ix_1551857556b7a6a-2.jpg"),
    Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://i.pinimg.com/originals/63/63/74/63637425a3f3ab3e8f7749da0ee59f72.jpg")
)