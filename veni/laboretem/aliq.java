import com.example.jknack.handlebars.Handlebars;
import com.example.jknack.handlebars.Template;
import java.io.IOException;

public class HandlebarsExample {
    public static void main(String[] args) {
        Handlebars handlebars = new Handlebars();
        String source = "Hello, {{name}}!";
        
        try {
            Template template = handlebars.compileInline(source);
            String output = template.apply(new Object() {
                String name = "John";
            });
            System.out.println(output); // Output: Hello, John!
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
