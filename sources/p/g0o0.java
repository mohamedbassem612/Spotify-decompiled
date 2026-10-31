package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g0o0 implements j0o0 {
    public final cv21 a;

    public g0o0(cv21 cv21Var) {
        this.a = cv21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0o0) && this.a.equals(((g0o0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
