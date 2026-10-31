package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g63 {
    public final jo70 a;
    public final xkk1 b;
    public final boolean c;

    public g63(jo70 jo70Var, xkk1 xkk1Var, boolean z) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g63)) {
            return false;
        }
        g63 g63Var = (g63) obj;
        return this.a.equals(g63Var.a) && this.b.equals(g63Var.b) && this.c == g63Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
