import java.util.Random;
public class PaintMixGame{
    private PaintMix solution;
    private LLNode head = null;
    Random r = new Random();

    public PaintMixGame(PaintMix solution){
        this.solution = solution;
    }

    public boolean attemptPaintMix(PaintMix paintMix){
        Attempt attempt = new Attempt(paintMix, solution);
        head = new LLNode(attempt, head);

        if (attempt.getPaintMix().toString().equals(solution.toString())) return true;
        else return false;
    }

    public LLNode getPreviousAttempts(){
        return head;
    }

    public PaintMix getSolution(){
        return this.solution;
    }

    public PaintMixGame(){
        char[] solution = new char[5];
        for (int i = 0; i < 5; i++){
            char numToLetter = (char)('A' + r.nextInt(6));
            solution[i] = numToLetter;
        }
        this.solution = new PaintMix(solution);
    }
}
