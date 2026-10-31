package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ekr0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jkr0 b;

    public /* synthetic */ ekr0(jkr0 jkr0Var, byte b) {
        this.a = b;
        this.b = jkr0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Long] */
    public final Object invoke(Object obj) {
        xjr0 xjr0Var;
        byte b = this.a;
        iu30 iu30VarE = null;
        jkr0 jkr0Var = this.b;
        switch (b) {
            case 0:
                ?? ValueOf = (Float) obj;
                float fFloatValue = ValueOf.floatValue();
                long jF = q1o1.f(jkr0Var);
                float f = jkr0Var.i + fFloatValue;
                long jA0 = jch0.a0(f);
                jkr0Var.i = f - jA0;
                if (Math.abs(fFloatValue) >= 1.0E-4f) {
                    long j = jF + jA0;
                    long jR = yoi1.r(j, jkr0Var.h, jkr0Var.g);
                    boolean z = j != jR;
                    long j2 = jR - jF;
                    float f2 = j2;
                    jkr0Var.j = f2;
                    if (Math.abs(j2) != 0) {
                        jkr0Var.F.setValue(Boolean.valueOf(f2 > 0.0f));
                        jkr0Var.G.setValue(Boolean.valueOf(f2 < 0.0f));
                    }
                    int i = (int) j2;
                    int i2 = -i;
                    iu30 iu30VarF = ((xjr0) jkr0Var.m.getValue()).f(i2);
                    if (iu30VarF == null || (xjr0Var = jkr0Var.b) == null) {
                        iu30VarE = iu30VarF;
                    } else {
                        xjr0 xjr0VarF = xjr0Var.f(i2);
                        if (xjr0VarF != null) {
                            jkr0Var.b = xjr0VarF;
                            iu30VarE = iu30VarF;
                        }
                    }
                    if (iu30VarE != null) {
                        jkr0Var.h(iu30VarE, jkr0Var.a, true);
                        s8p1.r(jkr0Var.B);
                    } else {
                        kl1 kl1Var = jkr0Var.d;
                        drr0 drr0Var = (drr0) kl1Var.d;
                        jkr0 jkr0Var2 = (jkr0) kl1Var.b;
                        drr0Var.t(drr0Var.s() + (jkr0Var2.n() != 0 ? i / jkr0Var2.n() : 0.0f));
                        hmb0 hmb0Var = (hmb0) jkr0Var.y.getValue();
                        if (hmb0Var != null) {
                            hmb0Var.l();
                        }
                    }
                    if (z) {
                        ValueOf = Long.valueOf(j2);
                    }
                    fFloatValue = ValueOf.floatValue();
                }
                return Float.valueOf(fFloatValue);
            default:
                rsb0 rsb0Var = (rsb0) obj;
                jv91 jv91VarO = ekb.o();
                iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
                jv91 jv91VarU = ekb.u(jv91VarO);
                try {
                    rsb0Var.a(jkr0Var.e);
                    return rih1.a;
                } finally {
                    ekb.C(jv91VarO, jv91VarU, iu30VarE);
                }
        }
    }
}
