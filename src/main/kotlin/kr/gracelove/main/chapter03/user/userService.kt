package kr.gracelove.main.chapter03.user



fun saveUser(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException(
            "Can't save user id - ${user.id}: empty Name"
        )
    }

    if (user.address.isEmpty()) {
        throw IllegalArgumentException(
            "Can't save user address - ${user.address}: empty Address"
        )
    }

    println("SUCCEED!")
}