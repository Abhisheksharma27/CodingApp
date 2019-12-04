<<<<<<< HEAD:app/src/main/java/info/learntocode/codingapp/HtmlQuestions.kt
package info.learntocode.codingapp
=======
<<<<<<< HEAD:app/src/main/java/com/learncode/codingapp/HtmlQuestions.kt
package com.learncode.codingapp
=======
package com.learntocode.codingapp
>>>>>>> 9281bb3bef09da154a2e1eba667ba14461ad21ef:app/src/main/java/com/learntocode/codingapp/HtmlQuestions.kt
>>>>>>> 3c3239577babc754f33ccf6f758ec90df27ef6d0:app/src/main/java/com/learntocode/codingapp/HtmlQuestions.kt


class HtmlQuestions  {
    var myQuestions = arrayOf(
        "Which tag go inside head tag?",
        "HERF is that links tell the browser where to go using an href attribute, which stores a URL.",
        "Which tag include the elements such as metadata about the page and links to stylesheets, scripts?",
        "How many levels of documents allow to use in Heading?",
        "WHat is HTML stands for?"
    )
    private var myChoices = arrayOf(arrayOf("body", "title", "div","script"), arrayOf("true", "false",".", "."), arrayOf("html", "li", "footer", "head"), arrayOf("6", "7", "8","9"), arrayOf("Hyper Track markup Language", "Hypertext Makeup Language", "Hypertext Markup Language", "None"))
    private var myCorrectAnswers = arrayOf("title", "true", "head", "6", "Hypertext Markup Language")

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