package p;

import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qtb0 implements jsb0 {
    public final int[] A;
    public final int a;
    public final List b;
    public final boolean c;
    public final nl3 d;
    public final pl3 e;
    public final flb0 f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final Object l;
    public final Object m;
    public final bsb0 n;
    public final long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f102p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public boolean w;
    public int x = Integer.MIN_VALUE;
    public int y;
    public int z;

    public qtb0(int i, List list, boolean z, nl3 nl3Var, pl3 pl3Var, flb0 flb0Var, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, bsb0 bsb0Var, long j2) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = nl3Var;
        this.e = pl3Var;
        this.f = flb0Var;
        this.g = z2;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = j;
        this.l = obj;
        this.m = obj2;
        this.n = bsb0Var;
        this.o = j2;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            q5t0 q5t0Var = (q5t0) list.get(i6);
            boolean z3 = this.c;
            i5 += z3 ? q5t0Var.b : q5t0Var.a;
            iMax = Math.max(iMax, !z3 ? q5t0Var.b : q5t0Var.a);
        }
        this.q = i5;
        this.v = iMax;
        this.A = new int[this.b.size() * 2];
        if (this.c) {
            this.u = this.j;
            this.s = i5;
            this.r = iMax;
            this.t = 0;
            return;
        }
        this.u = 0;
        this.s = iMax;
        this.r = i5;
        this.t = this.j;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // p.jsb0
    public final void a(int i, int i2, int i3, int i4) throws KotlinNothingValueException {
        o(i, i3, i4);
    }

    @Override // p.jsb0
    public final int b() {
        return 1;
    }

    @Override // p.jsb0
    public final int c() {
        return this.s;
    }

    @Override // p.jsb0
    public final long d() {
        return this.o;
    }

    @Override // p.jsb0
    public final void e() {
        this.w = true;
    }

    @Override // p.jsb0
    public final int f() {
        return this.t;
    }

    @Override // p.jsb0
    public final List g() {
        return this.b;
    }

    @Override // p.jsb0
    public final int getIndex() {
        return this.a;
    }

    @Override // p.jsb0
    public final Object getKey() {
        return this.l;
    }

    @Override // p.jsb0
    public final int h() {
        return this.u;
    }

    @Override // p.jsb0
    public final long i(int i) {
        if (i == 0 && men1.v(this) == 0) {
            int i2 = this.f102p;
            return this.c ? ((long) i2) & 4294967295L : ((long) i2) << 32;
        }
        int i3 = i * 2;
        int[] iArr = this.A;
        return (((long) iArr[i3 + 1]) & 4294967295L) | (((long) iArr[i3]) << 32);
    }

    @Override // p.jsb0
    public final int j() {
        return 0;
    }

    @Override // p.jsb0
    public final int k() {
        return this.r;
    }

    public final int l(long j) {
        return (int) (this.c ? j & 4294967295L : j >> 32);
    }

    public final int m() {
        int i;
        int i2;
        if (this.c) {
            i = this.s;
            i2 = this.u;
        } else {
            i = this.r;
            i2 = this.t;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public final void n(p5t0 p5t0Var, boolean z) {
        be50 be50Var;
        long j;
        if (this.x == Integer.MIN_VALUE) {
            tf80.a("position() should be called first");
        }
        int iV = men1.v(this);
        for (int i = 0; i < iV; i++) {
            q5t0 q5t0Var = (q5t0) this.b.get(i);
            int i2 = this.y;
            boolean z2 = this.c;
            int i3 = i2 - (z2 ? q5t0Var.b : q5t0Var.a);
            int i4 = this.z;
            long jI = i(i);
            xrb0 xrb0VarA = this.n.a(i, this.l);
            if (xrb0VarA != null) {
                if (z) {
                    xrb0VarA.n = jI;
                } else {
                    if (!qr80.b(xrb0VarA.n, 9223372034707292159L)) {
                        jI = xrb0VarA.n;
                    }
                    long jD = qr80.d(jI, ((qr80) xrb0VarA.r.getValue()).a);
                    if ((l(jI) <= i3 && l(jD) <= i3) || (l(jI) >= i4 && l(jD) >= i4)) {
                        xrb0VarA.b();
                    }
                    jI = jD;
                }
                be50Var = xrb0VarA.o;
            } else {
                be50Var = null;
            }
            if (this.g) {
                int i5 = this.x;
                if (z2) {
                    j = (((long) ((int) (jI >> 32))) << 32) | (4294967295L & ((long) ((i5 - ((int) (jI & 4294967295L))) - (z2 ? q5t0Var.b : q5t0Var.a))));
                } else {
                    j = (((long) ((int) (jI & 4294967295L))) & 4294967295L) | (((long) ((i5 - ((int) (jI >> 32))) - (z2 ? q5t0Var.b : q5t0Var.a))) << 32);
                }
                jI = j;
            }
            long jD2 = qr80.d(jI, this.k);
            if (!z && xrb0VarA != null) {
                xrb0VarA.m = jD2;
            }
            if (z2) {
                if (be50Var != null) {
                    p5t0Var.e(q5t0Var);
                    q5t0Var.f0(qr80.d(jD2, q5t0Var.e), 0.0f, be50Var);
                } else {
                    p5t0.w(p5t0Var, q5t0Var, jD2);
                }
            } else if (be50Var != null) {
                p5t0.q(p5t0Var, q5t0Var, jD2, be50Var);
            } else {
                p5t0.p(p5t0Var, q5t0Var, jD2);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void o(int i, int i2, int i3) throws KotlinNothingValueException {
        int i4;
        this.f102p = i;
        boolean z = this.c;
        this.x = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            q5t0 q5t0Var = (q5t0) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.A;
            if (z) {
                nl3 nl3Var = this.d;
                if (nl3Var == null) {
                    throw kaa0.g("null horizontalAlignment when isVertical == true");
                }
                iArr[i6] = nl3Var.a(q5t0Var.a, i2, this.f);
                iArr[i6 + 1] = i;
                i4 = q5t0Var.b;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                pl3 pl3Var = this.e;
                if (pl3Var == null) {
                    throw kaa0.g("null verticalAlignment when isVertical == false");
                }
                iArr[i7] = pl3Var.c(q5t0Var.b, i3);
                i4 = q5t0Var.a;
            }
            i += i4;
        }
        this.y = -this.h;
        this.z = this.x + this.i;
    }
}
