package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jao0 {
    public final xd10 a;
    public final r6h1 b;

    public jao0(xd10 xd10Var, r6h1 r6h1Var) {
        this.a = xd10Var;
        this.b = r6h1Var;
    }

    public final xd10 a() {
        return this.a;
    }

    public final r6h1 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jao0)) {
            return false;
        }
        jao0 jao0Var = (jao0) obj;
        return u890.j(this.a, jao0Var.a) && u890.j(this.b, jao0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
