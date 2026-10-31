package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c63 {
    public final jo70 a;
    public final xkk1 b;

    public c63(jo70 jo70Var, xkk1 xkk1Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c63)) {
            return false;
        }
        c63 c63Var = (c63) obj;
        return this.a.equals(c63Var.a) && this.b.equals(c63Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
