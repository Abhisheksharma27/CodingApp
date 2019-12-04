package com.example.codingapp

class JavaScriptQuestions   {
    var myQuestions = arrayOf(
        "Which is correct symbol of block in javascript?",
        "what is this function that invoked when something happens?",
        "'This' is that referred to a variable, in what portion of a program that variable is visible. What is 'this'?",
        "How many times you could call pure function?","AA"
    )
    private var myChoices = arrayOf(arrayOf("<>", "[]", "{}","()"), arrayOf("callback()", "toString()", "shift()", "values()"), arrayOf("log", "scope", "keys", "seal"), arrayOf("1 million", "2 million", "5 million", "10 million"), arrayOf("1","2", "3", "4"))
    private var myCorrectAnswers = arrayOf("{}", "callback()", "scope", "1 million", "1")

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