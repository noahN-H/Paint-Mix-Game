public class PaintMix{
    private char[] paintOrder;
    private char A;
    private char B;
    private char C;
    private char D;
    private char E;
    private char F;


    public PaintMix(char[] paintOrder){
        this.paintOrder = paintOrder;
        this.A = 'A';
        this.B = 'B';
        this.C = 'C';
        this.D = 'D';
        this.E = 'E';
        this.F = 'F';

    }

    public char getPaint(int i){
        return this.paintOrder[i];
    }

    @Override
    public String toString(){
        String stringOut = "";
        for (int i = 0; i < this.paintOrder.length; i++){
            stringOut += paintOrder[i];
        }
        return stringOut;
    }
}
