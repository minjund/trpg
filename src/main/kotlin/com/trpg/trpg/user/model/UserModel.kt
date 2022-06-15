package com.trpg.trpg.user.model

import io.swagger.annotations.ApiModelProperty
import java.io.Serializable
import java.sql.Date
import java.sql.Time
import java.sql.Timestamp
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name="user")
data class UserModel(
    @Id
    @GeneratedValue
    @Column(nullable = true,name="seq")
    @ApiModelProperty("시퀀스", required = true)
    val seq: Int,
    @Column(nullable = true,name="id")
    @ApiModelProperty("아이디", required = true, example = "test")
    val id: String,
    @Column(nullable = true,name="pw")
    @ApiModelProperty("패스워드", required = true, example = "1234")
    val pw: String,
    @Column(nullable = true,name="nickname")
    @ApiModelProperty("닉네임", required = true, example = "tr장인")
    val nickname: String,
    @Column(nullable = true,name="use_yn")
    @ApiModelProperty("회원 탈퇴 여부", required = true, example = "Y")
    val use_yn: Char = 'Y'
) {
    constructor() : this(0,"1","2","3",'Y') {

    }
}