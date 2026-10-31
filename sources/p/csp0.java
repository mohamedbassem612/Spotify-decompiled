package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class csp0 {
    public final qsp0 a;

    public csp0(qsp0 qsp0Var) {
        this.a = qsp0Var;
    }

    public final qsp0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof csp0) && this.a.equals(((csp0) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.a);
    }
}
