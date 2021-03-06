//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        //Comment for lab3
        int currentIndex = 0;
        while (currentIndex < markdown.length()) {
            int openBracket = markdown.indexOf("[", currentIndex);
            int closeBracket = markdown.indexOf("]", openBracket);
            int openParen = markdown.indexOf("(", closeBracket);
            int closeParen = markdown.indexOf(")", openParen);
            if (openBracket == -1 || closeBracket == -1 || openParen == -1 || closeParen == -1) {
                break;
            }
            if ((openBracket - 1) > -1 && markdown.substring(openBracket - 1, openBracket).equals("!")) {
                currentIndex = closeParen + 1;
                continue;
            }
            if (!markdown.substring(closeBracket + 1, closeBracket + 2).equals("(")) {
                currentIndex = closeParen + 1;
                continue;
            }

            if (markdown.substring(openParen + 1, closeParen).contains("(")) {
                if (closeParen + 1 < markdown.length() - 1) {

                    closeParen = markdown.indexOf(")", closeParen + 1);
                }
            }
            if (closeParen < markdown.length() - 1 && markdown.substring(closeParen +
                    1).equals(")")) {
                closeParen++;
            }

            toReturn.add(markdown.substring(openParen + 1, closeParen));
            currentIndex = closeParen + 1;
        }

        System.out.println("hi");
        return toReturn;
    }

    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
        System.out.println(links);
    }
}
