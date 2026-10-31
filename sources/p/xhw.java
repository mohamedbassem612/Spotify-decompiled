package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xhw implements diw {
    public final h3b1 a;

    public xhw(h3b1 h3b1Var) {
        this.a = h3b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xhw) && this.a == ((xhw) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
