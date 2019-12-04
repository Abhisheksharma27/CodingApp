package com.learntocode.codingapp

class JavaQuestions {
     var myQuestions = arrayOf(
        "Which allows the removal of elements from a collection?",
        "The Comparator interface contains the method?",
        "Which of those is synchronized?",
        "Iterator returned by ArrayList is?",
         "What is the keyword that used to define a collection of method definition and constant values?"
    )
    private var myChoices = arrayOf(arrayOf("Enumeration", "Iterator", "Both","None of the Above"), arrayOf("compareWith()", "compare()", "compareTo()", "None"), arrayOf("TreeMap", "HashMap", "HashTable", "TreeSet"), arrayOf("Fail-fast", "Fail-safe", "Both","None"), arrayOf("constructor", "interface", "inheritance", "abstract"))
    private var myCorrectAnswers = arrayOf("None of the Above", "compare()", "HashTable", "Fail-fast", "interface")

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