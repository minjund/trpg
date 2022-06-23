package com.trpg.trpg.user.model

import io.swagger.annotations.ApiModelProperty
import javax.persistence.*

@Entity
@Table(name="board")
class BoardModel(
    @Id
    @GeneratedValue
    @Column(nullable = true,name="board_id")
    @ApiModelProperty("게시판 id", required = true)
    val board_id: Int,
    @Column(nullable = true,name="board_title")
    @ApiModelProperty("게시판 제목", required = true, example = "trpg 사용법")
    val board_title: String,
    @Column(nullable = true,name="board_contents")
    @ApiModelProperty("게시판 내용", required = true, example = "게시판 내용 블라블라")
    val board_contents: String,
    @Column(nullable = true,name="board_type")
    @ApiModelProperty("게시판 종류", required = true, example = "BT01")
    val board_type: String,
    @Column(nullable = true,name="writer_id")
    @ApiModelProperty("글쓴이 아이디", required = true, example = "tr장인")
    val writer_id: String,
    @Column(nullable = true,name="use_yn")
    @ApiModelProperty("삭제 여부", required = true, example = "N")
    val use_yn: Char = 'Y'
) {
    constructor() : this(0, "1", "2", "3", "글쓴이",'N') {

    }
}