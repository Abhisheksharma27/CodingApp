package com.example.codingapp


class HtmlQuestions  {
    var myQuestions = arrayOf(
        "Which tag go inside head tag?",
        "HERF is that links tell the browser where to go using an href attribute, which stores a URL.",
        "Which tag include the elements such as metadata about the page and links to stylesheets, scripts?",
        "How many levels of documents allow to use in Heading?","."
    )
    private var myChoices = arrayOf(arrayOf("body", "title", "div","script"), arrayOf("true", "false",".", "."), arrayOf("html", "li", "footer", "head"), arrayOf("6", "7", "8","9"), arrayOf(".", ",", "/", "*"))
    private var myCorrectAnswers = arrayOf("title", "true", "head", "6", ".")

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