package org.example.dao

import org.example.model.User
import java.util.concurrent.atomic.AtomicInteger

class UserDAO {


    val users = hashMapOf(
        0 to User(name = "Michael", email = "mmorera.dg@gmail.com", id = 0),
        1 to User(name = "Michael1", email = "mmorera1.dg@gmail.com", id = 1),
        2 to User(name = "Michael2", email = "mmorera2.dg@gmail.com", id = 2),
        3 to User(name = "Michael3", email = "mmorera3.dg@gmail.com", id = 3)
    )


    var lastId: AtomicInteger = AtomicInteger(users.size - 1)

    fun save(name: String, email: String) {
        val id = lastId.incrementAndGet()
        users.put(id, User(name = name, email = email, id = id))
    }

    fun findById(id: Int): User? {
        return users[id]
    }

    fun findByEmail(email: String): User? {
        return users.values.find { it.email == email }
    }

    fun update(id: Int, user: User) {
        users.put(id, User(name = user.name, email = user.email, id = id))
    }

    fun delete(id: Int) {
        users.remove(id)
    }
}