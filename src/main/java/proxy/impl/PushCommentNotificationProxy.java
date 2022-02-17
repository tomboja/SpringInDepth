package proxy.impl;

import domain.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import proxy.CommentNotificationProxy;

/**
 * @ProjectName: SpringBasicDetails
 * @Author: Temesgen D.
 * @Date: 2/16/22
 */

/**
 *
 */
@Component
//@Primary // Used when making this a default implementation bean
@Qualifier(value = "PUSH") // or @Qualifier("PUSH")
public class PushCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("CommentPushNotificationProxy comment.getText() = " + comment.getText());
    }
}
