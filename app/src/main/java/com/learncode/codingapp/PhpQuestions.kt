package com.learncode.codingapp


class PhpQuestions  {
    var myQuestions = arrayOf(
        "What does API stands for?",
        "Which is a special variable, holding a reference to an external resource?",
        "An operator is something that doesn't takes one or more values and yields another value.",
        "What is the value that cannot change during the execution of the script??",
        "Which term refers to a piece of sofrware that allows yout application to connect to the MySQL database server?"
    )
    private var myChoices = arrayOf(arrayOf("American Petroleum Institute", "Apple Pie Ice cream", "Active Pharmaceutical Ingredient","Application Programming Interface"), arrayOf("resource", "String", "constant", "Driver"), arrayOf("true", "false", ".", "."), arrayOf("constant", "count", "compact","natsort"), arrayOf("constant", "extension", "overloading", "connector"))
    private var myCorrectAnswers = arrayOf("Application Programming Interface", "resource", "false", "constant", "connector")

    fun getQuestion(a: Int): String {
        return myQuestions[a]
    }

    fun getChoice1(a: Int): String {
        return myChoices[a][0]
    }

    fun getChoice2(a: Int): String {
        return myChoices[a][1]
    }

    fun getChoice3(a: Int): String {
        return myChoices[a][2]
    }

    fun getChoice4(a: Int): String {
        return myChoices[a][3]
    }

    fun getCorrectAnswer(a: Int): String {
        return myCorrectAnswers[a]
    }
}