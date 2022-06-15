package com.trpg.trpg.user.service

import com.trpg.trpg.user.model.UserModel
import org.springframework.stereotype.Service

@Service
interface UserService {

    fun getAllUser(): List<UserModel>?

    fun saveUser(userModel: UserModel): UserModel
}