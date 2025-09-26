
import java.util.Scanner;
class Conversation implements ConversationRequirements {

  // Attributes 
  /** Diane's Codes */
  private String userInput;
  private String response;
  private String[] Transcript;
  private String [] MirrorWords;
  private static  String[] cannedResponses = {
      "Interesting, tell me more.",
      "Hmmm.",
      "Do you really think so?",
      "Tell me more.",
      " What would you say about that?",
      " That sounds interesting. Go on.",
      "Would you love to elaborate more on that?",
      "Oh, I see.",
      "Could you explain that?",
      "That's quite fascinating."
  };
  /** Mirror set */
  private static String[][] mirrorSet = {
      {"I", "you"},
      {"me", "you"},
      {"my", "your"},
      {"am", "are"},
      {"you", "I"},
      {"your", "my"},
      {"yours", "mine"},
      {"are", "am"}
  };

  /**
   * Constructor 
   */
  public Conversation(String UserInput, String Response, String[] Transcript, String[] MirrorWords) {
    this.userInput = UserInput;
    this.response = Response;
    this.Transcript = Transcript;
    this.MirrorWords = MirrorWords;
    
    
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
    int round = scanner.nextInt();
    for (int a =0; a<round; a++) {
      System.out.println("Hi there!  What's on your mind? ");
      String userInput = scanner.nextLine();
      /** mirror the sentence */
      if (userInput.contains("I"|| "you"||" me"||"my"||"am"||"your")){
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
