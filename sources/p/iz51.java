package p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iz51 {
    public final ggg1 a;
    public final y9e1 b;
    public final boolean c;
    public final boolean d;
    public final float e;
    public final ir20 f;
    public final i4e1 g;
    public final y061 h;
    public long i;
    public int j;
    public final String k;

    public iz51(ggg1 ggg1Var, y9e1 y9e1Var, boolean z, boolean z2, float f, ir20 ir20Var) {
        this.a = ggg1Var;
        this.b = y9e1Var;
        this.c = z;
        this.d = z2;
        this.e = f;
        this.f = ir20Var;
        jv91 jv91VarO = ekb.o();
        iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
        jv91 jv91VarU = ekb.u(jv91VarO);
        try {
            i4e1 i4e1VarH = ggg1Var.h();
            this.g = i4e1VarH;
            this.h = ggg1Var.f();
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
            this.i = i4e1VarH.e;
            this.k = i4e1VarH.d.toString();
        } catch (Throwable th) {
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
            throw th;
        }
    }

    public final void a() {
        if (this.k.length() > 0) {
            i4e1 i4e1Var = this.g;
            boolean zD = nbe1.d(i4e1Var.e);
            ggg1 ggg1Var = this.a;
            if (zD) {
                ggg1.n(ggg1Var, "", e6p1.e((int) (i4e1Var.e >> 32), (int) (this.i & 4294967295L)), !this.c, this.d, 4);
            } else {
                ggg1Var.c(this.d);
            }
            this.i = this.a.h().e;
            this.j = 1;
        }
    }

    public final boolean b() {
        y9e1 y9e1Var = this.b;
        if (y9e1Var != null) {
            long j = this.i;
            int i = nbe1.c;
            if (y9e1Var.j((int) (j & 4294967295L)) != 1) {
                return false;
            }
        }
        return true;
    }

    public final int c(y9e1 y9e1Var, int i) {
        long j = this.i;
        int i2 = nbe1.c;
        int i3 = (int) (j & 4294967295L);
        ir20 ir20Var = this.f;
        if (Float.isNaN(ir20Var.b)) {
            ir20Var.b = y9e1Var.c(i3).a;
        }
        zrm0 zrm0Var = y9e1Var.b;
        int iD = zrm0Var.d(i3) + i;
        if (iD < 0) {
            return os00.INVALID_ID;
        }
        if (iD >= zrm0Var.f) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        float fB = zrm0Var.b(iD) - 1.0f;
        float f = ir20Var.b;
        if ((b() && f >= y9e1Var.h(iD)) || (!b() && f <= y9e1Var.g(iD))) {
            return zrm0Var.c(iD, true);
        }
        return zrm0Var.g((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L));
    }

    public final int d(int i) {
        long j = this.g.e;
        int i2 = nbe1.c;
        int i3 = (int) (j & 4294967295L);
        y9e1 y9e1Var = this.b;
        if (y9e1Var != null) {
            zrm0 zrm0Var = y9e1Var.b;
            float f = this.e;
            if (!Float.isNaN(f)) {
                n511 n511VarM = y9e1Var.c(i3).m(0.0f, f * i);
                float f2 = n511VarM.b;
                float fB = zrm0Var.b(zrm0Var.e(f2));
                return Math.abs(f2 - fB) > Math.abs(n511VarM.d - fB) ? zrm0Var.g(n511VarM.h()) : zrm0Var.g(n511VarM.d());
            }
        }
        return i3;
    }

    public final void e() {
        y9e1 y9e1Var = this.b;
        int iC = y9e1Var != null ? c(y9e1Var, 1) : Integer.MAX_VALUE;
        if (iC == Integer.MAX_VALUE) {
            this.f.b = Float.NaN;
        }
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = nbe1.c;
            int i2 = (int) (j & 4294967295L);
            int length = str.length();
            if (iC > length) {
                iC = length;
            }
            long jK = z5p1.k(iC, i2, this.a);
            int i3 = (int) (jK >> 32);
            int iJ = axo1.j(jK);
            if (i3 != i2 || !nbe1.d(this.i)) {
                this.i = e6p1.e(i3, i3);
            }
            if (iJ != 0) {
                this.j = iJ;
            }
        }
    }

    public final void f() {
        if (this.k.length() > 0) {
            long j = this.i;
            int i = nbe1.c;
            int i2 = (int) (j & 4294967295L);
            long jK = z5p1.k(d(1), i2, this.a);
            int i3 = (int) (jK >> 32);
            int iJ = axo1.j(jK);
            if (i3 != i2 || !nbe1.d(this.i)) {
                this.i = e6p1.e(i3, i3);
            }
            if (iJ != 0) {
                this.j = iJ;
            }
        }
    }

    public final void g() {
        this.f.b = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = nbe1.c;
            int i2 = (int) (j & 4294967295L);
            long jK = z5p1.k(mmo1.u(i2, str), i2, this.a);
            int i3 = (int) (jK >> 32);
            int iJ = axo1.j(jK);
            if (i3 != i2 || !nbe1.d(this.i)) {
                this.i = e6p1.e(i3, i3);
            }
            if (iJ != 0) {
                this.j = iJ;
            }
        }
    }

    public final void h() {
        this.f.b = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = (int) (4294967295L & j);
            int iG = jmo1.g(nbe1.f(j), str);
            if (iG == nbe1.f(this.i) && iG != str.length()) {
                iG = jmo1.g(iG + 1, str);
            }
            long jK = z5p1.k(iG, i, this.a);
            int i2 = (int) (jK >> 32);
            int iJ = axo1.j(jK);
            if (i2 != i || !nbe1.d(this.i)) {
                this.i = e6p1.e(i2, i2);
            }
            if (iJ != 0) {
                this.j = iJ;
            }
        }
    }

    public final void i() {
        int length;
        this.f.b = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = nbe1.c;
            int i2 = (int) (j & 4294967295L);
            y9e1 y9e1Var = this.b;
            if (y9e1Var != null) {
                int i3 = i2;
                while (true) {
                    i4e1 i4e1Var = this.g;
                    if (i3 < i4e1Var.d.length()) {
                        int length2 = str.length() - 1;
                        if (i3 <= length2) {
                            length2 = i3;
                        }
                        long jL = y9e1Var.l(length2);
                        int i4 = nbe1.c;
                        int i5 = (int) (jL & 4294967295L);
                        if (i5 > i3) {
                            length = i5;
                            break;
                        }
                        i3++;
                    } else {
                        length = i4e1Var.d.length();
                        break;
                    }
                }
            } else {
                length = str.length();
            }
            long jK = z5p1.k(length, i2, this.a);
            int i6 = (int) (jK >> 32);
            int iJ = axo1.j(jK);
            if (i6 != i2 || !nbe1.d(this.i)) {
                this.i = e6p1.e(i6, i6);
            }
            if (iJ != 0) {
                this.j = iJ;
            }
        }
    }

    public final void j() {
        this.f.b = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = nbe1.c;
            int i2 = (int) (j & 4294967295L);
            long jK = z5p1.k(mmo1.v(i2, str), i2, this.a);
            int i3 = (int) (jK >> 32);
            int iJ = axo1.j(jK);
            if (i3 != i2 || !nbe1.d(this.i)) {
                this.i = e6p1.e(i3, i3);
            }
            if (iJ != 0) {
                this.j = iJ;
            }
        }
    }

    public final void k() {
        this.f.b = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = (int) (4294967295L & j);
            int iH = jmo1.h(nbe1.g(j), str);
            if (iH == nbe1.g(this.i) && iH != 0) {
                iH = jmo1.h(iH - 1, str);
            }
            long jK = z5p1.k(iH, i, this.a);
            int i2 = (int) (jK >> 32);
            int iJ = axo1.j(jK);
            if (i2 != i || !nbe1.d(this.i)) {
                this.i = e6p1.e(i2, i2);
            }
            if (iJ != 0) {
                this.j = iJ;
            }
        }
    }

    public final void l() {
        this.f.b = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = nbe1.c;
            int i2 = (int) (j & 4294967295L);
            int i3 = 0;
            y9e1 y9e1Var = this.b;
            if (y9e1Var != null) {
                for (int i4 = i2; i4 > 0; i4--) {
                    int length = str.length() - 1;
                    if (i4 <= length) {
                        length = i4;
                    }
                    long jL = y9e1Var.l(length);
                    int i5 = nbe1.c;
                    int i6 = (int) (jL >> 32);
                    if (i6 < i4) {
                        i3 = i6;
                        break;
                    }
                }
            }
            long jK = z5p1.k(i3, i2, this.a);
            int i7 = (int) (jK >> 32);
            int iJ = axo1.j(jK);
            if (i7 != i2 || !nbe1.d(this.i)) {
                this.i = e6p1.e(i7, i7);
            }
            if (iJ != 0) {
                this.j = iJ;
            }
        }
    }

    public final void m() {
        this.f.b = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = nbe1.c;
            int i2 = (int) (j & 4294967295L);
            long jK = z5p1.k(str.length(), i2, this.a);
            int i3 = (int) (jK >> 32);
            int iJ = axo1.j(jK);
            if (i3 != i2 || !nbe1.d(this.i)) {
                this.i = e6p1.e(i3, i3);
            }
            if (iJ != 0) {
                this.j = iJ;
            }
        }
    }

    public final void n() {
        this.f.b = Float.NaN;
        if (this.k.length() > 0) {
            long j = this.i;
            int i = nbe1.c;
            int i2 = (int) (j & 4294967295L);
            long jK = z5p1.k(0, i2, this.a);
            int i3 = (int) (jK >> 32);
            int iJ = axo1.j(jK);
            if (i3 != i2 || !nbe1.d(this.i)) {
                this.i = e6p1.e(i3, i3);
            }
            if (iJ != 0) {
                this.j = iJ;
            }
        }
    }

    public final void o() {
        int length;
        this.f.b = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = nbe1.c;
            int i2 = (int) (4294967295L & j);
            y9e1 y9e1Var = this.b;
            if (y9e1Var != null) {
                zrm0 zrm0Var = y9e1Var.b;
                length = zrm0Var.c(zrm0Var.d(nbe1.f(j)), true);
            } else {
                length = str.length();
            }
            long jK = z5p1.k(length, i2, this.a);
            int i3 = (int) (jK >> 32);
            int iJ = axo1.j(jK);
            if (i3 != i2 || !nbe1.d(this.i)) {
                this.i = e6p1.e(i3, i3);
            }
            if (iJ != 0) {
                this.j = iJ;
            }
        }
    }

    public final void p() {
        int i;
        this.f.b = Float.NaN;
        if (this.k.length() > 0) {
            long j = this.i;
            int i2 = nbe1.c;
            int i3 = (int) (4294967295L & j);
            y9e1 y9e1Var = this.b;
            if (y9e1Var != null) {
                i = y9e1Var.i(y9e1Var.b.d(nbe1.g(j)));
            } else {
                i = 0;
            }
            long jK = z5p1.k(i, i3, this.a);
            int i4 = (int) (jK >> 32);
            int iJ = axo1.j(jK);
            if (i4 != i3 || !nbe1.d(this.i)) {
                this.i = e6p1.e(i4, i4);
            }
            if (iJ != 0) {
                this.j = iJ;
            }
        }
    }

    public final void q() {
        y9e1 y9e1Var = this.b;
        int iC = y9e1Var != null ? c(y9e1Var, -1) : Integer.MIN_VALUE;
        if (iC == Integer.MIN_VALUE) {
            this.f.b = Float.NaN;
        }
        if (this.k.length() > 0) {
            long j = this.i;
            int i = nbe1.c;
            int i2 = (int) (j & 4294967295L);
            if (iC < 0) {
                iC = 0;
            }
            long jK = z5p1.k(iC, i2, this.a);
            int i3 = (int) (jK >> 32);
            int iJ = axo1.j(jK);
            if (i3 != i2 || !nbe1.d(this.i)) {
                this.i = e6p1.e(i3, i3);
            }
            if (iJ != 0) {
                this.j = iJ;
            }
        }
    }

    public final void r() {
        if (this.k.length() > 0) {
            long j = this.i;
            int i = nbe1.c;
            int i2 = (int) (j & 4294967295L);
            long jK = z5p1.k(d(-1), i2, this.a);
            int i3 = (int) (jK >> 32);
            int iJ = axo1.j(jK);
            if (i3 != i2 || !nbe1.d(this.i)) {
                this.i = e6p1.e(i3, i3);
            }
            if (iJ != 0) {
                this.j = iJ;
            }
        }
    }

    public final void s() {
        if (this.k.length() > 0) {
            long j = this.g.e;
            int i = nbe1.c;
            this.i = e6p1.e((int) (j >> 32), (int) (this.i & 4294967295L));
        }
    }
}
