public class StringProgram
{
  public static void main(String[] args) 
  {
    String sentence = "I hate text processing!";
    int position = sentence.indexOf("hate");
    String ending = sentence.substring(position + "hate".length());

    System.out.println("23423423423");
    System.out.println(sentence);
    System.out.println("The word \"hate\" starts at index " + position);

    // I adore text processing!
    sentence = sentence.substring(0, position) + "adore" + ending;
    System.out.println("The changed string is: ");
    System.out.println(sentence);

    // Timeis money
    String verbPhrase = "is money";
    System.out.println("Time" + verbPhrase);

    // 7
    String test = "abcdefg";
    System.out.println(test.length());

    // b
    System.out.println(test.charAt(1));

    // defg
    System.out.println(test.substring(3));

    // abd
    // def
    System.out.println("abc\ndef");

    // abc\ndef
    System.out.println("abc\\ndef");

    // HELLO TONY
    String test2 = "Hello Tony";
    test2 = test2.toUpperCase();
    System.out.println(test2);

    // 2 + 2 = 4
    // 2 + 2 = 22
    System.out.println("2 + 2 = " + (2 + 2));
    System.out.println("2 + 2 = " + 2 + 2);
  }
}
