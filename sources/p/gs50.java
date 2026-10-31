package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gs50 extends hs50 {
    public final v5w0 a;
    public final cvy0 b;
    public final String c;

    public gs50(v5w0 v5w0Var, cvy0 cvy0Var, String str) {
        this.a = v5w0Var;
        this.b = cvy0Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs50)) {
            return false;
        }
        gs50 gs50Var = (gs50) obj;
        return this.a.equals(gs50Var.a) && u890.j(this.b, gs50Var.b) && u890.j(this.c, gs50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
