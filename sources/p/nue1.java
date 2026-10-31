package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nue1 {
    public final ejk1 a;
    public final uvg1 b;
    public final uvg1 c;
    public final d161 d;
    public final float e;
    public final boolean f;
    public final int g;
    public final List h;
    public final long i;
    public final long j;
    public final long k;

    public nue1() {
        uvg1 uvg1Var = new uvg1(0L, 0L);
        this(ejk1.e, uvg1Var, uvg1Var, b161.a, 0.0f, false, 4, z6x.a, 0L, Long.MAX_VALUE, uvg1Var.c);
    }

    public static nue1 a(nue1 nue1Var, ejk1 ejk1Var, uvg1 uvg1Var, uvg1 uvg1Var2, d161 d161Var, float f, boolean z, int i, List list, long j, long j2, long j3, int i2) {
        ejk1 ejk1Var2 = (i2 & 1) != 0 ? nue1Var.a : ejk1Var;
        uvg1 uvg1Var3 = (i2 & 2) != 0 ? nue1Var.b : uvg1Var;
        uvg1 uvg1Var4 = (i2 & 4) != 0 ? nue1Var.c : uvg1Var2;
        d161 d161Var2 = (i2 & 8) != 0 ? nue1Var.d : d161Var;
        float f2 = (i2 & 16) != 0 ? nue1Var.e : f;
        boolean z2 = (i2 & 32) != 0 ? nue1Var.f : z;
        int i3 = (i2 & 64) != 0 ? nue1Var.g : i;
        List list2 = (i2 & 128) != 0 ? nue1Var.h : list;
        long j4 = (i2 & 256) != 0 ? nue1Var.i : j;
        long j5 = (i2 & 512) != 0 ? nue1Var.j : j2;
        long j6 = (i2 & 1024) != 0 ? nue1Var.k : j3;
        nue1Var.getClass();
        return new nue1(ejk1Var2, uvg1Var3, uvg1Var4, d161Var2, f2, z2, i3, list2, j4, j5, j6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nue1)) {
            return false;
        }
        nue1 nue1Var = (nue1) obj;
        return u890.j(this.a, nue1Var.a) && u890.j(this.b, nue1Var.b) && u890.j(this.c, nue1Var.c) && u890.j(this.d, nue1Var.d) && Float.compare(this.e, nue1Var.e) == 0 && this.f == nue1Var.f && this.g == nue1Var.g && u890.j(this.h, nue1Var.h) && this.i == nue1Var.i && this.j == nue1Var.j && this.k == nue1Var.k;
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + cy30.f(cy30.f(f4i1.b(ab80.k(this.g, xcg1.g(x0d.f((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f), 31), 31, this.h), this.i, 31), this.j, 31);
    }

    public nue1(ejk1 ejk1Var, uvg1 uvg1Var, uvg1 uvg1Var2, d161 d161Var, float f, boolean z, int i, List list, long j, long j2, long j3) {
        this.a = ejk1Var;
        this.b = uvg1Var;
        this.c = uvg1Var2;
        this.d = d161Var;
        this.e = f;
        this.f = z;
        this.g = i;
        this.h = list;
        this.i = j;
        this.j = j2;
        this.k = j3;
    }
}
