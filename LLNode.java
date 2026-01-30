public class LLNode{
    private Attempt payload;
    private LLNode next;

    public LLNode(Attempt payload, LLNode next){
        this.payload = payload;
        this.next = next;
    }

    public Attempt getPayload(){
        return this.payload;
    }

    public LLNode getNext(){
        return this.next;
    }

    @Override
    public String toString(){
        if (this.getNext() == null){
            return this.getPayload() + "";
        }
        else  return this.getPayload() + "\n" + next.toString();
    }
}