package com.trpg.trpg.user.service

import com.trpg.trpg.user.model.BoardModel
import org.springframework.stereotype.Service

@Service
interface BoardService {

    fun getBoard(): List<BoardModel>?

    fun saveBoard(boardModel: BoardModel): BoardModel
}