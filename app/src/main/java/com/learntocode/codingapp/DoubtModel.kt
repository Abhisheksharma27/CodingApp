package com.learntocode.codingapp

class DoubtModel {

    var doubtId: String? = null
    var doubtDescription: String? = null
    var languageDoubt: String? = null

    //require an empty constructor.

    constructor() {
    }


    //override
    constructor(doubtId: String, doubtDescription: String, languageDoubt: String)
    {
        this.doubtId = doubtId
        this.doubtDescription = doubtDescription
        this.languageDoubt = languageDoubt
    }

}
