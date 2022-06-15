package com.trpg.trpg.user.Controller

import com.trpg.trpg.user.model.UserModel
import com.trpg.trpg.user.service.UserService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController // @Controller + @ResponseBody
@RequestMapping("/user")
@Api(description = "회원 가입/조회 API")
class UserController {

    @Autowired
    private lateinit var userService: UserService

    @ApiOperation("회원 가져오기", notes = "모든 회원 정보를 가져옵니다.")
    @GetMapping()
    private fun getUser(): ResponseEntity<Any> {
        return ResponseEntity
            .ok()
            .body(userService.getAllUser())
    }

    @ApiOperation("회원 저장하기", notes = "등록할려는 회원을 json으로 가져와 저장합니다.")
    @PostMapping()
    private fun postUser(@RequestBody userModel: UserModel): ResponseEntity<Any> {
        userService.saveUser(userModel)
        return ResponseEntity
            .ok()
            .body(true)
    }
}