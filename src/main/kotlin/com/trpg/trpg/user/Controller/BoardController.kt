package com.trpg.trpg.user.Controller


import com.trpg.trpg.user.model.BoardModel
import com.trpg.trpg.user.model.UserModel
import com.trpg.trpg.user.service.BoardService
import com.trpg.trpg.user.service.UserService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController // @Controller + @ResponseBody
@RequestMapping("/user")
@Api(description = "게시판 CURD API")
class BoardController {

    @Autowired
    private lateinit var boardService: BoardService

    @ApiOperation("게시판 가져오기", notes = "모든 게시판 내용을 가져옵니다.")
    @GetMapping()
    private fun getBoard(): ResponseEntity<Any> {
        return ResponseEntity
            .ok()
            .body(boardService.getBoard())
    }

    @ApiOperation("게시판 저장하기", notes = "등록할려는 게시판을 json으로 가져와 저장합니다.")
    @PostMapping()
    private fun postBoard(@RequestBody boardModel: BoardModel): ResponseEntity<Any> {
        boardService.saveBoard(boardModel)
        return ResponseEntity
            .ok()
            .body(true)
    }
}