package repositories;

import domain.Comment;

/**
 * @ProjectName: SpringBasicDetails
 * @Author: Temesgen D.
 * @Date: 2/15/22
 */

public interface CommentRepository {
    void storeComment(Comment comment);
}
