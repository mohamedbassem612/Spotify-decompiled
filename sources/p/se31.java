package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class se31 {
    public final cf31 a;
    public final String b;
    public final k3h1 c;

    public se31(cf31 cf31Var, String str, k3h1 k3h1Var) {
        this.a = cf31Var;
        this.b = str;
        this.c = k3h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se31)) {
            return false;
        }
        se31 se31Var = (se31) obj;
        return this.a.equals(se31Var.a) && this.b.equals(se31Var.b) && this.c.equals(se31Var.c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.b) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
