package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sl71 {
    public final ql71 a;
    public final rl71 b;

    public sl71(ql71 ql71Var, rl71 rl71Var) {
        this.a = ql71Var;
        this.b = rl71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl71)) {
            return false;
        }
        sl71 sl71Var = (sl71) obj;
        return this.a.equals(sl71Var.a) && this.b.equals(sl71Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
