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
    public void testGetLinksFile1() throws IOException {
        List<String> answer = List.of("https://something.com", "some-thing.html");
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        assertEquals(answer, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinksFile2() throws IOException {
        List<String> answer = List.of();
        Path fileName = Path.of("test-2.md");
        String content = Files.readString(fileName);
        assertEquals(answer, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinksFile3() throws IOException {
        List<String> answer = List.of();
        Path fileName = Path.of("test-3.md");
        String content = Files.readString(fileName);
        assertEquals(answer, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinksFile4() throws IOException {
        List<String> answer = List.of("https://en.wikipedia.org/wiki/Day_One_(app)");
        Path fileName = Path.of("test-4.md");
        String content = Files.readString(fileName);
        assertEquals(answer, MarkdownParse.getLinks(content));
    }

}