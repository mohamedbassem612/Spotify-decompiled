package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class x3l implements z3l {
    public final xvd1 a;

    public x3l(xvd1 xvd1Var) {
        this.a = xvd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x3l) && this.a == ((x3l) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
