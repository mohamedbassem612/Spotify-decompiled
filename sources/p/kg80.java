package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kg80 implements og80 {
    public final at80 a;
    public final md80 b;
    public final dg80 c;

    public kg80(at80 at80Var, md80 md80Var, dg80 dg80Var) {
        this.a = at80Var;
        this.b = md80Var;
        this.c = dg80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kg80)) {
            return false;
        }
        kg80 kg80Var = (kg80) obj;
        return this.a == kg80Var.a && this.b == kg80Var.b && this.c == kg80Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
