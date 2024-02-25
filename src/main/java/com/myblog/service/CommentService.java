package com.myblog.service;

import com.myblog.payload.CommentDto;
import com.myblog.payload.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CommentService {
    public CommentDto createComment(long postId, CommentDto commentDto);

    void deleteComment(long commentId);

    List<CommentDto> getCommentsByPostId(long postId);

    List<CommentDto> getAllComments();

    CommentDto updateComment(long postId, long id, CommentDto commentDto);

//    CommentDto updateComment(Long postId, Long commentId, CommentDto commentDto);
}
