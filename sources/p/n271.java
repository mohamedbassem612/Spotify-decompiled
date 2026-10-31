package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n271 {
    public final z771 a;
    public final int b;
    public final s1f1 c;

    public n271(z771 z771Var, int i, s1f1 s1f1Var) {
        this.a = z771Var;
        this.b = i;
        this.c = s1f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n271)) {
            return false;
        }
        n271 n271Var = (n271) obj;
        return u890.j(this.a, n271Var.a) && this.b == n271Var.b && u890.j(this.c, n271Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.a.hashCode() * 31, 31);
    }
}
