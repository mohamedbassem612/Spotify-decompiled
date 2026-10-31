package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yub0 implements hfh0 {
    public final int[] a;
    public final int[] b;
    public final float c;
    public final hfh0 d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final dvb0 i;
    public final jpa0 j;
    public final wat k;
    public final int l;
    public final List m;
    public final long n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f180p;
    public final int q;
    public final int r;
    public final int s;
    public final c9n t;
    public final qqq0 u;

    public yub0(int[] iArr, int[] iArr2, float f, hfh0 hfh0Var, float f2, boolean z, boolean z2, boolean z3, dvb0 dvb0Var, jpa0 jpa0Var, wat watVar, int i, List list, long j, int i2, int i3, int i4, int i5, int i6, c9n c9nVar) {
        this.a = iArr;
        this.b = iArr2;
        this.c = f;
        this.d = hfh0Var;
        this.e = f2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = dvb0Var;
        this.j = jpa0Var;
        this.k = watVar;
        this.l = i;
        this.m = list;
        this.n = j;
        this.o = i2;
        this.f180p = i3;
        this.q = i4;
        this.r = i5;
        this.s = i6;
        this.t = c9nVar;
        this.u = z2 ? qqq0.a : qqq0.b;
    }

    public final void a() {
        this.d.a();
    }

    public final iu30 b() {
        return this.d.b();
    }

    public final Map c() {
        return this.d.c();
    }

    public final vu30 d() {
        return this.d.d();
    }

    public final iu30 e() {
        return this.d.e();
    }

    public final yub0 f(int i, boolean z) {
        if (this.h) {
            return null;
        }
        List list = this.m;
        if (list.isEmpty()) {
            return null;
        }
        int[] iArr = this.a;
        if (iArr.length == 0) {
            return null;
        }
        int[] iArr2 = this.b;
        if (iArr2.length == 0) {
            return null;
        }
        int i2 = this.r;
        int i3 = this.f180p;
        int i4 = i3 - i2;
        List list2 = list;
        int size = list2.size();
        for (int i5 = 0; i5 < size; i5++) {
            avb0 avb0Var = (avb0) list.get(i5);
            if (avb0Var.u) {
                return null;
            }
            if ((avb0Var.m() <= 0) != (avb0Var.m() + i <= 0)) {
                return null;
            }
            int iM = avb0Var.m();
            int i6 = this.o;
            if (iM <= i6) {
                if (i < 0) {
                    if ((avb0Var.n() + avb0Var.m()) - i6 <= (-i)) {
                        return null;
                    }
                } else if (i6 - avb0Var.m() <= i) {
                    return null;
                }
            }
            if (avb0Var.n() + avb0Var.m() >= i4) {
                if (i < 0) {
                    if ((avb0Var.n() + avb0Var.m()) - i3 <= (-i)) {
                        return null;
                    }
                } else if (i3 - avb0Var.m() <= i) {
                    return null;
                }
            }
        }
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            avb0 avb0Var2 = (avb0) list.get(i7);
            boolean z2 = avb0Var2.d;
            if (!avb0Var2.u) {
                long j = avb0Var2.w;
                avb0Var2.w = (((long) (z2 ? ((int) (j & 4294967295L)) + i : (int) (j & 4294967295L))) & 4294967295L) | (((long) (z2 ? (int) (j >> 32) : ((int) (j >> 32)) + i)) << 32);
                if (z) {
                    int size3 = avb0Var2.c.size();
                    for (int i8 = 0; i8 < size3; i8++) {
                        xrb0 xrb0VarA = avb0Var2.j.a(i8, avb0Var2.b);
                        if (xrb0VarA != null) {
                            long j2 = xrb0VarA.l;
                            xrb0VarA.l = (((long) (z2 ? ((int) (j2 & 4294967295L)) + i : (int) (j2 & 4294967295L))) & 4294967295L) | (((long) (z2 ? (int) (j2 >> 32) : ((int) (j2 >> 32)) + i)) << 32);
                        }
                    }
                }
            }
        }
        int length = iArr2.length;
        int[] iArr3 = new int[length];
        for (int i9 = 0; i9 < length; i9++) {
            iArr3[i9] = iArr2[i9] - i;
        }
        return new yub0(iArr, iArr3, i, this.d, this.e, this.f || i > 0, this.g, this.h, this.i, this.j, this.k, this.l, list, this.n, this.o, this.f180p, this.q, this.r, this.s, this.t);
    }

    public final int getHeight() {
        return this.d.getHeight();
    }

    public final int getWidth() {
        return this.d.getWidth();
    }
}
