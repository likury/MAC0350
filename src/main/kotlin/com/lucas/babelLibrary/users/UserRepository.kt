package com.lucas.babelLibrary.users


import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Int>