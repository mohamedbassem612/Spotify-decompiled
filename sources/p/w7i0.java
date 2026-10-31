package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w7i0 {
    public final z771 a;
    public final int b;
    public final s1f1 c;

    public w7i0(z771 z771Var, int i, s1f1 s1f1Var) {
        this.a = z771Var;
        this.b = i;
        this.c = s1f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7i0)) {
            return false;
        }
        w7i0 w7i0Var = (w7i0) obj;
        return u890.j(this.a, w7i0Var.a) && this.b == w7i0Var.b && this.c.equals(w7i0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.a.hashCode() * 31, 31);
    }
}
