import domain.Comment;
import proxy.impl.EmailCommentNotificationProxy;
import repositories.impl.DBCommentRepository;
import service.CommentService;

/**
 * @ProjectName: SpringBasicDetails
 * @Author: Temesgen D.
 * @Date: 2/15/22
 */

public class Main {
    public static void main(String[] args) {
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();

        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        Comment comment = new Comment();
        comment.setAuthor("Lauretta");
        comment.setText("Demo comment");

        commentService.publishComment(comment);
    }
}
