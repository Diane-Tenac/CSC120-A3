
import java.util.Scanner;
class Conversation implements ConversationRequirements {

  // Attributes 
  /** Diane's Codes */
  private String userInput;
  private String response;
  private String[] Transcript;

  /**
   * Constructor 
   */
  public Conversation(String UserInput, String Response) {
    this.userInput = UserInput;
    this.response = Response;
    
  }
  /** Manupulator and accessor */
  public String getUserInput() {
    return this.userInput;
  }
  public void setResponse(String answer) {
    this.response = answer;
  }
  /**
   * Starts and runs the conversation with the user
   */
  public void chat() {
    System.out.println("Hey, would love to chat with you! Enter the chat rounds");
    Scanner scanner =new Scanner(System.in);
    int round = scanner.nextLine();
    for (int a =0; a<round; a++) {
      System.out.println("Hi there!  What's on your mind? ");
      String userInput = scanner.nextLine();
      //mirror the sentence
      if userInput contains ("I"|| "you"||" me"||"my"||"am"||"your")
      {
        /** need to know how to concatinate this pronuns with users inputs and make a meaningful conversation */
      }
      else 
        //canned response
      System.out.println("ChatJad: " + respond(userInput));
    }

  }

  /**
   * Prints transcript of conversation
   */
  public void printTranscript() {

  }

  /**
   * Gives appropriate response (mirrored or canned) to user input
   * @param inputString the users last line of input
   * @return mirrored or canned response to user input  
   */
  public String respond(String inputString) {
    String returnString = ""; 
    return returnString; 
  }

  public static void main(String[] arguments) {

    Conversation myConversation = new Conversation();
    myConversation.chat();
    myConversation.printTranscript();

  }
}
