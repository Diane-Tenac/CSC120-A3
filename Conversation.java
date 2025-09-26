
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Conversation implements ConversationRequirements {

    // Attributes 
    /**
     * Diane's Codes
     */
    private String userInput;
    private String response;
    private ArrayList<String> transcript = new ArrayList();
    private String[] MirrorWords;
    private static List<String> cannedResponses = List.of(
            "Interesting, tell me more.",
            "Hmmm.",
            "Do you really think so?",
            "Tell me more.",
            " What would you say about that?",
            " That sounds interesting.",
            "Would you love to elaborate more on that?",
            "Oh, I see.",
            "Could you explain that?",
            "That's quite fascinating."
    );
    /**
     * Mirror set
     */
    private static String[][] mirrorSet = {
        {"i", "you"},
        {"me", "you"},
        {"my", "your"},
        {"am", "are"},
        {"you", "I"},
        {"your", "my"},
        {"yours", "mine"},
        {"are", "am"},
        {"i'm", "you're"},
        {"you're", "i'm"}

    };

    /**
     * Constructor
     */
    public Conversation() {

    }

    /**
     * Manupulator and accessor
     */
    public String getUserInput() {
        return this.userInput;
    }

    public void setResponse(String answer) {
        this.response = answer;
    }

    public String getResponse() {
        return this.response;
    }

    public String[] getMirrorWords() {
        return this.MirrorWords;
    }

    public void setMirrorWords(String[] words) {
        this.MirrorWords = words;
    }

    /**
     * Starts and runs the conversation with the user
     */
    public void chat() {
        System.out.println("Hey, would love to chat with you! Enter the chat rounds");
        Scanner scanner = new Scanner(System.in);
        int rounds = scanner.nextInt();
        System.out.println("Hi there!  What's on your mind?");
        transcript.add("Hi there! What's on your mind?");
        while (rounds > 0) {
            String userInput = scanner.nextLine();
            transcript.add(userInput);
            if (userInput != "") {
                transcript.add(respond(userInput));
                System.out.println(respond(userInput));
                rounds--;
            }
        }
        transcript.add("See ya!");
        System.out.println("See ya!");
        System.out.println();
        System.out.println();
    }

    /**
     * Prints transcript of conversation
     */
    public void printTranscript() {
        System.out.println("TRANSCRIPT:");
        for (String phrase : transcript) {
            System.out.println(phrase);
        }
    }

    /**
     * Gives appropriate response (mirrored or canned) to user input
     *
     * @param inputString the users last line of input
     * @return mirrored or canned response to user input
     */
    public String respond(String inputString) {
        String[] userInputSeparatedArray = inputString.toLowerCase().split(" ");
        boolean containsMirrorResponse = false;
        for (int i = 0; i < userInputSeparatedArray.length; i++) {
            if (userInputSeparatedArray[i].equals(mirrorSet[0][0])) {
                userInputSeparatedArray[i] = mirrorSet[0][1];
                containsMirrorResponse = true;
            }
            if (userInputSeparatedArray[i].equals(mirrorSet[1][0])) {
                userInputSeparatedArray[i] = mirrorSet[1][1];
                containsMirrorResponse = true;
            }
            if (userInputSeparatedArray[i].equals(mirrorSet[2][0])) {
                userInputSeparatedArray[i] = mirrorSet[2][1];
                containsMirrorResponse = true;

            }
            if (userInputSeparatedArray[i].equals(mirrorSet[3][0])) {
                userInputSeparatedArray[i] = mirrorSet[3][1];
                containsMirrorResponse = true;

            }
            if (userInputSeparatedArray[i].equals(mirrorSet[4][0])) {
                userInputSeparatedArray[i] = mirrorSet[4][1];
                containsMirrorResponse = true;

            }
            if (userInputSeparatedArray[i].equals(mirrorSet[5][0])) {
                userInputSeparatedArray[i] = mirrorSet[5][1];
                containsMirrorResponse = true;

            }
            if (userInputSeparatedArray[i].equals(mirrorSet[6][0])) {
                userInputSeparatedArray[i] = mirrorSet[6][1];
                containsMirrorResponse = true;

            }
            if (userInputSeparatedArray[i].equals(mirrorSet[7][0])) {
                userInputSeparatedArray[i] = mirrorSet[7][1];
                containsMirrorResponse = true;

            }
            if (userInputSeparatedArray[i].equals(mirrorSet[8][0])) {
                userInputSeparatedArray[i] = mirrorSet[8][1];
                containsMirrorResponse = true;
            }
            if (userInputSeparatedArray[i].equals(mirrorSet[9][0])) {
                userInputSeparatedArray[i] = mirrorSet[9][1];
                containsMirrorResponse = true;
            }

            if (!containsMirrorResponse) {
                int randomIndex = (int) (Math.random() * cannedResponses.size());
                return cannedResponses.get(randomIndex);
            }

        }

        return "ChatJad: " + String.join(" ", userInputSeparatedArray);
    }

    public static void main(String[] arguments) {

        Conversation myConversation = new Conversation();
        myConversation.chat();
        myConversation.printTranscript();

    }
}
