package proxy;

import domain.Comment;

/**
 * @ProjectName: SpringBasicDetails
 * @Author: Temesgen D.
 * @Date: 2/16/22
 */

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
