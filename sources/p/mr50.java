package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mr50 implements ytw {
    public final gt51 a;
    public String b;
    public gtf1 c;
    public lr50 d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final sin0 g = new sin0(32);
    public final sin0 h = new sin0(33);
    public final sin0 i = new sin0(34);
    public final sin0 j = new sin0(39);
    public final sin0 k = new sin0(40);
    public long m = -9223372036854775807L;
    public final izr0 n = new izr0();

    public mr50(gt51 gt51Var) {
        this.a = gt51Var;
    }

    @Override // p.ytw
    public final void a(izr0 izr0Var) {
        int i;
        this.c.getClass();
        String str = zoi1.a;
        while (izr0Var.a() > 0) {
            int i2 = izr0Var.b;
            int i3 = izr0Var.c;
            byte[] bArr = izr0Var.a;
            this.l += (long) izr0Var.a();
            this.c.f(izr0Var.a(), izr0Var);
            while (i2 < i3) {
                int iO = mqn1.o(bArr, i2, i3, this.f);
                if (iO == i3) {
                    h(i2, bArr, i3);
                    return;
                }
                int i4 = (bArr[iO + 3] & 126) >> 1;
                if (iO <= 0 || bArr[iO - 1] != 0) {
                    i = 3;
                } else {
                    iO--;
                    i = 4;
                }
                int i5 = iO;
                int i6 = i;
                int i7 = i5 - i2;
                if (i7 > 0) {
                    h(i2, bArr, i5);
                }
                int i8 = i3 - i5;
                long j = this.l - ((long) i8);
                g(j, this.m, i8, i7 < 0 ? -i7 : 0);
                i(j, this.m, i8, i4);
                i2 = i5 + i6;
            }
        }
    }

    @Override // p.ytw
    public final void b() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        mqn1.k(this.f);
        this.g.c();
        this.h.c();
        this.i.c();
        this.j.c();
        this.k.c();
        this.a.d.o(0);
        lr50 lr50Var = this.d;
        if (lr50Var != null) {
            lr50Var.f = false;
            lr50Var.g = false;
            lr50Var.h = false;
            lr50Var.i = false;
            lr50Var.j = false;
        }
    }

    @Override // p.ytw
    public final void c() {
        this.c.getClass();
        String str = zoi1.a;
        this.a.d.o(0);
        g(this.l, this.m, 0, 0);
        i(this.l, this.m, 0, 48);
    }

    @Override // p.ytw
    public final void d(gc10 gc10Var, wwg1 wwg1Var) {
        wwg1Var.a();
        wwg1Var.b();
        this.b = wwg1Var.e;
        wwg1Var.b();
        gtf1 gtf1VarW = gc10Var.w(wwg1Var.d, 2);
        this.c = gtf1VarW;
        this.d = new lr50(gtf1VarW);
        this.a.b(gc10Var, wwg1Var);
    }

    @Override // p.ytw
    public final void f(int i, long j) {
        this.m = j;
    }

    public final void g(long j, long j2, int i, int i2) {
        t01 t01Var = this.a.d;
        lr50 lr50Var = this.d;
        boolean z = this.e;
        if (lr50Var.j && lr50Var.g) {
            lr50Var.m = lr50Var.c;
            lr50Var.j = false;
        } else if (lr50Var.h || lr50Var.g) {
            if (z && lr50Var.i) {
                lr50Var.a(i + ((int) (j - lr50Var.b)));
            }
            lr50Var.k = lr50Var.b;
            lr50Var.l = lr50Var.e;
            lr50Var.m = lr50Var.c;
            lr50Var.i = true;
        }
        if (!this.e) {
            sin0 sin0Var = this.g;
            sin0Var.b(i2);
            sin0 sin0Var2 = this.h;
            sin0Var2.b(i2);
            sin0 sin0Var3 = this.i;
            sin0Var3.b(i2);
            if (sin0Var.c && sin0Var2.c && sin0Var3.c) {
                String str = this.b;
                int i3 = sin0Var.e;
                byte[] bArr = new byte[sin0Var2.e + i3 + sin0Var3.e];
                System.arraycopy(sin0Var.d, 0, bArr, 0, i3);
                System.arraycopy(sin0Var2.d, 0, bArr, sin0Var.e, sin0Var2.e);
                System.arraycopy(sin0Var3.d, 0, bArr, sin0Var.e + sin0Var2.e, sin0Var3.e);
                win0 win0VarZ = mqn1.z(sin0Var2.d, 3, sin0Var2.e, null);
                uin0 uin0Var = win0VarZ.b;
                String strA = uin0Var != null ? kwg.a(uin0Var.a, uin0Var.b, uin0Var.c, uin0Var.d, uin0Var.e, uin0Var.f) : null;
                ge30 ge30Var = new ge30();
                ge30Var.a = str;
                ge30Var.n = asj0.p("video/mp2t");
                ge30Var.o = asj0.p("video/hevc");
                ge30Var.k = strA;
                ge30Var.v = win0VarZ.f;
                ge30Var.w = win0VarZ.g;
                ge30Var.y = win0VarZ.h;
                ge30Var.z = win0VarZ.i;
                ge30Var.G = new x8h(win0VarZ.l, win0VarZ.m, win0VarZ.n, null, win0VarZ.d + 8, win0VarZ.e + 8);
                ge30Var.D = win0VarZ.j;
                ge30Var.q = win0VarZ.k;
                ge30Var.H = win0VarZ.a + 1;
                ge30Var.r = Collections.singletonList(bArr);
                ie30 ie30Var = new ie30(ge30Var);
                this.c.a(ie30Var);
                int i4 = ie30Var.r;
                dm5.y(i4 != -1);
                t01Var.F(i4);
                this.e = true;
            }
        }
        sin0 sin0Var4 = this.j;
        boolean zB = sin0Var4.b(i2);
        izr0 izr0Var = this.n;
        if (zB) {
            izr0Var.P(sin0Var4.d, mqn1.K(sin0Var4.d, sin0Var4.e));
            izr0Var.S(5);
            t01Var.a(j2, izr0Var);
        }
        sin0 sin0Var5 = this.k;
        if (sin0Var5.b(i2)) {
            izr0Var.P(sin0Var5.d, mqn1.K(sin0Var5.d, sin0Var5.e));
            izr0Var.S(5);
            t01Var.a(j2, izr0Var);
        }
    }

    public final void h(int i, byte[] bArr, int i2) {
        lr50 lr50Var = this.d;
        if (lr50Var.f) {
            int i3 = lr50Var.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                lr50Var.g = (bArr[i4] & 128) != 0;
                lr50Var.f = false;
            } else {
                lr50Var.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(i, bArr, i2);
            this.h.a(i, bArr, i2);
            this.i.a(i, bArr, i2);
        }
        this.j.a(i, bArr, i2);
        this.k.a(i, bArr, i2);
    }

    public final void i(long j, long j2, int i, int i2) {
        lr50 lr50Var = this.d;
        boolean z = this.e;
        lr50Var.g = false;
        lr50Var.h = false;
        lr50Var.e = j2;
        lr50Var.d = 0;
        lr50Var.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (lr50Var.i && !lr50Var.j) {
                if (z) {
                    lr50Var.a(i);
                }
                lr50Var.i = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                lr50Var.h = !lr50Var.j;
                lr50Var.j = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        lr50Var.c = z2;
        lr50Var.f = z2 || i2 <= 9;
        if (!this.e) {
            this.g.d(i2);
            this.h.d(i2);
            this.i.d(i2);
        }
        this.j.d(i2);
        this.k.d(i2);
    }
}
