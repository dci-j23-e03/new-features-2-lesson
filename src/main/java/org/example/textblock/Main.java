package org.example.textblock;

public class Main {

  public static void main(String[] args) {

    String loremIpsum = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. \n"
        + "\"showing usage of quotes\"\n"
        + "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, \n"
        + "when an unknown printer took a galley of type and scrambled it to make a type specimen book. \n"
        + "It has survived not only five centuries, but also the leap into electronic typesetting, \n"
        + "remaining essentially unchanged. It was popularised in the 1960s with the release of \n"
        + "Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing \n"
        + "software like Aldus PageMaker including versions of Lorem Ipsum.";

    System.out.println(loremIpsum);

    String loremIpsum1 = """
        Lorem Ipsum is simply dummy text of the printing and typesetting industry. 
            "showing usage of quotes"" "" \""" need to escape 3 double quotes if we want to use them in the text block
        Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
        when an unknown printer took a galley of type and scrambled it to make a type specimen book. 
        It has survived not only five centuries, but also the leap into electronic typesetting, 
        remaining essentially unchanged. It was popularised in the 1960s with the release of 
        Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing 
        software like Aldus PageMaker including versions of Lorem Ipsum.""";

    System.out.println("With text block: ");
    System.out.println(loremIpsum1);

    String html = """
<html>

    <body>
        <span>example text</span>
    </body>

</html>""";

    System.out.println(html);

    String htmlString = "<html>\n"
        + "\n"
        + "\t\t<body>\n"
        + "\t\t\t\t<span>example text</span>\n"
        + "\t\t</body>\n"
        + "\n"
        + "</html>\n";

    System.out.println("Html old way: \n" + htmlString);


    String spacesExample = """
        text with 2 spaces in the end \s
        text with 2 spaces in the end  """;
    System.out.println(spacesExample);
    System.out.println("""
        text with 2 spaces in the end \s
        text with 2 spaces in the end  """);
  }

}
