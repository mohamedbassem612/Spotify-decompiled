package p;

import androidx.media3.common.ParserException;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oyp0 implements ec10 {
    public gc10 a;
    public aec1 b;
    public boolean c;

    @Override // p.ec10
    public final void a(long j, long j2) {
        aec1 aec1Var = this.b;
        if (aec1Var != null) {
            qyp0 qyp0Var = aec1Var.a;
            qyp0Var.a.b();
            qyp0Var.b.O(0);
            qyp0Var.c = -1;
            qyp0Var.e = false;
            if (j == 0) {
                aec1Var.d(!aec1Var.l);
                return;
            }
            if (aec1Var.h != 0) {
                long j3 = (((long) aec1Var.i) * j2) / 1000000;
                aec1Var.e = j3;
                syp0 syp0Var = aec1Var.d;
                String str = zoi1.a;
                syp0Var.j(j3);
                aec1Var.h = (byte) 2;
            }
        }
    }

    @Override // p.ec10
    public final void b(gc10 gc10Var) {
        this.a = gc10Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Code duplicated, block: B:70:0x0174 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0175  */
    @Override // p.ec10
    public final int c(fc10 fc10Var, sfv0 sfv0Var) throws ParserException {
        byte[] bArr;
        this.a.getClass();
        if (this.b == null) {
            if (!f(fc10Var)) {
                throw ParserException.a((RuntimeException) null, "Failed to determine bitstream type");
            }
            fc10Var.f();
        }
        if (!this.c) {
            gtf1 gtf1VarW = this.a.w(0, 1);
            this.a.s();
            aec1 aec1Var = this.b;
            aec1Var.c = this.a;
            aec1Var.b = gtf1VarW;
            aec1Var.d(true);
            this.c = true;
        }
        aec1 aec1Var2 = this.b;
        qyp0 qyp0Var = aec1Var2.a;
        izr0 izr0Var = qyp0Var.b;
        aec1Var2.b.getClass();
        String str = zoi1.a;
        byte b = aec1Var2.h;
        if (b == 0) {
            while (qyp0Var.b(fc10Var)) {
                long position = fc10Var.getPosition();
                long j = aec1Var2.f;
                aec1Var2.k = position - j;
                if (!aec1Var2.c(izr0Var, j, aec1Var2.j)) {
                    ie30 ie30Var = (ie30) aec1Var2.j.b;
                    aec1Var2.i = ie30Var.L;
                    if (!aec1Var2.m) {
                        aec1Var2.b.a(ie30Var);
                        aec1Var2.m = true;
                    }
                    z1c z1cVar = (z1c) aec1Var2.j.c;
                    if (z1cVar == null) {
                        if (fc10Var.getLength() == -1) {
                            aec1Var2.d = new sjb((byte) 26);
                        } else {
                            ryp0 ryp0Var = qyp0Var.a;
                            aec1Var2.d = new gds(aec1Var2, aec1Var2.f, fc10Var.getLength(), ryp0Var.d + ryp0Var.e, ryp0Var.b, (ryp0Var.a & 4) != 0);
                        }
                        aec1Var2.h = 2;
                        bArr = izr0Var.a;
                        if (bArr.length == 65025) {
                            return 0;
                        }
                        izr0Var.P(Arrays.copyOf(bArr, Math.max(65025, izr0Var.c)), izr0Var.c);
                        return 0;
                    }
                    aec1Var2.d = z1cVar;
                    aec1Var2.h = 2;
                    bArr = izr0Var.a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    izr0Var.P(Arrays.copyOf(bArr, Math.max(65025, izr0Var.c)), izr0Var.c);
                    return 0;
                }
                aec1Var2.f = fc10Var.getPosition();
            }
            aec1Var2.h = (byte) 3;
            return -1;
        }
        if (b == 1) {
            fc10Var.u((int) aec1Var2.f);
            aec1Var2.h = (byte) 2;
            return 0;
        }
        if (b != 2) {
            if (b == 3) {
                return -1;
            }
            bhn0.w();
            return 0;
        }
        long jF = aec1Var2.d.f(fc10Var);
        if (jF >= 0) {
            sfv0Var.a = jF;
            return 1;
        }
        if (jF < -1) {
            aec1Var2.a(-(jF + 2));
        }
        if (!aec1Var2.l) {
            fn51 fn51VarI = aec1Var2.d.i();
            fn51VarI.getClass();
            aec1Var2.c.c(fn51VarI);
            aec1Var2.b.g(fn51VarI.g());
            aec1Var2.l = true;
        }
        if (aec1Var2.k <= 0 && !qyp0Var.b(fc10Var)) {
            aec1Var2.h = (byte) 3;
            return -1;
        }
        aec1Var2.k = 0L;
        long jB = aec1Var2.b(izr0Var);
        if (jB >= 0) {
            long j2 = aec1Var2.g;
            if (j2 + jB >= aec1Var2.e) {
                long j3 = (j2 * 1000000) / ((long) aec1Var2.i);
                aec1Var2.b.f(izr0Var.c, izr0Var);
                aec1Var2.b.b(j3, 1, izr0Var.c, 0, null);
                aec1Var2.e = -1L;
            }
        }
        aec1Var2.g += jB;
        return 0;
    }

    @Override // p.ec10
    public final boolean d(fc10 fc10Var) {
        try {
            return f(fc10Var);
        } catch (ParserException unused) {
            return false;
        }
    }

    public final boolean f(fc10 fc10Var) {
        boolean zB;
        ryp0 ryp0Var = new ryp0();
        if (ryp0Var.a(fc10Var, true) && (ryp0Var.a & 2) == 2) {
            int iMin = Math.min(ryp0Var.e, 8);
            izr0 izr0Var = new izr0(iMin);
            fc10Var.h(0, izr0Var.a, iMin);
            izr0Var.R(0);
            if (izr0Var.a() >= 5 && izr0Var.E() == 127 && izr0Var.G() == 1179402563) {
                this.b = new wn20();
                return true;
            }
            izr0Var.R(0);
            try {
                zB = sj1.B(1, izr0Var, true);
            } catch (ParserException unused) {
                zB = false;
            }
            if (zB) {
                this.b = new kuk1();
            } else {
                izr0Var.R(0);
                if (gqq0.e(izr0Var, gqq0.o)) {
                    this.b = new gqq0();
                }
            }
            return true;
        }
        return false;
    }

    @Override // p.ec10
    public final void release() {
    }
}
