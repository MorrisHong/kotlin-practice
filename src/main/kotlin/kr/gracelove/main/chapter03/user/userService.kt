package kr.gracelove.main.chapter03.user

fun saveUser(user: User) {
    user.validateBeforeSave()
    println("SUCCEED!")
}

fun User.validateBeforeSave() {
    fun validate(
        value: String,
        fieldName: String,
    ) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${this.id}: empty $fieldName"
            )
        }
    }
    validate(this.name, "Name")
    validate(this.address, "Address")
}