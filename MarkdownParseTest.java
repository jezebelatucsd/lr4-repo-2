import static org.junit.Assert.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException {
        List<String> answer = List.of("https://something.com", "some-thing.html");
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        assertEquals(answer, MarkdownParse.getLinks(content));
    }

}