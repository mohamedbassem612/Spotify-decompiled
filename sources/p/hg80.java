package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hg80 implements og80 {
    public final at80 a;
    public final int b;
    public final md80 c;

    public hg80(int i, md80 md80Var, at80 at80Var) {
        this.a = at80Var;
        this.b = i;
        this.c = md80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg80)) {
            return false;
        }
        hg80 hg80Var = (hg80) obj;
        return this.a == hg80Var.a && this.b == hg80Var.b && this.c == hg80Var.c;
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, this.a.hashCode() * 31, 31);
        md80 md80Var = this.c;
        return iK + (md80Var == null ? 0 : md80Var.hashCode());
    }
}
