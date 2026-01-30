import java.util.Scanner;
public class PaintAssistantCli {
    public static void playGame(PaintMixGame play){
        Scanner keys = new Scanner(System.in);
        boolean valid = false;
        boolean correct = false;
        System.out.println("Previous attempts:");
        System.out.println("No previous attempts");

        while (!correct){
            valid = false;
            System.out.println("Enter paint mix:");
            char[] attempt = new char[5];
            while (!valid){
                String myString = keys.nextLine();
                valid = true;

                if (myString.length() != 5){
                    System.out.println("Invalid paint mix!");
                    valid = false;
                    continue;
                }
                for (int i = 0; i < 5; i++){
                    if (myString.charAt(i) >= 'A' && myString.charAt(i) <= 'F'){
                        attempt[i] = myString.charAt(i);
                    }
                    else{
                        System.out.println("Invalid paint mix!");
                        valid = false;
                        break;
                    }
                }
            }
            PaintMix guess = new PaintMix(attempt);
            correct = play.attemptPaintMix(guess);

            if (correct){
                System.out.println("Congratulations!");
            }
            else {
                if (play.getPreviousAttempts() != null){
                            System.out.println("Previous attempts:");
                            System.out.println(play.getPreviousAttempts());
                    }
                }
            }
        }


    public static void main(String[] args){
        PaintMixGame game = new PaintMixGame();
        playGame(game);
    }
}
