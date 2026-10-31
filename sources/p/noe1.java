package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class noe1 implements arh0, zqh0 {
    public final arh0 a;
    public final long b;
    public zqh0 c;

    public noe1(arh0 arh0Var, long j) {
        this.a = arh0Var;
        this.b = j;
    }

    @Override // p.v561
    public final long a() {
        long jA = this.a.a();
        if (jA == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jA + this.b;
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
        long j2 = this.b;
        return this.a.d(j - j2) + j2;
    }

    @Override // p.arh0
    public final List f(ArrayList arrayList) {
        return this.a.f(arrayList);
    }

    @Override // p.arh0
    public final long g() {
        long jG = this.a.g();
        if (jG == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jG + this.b;
    }

    @Override // p.v561
    public final boolean i(hae0 hae0Var) {
        gae0 gae0Var = new gae0();
        long j = hae0Var.a;
        gae0Var.b = hae0Var.b;
        gae0Var.c = hae0Var.c;
        gae0Var.a = j - this.b;
        return this.a.i(new hae0(gae0Var));
    }

    @Override // p.zqh0
    public final void j(arh0 arh0Var) {
        zqh0 zqh0Var = this.c;
        zqh0Var.getClass();
        zqh0Var.j(this);
    }

    @Override // p.arh0
    public final long k(long j) {
        long j2 = this.b;
        long jK = this.a.k(j == Long.MIN_VALUE ? Long.MIN_VALUE : j - j2);
        if (jK == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jK + j2;
    }

    @Override // p.arh0
    public final long m(qp00[] qp00VarArr, boolean[] zArr, p641[] p641VarArr, boolean[] zArr2, long j) {
        p641[] p641VarArr2 = new p641[p641VarArr.length];
        int i = 0;
        while (true) {
            p641 p641Var = null;
            if (i >= p641VarArr.length) {
                break;
            }
            moe1 moe1Var = (moe1) p641VarArr[i];
            if (moe1Var != null) {
                p641Var = moe1Var.a;
            }
            p641VarArr2[i] = p641Var;
            i++;
        }
        arh0 arh0Var = this.a;
        long j2 = this.b;
        long jM = arh0Var.m(qp00VarArr, zArr, p641VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < p641VarArr.length; i2++) {
            p641 p641Var2 = p641VarArr2[i2];
            if (p641Var2 == null) {
                p641VarArr[i2] = null;
            } else {
                p641 p641Var3 = p641VarArr[i2];
                if (p641Var3 == null || ((moe1) p641Var3).a != p641Var2) {
                    p641VarArr[i2] = new moe1(p641Var2, j2);
                }
            }
        }
        return jM + j2;
    }

    @Override // p.arh0
    public final void p() {
        String str = zoi1.a;
        this.a.p();
    }

    @Override // p.arh0
    public final void q() {
        this.a.q();
    }

    @Override // p.arh0
    public final void r(long j) {
        this.a.r(j - this.b);
    }

    @Override // p.arh0
    public final long t(long j, on51 on51Var) {
        long j2 = this.b;
        return this.a.t(j - j2, on51Var) + j2;
    }

    @Override // p.arh0
    public final qnf1 u() {
        return this.a.u();
    }

    @Override // p.arh0
    public final void v(zqh0 zqh0Var, long j) {
        this.c = zqh0Var;
        this.a.v(this, j - this.b);
    }

    @Override // p.v561
    public final long x() {
        long jX = this.a.x();
        if (jX == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jX + this.b;
    }

    @Override // p.v561
    public final void y(long j) {
        this.a.y(j - this.b);
    }
}
