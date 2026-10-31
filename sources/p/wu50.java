package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wu50 {
    public final bpb1 a;
    public final iu30 b;

    public wu50(iu30 iu30Var, bpb1 bpb1Var) {
        this.a = bpb1Var;
        this.b = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wu50) {
            wu50 wu50Var = (wu50) obj;
            if (this.a == wu50Var.a && this.b.equals(wu50Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
