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

    @Test
    public void testGetLinksNewFile2() throws IOException {
        List<String> answer = List.of("https://something.com", "some-page.html");
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        assertEquals(answer, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinksNewFile3() throws IOException {
        List<String> answer = List.of();
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        assertEquals(answer, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinksNewFile4() throws IOException {
        List<String> answer = List.of();
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        assertEquals(answer, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinksNewFile5() throws IOException {
        List<String> answer = List.of();
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        assertEquals(answer, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinksNewFile6() throws IOException {
        List<String> answer = List.of();
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        assertEquals(answer, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinksNewFile7() throws IOException {
        List<String> answer = List.of();
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        assertEquals(answer, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinksNewFile8() throws IOException {
        List<String> answer = List.of("a link on the first line");
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        assertEquals(answer, MarkdownParse.getLinks(content));
    }

    @Test
    public void fixedTest() throws IOException {
        List<String> answer = List.of("a link on the first line");
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        assertEquals(answer, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinksNewFile9() throws IOException {
        List<String> answer = List.of("https://google(wee).com");
        Path fileName = Path.of("test-file9.md");
        String content = Files.readString(fileName);
        assertEquals(answer, MarkdownParse.getLinks(content));
    }

}