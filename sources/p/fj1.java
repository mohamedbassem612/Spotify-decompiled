package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fj1 {
    public final String a;
    public final String b;
    public final int c;
    public final t7q0 d;

    public fj1(String str, String str2, int i, t7q0 t7q0Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = t7q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj1)) {
            return false;
        }
        fj1 fj1Var = (fj1) obj;
        return u890.j(this.a, fj1Var.a) && u890.j(this.b, fj1Var.b) && this.c == fj1Var.c && u890.j(this.d, fj1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
