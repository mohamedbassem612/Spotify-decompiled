package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kw1 {
    public final y7e1 a;
    public final xtb0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public kw1(y7e1 y7e1Var, xtb0 xtb0Var, boolean z, boolean z2, boolean z3, String str) {
        this.a = y7e1Var;
        this.b = xtb0Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw1)) {
            return false;
        }
        kw1 kw1Var = (kw1) obj;
        return u890.j(this.a, kw1Var.a) && u890.j(this.b, kw1Var.b) && this.c == kw1Var.c && this.d == kw1Var.d && this.e == kw1Var.e && u890.j(this.f, kw1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g(xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }
}
