package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a6f0 implements elb0 {
    public final z5f0 a;

    public a6f0(z5f0 z5f0Var) {
        this.a = z5f0Var;
    }

    @Override // p.elb0
    public final long E(long j) {
        return this.a.Q0().E(Offset.g(j, c()));
    }

    @Override // p.elb0
    public final elb0 J() {
        z5f0 z5f0VarC1;
        if (!a()) {
            qf80.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        ndo0 ndo0Var = ((ndo0) this.a.Q0().U0.e1.e).Y0;
        if (ndo0Var == null || (z5f0VarC1 = ndo0Var.c1()) == null) {
            return null;
        }
        return z5f0VarC1.x0();
    }

    @Override // p.elb0
    public final long K(elb0 elb0Var, long j) {
        return q(elb0Var, j, true);
    }

    @Override // p.elb0
    public final n511 M(elb0 elb0Var, boolean z) {
        return this.a.Q0().M(elb0Var, z);
    }

    @Override // p.elb0
    public final long O(long j) {
        return this.a.Q0().O(Offset.g(j, c()));
    }

    @Override // p.elb0
    public final void R(elb0 elb0Var, float[] fArr) {
        this.a.Q0().R(elb0Var, fArr);
    }

    @Override // p.elb0
    public final boolean a() {
        return this.a.Q0().f1().N0;
    }

    @Override // p.elb0
    public final long b() {
        z5f0 z5f0Var = this.a;
        return (((long) z5f0Var.a) << 32) | (((long) z5f0Var.b) & 4294967295L);
    }

    public final long c() {
        z5f0 z5f0Var = this.a;
        z5f0 z5f0VarT = nln.t(z5f0Var);
        return Offset.f(q(z5f0VarT.x0(), 0L, true), z5f0Var.Q0().q(z5f0VarT.Q0(), 0L, true));
    }

    @Override // p.elb0
    public final long f(long j) {
        return Offset.g(this.a.Q0().f(j), c());
    }

    @Override // p.elb0
    public final long l(long j) {
        return Offset.g(this.a.Q0().l(j), c());
    }

    @Override // p.elb0
    public final long p(long j) {
        return this.a.Q0().p(Offset.g(j, c()));
    }

    @Override // p.elb0
    public final long q(elb0 elb0Var, long j, boolean z) {
        boolean z2 = elb0Var instanceof a6f0;
        z5f0 z5f0Var = this.a;
        if (!z2) {
            z5f0 z5f0VarT = nln.t(z5f0Var);
            long jQ = q(z5f0VarT.T0(), j, z);
            long jE0 = z5f0VarT.E0();
            long jF = Offset.f(jQ, (((long) Float.floatToRawIntBits((int) (jE0 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (jE0 >> 32)) << 32));
            ndo0 ndo0VarQ0 = z5f0VarT.Q0();
            if (!ndo0VarQ0.f1().N0) {
                qf80.c("LayoutCoordinate operations are only valid when isAttached is true");
            }
            ndo0VarQ0.w1();
            ndo0 ndo0VarQ1 = ndo0VarQ0.Y0;
            if (ndo0VarQ1 == null) {
                ndo0VarQ1 = z5f0VarT.Q0();
                ndo0VarQ1.getClass();
            }
            return Offset.g(jF, ndo0VarQ1.q(elb0Var, 0L, z));
        }
        z5f0 z5f0Var2 = ((a6f0) elb0Var).a;
        z5f0Var2.Q0().w1();
        z5f0 z5f0VarC1 = z5f0Var.Q0().Z0(z5f0Var2.Q0()).c1();
        if (z5f0VarC1 != null) {
            boolean z3 = !z;
            long jC = qr80.c(qr80.d(z5f0Var2.b1(z5f0VarC1, z3), dm5.c0(j)), z5f0Var.b1(z5f0VarC1, z3));
            return (((long) Float.floatToRawIntBits((int) (jC >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jC & 4294967295L))) & 4294967295L);
        }
        z5f0 z5f0VarT2 = nln.t(z5f0Var2);
        boolean z4 = !z;
        long jD = qr80.d(qr80.d(z5f0Var2.b1(z5f0VarT2, z4), z5f0VarT2.E0()), dm5.c0(j));
        z5f0 z5f0VarT3 = nln.t(z5f0Var);
        long jC2 = qr80.c(jD, qr80.d(z5f0Var.b1(z5f0VarT3, z4), z5f0VarT3.E0()));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jC2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jC2 & 4294967295L))) & 4294967295L;
        ndo0 ndo0Var = z5f0VarT3.Q0().Y0;
        ndo0Var.getClass();
        ndo0 ndo0Var2 = z5f0VarT2.Q0().Y0;
        ndo0Var2.getClass();
        return ndo0Var.q(ndo0Var2, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), z);
    }

    @Override // p.elb0
    public final void u(float[] fArr) {
        this.a.Q0().u(fArr);
    }
}
