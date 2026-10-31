package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xfk extends nln {
    public final ma00 e;

    public xfk(ma00 ma00Var) {
        super((byte) 4);
        this.e = ma00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xfk) && u890.j(this.e, ((xfk) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
