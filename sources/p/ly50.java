package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ly50 {
    public static final ly50 i = new ly50(iy50.a, false, false, 0, false, null);
    public final iy50 a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final qx50 f;
    public final cy50 g;
    public final Boolean h;

    public ly50(iy50 iy50Var, boolean z, boolean z2, int i2, boolean z3, qx50 qx50Var, cy50 cy50Var, Boolean bool) {
        this.a = iy50Var;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = z3;
        this.f = qx50Var;
        this.g = cy50Var;
        this.h = bool;
    }

    public static ly50 a(ly50 ly50Var, iy50 iy50Var, boolean z, boolean z2, int i2, boolean z3, px50 px50Var, by50 by50Var, int i3) {
        Boolean bool = Boolean.TRUE;
        iy50 iy50Var2 = (i3 & 1) != 0 ? ly50Var.a : iy50Var;
        boolean z4 = (i3 & 2) != 0 ? ly50Var.b : z;
        boolean z5 = (i3 & 4) != 0 ? ly50Var.c : z2;
        int i4 = (i3 & 8) != 0 ? ly50Var.d : i2;
        boolean z6 = (i3 & 16) != 0 ? ly50Var.e : z3;
        px50 px50Var2 = (i3 & 32) != 0 ? ly50Var.f : px50Var;
        by50 by50Var2 = (i3 & 64) != 0 ? ly50Var.g : by50Var;
        if ((i3 & 128) != 0) {
            bool = ly50Var.h;
        }
        ly50Var.getClass();
        return new ly50(iy50Var2, z4, z5, i4, z6, px50Var2, by50Var2, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly50)) {
            return false;
        }
        ly50 ly50Var = (ly50) obj;
        return this.a == ly50Var.a && this.b == ly50Var.b && this.c == ly50Var.c && this.d == ly50Var.d && this.e == ly50Var.e && u890.j(this.f, ly50Var.f) && u890.j(this.g, ly50Var.g) && u890.j(this.h, ly50Var.h);
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((this.f.hashCode() + xcg1.g(kaa0.f(this.d, xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e)) * 31)) * 31;
        Boolean bool = this.h;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public /* synthetic */ ly50(iy50 iy50Var, boolean z, boolean z2, int i2, boolean z3, Boolean bool) {
        this(iy50Var, z, z2, i2, z3, ox50.a, ay50.a, bool);
    }
}
