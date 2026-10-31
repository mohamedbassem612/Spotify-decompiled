package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class n6e1 {
    public final af5 a;
    public final long b;
    public final y9e1 c;
    public final hyp0 d;
    public final jbe1 e;
    public long f;
    public final af5 g;
    public final c8e1 h;
    public final z9e1 i;

    public n6e1(c8e1 c8e1Var, hyp0 hyp0Var, z9e1 z9e1Var, jbe1 jbe1Var) {
        af5 af5Var = c8e1Var.a;
        long j = c8e1Var.b;
        y9e1 y9e1Var = z9e1Var != null ? z9e1Var.a : null;
        this.a = af5Var;
        this.b = j;
        this.c = y9e1Var;
        this.d = hyp0Var;
        this.e = jbe1Var;
        this.f = j;
        this.g = af5Var;
        this.h = c8e1Var;
        this.i = z9e1Var;
    }

    public final List a(iu30 iu30Var) {
        if (!nbe1.d(this.f)) {
            return p7h.M(new lov[]{new qqh("", 0), new sl61(nbe1.g(this.f), nbe1.g(this.f))});
        }
        lov lovVar = (lov) iu30Var.invoke(this);
        if (lovVar != null) {
            return Collections.singletonList(lovVar);
        }
        return null;
    }

    public final Integer b() {
        y9e1 y9e1Var = this.c;
        if (y9e1Var == null) {
            return null;
        }
        zrm0 zrm0Var = y9e1Var.b;
        int iF = nbe1.f(this.f);
        hyp0 hyp0Var = this.d;
        return Integer.valueOf(hyp0Var.i(zrm0Var.c(zrm0Var.d(hyp0Var.o(iF)), true)));
    }

    public final Integer c() {
        y9e1 y9e1Var = this.c;
        if (y9e1Var == null) {
            return null;
        }
        int iG = nbe1.g(this.f);
        hyp0 hyp0Var = this.d;
        return Integer.valueOf(hyp0Var.i(y9e1Var.i(y9e1Var.b.d(hyp0Var.o(iG)))));
    }

    public final Integer d() {
        int length;
        y9e1 y9e1Var = this.c;
        if (y9e1Var == null) {
            return null;
        }
        int iR = r();
        while (true) {
            af5 af5Var = this.a;
            if (iR < af5Var.b.length()) {
                int length2 = this.g.b.length() - 1;
                if (iR <= length2) {
                    length2 = iR;
                }
                long jL = y9e1Var.l(length2);
                int i = nbe1.c;
                int i2 = (int) (jL & 4294967295L);
                if (i2 > iR) {
                    length = this.d.i(i2);
                    break;
                }
                iR++;
            } else {
                length = af5Var.b.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int i;
        y9e1 y9e1Var = this.c;
        if (y9e1Var == null) {
            return null;
        }
        for (int iR = r(); iR > 0; iR--) {
            int length = this.g.b.length() - 1;
            if (iR <= length) {
                length = iR;
            }
            long jL = y9e1Var.l(length);
            int i2 = nbe1.c;
            int i3 = (int) (jL >> 32);
            if (i3 < iR) {
                i = this.d.i(i3);
                return Integer.valueOf(i);
            }
        }
        i = 0;
        return Integer.valueOf(i);
    }

    public final boolean f() {
        y9e1 y9e1Var = this.c;
        return (y9e1Var != null ? y9e1Var.j(r()) : 0) != 2;
    }

    public final int g(y9e1 y9e1Var, int i) {
        int iR = r();
        jbe1 jbe1Var = this.e;
        if (jbe1Var.a == null) {
            jbe1Var.a = Float.valueOf(y9e1Var.c(iR).a);
        }
        zrm0 zrm0Var = y9e1Var.b;
        int iD = zrm0Var.d(iR) + i;
        if (iD < 0) {
            return 0;
        }
        if (iD >= zrm0Var.f) {
            return this.g.b.length();
        }
        float fB = zrm0Var.b(iD) - 1.0f;
        Float f = jbe1Var.a;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((f() && fFloatValue >= y9e1Var.h(iD)) || (!f() && fFloatValue <= y9e1Var.g(iD))) {
            return zrm0Var.c(iD, true);
        }
        return this.d.i(zrm0Var.g((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final int h(z9e1 z9e1Var, int i) {
        n511 n511VarM;
        elb0 elb0Var = z9e1Var.b;
        y9e1 y9e1Var = z9e1Var.a;
        if (elb0Var == null) {
            n511VarM = n511.e;
        } else {
            elb0 elb0Var2 = z9e1Var.c;
            n511VarM = elb0Var2 != null ? elb0Var2.M(elb0Var, true) : null;
            if (n511VarM == null) {
                n511VarM = n511.e;
            }
        }
        long j = this.h.b;
        int i2 = nbe1.c;
        hyp0 hyp0Var = this.d;
        n511 n511VarC = y9e1Var.c(hyp0Var.o((int) (j & 4294967295L)));
        float f = n511VarC.a;
        return hyp0Var.i(y9e1Var.b.g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (n511VarM.g() & 4294967295L)) * i) + n511VarC.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
    }

    public final void i() {
        jbe1 jbe1Var = this.e;
        jbe1Var.a = null;
        af5 af5Var = this.g;
        if (af5Var.b.length() > 0) {
            if (f()) {
                k();
                return;
            }
            jbe1Var.a = null;
            if (af5Var.b.length() > 0) {
                String str = af5Var.b;
                long j = this.f;
                int i = nbe1.c;
                int iU = mmo1.u((int) (j & 4294967295L), str);
                if (iU != -1) {
                    q(iU, iU);
                }
            }
        }
    }

    public final void j() {
        this.e.a = null;
        af5 af5Var = this.g;
        String str = af5Var.b;
        String str2 = af5Var.b;
        if (str.length() > 0) {
            int iG = jmo1.g(nbe1.f(this.f), str2);
            if (iG == nbe1.f(this.f) && iG != str2.length()) {
                iG = jmo1.g(iG + 1, str2);
            }
            q(iG, iG);
        }
    }

    public final void k() {
        this.e.a = null;
        af5 af5Var = this.g;
        if (af5Var.b.length() > 0) {
            String str = af5Var.b;
            long j = this.f;
            int i = nbe1.c;
            int iV = mmo1.v((int) (j & 4294967295L), str);
            if (iV != -1) {
                q(iV, iV);
            }
        }
    }

    public final void l() {
        this.e.a = null;
        af5 af5Var = this.g;
        String str = af5Var.b;
        String str2 = af5Var.b;
        if (str.length() > 0) {
            int iH = jmo1.h(nbe1.g(this.f), str2);
            if (iH == nbe1.g(this.f) && iH != 0) {
                iH = jmo1.h(iH - 1, str2);
            }
            q(iH, iH);
        }
    }

    public final void m() {
        jbe1 jbe1Var = this.e;
        jbe1Var.a = null;
        af5 af5Var = this.g;
        if (af5Var.b.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            jbe1Var.a = null;
            if (af5Var.b.length() > 0) {
                String str = af5Var.b;
                long j = this.f;
                int i = nbe1.c;
                int iU = mmo1.u((int) (j & 4294967295L), str);
                if (iU != -1) {
                    q(iU, iU);
                }
            }
        }
    }

    public final void n() {
        Integer numB;
        this.e.a = null;
        if (this.g.b.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        q(iIntValue, iIntValue);
    }

    public final void o() {
        Integer numC;
        this.e.a = null;
        if (this.g.b.length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        q(iIntValue, iIntValue);
    }

    public final void p() {
        if (this.g.b.length() > 0) {
            int i = nbe1.c;
            this.f = e6p1.e((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void q(int i, int i2) {
        this.f = e6p1.e(i, i2);
    }

    public final int r() {
        long j = this.f;
        int i = nbe1.c;
        return this.d.o((int) (j & 4294967295L));
    }
}
