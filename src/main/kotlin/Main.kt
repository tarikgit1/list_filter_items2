package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val selectedDates = listOf("2018-08-12", "2018-08-13", "2018-08-14")

    val expenses = listOf(Expense("Food", "2018-08-12"),
        Expense("Transportation", "2018-08-15"),
        Expense("Misc.", "2018-08-13"),
        Expense("Uber", "2018-08-12"),
        Expense("Clothing", "2018-08-16"))

    val listOfExpensesInSelectedDate = mutableListOf<Expense>()


    listOfExpensesInSelectedDate.addAll(expenses.filter { it.date==selectedDates.get(0)})


    //  println(listOfExpensesInSelectedDate)
    val selectedEventId = listOf(1,2,3,4,5,6,7,8)
    val selectedEventSex = listOf("female","male")
    val selectedEventAge = listOf(10,20,30,40,50,60,70,80)
    val selectedEventName = listOf("mara","kara","java")

    val events = listOf(Event(1,"male",10,"mara"),Event(2,"female",90,"mara")
        ,Event(5,"female",90,"dara"),Event(1,"male",90,"dara"))
    val lis = mutableListOf<org.example.Event>()
    val lis2 = mutableListOf<org.example.Event>()
    /*
        lis.addAll(events.filter { it.name=="mara"}
            .filter { it.age <20 })
    */
    // println(lis)
    lis.addAll(events.filter {it.id in selectedEventId})
    // .filter { it.age in selectedEventAge })

    println(lis)
    println("*********")
    lis2.addAll(events.filter { it.name in selectedEventName })
    println(lis2)

    lis.forEach { (x,y,t,z) -> if (y == "male") println(z) }
}



data class Expense(
    val expense:String,
    val date: String
)
data class Event(
    val  id : Int,
    val sex : String,
    val age : Int,
    val name :String

)