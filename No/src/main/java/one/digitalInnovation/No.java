package one.digitalInnovation;

public class No <T>{

    private T objetc;
    private No <T> refNo;

    public No(){

    }

    public Object getObjetc() {
        return objetc;
    }

    public void setObjetc(T objetc) {
        this.objetc = objetc;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }


    public No(T object){
        this.refNo = null;
        this.objetc = object;


    }

    @Override
    public String toString() {
        return "No{" +
                "objetc=" + objetc +
                '}';

    }
}
