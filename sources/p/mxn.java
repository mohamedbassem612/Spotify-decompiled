package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mxn implements txn {
    public final h290 a;

    public mxn(h290 h290Var) {
        this.a = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mxn) && this.a.equals(((mxn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
