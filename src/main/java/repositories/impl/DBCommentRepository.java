package repositories.impl;

import domain.Comment;
import org.springframework.stereotype.Component;
import repositories.CommentRepository;

/**
 * @ProjectName: SpringBasicDetails
 * @Author: Temesgen D.
 * @Date: 2/15/22
 */

@Component
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment = " + comment.getText());
    }
}
