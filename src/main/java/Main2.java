import applicationConfig.Config;
import domain.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;

/**
 * @ProjectName: SpringBasicDetails
 * @Author: Temesgen D.
 * @Date: 2/16/22
 */

public class Main2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        Comment comment = new Comment();
        comment.setText("Main 2 Comment");
        comment.setAuthor("Lorena");

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
