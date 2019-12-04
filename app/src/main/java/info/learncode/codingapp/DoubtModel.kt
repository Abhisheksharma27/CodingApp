<<<<<<< HEAD:app/src/main/java/com/learncode/codingapp/DoubtModel.kt
package com.learncode.codingapp
=======
package com.learntocode.codingapp
>>>>>>> 9281bb3bef09da154a2e1eba667ba14461ad21ef:app/src/main/java/com/learntocode/codingapp/DoubtModel.kt

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
