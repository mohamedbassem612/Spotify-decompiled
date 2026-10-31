package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lpb0 implements hfh0 {
    public final npb0 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final hfh0 e;
    public final float f;
    public final boolean g;
    public final c9n h;
    public final wat i;
    public final int j;
    public final iu30 k;
    public final iu30 l;
    public final int m;
    public final List n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f88p;
    public final int q;
    public final qqq0 r;
    public final int s;
    public final int t;

    public lpb0(npb0 npb0Var, int i, boolean z, float f, hfh0 hfh0Var, float f2, boolean z2, c9n c9nVar, wat watVar, int i2, iu30 iu30Var, iu30 iu30Var2, int i3, List list, int i4, int i5, int i6, qqq0 qqq0Var, int i7, int i8) {
        this.a = npb0Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = hfh0Var;
        this.f = f2;
        this.g = z2;
        this.h = c9nVar;
        this.i = watVar;
        this.j = i2;
        this.k = iu30Var;
        this.l = iu30Var2;
        this.m = i3;
        this.n = list;
        this.o = i4;
        this.f88p = i5;
        this.q = i6;
        this.r = qqq0Var;
        this.s = i7;
        this.t = i8;
    }

    public final void a() {
        this.e.a();
    }

    public final iu30 b() {
        return this.e.b();
    }

    public final Map c() {
        return this.e.c();
    }

    public final vu30 d() {
        return this.e.d();
    }

    public final iu30 e() {
        return this.e.e();
    }

    public final lpb0 f(int i, boolean z) {
        npb0 npb0Var;
        List list;
        int i2;
        long j;
        if (this.g) {
            return null;
        }
        List list2 = this.n;
        if (list2.isEmpty() || (npb0Var = this.a) == null) {
            return null;
        }
        int i3 = npb0Var.g;
        int i4 = this.b - i;
        if (i4 < 0 || i4 >= i3) {
            return null;
        }
        mpb0 mpb0Var = (mpb0) o7h.q0(list2);
        mpb0 mpb0Var2 = (mpb0) o7h.A0(list2);
        if (mpb0Var.z || mpb0Var2.z) {
            return null;
        }
        int i5 = this.f88p;
        int i6 = this.o;
        qqq0 qqq0Var = this.r;
        if (i < 0) {
            if (Math.min((mpb0Var.l() + zko1.p(mpb0Var, qqq0Var)) - i6, (mpb0Var2.l() + zko1.p(mpb0Var2, qqq0Var)) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - zko1.p(mpb0Var, qqq0Var), i5 - zko1.p(mpb0Var2, qqq0Var)) <= i) {
            return null;
        }
        int size = list2.size();
        int i7 = 0;
        while (i7 < size) {
            mpb0 mpb0Var3 = (mpb0) list2.get(i7);
            mpb0Var3.getClass();
            if (mpb0Var3.z) {
                list = list2;
                i2 = size;
            } else {
                long j2 = mpb0Var3.w;
                long j3 = 4294967295L;
                mpb0Var3.w = (((long) ((int) (j2 >> 32))) << 32) | (((long) (((int) (j2 & 4294967295L)) + i)) & 4294967295L);
                if (z) {
                    int size2 = mpb0Var3.g.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        xrb0 xrb0VarA = mpb0Var3.j.a(i8, mpb0Var3.b);
                        if (xrb0VarA != null) {
                            long j4 = xrb0VarA.l;
                            j = j3;
                            xrb0VarA.l = (((long) (((int) (j4 & j)) + i)) & j) | (((long) ((int) (j4 >> 32))) << 32);
                        } else {
                            j = j3;
                        }
                        i8++;
                        list2 = list2;
                        j3 = j;
                        size = size;
                    }
                }
                list = list2;
                i2 = size;
            }
            i7++;
            i4 = i4;
            list2 = list;
            size = i2;
        }
        return new lpb0(this.a, i4, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, list2, this.o, this.f88p, this.q, qqq0Var, this.s, this.t);
    }

    public final boolean g() {
        npb0 npb0Var = this.a;
        return ((npb0Var != null ? npb0Var.a : 0) == 0 && this.b == 0) ? false : true;
    }

    public final int getHeight() {
        return this.e.getHeight();
    }

    public final int getWidth() {
        return this.e.getWidth();
    }

    public final boolean h() {
        return this.c;
    }

    public final float i() {
        return this.d;
    }

    public final c9n j() {
        return this.h;
    }

    public final wat k() {
        return this.i;
    }

    public final npb0 l() {
        return this.a;
    }

    public final int m() {
        return this.b;
    }

    public final float n() {
        return this.f;
    }

    public final int o() {
        return this.j;
    }

    public final long p() {
        hfh0 hfh0Var = this.e;
        return (((long) hfh0Var.getWidth()) << 32) | (((long) hfh0Var.getHeight()) & 4294967295L);
    }

    public final List q() {
        return this.n;
    }
}
