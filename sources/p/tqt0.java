package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tqt0 {
    public final sqt0 a;
    public final iix0 b;

    public tqt0(sqt0 sqt0Var, iix0 iix0Var) {
        this.a = sqt0Var;
        this.b = iix0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqt0)) {
            return false;
        }
        tqt0 tqt0Var = (tqt0) obj;
        return this.a.equals(tqt0Var.a) && this.b.equals(tqt0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
