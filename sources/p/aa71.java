package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aa71 {
    public final u9 a;
    public final int b;
    public final y971 c;

    public aa71(u9 u9Var, int i, y971 y971Var) {
        this.a = u9Var;
        this.b = i;
        this.c = y971Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa71)) {
            return false;
        }
        aa71 aa71Var = (aa71) obj;
        return this.a.equals(aa71Var.a) && this.b == aa71Var.b && this.c.equals(aa71Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ab80.k(this.b, xcg1.g(this.a.hashCode() * 31, 29791, false), 31);
    }
}
