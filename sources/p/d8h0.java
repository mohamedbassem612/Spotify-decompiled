package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d8h0 implements arh0, zqh0 {
    public final p2i0 a;
    public final long b;
    public final hw3 c;
    public qba d;
    public arh0 e;
    public zqh0 f;
    public long g = -9223372036854775807L;
    public boolean h;

    public d8h0(p2i0 p2i0Var, hw3 hw3Var, long j) {
        this.a = p2i0Var;
        this.c = hw3Var;
        this.b = j;
    }

    @Override // p.v561
    public final long a() {
        arh0 arh0Var = this.e;
        String str = zoi1.a;
        return arh0Var.a();
    }

    @Override // p.v561
    public final boolean b() {
        arh0 arh0Var = this.e;
        return arh0Var != null && arh0Var.b();
    }

    public final void c(v561 v561Var) {
        zqh0 zqh0Var = this.f;
        String str = zoi1.a;
        zqh0Var.c(this);
    }

    @Override // p.arh0
    public final long d(long j) {
        arh0 arh0Var = this.e;
        String str = zoi1.a;
        return arh0Var.d(j);
    }

    public final void e(p2i0 p2i0Var) {
        long j = this.g;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        qba qbaVar = this.d;
        qbaVar.getClass();
        arh0 arh0VarF = qbaVar.f(p2i0Var, this.c, j);
        this.e = arh0VarF;
        if (this.h) {
            arh0VarF.p();
        }
        if (this.f != null) {
            this.e.v(this, j);
        }
    }

    @Override // p.arh0
    public final List f(ArrayList arrayList) {
        arh0 arh0Var = this.e;
        String str = zoi1.a;
        return arh0Var.f(arrayList);
    }

    @Override // p.arh0
    public final long g() {
        arh0 arh0Var = this.e;
        String str = zoi1.a;
        return arh0Var.g();
    }

    @Override // p.v561
    public final boolean i(hae0 hae0Var) {
        arh0 arh0Var = this.e;
        return arh0Var != null && arh0Var.i(hae0Var);
    }

    @Override // p.zqh0
    public final void j(arh0 arh0Var) {
        zqh0 zqh0Var = this.f;
        String str = zoi1.a;
        zqh0Var.j(this);
    }

    @Override // p.arh0
    public final long k(long j) {
        arh0 arh0Var = this.e;
        if (arh0Var != null) {
            return arh0Var.k(j);
        }
        return Long.MIN_VALUE;
    }

    @Override // p.arh0
    public final long m(qp00[] qp00VarArr, boolean[] zArr, p641[] p641VarArr, boolean[] zArr2, long j) {
        long j2 = this.g;
        if (j2 != -9223372036854775807L && j == this.b) {
            j = j2;
        }
        this.g = -9223372036854775807L;
        arh0 arh0Var = this.e;
        String str = zoi1.a;
        return arh0Var.m(qp00VarArr, zArr, p641VarArr, zArr2, j);
    }

    @Override // p.arh0
    public final void p() {
        this.h = true;
        arh0 arh0Var = this.e;
        if (arh0Var != null) {
            arh0Var.p();
        }
    }

    @Override // p.arh0
    public final void q() {
        arh0 arh0Var = this.e;
        if (arh0Var != null) {
            arh0Var.q();
            return;
        }
        qba qbaVar = this.d;
        if (qbaVar != null) {
            qbaVar.o();
        }
    }

    @Override // p.arh0
    public final void r(long j) {
        arh0 arh0Var = this.e;
        String str = zoi1.a;
        arh0Var.r(j);
    }

    @Override // p.arh0
    public final long t(long j, on51 on51Var) {
        arh0 arh0Var = this.e;
        String str = zoi1.a;
        return arh0Var.t(j, on51Var);
    }

    @Override // p.arh0
    public final qnf1 u() {
        arh0 arh0Var = this.e;
        String str = zoi1.a;
        return arh0Var.u();
    }

    @Override // p.arh0
    public final void v(zqh0 zqh0Var, long j) {
        this.f = zqh0Var;
        arh0 arh0Var = this.e;
        if (arh0Var != null) {
            long j2 = this.g;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            arh0Var.v(this, j2);
        }
    }

    @Override // p.v561
    public final long x() {
        arh0 arh0Var = this.e;
        String str = zoi1.a;
        return arh0Var.x();
    }

    @Override // p.v561
    public final void y(long j) {
        arh0 arh0Var = this.e;
        String str = zoi1.a;
        arh0Var.y(j);
    }
}
