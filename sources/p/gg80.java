package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gg80 implements og80 {
    public final at80 a;
    public final md80 b;
    public final cg80 c;

    public gg80(at80 at80Var, md80 md80Var, cg80 cg80Var) {
        this.a = at80Var;
        this.b = md80Var;
        this.c = cg80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg80)) {
            return false;
        }
        gg80 gg80Var = (gg80) obj;
        return this.a == gg80Var.a && this.b == gg80Var.b && this.c == gg80Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
