package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xsz0 {
    public final dsz0 a;

    public xsz0(dsz0 dsz0Var) {
        this.a = dsz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xsz0) && this.a.equals(((xsz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
