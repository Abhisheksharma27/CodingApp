package com.example.codingapp

class JavaScriptQuestions   {
    var myQuestions = arrayOf(
        "Which allows the removal of elements from a collection?",
        "The Comparator interface contains the method?",
        "Which of those is synchronized?",
        "Iterator returned by ArrayList is?"
    )
    private var myChoices = arrayOf(arrayOf("Enumeration", "Iterator", "Both","None of the Above"), arrayOf("compareWith()", "compare()", "compareTo()", "None"), arrayOf("TreeMap", "HashMap", "TreeSet", "HashTable"), arrayOf("Fail-fast", "Fail-safe", "Both","None"))
    private var myCorrectAnswers = arrayOf("None of the Above", "compare()", "HashTable", "Fail-fast")

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