package africa.semicolon.yarnMe.services;

import africa.semicolon.yarnMe.data.models.Comment;

public interface CommentService {
    Comment createComment(String body);
    Comment findComment(int Id);
    Comment deleteComment(int Id);
    Comment editComment(String title, String body);
}