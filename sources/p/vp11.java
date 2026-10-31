package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vp11 {
    public final my50 a;
    public final vu30 b;
    public final vu30 c;
    public final vu30 d;
    public final vu30 e;
    public final vhd f;
    public final up11 g;
    public final n6r0 h;
    public final p04 i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public vp11(my50 my50Var, vu30 vu30Var, ep11 ep11Var, vu30 vu30Var2, vu30 vu30Var3, vhd vhdVar, up11 up11Var, n6r0 n6r0Var, p04 p04Var, int i, boolean z, boolean z2, boolean z3, int i2) {
        vu30Var = (i2 & 2) != 0 ? null : vu30Var;
        ep11Var = (i2 & 4) != 0 ? null : ep11Var;
        vu30Var2 = (i2 & 8) != 0 ? null : vu30Var2;
        vu30Var3 = (i2 & 16) != 0 ? null : vu30Var3;
        up11 up11Var2 = (i2 & 64) != 0 ? rp11.a : up11Var;
        p04 p04Var2 = (i2 & 256) == 0 ? p04Var : null;
        boolean z4 = (i2 & 1024) != 0 ? false : z;
        boolean z5 = (i2 & 2048) != 0 ? false : z2;
        boolean z6 = (i2 & 4096) == 0 ? z3 : false;
        this.a = my50Var;
        this.b = vu30Var;
        this.c = ep11Var;
        this.d = vu30Var2;
        this.e = vu30Var3;
        this.f = vhdVar;
        this.g = up11Var2;
        this.h = n6r0Var;
        this.i = p04Var2;
        this.j = i;
        this.k = z4;
        this.l = z5;
        this.m = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vp11) {
            vp11 vp11Var = (vp11) obj;
            if (this.a.equals(vp11Var.a) && u890.j(this.b, vp11Var.b) && u890.j(this.c, vp11Var.c) && u890.j(this.d, vp11Var.d) && u890.j(this.e, vp11Var.e) && this.f == vp11Var.f && this.g.equals(vp11Var.g) && u890.j(this.h, vp11Var.h) && u890.j(this.i, vp11Var.i) && this.j == vp11Var.j && this.k == vp11Var.k && this.l == vp11Var.l && this.m == vp11Var.m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        vu30 vu30Var = this.b;
        int iHashCode2 = (iHashCode + (vu30Var == null ? 0 : vu30Var.hashCode())) * 31;
        vu30 vu30Var2 = this.c;
        int iHashCode3 = (iHashCode2 + (vu30Var2 == null ? 0 : vu30Var2.hashCode())) * 31;
        vu30 vu30Var3 = this.d;
        int iHashCode4 = (iHashCode3 + (vu30Var3 == null ? 0 : vu30Var3.hashCode())) * 31;
        vu30 vu30Var4 = this.e;
        int iHashCode5 = (this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode4 + (vu30Var4 == null ? 0 : vu30Var4.hashCode())) * 31)) * 31)) * 31)) * 31;
        p04 p04Var = this.i;
        return Boolean.hashCode(this.m) + xcg1.g(xcg1.g(ab80.k(this.j, (iHashCode5 + (p04Var != null ? p04Var.a.hashCode() : 0)) * 31, 31), 31, this.k), 31, this.l);
    }
}
