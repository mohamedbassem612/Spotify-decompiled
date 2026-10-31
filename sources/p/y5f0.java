package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y5f0 extends p5t0 {
    public final x5f0 b;

    public y5f0(x5f0 x5f0Var) {
        this.b = x5f0Var;
    }

    public final float U0() {
        return this.b.U0();
    }

    public final float a(zy31 zy31Var) {
        iu30 iu30Var;
        int iP0;
        uxq0 snapshotObserver;
        int iP1;
        vu30 vu30Var = zy31Var.a;
        if (vu30Var != null) {
            return ((Number) vu30Var.invoke(this, Float.valueOf(Float.NaN))).floatValue();
        }
        x5f0 x5f0Var = this.b;
        if (x5f0Var.O0) {
            return Float.NaN;
        }
        p811 p811Var = new p811();
        p811Var.a = x5f0Var;
        while (true) {
            v170 v170Var = ((x5f0) p811Var.a).Q0;
            float f = (v170Var == null || (iP1 = f46.p0((zy31[]) v170Var.b, zy31Var)) < 0) ? Float.NaN : ((float[]) v170Var.c)[iP1];
            boolean zIsNaN = Float.isNaN(f);
            Object obj = p811Var.a;
            if (!zIsNaN) {
                ((x5f0) obj).l0(x5f0Var.z0(), zy31Var);
                return zy31Var.a(f, ((x5f0) p811Var.a).x0(), x5f0Var.x0());
            }
            x5f0 x5f0Var2 = (x5f0) obj;
            vu30 vu30Var2 = x5f0Var2.h;
            if (vu30Var2 != null && (iu30Var = x5f0Var2.i) != null && ((Boolean) iu30Var.invoke(zy31Var)).booleanValue()) {
                x5f0 x5f0Var3 = (x5f0) p811Var.a;
                nen0 nen0Var = x5f0Var3.X;
                if (nen0Var == null) {
                    long[] jArr = hj41.a;
                    nen0Var = new nen0();
                    x5f0Var3.X = nen0Var;
                }
                Object objG = nen0Var.g(zy31Var);
                if (objG == null) {
                    objG = new s5t0(x5f0Var3.A0(), x5f0Var3, zy31Var);
                    nen0Var.m(zy31Var, objG);
                }
                s5t0 s5t0Var = (s5t0) objG;
                s5t0Var.a = x5f0Var3.A0();
                ha4 ha4Var = x5f0Var.z0().O0;
                if (ha4Var != null && (snapshotObserver = ha4Var.getSnapshotObserver()) != null) {
                    snapshotObserver.a.d(s5t0Var, x5f0.T0, new uc9(vu30Var2, p811Var, zy31Var, (byte) 7));
                }
                ((x5f0) p811Var.a).l0(x5f0Var.z0(), zy31Var);
                v170 v170Var2 = ((x5f0) p811Var.a).Q0;
                float f2 = (v170Var2 == null || (iP0 = f46.p0((zy31[]) v170Var2.b, zy31Var)) < 0) ? Float.NaN : ((float[]) v170Var2.c)[iP0];
                if (!Float.isNaN(f2)) {
                    return zy31Var.a(f2, ((x5f0) p811Var.a).x0(), x5f0Var.x0());
                }
            }
            x5f0 x5f0VarD0 = ((x5f0) p811Var.a).D0();
            if (x5f0VarD0 == null) {
                ((x5f0) p811Var.a).l0(x5f0Var.z0(), zy31Var);
                return Float.NaN;
            }
            p811Var.a = x5f0VarD0;
        }
    }

    public final elb0 b() {
        x5f0 x5f0Var = this.b;
        elb0 elb0VarX0 = x5f0Var.O0 ? null : x5f0Var.x0();
        if (elb0VarX0 == null) {
            x5f0Var.z0().f1.b();
        }
        return elb0VarX0;
    }

    public final flb0 c() {
        return this.b.getLayoutDirection();
    }

    public final int d() {
        return this.b.Y();
    }

    public final float h() {
        return this.b.h();
    }
}
