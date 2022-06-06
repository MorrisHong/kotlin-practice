package kr.gracelove.main.chapter03.user



fun saveUser(user: User) {

    fun validate(
        user: User,
        value: String,
        fieldName: String,
    ) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id}: empty $fieldName"
            )
        }
    }

    println("SUCCEED!")
}