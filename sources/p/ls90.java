package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ls90 {
    public final zo90 a;
    public final m4o0 b;

    public ls90(zo90 zo90Var, m4o0 m4o0Var) {
        this.a = zo90Var;
        this.b = m4o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls90)) {
            return false;
        }
        ls90 ls90Var = (ls90) obj;
        return this.a.equals(ls90Var.a) && u890.j(this.b, ls90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
