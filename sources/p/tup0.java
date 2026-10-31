package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tup0 {
    public final hvl1 a;

    public tup0(hvl1 hvl1Var) {
        this.a = hvl1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tup0) && this.a.equals(((tup0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() - 1150326230;
    }
}
