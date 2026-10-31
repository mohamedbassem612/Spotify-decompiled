package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t1p0 {
    public final ibu0 a;
    public final cam b;
    public final d7l c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public t1p0(ibu0 ibu0Var, cam camVar, d7l d7lVar, boolean z, boolean z2, boolean z3) {
        this.a = ibu0Var;
        this.b = camVar;
        this.c = d7lVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public static t1p0 a(t1p0 t1p0Var, ibu0 ibu0Var, cam camVar, d7l d7lVar, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            ibu0Var = t1p0Var.a;
        }
        ibu0 ibu0Var2 = ibu0Var;
        if ((i & 2) != 0) {
            camVar = t1p0Var.b;
        }
        cam camVar2 = camVar;
        if ((i & 4) != 0) {
            d7lVar = t1p0Var.c;
        }
        d7l d7lVar2 = d7lVar;
        if ((i & 8) != 0) {
            z = t1p0Var.d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = t1p0Var.e;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            z3 = t1p0Var.f;
        }
        return new t1p0(ibu0Var2, camVar2, d7lVar2, z4, z5, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1p0)) {
            return false;
        }
        t1p0 t1p0Var = (t1p0) obj;
        return u890.j(this.a, t1p0Var.a) && u890.j(this.b, t1p0Var.b) && u890.j(this.c, t1p0Var.c) && this.d == t1p0Var.d && this.e == t1p0Var.e && this.f == t1p0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(xcg1.g((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }
}
