package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class p5t0 implements wat {
    public boolean a;

    public static void i(p5t0 p5t0Var, q5t0 q5t0Var, long j) {
        p5t0Var.e(q5t0Var);
        q5t0Var.e0(qr80.d(j, q5t0Var.e), 0.0f, null);
    }

    public static void n(p5t0 p5t0Var, q5t0 q5t0Var, int i, int i2, iu30 iu30Var, int i3) {
        if ((i3 & 8) != 0) {
            iu30Var = r5t0.a;
        }
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (p5t0Var.c() == flb0.a || p5t0Var.d() == 0) {
            p5t0Var.e(q5t0Var);
            q5t0Var.e0(qr80.d(j, q5t0Var.e), 0.0f, iu30Var);
        } else {
            p5t0Var.e(q5t0Var);
            q5t0Var.e0(qr80.d((((long) ((p5t0Var.d() - q5t0Var.a) - ((int) (j >> 32)))) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), q5t0Var.e), 0.0f, iu30Var);
        }
    }

    public static void p(p5t0 p5t0Var, q5t0 q5t0Var, long j) {
        ia4 ia4Var = r5t0.a;
        if (p5t0Var.c() == flb0.a || p5t0Var.d() == 0) {
            p5t0Var.e(q5t0Var);
            q5t0Var.e0(qr80.d(j, q5t0Var.e), 0.0f, ia4Var);
        } else {
            int iD = (p5t0Var.d() - q5t0Var.a) - ((int) (j >> 32));
            p5t0Var.e(q5t0Var);
            q5t0Var.e0(qr80.d((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iD) << 32), q5t0Var.e), 0.0f, ia4Var);
        }
    }

    public static void q(p5t0 p5t0Var, q5t0 q5t0Var, long j, be50 be50Var) {
        if (p5t0Var.c() == flb0.a || p5t0Var.d() == 0) {
            p5t0Var.e(q5t0Var);
            q5t0Var.f0(qr80.d(j, q5t0Var.e), 0.0f, be50Var);
        } else {
            int iD = (p5t0Var.d() - q5t0Var.a) - ((int) (j >> 32));
            p5t0Var.e(q5t0Var);
            q5t0Var.f0(qr80.d((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iD) << 32), q5t0Var.e), 0.0f, be50Var);
        }
    }

    public static /* synthetic */ void u(p5t0 p5t0Var, q5t0 q5t0Var, int i, int i2, iu30 iu30Var, int i3) {
        if ((i3 & 8) != 0) {
            iu30Var = r5t0.a;
        }
        p5t0Var.r(q5t0Var, i, i2, 0.0f, iu30Var);
    }

    public static void w(p5t0 p5t0Var, q5t0 q5t0Var, long j) {
        ia4 ia4Var = r5t0.a;
        p5t0Var.e(q5t0Var);
        q5t0Var.e0(qr80.d(j, q5t0Var.e), 0.0f, ia4Var);
    }

    public float a(zy31 zy31Var) {
        return Float.NaN;
    }

    public abstract elb0 b();

    public abstract flb0 c();

    public abstract int d();

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(q5t0 q5t0Var) {
        if (q5t0Var instanceof fnm0) {
            ((fnm0) q5t0Var).i(this.a);
        }
    }

    public final void f(q5t0 q5t0Var, int i, int i2, float f) {
        e(q5t0Var);
        q5t0Var.e0(qr80.d((((long) i2) & 4294967295L) | (((long) i) << 32), q5t0Var.e), f, null);
    }

    public final void k(q5t0 q5t0Var, int i, int i2, float f) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (c() == flb0.a || d() == 0) {
            e(q5t0Var);
            q5t0Var.e0(qr80.d(j, q5t0Var.e), f, null);
        } else {
            int iD = (d() - q5t0Var.a) - ((int) (j >> 32));
            e(q5t0Var);
            q5t0Var.e0(qr80.d((((long) iD) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), q5t0Var.e), f, null);
        }
    }

    public final void r(q5t0 q5t0Var, int i, int i2, float f, iu30 iu30Var) {
        e(q5t0Var);
        q5t0Var.e0(qr80.d((((long) i2) & 4294967295L) | (((long) i) << 32), q5t0Var.e), f, iu30Var);
    }

    public final void x(iu30 iu30Var) {
        this.a = true;
        iu30Var.invoke(this);
        this.a = false;
    }
}
