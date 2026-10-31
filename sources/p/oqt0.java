package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class oqt0 {
    public final boolean a;
    public final boolean b;
    public final float c;
    public final int d;
    public final dn90 e;
    public final boolean f;

    public oqt0(boolean z, boolean z2, float f, int i, dn90 dn90Var, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = f;
        this.d = i;
        this.e = dn90Var;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqt0)) {
            return false;
        }
        oqt0 oqt0Var = (oqt0) obj;
        return this.a == oqt0Var.a && this.b == oqt0Var.b && Float.compare(this.c, oqt0Var.c) == 0 && this.d == oqt0Var.d && u890.j(this.e, oqt0Var.e) && this.f == oqt0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ab80.k(this.d, x0d.f(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31)) * 31);
    }
}
