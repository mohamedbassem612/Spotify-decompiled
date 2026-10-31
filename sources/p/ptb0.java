package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ptb0 implements hfh0 {
    public final qtb0 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final hfh0 e;
    public final float f;
    public final boolean g;
    public final c9n h;
    public final wat i;
    public final long j;
    public final int k;
    public final List l;
    public final int m;
    public final int n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f94p;
    public final qqq0 q;
    public final int r;
    public final int s;

    public ptb0(qtb0 qtb0Var, int i, boolean z, float f, hfh0 hfh0Var, float f2, boolean z2, c9n c9nVar, wat watVar, long j, int i2, List list, int i3, int i4, int i5, boolean z3, qqq0 qqq0Var, int i6, int i7) {
        this.a = qtb0Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = hfh0Var;
        this.f = f2;
        this.g = z2;
        this.h = c9nVar;
        this.i = watVar;
        this.j = j;
        this.k = i2;
        this.l = list;
        this.m = i3;
        this.n = i4;
        this.o = i5;
        this.f94p = z3;
        this.q = qqq0Var;
        this.r = i6;
        this.s = i7;
    }

    @Override // p.hfh0
    public final void a() {
        this.e.a();
    }

    @Override // p.hfh0
    public final iu30 b() {
        return this.e.b();
    }

    @Override // p.hfh0
    public final Map c() {
        return this.e.c();
    }

    @Override // p.hfh0
    public final vu30 d() {
        return this.e.d();
    }

    @Override // p.hfh0
    public final iu30 e() {
        return this.e.e();
    }

    public final ptb0 f(int i, boolean z) {
        qtb0 qtb0Var;
        int i2;
        int i3;
        if (this.g) {
            return null;
        }
        List list = this.l;
        if (list.isEmpty() || (qtb0Var = this.a) == null) {
            return null;
        }
        int iM = qtb0Var.m();
        int i4 = this.b - i;
        if (i4 < 0 || i4 >= iM) {
            return null;
        }
        qtb0 qtb0Var2 = (qtb0) o7h.q0(list);
        qtb0 qtb0Var3 = (qtb0) o7h.A0(list);
        if (qtb0Var2.w || qtb0Var3.w) {
            return null;
        }
        int i5 = qtb0Var2.f102p;
        int i6 = this.n;
        int i7 = this.m;
        if (i < 0) {
            if (Math.min((qtb0Var2.m() + i5) - i7, (qtb0Var3.m() + qtb0Var3.f102p) - i6) <= (-i)) {
                return null;
            }
        } else if (Math.min(i7 - i5, i6 - qtb0Var3.f102p) <= i) {
            return null;
        }
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            qtb0 qtb0Var4 = (qtb0) list.get(i8);
            boolean z2 = qtb0Var4.c;
            int[] iArr = qtb0Var4.A;
            if (!qtb0Var4.w) {
                qtb0Var4.f102p += i;
                int length = iArr.length;
                for (int i9 = 0; i9 < length; i9++) {
                    int i10 = i9 & 1;
                    if ((z2 && i10 != 0) || (!z2 && i10 == 0)) {
                        iArr[i9] = iArr[i9] + i;
                    }
                }
                if (z) {
                    int iV = men1.v(qtb0Var4);
                    int i11 = 0;
                    while (i11 < iV) {
                        xrb0 xrb0VarA = qtb0Var4.n.a(i11, qtb0Var4.l);
                        if (xrb0VarA != null) {
                            long j = xrb0VarA.l;
                            if (z2) {
                                i2 = (int) (j >> 32);
                                i3 = ((int) (j & 4294967295L)) + i;
                            } else {
                                i2 = ((int) (j >> 32)) + i;
                                i3 = (int) (j & 4294967295L);
                            }
                            xrb0VarA.l = (((long) i3) & 4294967295L) | (((long) i2) << 32);
                        } else {
                            i4 = i4;
                        }
                        i11++;
                        i4 = i4;
                    }
                }
            }
            i8++;
            i4 = i4;
        }
        return new ptb0(this.a, i4, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, list, this.m, this.n, this.o, this.f94p, this.q, this.r, this.s);
    }

    public final long g() {
        hfh0 hfh0Var = this.e;
        return (((long) hfh0Var.getWidth()) << 32) | (((long) hfh0Var.getHeight()) & 4294967295L);
    }

    @Override // p.hfh0
    public final int getHeight() {
        return this.e.getHeight();
    }

    @Override // p.hfh0
    public final int getWidth() {
        return this.e.getWidth();
    }
}
