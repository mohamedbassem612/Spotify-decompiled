package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nxb implements dbr0 {
    public final Integer a;
    public final ixb b;
    public final Integer c;
    public final int d;
    public final mxb e;
    public final los f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final vu30 l;

    public /* synthetic */ nxb(Integer num, ixb ixbVar, Integer num2, int i, mxb mxbVar, los losVar, boolean z, boolean z2, boolean z3, nsm0 nsm0Var, int i2) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? ixb.a : ixbVar, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? 1 : i, (i2 & 16) != 0 ? lxb.a : mxbVar, (i2 & 32) != 0 ? null : losVar, (i2 & 64) != 0 ? true : z, (i2 & 128) != 0 ? true : z2, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0, (i2 & 1024) == 0, (i2 & 2048) != 0 ? null : nsm0Var);
    }

    public static nxb a(nxb nxbVar, Integer num, ixb ixbVar, int i, boolean z, boolean z2, int i2) {
        Integer num2 = (i2 & 1) != 0 ? nxbVar.a : num;
        ixb ixbVar2 = (i2 & 2) != 0 ? nxbVar.b : ixbVar;
        Integer num3 = nxbVar.c;
        int i3 = (i2 & 8) != 0 ? nxbVar.d : i;
        mxb mxbVar = nxbVar.e;
        los losVar = nxbVar.f;
        boolean z3 = nxbVar.g;
        boolean z4 = (i2 & 128) != 0 ? nxbVar.h : z;
        boolean z5 = (i2 & 256) != 0 ? nxbVar.i : z2;
        boolean z6 = nxbVar.j;
        boolean z7 = nxbVar.k;
        vu30 vu30Var = nxbVar.l;
        nxbVar.getClass();
        return new nxb(num2, ixbVar2, num3, i3, mxbVar, losVar, z3, z4, z5, z6, z7, vu30Var);
    }

    public final boolean b() {
        return this.h;
    }

    public final los c() {
        return this.f;
    }

    public final boolean d() {
        return this.k;
    }

    public final vu30 e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxb)) {
            return false;
        }
        nxb nxbVar = (nxb) obj;
        return u890.j(this.a, nxbVar.a) && this.b == nxbVar.b && u890.j(this.c, nxbVar.c) && this.d == nxbVar.d && u890.j(this.e, nxbVar.e) && u890.j(this.f, nxbVar.f) && this.g == nxbVar.g && this.h == nxbVar.h && this.i == nxbVar.i && this.j == nxbVar.j && this.k == nxbVar.k && u890.j(this.l, nxbVar.l);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31;
        Integer num2 = this.c;
        int iHashCode2 = (this.e.hashCode() + ab80.k(this.d, (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31)) * 31;
        los losVar = this.f;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iHashCode2 + (losVar == null ? 0 : losVar.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        vu30 vu30Var = this.l;
        return iG + (vu30Var != null ? vu30Var.hashCode() : 0);
    }

    public nxb(Integer num, ixb ixbVar, Integer num2, int i, mxb mxbVar, los losVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, vu30 vu30Var) {
        this.a = num;
        this.b = ixbVar;
        this.c = num2;
        this.d = i;
        this.e = mxbVar;
        this.f = losVar;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = vu30Var;
    }
}
