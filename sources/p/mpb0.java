package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mpb0 implements jsb0 {
    public final int a;
    public final Object b;
    public final int c;
    public final flb0 d;
    public final int e;
    public final int f;
    public final List g;
    public final long h;
    public final Object i;
    public final bsb0 j;
    public final long k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f92p;
    public final int q;
    public final int r;
    public int s = os00.INVALID_ID;
    public int t;
    public int u;
    public final long v;
    public long w;
    public int x;
    public int y;
    public boolean z;

    public mpb0(int i, Object obj, int i2, int i3, flb0 flb0Var, int i4, int i5, List list, long j, Object obj2, bsb0 bsb0Var, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.c = i2;
        this.d = flb0Var;
        this.e = i4;
        this.f = i5;
        this.g = list;
        this.h = j;
        this.i = obj2;
        this.j = bsb0Var;
        this.k = j2;
        this.l = i6;
        this.m = i7;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iMax = Math.max(iMax, ((q5t0) list.get(i8)).b);
        }
        this.n = iMax;
        this.r = i3;
        this.f92p = iMax;
        int i9 = this.c;
        this.o = i9;
        this.q = 0;
        this.v = (((long) i9) << 32) | (((long) iMax) & 4294967295L);
        this.w = 0L;
        this.x = -1;
        this.y = -1;
    }

    public final void a(int i, int i2, int i3, int i4) {
        n(i, i2, i3, i4, -1, -1);
    }

    public final int b() {
        return this.m;
    }

    public final int c() {
        return this.f92p;
    }

    public final long d() {
        return this.k;
    }

    public final void e() {
        this.z = true;
    }

    public final int f() {
        return this.q;
    }

    public final List g() {
        return this.g;
    }

    public final int getIndex() {
        return this.a;
    }

    public final Object getKey() {
        return this.b;
    }

    public final int h() {
        return this.r;
    }

    public final long i(int i) {
        return this.w;
    }

    public final int j() {
        return this.l;
    }

    public final int k() {
        return this.o;
    }

    public final int l() {
        return this.f92p + this.r;
    }

    public final void m(p5t0 p5t0Var, boolean z) {
        be50 be50Var;
        if (this.s == Integer.MIN_VALUE) {
            tf80.a("position() should be called first");
        }
        List list = this.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            q5t0 q5t0Var = (q5t0) list.get(i);
            int i2 = this.t - q5t0Var.b;
            int i3 = this.u;
            long j = this.w;
            xrb0 xrb0VarA = this.j.a(i, this.b);
            if (xrb0VarA != null) {
                if (z) {
                    xrb0VarA.n = j;
                } else {
                    long jD = qr80.d(!qr80.b(xrb0VarA.n, 9223372034707292159L) ? xrb0VarA.n : j, ((qr80) xrb0VarA.r.getValue()).a);
                    int i4 = (int) (j & 4294967295L);
                    if ((i4 <= i2 && ((int) (jD & 4294967295L)) <= i2) || (i4 >= i3 && ((int) (jD & 4294967295L)) >= i3)) {
                        xrb0VarA.b();
                    }
                    j = jD;
                }
                be50Var = xrb0VarA.o;
            } else {
                be50Var = null;
            }
            long jD2 = qr80.d(j, this.h);
            if (!z && xrb0VarA != null) {
                xrb0VarA.m = jD2;
            }
            if (be50Var != null) {
                p5t0Var.e(q5t0Var);
                q5t0Var.f0(qr80.d(jD2, q5t0Var.e), 0.0f, be50Var);
            } else {
                p5t0.w(p5t0Var, q5t0Var, jD2);
            }
        }
    }

    public final void n(int i, int i2, int i3, int i4, int i5, int i6) {
        this.s = i4;
        if (this.d == flb0.b) {
            i2 = (i3 - i2) - this.c;
        }
        this.w = (((long) i2) << 32) | (((long) i) & 4294967295L);
        this.x = i5;
        this.y = i6;
        this.t = -this.e;
        this.u = i4 + this.f;
    }
}
