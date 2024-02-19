package org.ohgiraffers.mission02board.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DeletePostResponse {

    private Long postId;

    private String title;

    private String content;
}
