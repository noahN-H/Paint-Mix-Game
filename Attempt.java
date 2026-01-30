class Attempt{
    private PaintMix suggestion;
    private PaintMix solution;

    Attempt(PaintMix suggestion, PaintMix solution){
        this.suggestion = suggestion;
        this.solution = solution;
    }

    public PaintMix getPaintMix(){
        return this.suggestion;
    }

    public int getNumGood(){
        int counter = 0;
        boolean[] counted = new boolean[5];

        for (int i = 0; i < 5; i++){
            if ((this.suggestion.getPaint(i) == this.solution.getPaint(i))){
                counted[i] = true;
                counter++;
            }
        }

        return counter;
    }

    public int getNumWrongQuantity(){
        int counter = 0;
        boolean[] counted = new boolean[5];

        for (int i = 0; i < 5; i++){
            if (this.suggestion.getPaint(i) == this.solution.getPaint(i)){
                counted[i] = true;
            }
        }

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (!counted[j] && i != j && this.suggestion.getPaint(i) == this.solution.getPaint(j)){
                    counter++;
                    counted[j] = true;
                    break;
                }
            }
        }
        return counter;
    }

    public boolean isCorrect(){
        if (suggestion.toString().equals(solution.toString())) return true;
        else return false;
    }

    @Override
    public String toString() {
        return this.suggestion + " (Good " + getNumGood() + ", Wrong quantity " + getNumWrongQuantity() + ")";
    }
}
