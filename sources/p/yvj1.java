package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yvj1 extends zvj1 {
    public final uvj1 a;
    public final y1k1 b;
    public final int c;
    public final int d;

    public yvj1(uvj1 uvj1Var, y1k1 y1k1Var) {
        this.a = uvj1Var;
        this.b = y1k1Var;
        this.c = uvj1Var.a;
        this.d = uvj1Var.b;
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvj1)) {
            return false;
        }
        yvj1 yvj1Var = (yvj1) obj;
        return this.a == yvj1Var.a && u890.j(this.b, yvj1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
