package p;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bpg implements arh0, zqh0 {
    public ClippingMediaSource$IllegalClippingException X;
    public boolean Y;
    public final arh0 a;
    public final boolean b;
    public zqh0 c;
    public apg[] d = new apg[0];
    public long e;
    public boolean f;
    public boolean g;
    public long h;
    public long i;
    public long t;

    public bpg(arh0 arh0Var, boolean z, long j, long j2, boolean z2) {
        this.a = arh0Var;
        this.e = z ? j : -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.b = z2;
        h(j, j2);
    }

    public static void l(w2z w2zVar, long j, long j2) {
        ie30 ie30Var = (ie30) w2zVar.c;
        ie30Var.getClass();
        int i = ie30Var.O;
        int i2 = ie30Var.N;
        if (i2 == 0 && i == 0) {
            return;
        }
        if (j != 0) {
            i2 = 0;
        }
        if (j2 != Long.MIN_VALUE) {
            i = 0;
        }
        ge30 ge30VarA = ie30Var.a();
        ge30VarA.M = i2;
        ge30VarA.N = i;
        w2zVar.c = new ie30(ge30VarA);
    }

    @Override // p.v561
    public final long a() {
        long jA = this.a.a();
        if (!this.Y) {
            if (jA != Long.MIN_VALUE) {
                long j = this.t;
                if (j == Long.MIN_VALUE || jA < j) {
                }
            }
            return Long.MIN_VALUE;
        }
        long j2 = this.t;
        if (j2 != Long.MIN_VALUE && jA != Long.MIN_VALUE) {
            return Math.min(j2, jA);
        }
        return jA;
    }

    @Override // p.v561
    public final boolean b() {
        return this.a.b();
    }

    public final void c(v561 v561Var) {
        zqh0 zqh0Var = this.c;
        zqh0Var.getClass();
        zqh0Var.c(this);
    }

    @Override // p.arh0
    public final long d(long j) {
        this.e = -9223372036854775807L;
        for (apg apgVar : this.d) {
            if (apgVar != null) {
                apgVar.c = false;
            }
        }
        long jD = this.a.d(j);
        long j2 = this.i;
        long j3 = this.t;
        long jMax = Math.max(jD, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    public final boolean e() {
        return (this.e == -9223372036854775807L || this.f) ? false : true;
    }

    @Override // p.arh0
    public final List f(ArrayList arrayList) {
        return this.a.f(arrayList);
    }

    @Override // p.arh0
    public final long g() {
        if (e()) {
            this.f = true;
            long j = this.e;
            this.e = -9223372036854775807L;
            this.h = j;
            long jG = g();
            return jG != -9223372036854775807L ? jG : j;
        }
        long jG2 = this.a.g();
        if (jG2 != -9223372036854775807L) {
            long j2 = this.i;
            long j3 = this.t;
            long jMax = Math.max(jG2, j2);
            if (j3 != Long.MIN_VALUE) {
                jMax = Math.min(jMax, j3);
            }
            if (jMax != this.h) {
                this.h = jMax;
                return jMax;
            }
        }
        return -9223372036854775807L;
    }

    public final void h(long j, long j2) {
        this.i = j;
        this.t = j2;
        if (this.b) {
            long jK = this.a.k(j2);
            dm5.w(jK, j2, "Period updating end positions not supported, %s!=%s", jK == Long.MIN_VALUE || jK == j2);
            this.Y = jK == j2;
        }
    }

    @Override // p.v561
    public final boolean i(hae0 hae0Var) {
        return this.a.i(hae0Var);
    }

    @Override // p.zqh0
    public final void j(arh0 arh0Var) {
        if (this.X != null) {
            return;
        }
        zqh0 zqh0Var = this.c;
        zqh0Var.getClass();
        zqh0Var.j(this);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    @Override // p.arh0
    public final long m(qp00[] qp00VarArr, boolean[] zArr, p641[] p641VarArr, boolean[] zArr2, long j) {
        boolean z;
        boolean z2;
        qp00 qp00Var;
        this.d = new apg[p641VarArr.length];
        p641[] p641VarArr2 = new p641[p641VarArr.length];
        int i = 0;
        while (true) {
            p641 p641Var = null;
            if (i >= p641VarArr.length) {
                break;
            }
            apg[] apgVarArr = this.d;
            apg apgVar = (apg) p641VarArr[i];
            apgVarArr[i] = apgVar;
            if (apgVar != null) {
                p641Var = apgVar.a;
            }
            p641VarArr2[i] = p641Var;
            i++;
        }
        long jM = this.a.m(qp00VarArr, zArr, p641VarArr2, zArr2, j);
        long j2 = this.t;
        long jMax = Math.max(jM, j);
        if (j2 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j2);
        }
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= p641VarArr.length) {
                break;
            }
            p641 p641Var2 = p641VarArr2[i2];
            apg[] apgVarArr2 = this.d;
            if (p641Var2 == null) {
                apgVarArr2[i2] = null;
            } else {
                apg apgVar2 = apgVarArr2[i2];
                if (apgVar2 == null || apgVar2.a != p641Var2) {
                    if (e()) {
                        if (jM < j) {
                            z2 = true;
                        } else if (jM == 0 || (qp00Var = qp00VarArr[i2]) == null) {
                            z2 = false;
                        } else {
                            ie30 ie30VarS = qp00Var.s();
                            z2 = !asj0.a(ie30VarS.f66p, ie30VarS.l);
                        }
                        z = z2;
                    }
                    apg[] apgVarArr3 = this.d;
                    p641 p641Var3 = p641VarArr2[i2];
                    p641Var3.getClass();
                    apgVarArr3[i2] = new apg(this, p641Var3, z);
                    z3 |= z;
                }
            }
            p641VarArr[i2] = this.d[i2];
            i2++;
        }
        this.e = z3 ? jMax : -9223372036854775807L;
        if (this.g) {
            this.f = true;
        }
        return jMax;
    }

    @Override // p.arh0
    public final void p() {
        this.g = true;
        this.a.p();
    }

    @Override // p.arh0
    public final void q() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.X;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        this.a.q();
    }

    @Override // p.arh0
    public final void r(long j) {
        this.a.r(j);
    }

    @Override // p.arh0
    public final long t(long j, on51 on51Var) {
        long j2 = this.i;
        if (j == j2) {
            return j2;
        }
        long jK = zoi1.k(on51Var.a, 0L, j - j2);
        long j3 = on51Var.b;
        long j4 = this.t;
        long jK2 = zoi1.k(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j);
        if (jK != on51Var.a || jK2 != on51Var.b) {
            on51Var = new on51(jK, jK2);
        }
        return this.a.t(j, on51Var);
    }

    @Override // p.arh0
    public final qnf1 u() {
        return this.a.u();
    }

    @Override // p.arh0
    public final void v(zqh0 zqh0Var, long j) {
        this.c = zqh0Var;
        this.a.v(this, j);
    }

    @Override // p.v561
    public final long x() {
        long jX = this.a.x();
        if (!this.Y) {
            if (jX != Long.MIN_VALUE) {
                long j = this.t;
                if (j == Long.MIN_VALUE || jX < j) {
                }
            }
            return Long.MIN_VALUE;
        }
        long j2 = this.t;
        if (j2 != Long.MIN_VALUE && jX != Long.MIN_VALUE) {
            return Math.min(j2, jX);
        }
        return jX;
    }

    @Override // p.v561
    public final void y(long j) {
        this.a.y(j);
    }
}
