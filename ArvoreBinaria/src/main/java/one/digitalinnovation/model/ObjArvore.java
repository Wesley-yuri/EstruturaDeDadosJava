package one.digitalinnovation.model;

public abstract class ObjArvore<T> implements Comparable<T> {

    public abstract boolean equals(Object o);
    public abstract int hascode();
    public abstract int CompareTo();
    public abstract String toString();


}
