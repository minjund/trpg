package com.trpg.trpg.user.service

import com.trpg.trpg.user.model.BoardModel
import com.trpg.trpg.user.repository.BoardRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class BoardServiceimpl constructor(@Autowired private val boardRepository: BoardRepository) : BoardService {

    override fun getBoard(): List<BoardModel>? =
        boardRepository.findAllBy()

    @Transactional
    override fun saveBoard(boardModel: BoardModel): BoardModel =
        boardRepository.save(boardModel)
}