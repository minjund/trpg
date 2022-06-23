package com.trpg.trpg.user.repository

import com.trpg.trpg.user.model.BoardModel
import com.trpg.trpg.user.model.UserModel
import org.springframework.data.jpa.repository.JpaRepository

interface BoardRepository: JpaRepository<BoardModel, Int> {

    fun findAllBy(): List<BoardModel>?

    fun save(boardModel : BoardModel): BoardModel
}