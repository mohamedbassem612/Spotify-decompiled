package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h7e1 implements qnm0 {
    public final qga0 a;
    public int b = -1;
    public long c = 9205357640488583168L;
    public boolean d = true;
    public final /* synthetic */ r7e1 e;

    public h7e1(r7e1 r7e1Var, qga0 qga0Var) {
        this.e = r7e1Var;
        this.a = qga0Var;
    }

    public final void a() {
        g7e1 g7e1Var = g7e1.a;
        r7e1 r7e1Var = this.e;
        r7e1Var.r.setValue(g7e1Var);
        if (this.d) {
            r7e1Var.r();
        }
    }

    public final boolean b(long j) {
        return true;
    }

    public final boolean c(long j, f341 f341Var, int i) {
        r7e1 r7e1Var = this.e;
        y9e1 y9e1VarC = r7e1Var.b.c();
        if (!r7e1Var.i || y9e1VarC == null || r7e1Var.a.h().d.length() == 0) {
            return false;
        }
        this.d = i >= 2;
        r7e1Var.r.setValue(g7e1.c);
        this.a.invoke();
        r7e1Var.w = -1;
        this.b = -1;
        this.c = j;
        this.b = (int) (d(j, f341Var, y9e1VarC, true) >> 32);
        return true;
    }

    public final long d(long j, f341 f341Var, y9e1 y9e1Var, boolean z) {
        int length = y9e1Var.a.a.b.length();
        int iD = this.b;
        r7e1 r7e1Var = this.e;
        if (iD < 0 || iD > length) {
            iD = r7e1Var.b.d(this.c, false);
        }
        int i = iD;
        long jB = r7e1Var.B(r7e1Var.a.h(), i, r7e1Var.b.d(j, false), false, f341Var, false, z, (vs50) null);
        if (this.b == -1 && !nbe1.d(jB)) {
            this.b = (int) (jB >> 32);
        }
        if (nbe1.h(jB)) {
            jB = e6p1.e((int) (4294967295L & jB), (int) (jB >> 32));
        }
        r7e1Var.a.o(jB);
        r7e1Var.x(ree1.c);
        return jB;
    }

    public final boolean f(long j, f341 f341Var) {
        r7e1 r7e1Var = this.e;
        aae1 aae1Var = r7e1Var.b;
        ggg1 ggg1Var = r7e1Var.a;
        y9e1 y9e1VarC = aae1Var.c();
        if (!r7e1Var.i || y9e1VarC == null || ggg1Var.h().d.length() == 0) {
            return false;
        }
        if (nbe1.c(ggg1Var.h().e, d(j, f341Var, y9e1VarC, false))) {
            return true;
        }
        this.d = false;
        return true;
    }

    public final boolean h(long j) {
        r7e1 r7e1Var = this.e;
        y9e1 y9e1VarC = r7e1Var.b.c();
        if (!r7e1Var.i || y9e1VarC == null || r7e1Var.a.h().d.length() == 0) {
            return false;
        }
        this.d = false;
        this.a.invoke();
        d(j, w1x0.X, y9e1VarC, false);
        return true;
    }
}
