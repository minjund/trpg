package com.trpg.trpg.user.repository

import com.trpg.trpg.user.model.UserModel
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<UserModel, Int> {

    fun findAllBy(): List<UserModel>?

    fun save(userModel : UserModel): UserModel
}